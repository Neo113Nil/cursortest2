package com.ironsource.adqualitysdk.sdk.i;

import com.unity3d.services.banners.BannerView;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ו, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C0606 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1011 f1042;

    public C0606(C1011 c1011) {
        this.f1042 = c1011;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C1011 c1011 = this.f1042;
        BannerView bannerView = (BannerView) arrayList.get(0);
        c1011.getClass();
        return bannerView.getPlacementId();
    }
}
