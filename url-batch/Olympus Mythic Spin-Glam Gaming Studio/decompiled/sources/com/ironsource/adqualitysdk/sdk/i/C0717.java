package com.ironsource.adqualitysdk.sdk.i;

import io.bidmachine.banner.BannerListener;
import io.bidmachine.banner.BannerView;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.হ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C0717 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0648 f1592;

    public C0717(C0648 c0648) {
        this.f1592 = c0648;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C0648 c0648 = this.f1592;
        BannerView bannerView = (BannerView) arrayList.get(0);
        BannerListener bannerListener = (BannerListener) arrayList.get(1);
        c0648.getClass();
        bannerView.setListener(bannerListener);
        return null;
    }
}
