package com.smaato.sdk.ng.vpaid.models.vast;

import com.smaato.sdk.ng.vpaid.xml.Attribute;
import com.smaato.sdk.ng.vpaid.xml.Tag;
import java.util.List;

/* loaded from: classes15.dex */
public class NonLinear {

    @Tag
    private AdParameters adParameters;

    @Attribute
    private String apiFramework;

    @Attribute
    private String expandedHeight;

    @Attribute
    private String expandedWidth;

    @Attribute
    private String height;

    @Tag("HTMLResource")
    private List<HTMLResource> htmlResources;

    @Tag("IFrameResource")
    private List<IFrameResource> iFrameResources;

    @Attribute
    private String id;

    @Attribute
    private String maintainAspectRatio;

    @Attribute
    private String minSuggestedDuration;

    @Tag
    private NonLinearClickThrough nonLinearClickThrough;

    @Tag("NonLinearClickTracking")
    private List<NonLinearClickTracking> nonLinearClickTrackingList;

    @Attribute
    private String scalable;

    @Tag("StaticResource")
    private List<StaticResource> staticResources;

    @Attribute
    private String width;

    public AdParameters getAdParameters() {
        return this.adParameters;
    }

    public String getApiFramework() {
        return this.apiFramework;
    }

    public String getExpandedHeight() {
        return this.expandedHeight;
    }

    public String getExpandedWidth() {
        return this.expandedWidth;
    }

    public String getHeight() {
        return this.height;
    }

    public List<HTMLResource> getHtmlResources() {
        return this.htmlResources;
    }

    public String getId() {
        return this.id;
    }

    public String getMinSuggestedDuration() {
        return this.minSuggestedDuration;
    }

    public NonLinearClickThrough getNonLinearClickThrough() {
        return this.nonLinearClickThrough;
    }

    public List<NonLinearClickTracking> getNonLinearClickTrackingList() {
        return this.nonLinearClickTrackingList;
    }

    public List<StaticResource> getStaticResources() {
        return this.staticResources;
    }

    public String getWidth() {
        return this.width;
    }

    public List<IFrameResource> getiFrameResources() {
        return this.iFrameResources;
    }

    public String isMaintainAspectRatio() {
        return this.maintainAspectRatio;
    }

    public String isScalable() {
        return this.scalable;
    }
}
