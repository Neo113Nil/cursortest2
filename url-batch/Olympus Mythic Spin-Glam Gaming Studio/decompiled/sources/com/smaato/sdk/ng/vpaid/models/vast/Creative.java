package com.smaato.sdk.ng.vpaid.models.vast;

import com.smaato.sdk.ng.vpaid.xml.Attribute;
import com.smaato.sdk.ng.vpaid.xml.Tag;
import java.util.List;

/* loaded from: classes.dex */
public class Creative {

    @Attribute
    private String adId;

    @Attribute
    private String apiFramework;

    @Tag
    private CompanionAds companionAds;

    @Tag
    private CreativeExtensions creativeExtensions;

    @Attribute
    private String id;

    @Tag
    private Linear linear;

    @Tag
    private NonLinearAds nonLinearAds;

    @Attribute
    private String sequence;

    @Tag("UniversalAdId")
    private List<UniversalAdId> universalAdIds;

    public String getAdId() {
        return this.adId;
    }

    public String getApiFramework() {
        return this.apiFramework;
    }

    public CompanionAds getCompanionAds() {
        return this.companionAds;
    }

    public CreativeExtensions getCreativeExtensions() {
        return this.creativeExtensions;
    }

    public String getId() {
        return this.id;
    }

    public Linear getLinear() {
        return this.linear;
    }

    public NonLinearAds getNonLinearAds() {
        return this.nonLinearAds;
    }

    public String getSequence() {
        return this.sequence;
    }

    public List<UniversalAdId> getUniversalAdIds() {
        return this.universalAdIds;
    }
}
