package com.ironsource.adqualitysdk.sdk.i;

import io.bidmachine.rewarded.RewardedAd;
import io.bidmachine.rewarded.RewardedListener;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ৰ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C0720 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0648 f1601;

    public C0720(C0648 c0648) {
        this.f1601 = c0648;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C0648 c0648 = this.f1601;
        RewardedAd rewardedAd = (RewardedAd) arrayList.get(0);
        RewardedListener rewardedListener = (RewardedListener) arrayList.get(1);
        c0648.getClass();
        rewardedAd.setListener(rewardedListener);
        return null;
    }
}
