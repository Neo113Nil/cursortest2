package com.ironsource.adqualitysdk.sdk.i;

import java.util.ArrayList;
import net.pubnative.lite.sdk.models.Ad;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﻴ, reason: contains not printable characters */
/* loaded from: classes14.dex */
public final class C1292 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1249 f3458;

    public C1292(C1249 c1249) {
        this.f3458 = c1249;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C1249 c1249 = this.f3458;
        Ad ad = (Ad) arrayList.get(0);
        String str = (String) arrayList.get(1);
        c1249.getClass();
        return ad.getMeta(str);
    }
}
