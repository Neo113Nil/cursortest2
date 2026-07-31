package com.ironsource.adqualitysdk.sdk.i;

import com.yandex.mobile.ads.rewarded.RewardedAd;
import com.yandex.mobile.ads.rewarded.RewardedAdEventListener;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class F implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ H f95;

    public F(H h) {
        this.f95 = h;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        H h = this.f95;
        RewardedAd rewardedAd = (RewardedAd) arrayList.get(0);
        RewardedAdEventListener rewardedAdEventListener = (RewardedAdEventListener) arrayList.get(1);
        h.getClass();
        rewardedAd.setAdEventListener(rewardedAdEventListener);
        return null;
    }
}
