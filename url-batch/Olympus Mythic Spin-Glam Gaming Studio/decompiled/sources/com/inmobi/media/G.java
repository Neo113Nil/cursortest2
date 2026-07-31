package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.ContextData;
import com.inmobi.media.ads.network.common.model.MetaInfo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public final class G {
    public final /* synthetic */ C4274q1 a;
    public final D b;
    public final String c;
    public final MetaInfo d;
    public final String e;
    public final List f;
    public final List g;
    public final ContextData h;
    public final String i;
    public final long j;
    public final long k;
    public final JSONObject l;
    public final F m;
    public final E n;

    public G(D adSetContext, String markupType, MetaInfo metaInfo, String creativeId, String tracking, List trackers, List trackingInfo, ContextData contextData, String str, long j, long j2, JSONObject transactionInfo, F viewability, E mrc50, C4274q1 adManagerContext) {
        Intrinsics.checkNotNullParameter(adSetContext, "adSetContext");
        Intrinsics.checkNotNullParameter(markupType, "markupType");
        Intrinsics.checkNotNullParameter(creativeId, "creativeId");
        Intrinsics.checkNotNullParameter(tracking, "tracking");
        Intrinsics.checkNotNullParameter(trackers, "trackers");
        Intrinsics.checkNotNullParameter(trackingInfo, "trackingInfo");
        Intrinsics.checkNotNullParameter(transactionInfo, "transactionInfo");
        Intrinsics.checkNotNullParameter(viewability, "viewability");
        Intrinsics.checkNotNullParameter(mrc50, "mrc50");
        Intrinsics.checkNotNullParameter(adManagerContext, "adManagerContext");
        this.a = adManagerContext;
        this.b = adSetContext;
        this.c = markupType;
        this.d = metaInfo;
        this.e = creativeId;
        this.f = trackers;
        this.g = trackingInfo;
        this.h = contextData;
        this.i = str;
        this.j = j;
        this.k = j2;
        this.l = transactionInfo;
        this.m = viewability;
        this.n = mrc50;
    }
}
