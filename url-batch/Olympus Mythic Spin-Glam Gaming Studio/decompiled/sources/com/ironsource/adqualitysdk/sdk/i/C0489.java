package com.ironsource.adqualitysdk.sdk.i;

import com.unity3d.services.banners.BannerView;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ː, reason: contains not printable characters */
/* loaded from: classes12.dex */
public final class C0489 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1011 f432;

    public C0489(C1011 c1011) {
        this.f432 = c1011;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C1011 c1011 = this.f432;
        BannerView bannerView = (BannerView) arrayList.get(0);
        BannerView.IListener iListener = (BannerView.IListener) arrayList.get(1);
        c1011.getClass();
        bannerView.setListener(iListener);
        return null;
    }
}
