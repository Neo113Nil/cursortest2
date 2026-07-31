package yads;

import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.rewarded.RewardedAdLoadListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class kt3 extends Lambda implements Function0 {
    public final /* synthetic */ mt3 b;
    public final /* synthetic */ AdRequestError c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kt3(mt3 mt3Var, AdRequestError adRequestError) {
        super(0);
        this.b = mt3Var;
        this.c = adRequestError;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        RewardedAdLoadListener rewardedAdLoadListener = this.b.a;
        if (rewardedAdLoadListener != null) {
            rewardedAdLoadListener.onAdFailedToLoad(this.c);
        }
        return Unit.INSTANCE;
    }
}
