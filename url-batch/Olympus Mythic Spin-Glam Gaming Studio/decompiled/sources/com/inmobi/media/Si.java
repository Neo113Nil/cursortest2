package com.inmobi.media;

import com.inmobi.media.ads.network.inmobiJson.model.MainLink;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes13.dex */
public final class Si {
    public final LinkedHashMap a;
    public final MainLink b;
    public final List c;

    public Si(LinkedHashMap assetIdToLinkMap, MainLink mainLink, List responseClickTrackers) {
        Intrinsics.checkNotNullParameter(assetIdToLinkMap, "assetIdToLinkMap");
        Intrinsics.checkNotNullParameter(responseClickTrackers, "responseClickTrackers");
        this.a = assetIdToLinkMap;
        this.b = mainLink;
        this.c = responseClickTrackers;
    }
}
