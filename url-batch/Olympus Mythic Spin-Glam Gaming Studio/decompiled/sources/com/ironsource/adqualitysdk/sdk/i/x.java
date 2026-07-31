package com.ironsource.adqualitysdk.sdk.i;

import com.yandex.mobile.ads.banner.BannerAdEventListener;
import com.yandex.mobile.ads.banner.BannerAdView;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class x implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ H f170;

    public x(H h) {
        this.f170 = h;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        H h = this.f170;
        BannerAdView bannerAdView = (BannerAdView) arrayList.get(0);
        BannerAdEventListener bannerAdEventListener = (BannerAdEventListener) arrayList.get(1);
        h.getClass();
        bannerAdView.setBannerAdEventListener(bannerAdEventListener);
        return null;
    }
}
