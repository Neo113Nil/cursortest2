package com.ironsource.adqualitysdk.sdk.i;

import com.yandex.mobile.ads.rewarded.Reward;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class C implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ H f92;

    public C(H h) {
        this.f92 = h;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        H h = this.f92;
        Reward reward = (Reward) arrayList.get(0);
        h.getClass();
        return Integer.valueOf(reward.getAmount());
    }
}
