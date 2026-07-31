package com.ironsource.adqualitysdk.sdk.i;

import java.util.ArrayList;
import net.pubnative.lite.sdk.models.Ad;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᵖ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C1012 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1249 f2516;

    public C1012(C1249 c1249) {
        this.f2516 = c1249;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C1249 c1249 = this.f2516;
        Ad ad = (Ad) arrayList.get(0);
        String str = (String) arrayList.get(1);
        c1249.getClass();
        return ad.getBeacons(str);
    }
}
