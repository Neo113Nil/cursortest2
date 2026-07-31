package com.smaato.sdk.ng.vpaid.models.vast;

import com.smaato.sdk.ng.vpaid.xml.Attribute;
import com.smaato.sdk.ng.vpaid.xml.Tag;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.List;

/* loaded from: classes13.dex */
public class Verification {

    @Tag("ExecutableResource")
    private List<ExecutableResource> executableResources;

    @Tag(VastTagName.JAVA_SCRIPT_RESOURCE)
    private List<JavaScriptResource> javaScriptResources;

    @Tag
    private TrackingEvents trackingEvents;

    @Attribute
    private String vendor;

    @Tag
    private VerificationParameters verificationParameters;

    public List<ExecutableResource> getExecutableResources() {
        return this.executableResources;
    }

    public List<JavaScriptResource> getJavaScriptResources() {
        return this.javaScriptResources;
    }

    public TrackingEvents getTrackingEvents() {
        return this.trackingEvents;
    }

    public String getVendor() {
        return this.vendor;
    }

    public VerificationParameters getVerificationParameters() {
        return this.verificationParameters;
    }
}
