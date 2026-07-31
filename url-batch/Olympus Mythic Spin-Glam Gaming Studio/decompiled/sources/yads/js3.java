package yads;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.interstitial.InterstitialAdLoadListener;

/* loaded from: classes15.dex */
public final class js3 implements u00 {
    public final InterstitialAdLoadListener a;

    public js3(InterstitialAdLoadListener interstitialAdLoadListener) {
        this.a = interstitialAdLoadListener;
    }

    @Override // yads.u00
    public final void a(zb1 zb1Var) {
        new CallbackStackTraceMarker(new is3(this, new as3(zb1Var)));
    }

    @Override // yads.u00
    public final void onAdFailedToLoad(d4 d4Var) {
        new CallbackStackTraceMarker(new hs3(this, new AdRequestError(d4Var.a, d4Var.c, d4Var.d)));
    }
}
