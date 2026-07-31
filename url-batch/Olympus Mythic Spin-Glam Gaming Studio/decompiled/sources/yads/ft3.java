package yads;

import com.yandex.mobile.ads.rewarded.RewardedAdEventListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes14.dex */
public final class ft3 extends Lambda implements Function0 {
    public final /* synthetic */ jt3 b;
    public final /* synthetic */ xp3 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ft3(jt3 jt3Var, xp3 xp3Var) {
        super(0);
        this.b = jt3Var;
        this.c = xp3Var;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        RewardedAdEventListener rewardedAdEventListener = this.b.a;
        if (rewardedAdEventListener != null) {
            rewardedAdEventListener.onAdFailedToShow(this.c);
        }
        return Unit.INSTANCE;
    }
}
