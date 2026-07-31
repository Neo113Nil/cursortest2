package com.ironsource.adqualitysdk.sdk.i;

import java.util.ArrayList;
import tv.superawesome.sdk.publisher.SABannerAd;
import tv.superawesome.sdk.publisher.SAInterface;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᵞ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C1019 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0994 f2527;

    public C1019(C0994 c0994) {
        this.f2527 = c0994;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C0994 c0994 = this.f2527;
        SABannerAd sABannerAd = (SABannerAd) arrayList.get(0);
        SAInterface sAInterface = (SAInterface) arrayList.get(1);
        c0994.getClass();
        sABannerAd.setListener(sAInterface);
        return null;
    }
}
