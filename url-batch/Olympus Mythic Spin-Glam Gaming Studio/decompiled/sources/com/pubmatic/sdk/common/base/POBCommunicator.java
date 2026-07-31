package com.pubmatic.sdk.common.base;

import android.os.Trace;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.POBError;
import com.pubmatic.sdk.common.base.POBAdBuilding;
import com.pubmatic.sdk.common.base.POBAdDescriptor;
import com.pubmatic.sdk.common.base.POBResponseParsing;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.models.POBAdResponse;
import com.pubmatic.sdk.common.network.POBHttpRequest;
import com.pubmatic.sdk.common.network.POBNetworkHandler;
import com.pubmatic.sdk.common.network.POBNetworkResult;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class POBCommunicator<AdDescriptorType extends POBAdDescriptor> implements POBNetworkHandler.POBNetworkListener<JSONObject>, POBResponseParsing.POBResponseParserListener<AdDescriptorType>, POBAdBuilding.POBAdBuilderListener<AdDescriptorType>, POBNetworkHandler.POBNetworkResultListener {
    private final POBRequestBuilding a;
    private final POBResponseParsing b;
    private final POBAdBuilding c;
    private final POBNetworkHandler d;
    private POBCommunicatorListener e;
    private POBNetworkResult f;
    private POBErrorCustomisationListener g;

    @MainThread
    public interface POBCommunicatorListener<AdDescriptorType extends POBAdDescriptor> {
        void onError(@NonNull POBError pOBError);

        void onSuccess(@NonNull POBAdResponse<AdDescriptorType> pOBAdResponse);
    }

    public interface POBErrorCustomisationListener {
        @NonNull
        POBError customisePOBError(@NonNull POBError pOBError, @Nullable POBNetworkResult pOBNetworkResult);
    }

    public POBCommunicator(@NonNull POBRequestBuilding pOBRequestBuilding, @NonNull POBResponseParsing pOBResponseParsing, @NonNull POBAdBuilding<AdDescriptorType> pOBAdBuilding, @NonNull POBNetworkHandler pOBNetworkHandler) {
        this.a = pOBRequestBuilding;
        this.d = pOBNetworkHandler;
        this.c = pOBAdBuilding;
        pOBAdBuilding.setListener(this);
        this.b = pOBResponseParsing;
        pOBResponseParsing.setListener(this);
    }

    private void a(POBError pOBError) {
        POBCommunicatorListener pOBCommunicatorListener = this.e;
        if (pOBCommunicatorListener != null) {
            pOBCommunicatorListener.onError(pOBError);
        }
    }

    @Override // com.pubmatic.sdk.common.base.POBAdBuilding.POBAdBuilderListener
    public void adBuilderOnSuccess(@NonNull POBAdResponse<AdDescriptorType> pOBAdResponse) {
        POBCommunicatorListener pOBCommunicatorListener = this.e;
        if (pOBCommunicatorListener != null) {
            pOBCommunicatorListener.onSuccess(pOBAdResponse);
        }
    }

    public void cancel() {
        this.d.cancelRequest(String.valueOf(this.a.hashCode()));
    }

    @Nullable
    public POBNetworkResult getNetworkResult() {
        return this.f;
    }

    @Override // com.pubmatic.sdk.common.network.POBNetworkHandler.POBNetworkListener
    public void onFailure(@NonNull POBError pOBError) {
        POBErrorCustomisationListener pOBErrorCustomisationListener = this.g;
        if (pOBErrorCustomisationListener != null) {
            pOBError = pOBErrorCustomisationListener.customisePOBError(pOBError, this.f);
        }
        POBLog.debug("POBCommunicator", "Failed to receive an Ad response from server - %s", pOBError.getErrorMessage());
        a(pOBError);
    }

    @Override // com.pubmatic.sdk.common.network.POBNetworkHandler.POBNetworkResultListener
    public void onResult(@Nullable POBNetworkResult pOBNetworkResult) {
        this.f = pOBNetworkResult;
    }

    @Override // com.pubmatic.sdk.common.base.POBResponseParsing.POBResponseParserListener
    public void parserOnError(@NonNull POBError pOBError) {
        a(pOBError);
    }

    @Override // com.pubmatic.sdk.common.base.POBResponseParsing.POBResponseParserListener
    public void parserOnSuccess(@NonNull POBAdResponse<AdDescriptorType> pOBAdResponse) {
        this.c.build(new POBAdResponse.Builder(pOBAdResponse).build());
    }

    public void requestAd() {
        POBHttpRequest build = this.a.build();
        if (build == null) {
            a(new POBError(1001, "Exception occurred while preparing this ad request"));
            return;
        }
        Trace.endSection();
        Trace.beginSection("POB Network Call");
        POBLog.debug("POBCommunicator", "Sending an Ad request - : %s", build);
        this.d.sendJSONRequest(build, this, this);
    }

    public void setListener(POBCommunicatorListener<AdDescriptorType> pOBCommunicatorListener) {
        this.e = pOBCommunicatorListener;
    }

    public void setPOBErrorCustomisationListener(@Nullable POBErrorCustomisationListener pOBErrorCustomisationListener) {
        this.g = pOBErrorCustomisationListener;
    }

    @Override // com.pubmatic.sdk.common.network.POBNetworkHandler.POBNetworkListener
    public void onSuccess(@Nullable JSONObject jSONObject) {
        if (jSONObject != null) {
            POBLog.debug("POBCommunicator", "Successfully received Ad response from server - %s", jSONObject);
        }
        Trace.endSection();
        Trace.beginSection("POB Response Parsing");
        this.b.parse(jSONObject);
    }
}
