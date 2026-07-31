package com.smaato.sdk.ng.vpaid.models.vast;

import com.smaato.sdk.ng.vpaid.xml.Attribute;
import com.smaato.sdk.ng.vpaid.xml.Tag;
import java.util.Collections;
import java.util.List;

/* loaded from: classes13.dex */
public class Wrapper implements VastAdSource {

    @Tag
    private AdSystem adSystem;

    @Tag
    private AdVerifications adVerifications;

    @Attribute
    private String allowMultipleAds;

    @Tag("BlockedAdCategories")
    private List<BlockedAdCategories> blockedAdCategories;

    @Tag
    private Creatives creatives;

    @Tag("Error")
    private List<Error> errors;

    @Tag
    private Extensions extensions;

    @Attribute
    private String fallbackOnNoAd;

    @Attribute
    private String followAdditionalWrappers;

    @Tag("Impression")
    private List<Impression> impressions;

    @Tag
    private Pricing pricing;

    @Tag
    private VASTAdTagURI vastAdTagURI;

    @Tag
    private ViewableImpression viewableImpression;

    @Override // com.smaato.sdk.ng.vpaid.models.vast.VastAdSource
    public AdServingId getAdServingId() {
        return null;
    }

    @Override // com.smaato.sdk.ng.vpaid.models.vast.VastAdSource
    public AdSystem getAdSystem() {
        return this.adSystem;
    }

    @Override // com.smaato.sdk.ng.vpaid.models.vast.VastAdSource
    public AdVerifications getAdVerifications() {
        return this.adVerifications;
    }

    public List<BlockedAdCategories> getBlockedAdCategories() {
        return this.blockedAdCategories;
    }

    @Override // com.smaato.sdk.ng.vpaid.models.vast.VastAdSource
    public List<Category> getCategories() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.smaato.sdk.ng.vpaid.models.vast.VastAdSource
    public Creatives getCreatives() {
        return this.creatives;
    }

    @Override // com.smaato.sdk.ng.vpaid.models.vast.VastAdSource
    public List<Error> getErrors() {
        return this.errors;
    }

    @Override // com.smaato.sdk.ng.vpaid.models.vast.VastAdSource
    public Extensions getExtensions() {
        return this.extensions;
    }

    @Override // com.smaato.sdk.ng.vpaid.models.vast.VastAdSource
    public List<Impression> getImpressions() {
        return this.impressions;
    }

    @Override // com.smaato.sdk.ng.vpaid.models.vast.VastAdSource
    public Pricing getPricing() {
        return this.pricing;
    }

    public VASTAdTagURI getVastAdTagURI() {
        return this.vastAdTagURI;
    }

    @Override // com.smaato.sdk.ng.vpaid.models.vast.VastAdSource
    public ViewableImpression getViewableImpression() {
        return this.viewableImpression;
    }

    public String isAllowMultipleAds() {
        return this.allowMultipleAds;
    }

    public String isFallbackOnNoAd() {
        return this.fallbackOnNoAd;
    }

    public String isFollowAdditionalWrappers() {
        return this.followAdditionalWrappers;
    }
}
