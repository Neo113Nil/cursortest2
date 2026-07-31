package yads;

import com.yandex.mobile.ads.interstitial.InterstitialAdEventListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes13.dex */
public final class fs3 extends Lambda implements Function0 {
    public final /* synthetic */ gs3 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fs3(gs3 gs3Var) {
        super(0);
        this.b = gs3Var;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        InterstitialAdEventListener interstitialAdEventListener = this.b.a;
        if (interstitialAdEventListener != null) {
            interstitialAdEventListener.onAdShown();
        }
        return Unit.INSTANCE;
    }
}
