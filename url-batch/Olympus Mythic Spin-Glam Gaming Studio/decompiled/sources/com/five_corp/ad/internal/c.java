package com.five_corp.ad.internal;

import com.five_corp.ad.FiveAdErrorCode;
import com.five_corp.ad.FiveAdInterstitial;
import com.five_corp.ad.FiveAdInterstitialEventListener;

/* loaded from: classes3.dex */
public final class c implements f {
    public final /* synthetic */ FiveAdInterstitialEventListener a;
    public final /* synthetic */ FiveAdInterstitial b;

    public c(FiveAdInterstitialEventListener fiveAdInterstitialEventListener, FiveAdInterstitial fiveAdInterstitial) {
        this.a = fiveAdInterstitialEventListener;
        this.b = fiveAdInterstitial;
    }

    @Override // com.five_corp.ad.internal.f
    public final void a() {
        this.a.onPlay(this.b);
    }

    @Override // com.five_corp.ad.internal.f
    public final void b() {
        this.a.onViewThrough(this.b);
    }

    @Override // com.five_corp.ad.internal.f
    public final void c() {
        this.a.onPause(this.b);
    }

    @Override // com.five_corp.ad.internal.f
    public final void d() {
        this.a.onClick(this.b);
    }

    @Override // com.five_corp.ad.internal.f
    public final void e() {
        this.a.onImpression(this.b);
    }

    @Override // com.five_corp.ad.internal.f
    public final void a(FiveAdErrorCode fiveAdErrorCode) {
        this.a.onViewError(this.b, fiveAdErrorCode);
    }
}
