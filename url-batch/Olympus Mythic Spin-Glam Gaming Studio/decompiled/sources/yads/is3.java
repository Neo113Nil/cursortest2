package yads;

import com.yandex.mobile.ads.interstitial.InterstitialAdLoadListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes10.dex */
public final class is3 extends Lambda implements Function0 {
    public final /* synthetic */ js3 b;
    public final /* synthetic */ as3 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public is3(js3 js3Var, as3 as3Var) {
        super(0);
        this.b = js3Var;
        this.c = as3Var;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        InterstitialAdLoadListener interstitialAdLoadListener = this.b.a;
        if (interstitialAdLoadListener != null) {
            interstitialAdLoadListener.onAdLoaded(this.c);
        }
        return Unit.INSTANCE;
    }
}
