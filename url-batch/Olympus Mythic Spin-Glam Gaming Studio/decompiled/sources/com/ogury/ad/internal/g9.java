package com.ogury.ad.internal;

import com.ogury.ad.OguryReward;
import com.ogury.ad.OguryRewardedAd;
import com.ogury.ad.OguryRewardedAdListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes9.dex */
public final class g9 extends Lambda implements Function1 {
    public final /* synthetic */ OguryRewardedAdListener a;
    public final /* synthetic */ OguryRewardedAd b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g9(OguryRewardedAdListener oguryRewardedAdListener, OguryRewardedAd oguryRewardedAd) {
        super(1);
        this.a = oguryRewardedAdListener;
        this.b = oguryRewardedAd;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        tg rewardItem = (tg) obj;
        Intrinsics.checkNotNullParameter(rewardItem, "rewardItem");
        OguryRewardedAdListener oguryRewardedAdListener = this.a;
        if (oguryRewardedAdListener != null) {
            oguryRewardedAdListener.onAdRewarded(this.b, new OguryReward(rewardItem.a, rewardItem.b));
        }
        return Unit.INSTANCE;
    }
}
