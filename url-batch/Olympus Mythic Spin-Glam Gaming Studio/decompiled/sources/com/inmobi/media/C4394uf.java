package com.inmobi.media;

import com.inmobi.media.core.config.models.SignalsConfig;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.uf, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4394uf extends AbstractC4275q2 {
    public final C4340sf b;
    public final C4493y9 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4394uf(SignalsConfig.NovatiqConfig mConfig, C4340sf data, C4493y9 c4493y9) {
        super(mConfig.getBeaconUrl());
        Intrinsics.checkNotNullParameter(mConfig, "mConfig");
        Intrinsics.checkNotNullParameter(data, "data");
        this.b = data;
        this.c = c4493y9;
    }

    public final Xe a() {
        C4493y9 c4493y9 = this.c;
        if (c4493y9 != null) {
            C4340sf c4340sf = this.b;
            c4493y9.a("Novatiq", "preparing Novatiq request with data - hyperId - " + c4340sf.a + " - sspHost - " + c4340sf.b + " - pubId - inmobi");
        }
        String str = this.a;
        Pair pair = TuplesKt.to("sptoken", this.b.a);
        this.b.getClass();
        Pair pair2 = TuplesKt.to("sspid", "i6i");
        Pair pair3 = TuplesKt.to("ssphost", this.b.b);
        this.b.getClass();
        return new Xe(str, null, null, MapsKt.mapOf(pair, pair2, pair3, TuplesKt.to("pubid", "inmobi")), null, false, 54);
    }
}
