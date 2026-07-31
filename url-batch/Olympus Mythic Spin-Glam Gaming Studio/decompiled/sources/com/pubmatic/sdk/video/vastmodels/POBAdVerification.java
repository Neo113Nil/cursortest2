package com.pubmatic.sdk.video.vastmodels;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.viewability.POBVerificationScriptResource;
import com.pubmatic.sdk.video.xmlserialiser.POBNodeBuilder;
import com.pubmatic.sdk.video.xmlserialiser.POBXMLNodeListener;
import io.bidmachine.iab.vast.tags.VastAttributes;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.List;

/* loaded from: classes5.dex */
public class POBAdVerification implements POBXMLNodeListener, POBVerificationScriptResource {
    private List a;
    private List b;
    private List c;
    private String d;
    private String e;

    @Override // com.pubmatic.sdk.video.xmlserialiser.POBXMLNodeListener
    public void build(@NonNull POBNodeBuilder pOBNodeBuilder) {
        this.d = pOBNodeBuilder.getAttributeValue(VastAttributes.VENDOR);
        this.a = pOBNodeBuilder.getStringList(VastTagName.JAVA_SCRIPT_RESOURCE);
        this.c = pOBNodeBuilder.getObjectList("TrackingEvents/Tracking", POBTracking.class);
        this.b = pOBNodeBuilder.getStringList("ExecutableResource");
        this.e = pOBNodeBuilder.getNodeValue(VastTagName.VERIFICATION_PARAMETERS);
    }

    @Nullable
    public List<String> getExecutableResource() {
        return this.b;
    }

    @Override // com.pubmatic.sdk.common.viewability.POBVerificationScriptResource
    @Nullable
    public List<String> getJavaScriptResource() {
        return this.a;
    }

    @Nullable
    public List<POBTracking> getTrackingEvents() {
        return this.c;
    }

    @Override // com.pubmatic.sdk.common.viewability.POBVerificationScriptResource
    @Nullable
    public String getVendorKey() {
        return this.d;
    }

    @Override // com.pubmatic.sdk.common.viewability.POBVerificationScriptResource
    @Nullable
    public String getVerificationParameter() {
        return this.e;
    }
}
