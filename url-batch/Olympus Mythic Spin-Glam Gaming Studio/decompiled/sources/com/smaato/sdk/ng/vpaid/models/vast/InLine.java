package com.smaato.sdk.ng.vpaid.models.vast;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import com.smaato.sdk.ng.vpaid.xml.Tag;
import java.util.List;

/* loaded from: classes12.dex */
public class InLine implements VastAdSource {

    @Tag
    private AdServingId adServingId;

    @Tag
    private AdSystem adSystem;

    @Tag
    private AdTitle adTitle;

    @Tag
    private AdVerifications adVerifications;

    @Tag
    private Advertiser advertiser;

    @Tag("Category")
    private List<Category> categories;

    @Tag
    private Creatives creatives;

    @Tag
    private Description description;

    @Tag("Error")
    private List<Error> errors;

    @Tag
    private Expires expires;

    @Tag
    private Extensions extensions;

    @Tag("Impression")
    private List<Impression> impressions;

    @Tag
    private Pricing pricing;

    @Tag(k.m)
    private List<Survey> surveys;

    @Tag
    private ViewableImpression viewableImpression;

    @Override // com.smaato.sdk.ng.vpaid.models.vast.VastAdSource
    public AdServingId getAdServingId() {
        return this.adServingId;
    }

    @Override // com.smaato.sdk.ng.vpaid.models.vast.VastAdSource
    public AdSystem getAdSystem() {
        return this.adSystem;
    }

    public AdTitle getAdTitle() {
        return this.adTitle;
    }

    @Override // com.smaato.sdk.ng.vpaid.models.vast.VastAdSource
    public AdVerifications getAdVerifications() {
        return this.adVerifications;
    }

    public Advertiser getAdvertiser() {
        return this.advertiser;
    }

    @Override // com.smaato.sdk.ng.vpaid.models.vast.VastAdSource
    public List<Category> getCategories() {
        return this.categories;
    }

    @Override // com.smaato.sdk.ng.vpaid.models.vast.VastAdSource
    public Creatives getCreatives() {
        return this.creatives;
    }

    public Description getDescription() {
        return this.description;
    }

    @Override // com.smaato.sdk.ng.vpaid.models.vast.VastAdSource
    public List<Error> getErrors() {
        return this.errors;
    }

    public Expires getExpires() {
        return this.expires;
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

    public List<Survey> getSurveys() {
        return this.surveys;
    }

    @Override // com.smaato.sdk.ng.vpaid.models.vast.VastAdSource
    public ViewableImpression getViewableImpression() {
        return this.viewableImpression;
    }
}
