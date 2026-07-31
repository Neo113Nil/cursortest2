package com.smaato.sdk.ng.vpaid.models.vast;

import java.util.List;

/* loaded from: classes13.dex */
public interface VastAdSource {
    AdServingId getAdServingId();

    AdSystem getAdSystem();

    AdVerifications getAdVerifications();

    List<Category> getCategories();

    Creatives getCreatives();

    List<Error> getErrors();

    Extensions getExtensions();

    List<Impression> getImpressions();

    Pricing getPricing();

    ViewableImpression getViewableImpression();
}
