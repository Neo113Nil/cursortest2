package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.MetaInfo;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public abstract class Hk {
    public static final Map a(G g) {
        String creativeType;
        Intrinsics.checkNotNullParameter(g, "<this>");
        Map mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("plId", Long.valueOf(g.a.a.a)), TuplesKt.to("plType", g.a.a.h), TuplesKt.to("adType", "native"), TuplesKt.to("markupType", g.c), TuplesKt.to("creativeId", "\"" + g.e + "\""), TuplesKt.to("impressionId", "\"" + g.m.b + "\""), TuplesKt.to("isRewarded", Boolean.valueOf(g.b.a)));
        MetaInfo metaInfo = g.d;
        if (metaInfo != null && (creativeType = metaInfo.getCreativeType()) != null) {
            mutableMapOf.put("creativeType", creativeType);
        }
        String str = g.i;
        if (str != null) {
            mutableMapOf.put("metadataBlob", str);
        }
        return mutableMapOf;
    }

    public static final Map a(C4274q1 c4274q1) {
        Intrinsics.checkNotNullParameter(c4274q1, "<this>");
        return MapsKt.mutableMapOf(TuplesKt.to("plId", Long.valueOf(c4274q1.a.a)), TuplesKt.to("plType", c4274q1.a.h), TuplesKt.to("adType", "native"));
    }
}
