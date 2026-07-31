package com.pubmatic.sdk.nativead.response;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.viewability.POBVerificationScriptResource;
import com.pubmatic.sdk.openwrap.core.nativead.POBNativeEventTrackingMethod;
import com.pubmatic.sdk.openwrap.core.nativead.POBNativeEventType;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class POBNativeAdResponseEventTracker implements POBVerificationScriptResource {
    private final String a;
    private final POBNativeEventType b;
    private final POBNativeEventTrackingMethod c;
    private JSONObject d;
    private final List e;

    public POBNativeAdResponseEventTracker(@NonNull String str, @NonNull POBNativeEventType pOBNativeEventType, @NonNull POBNativeEventTrackingMethod pOBNativeEventTrackingMethod) {
        this.a = str;
        this.b = pOBNativeEventType;
        this.c = pOBNativeEventTrackingMethod;
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        arrayList.add(str);
    }

    @Nullable
    public JSONObject getExt() {
        return this.d;
    }

    @Override // com.pubmatic.sdk.common.viewability.POBVerificationScriptResource
    @Nullable
    public List<String> getJavaScriptResource() {
        return this.e;
    }

    @NonNull
    public POBNativeEventTrackingMethod getTrackingMethod() {
        return this.c;
    }

    @NonNull
    public POBNativeEventType getType() {
        return this.b;
    }

    @NonNull
    public String getUrl() {
        return this.a;
    }

    @Override // com.pubmatic.sdk.common.viewability.POBVerificationScriptResource
    @Nullable
    public String getVendorKey() {
        JSONObject jSONObject = this.d;
        if (jSONObject != null) {
            return jSONObject.optString("vendorKey");
        }
        return null;
    }

    @Override // com.pubmatic.sdk.common.viewability.POBVerificationScriptResource
    @Nullable
    public String getVerificationParameter() {
        JSONObject jSONObject = this.d;
        if (jSONObject != null) {
            return jSONObject.optString("verification_parameters");
        }
        return null;
    }

    public void setExt(@Nullable JSONObject jSONObject) {
        this.d = jSONObject;
    }

    @NonNull
    public String toString() {
        return "{\n Event Type: " + this.b + "\nEvent Tracking Method: " + this.c + "\nUrl: " + this.a + " \n}";
    }
}
