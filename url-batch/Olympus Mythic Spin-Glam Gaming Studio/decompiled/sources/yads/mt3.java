package yads;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.rewarded.RewardedAdLoadListener;

/* loaded from: classes13.dex */
public final class mt3 implements o10 {
    public final RewardedAdLoadListener a;

    public mt3(RewardedAdLoadListener rewardedAdLoadListener) {
        this.a = rewardedAdLoadListener;
    }

    @Override // yads.o10
    public final void a(kr2 kr2Var) {
        new CallbackStackTraceMarker(new lt3(this, new ct3(kr2Var)));
    }

    @Override // yads.o10
    public final void onAdFailedToLoad(d4 d4Var) {
        new CallbackStackTraceMarker(new kt3(this, new AdRequestError(d4Var.a, d4Var.c, d4Var.d)));
    }
}
