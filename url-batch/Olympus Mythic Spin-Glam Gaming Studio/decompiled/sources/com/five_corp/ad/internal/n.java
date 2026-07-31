package com.five_corp.ad.internal;

import com.five_corp.ad.FiveAdInterstitial;
import com.five_corp.ad.FiveAdInterstitialEventListener;

/* loaded from: classes3.dex */
public final class n implements p {
    public final /* synthetic */ FiveAdInterstitialEventListener a;
    public final /* synthetic */ FiveAdInterstitial b;

    public n(FiveAdInterstitialEventListener fiveAdInterstitialEventListener, FiveAdInterstitial fiveAdInterstitial) {
        this.a = fiveAdInterstitialEventListener;
        this.b = fiveAdInterstitial;
    }

    @Override // com.five_corp.ad.internal.p
    public final void a() {
    }

    @Override // com.five_corp.ad.internal.p
    public final void b() {
        this.a.onFullScreenOpen(this.b);
    }

    @Override // com.five_corp.ad.internal.p
    public final void c() {
        this.a.onFullScreenClose(this.b);
    }
}
