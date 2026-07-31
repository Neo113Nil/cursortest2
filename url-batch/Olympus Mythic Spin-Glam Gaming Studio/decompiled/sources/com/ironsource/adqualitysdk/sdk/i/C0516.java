package com.ironsource.adqualitysdk.sdk.i;

import com.facebook.ads.Ad;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ν, reason: contains not printable characters */
/* loaded from: classes11.dex */
public final class C0516 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0426 f480;

    public C0516(C0426 c0426) {
        this.f480 = c0426;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C0426 c0426 = this.f480;
        Ad ad = (Ad) arrayList.get(0);
        c0426.getClass();
        return ad.getPlacementId();
    }
}
