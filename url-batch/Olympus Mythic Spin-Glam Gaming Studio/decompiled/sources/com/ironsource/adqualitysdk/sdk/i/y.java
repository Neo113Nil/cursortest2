package com.ironsource.adqualitysdk.sdk.i;

import com.yandex.mobile.ads.common.AdInfo;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class y implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ H f171;

    public y(H h) {
        this.f171 = h;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        H h = this.f171;
        AdInfo adInfo = (AdInfo) arrayList.get(0);
        h.getClass();
        return adInfo.getAdUnitId();
    }
}
