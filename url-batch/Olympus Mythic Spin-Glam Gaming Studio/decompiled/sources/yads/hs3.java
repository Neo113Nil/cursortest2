package yads;

import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.interstitial.InterstitialAdLoadListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class hs3 extends Lambda implements Function0 {
    public final /* synthetic */ js3 b;
    public final /* synthetic */ AdRequestError c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hs3(js3 js3Var, AdRequestError adRequestError) {
        super(0);
        this.b = js3Var;
        this.c = adRequestError;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        InterstitialAdLoadListener interstitialAdLoadListener = this.b.a;
        if (interstitialAdLoadListener != null) {
            interstitialAdLoadListener.onAdFailedToLoad(this.c);
        }
        return Unit.INSTANCE;
    }
}
