package yads;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.nativeads.NativeAdLoadListener;

/* loaded from: classes6.dex */
public final class us3 implements a10 {
    public final NativeAdLoadListener a;

    public us3(NativeAdLoadListener nativeAdLoadListener) {
        this.a = nativeAdLoadListener;
    }

    @Override // yads.a10
    public final void a(m12 m12Var) {
        new CallbackStackTraceMarker(new ts3(this, new com.yandex.mobile.ads.nativeads.g(m12Var)));
    }

    @Override // yads.a10
    public final void onAdFailedToLoad(d4 d4Var) {
        new CallbackStackTraceMarker(new ss3(this, new AdRequestError(d4Var.a, d4Var.c, d4Var.d)));
    }
}
