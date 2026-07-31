package yads;

import com.yandex.mobile.ads.rewarded.RewardedAdLoadListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
public final class lt3 extends Lambda implements Function0 {
    public final /* synthetic */ mt3 b;
    public final /* synthetic */ ct3 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lt3(mt3 mt3Var, ct3 ct3Var) {
        super(0);
        this.b = mt3Var;
        this.c = ct3Var;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        RewardedAdLoadListener rewardedAdLoadListener = this.b.a;
        if (rewardedAdLoadListener != null) {
            rewardedAdLoadListener.onAdLoaded(this.c);
        }
        return Unit.INSTANCE;
    }
}
