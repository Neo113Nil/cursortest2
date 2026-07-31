package com.ironsource.adqualitysdk.sdk.i;

import com.yandex.mobile.ads.rewarded.Reward;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class D implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ H f93;

    public D(H h) {
        this.f93 = h;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        H h = this.f93;
        Reward reward = (Reward) arrayList.get(0);
        h.getClass();
        return reward.getType();
    }
}
