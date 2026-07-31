package com.ironsource.adqualitysdk.sdk.i;

import com.yandex.mobile.ads.rewarded.RewardedAd;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class E implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ H f94;

    public E(H h) {
        this.f94 = h;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        H h = this.f94;
        RewardedAd rewardedAd = (RewardedAd) arrayList.get(0);
        h.getClass();
        return rewardedAd.getInfo();
    }
}
