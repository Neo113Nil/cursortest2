package com.vungle.ads.internal;

import android.content.Context;
import com.vungle.ads.AdConfig;
import com.vungle.ads.BaseAd;
import com.vungle.ads.VungleAdSize;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i0 extends BaseAd {
    public final VungleAdSize s;
    public final j0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(Context context, String placementId, VungleAdSize adSize, AdConfig adConfig) {
        super(context, placementId, adConfig);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        Intrinsics.checkNotNullParameter(adSize, "adSize");
        Intrinsics.checkNotNullParameter(adConfig, "adConfig");
        this.s = adSize;
        s adInternal$vungle_ads_release = getAdInternal$vungle_ads_release();
        Intrinsics.checkNotNull(adInternal$vungle_ads_release, "null cannot be cast to non-null type com.vungle.ads.internal.BannerAdInternal");
        this.t = ((k0) adInternal$vungle_ads_release).a(new h0(this));
    }

    public final j0 a() {
        return this.t;
    }

    @Override // com.vungle.ads.BaseAd
    public final s constructAdInternal$vungle_ads_release(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new k0(context, this.s);
    }

    public final VungleAdSize getAdViewSize() {
        s adInternal$vungle_ads_release = getAdInternal$vungle_ads_release();
        Intrinsics.checkNotNull(adInternal$vungle_ads_release, "null cannot be cast to non-null type com.vungle.ads.internal.BannerAdInternal");
        VungleAdSize m = ((k0) adInternal$vungle_ads_release).m();
        return m == null ? this.s : m;
    }
}
