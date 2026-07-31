package com.ironsource.adqualitysdk.sdk.i;

import com.moloco.sdk.publisher.Banner;
import com.moloco.sdk.publisher.BannerAdShowListener;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.דּ, reason: contains not printable characters */
/* loaded from: classes11.dex */
public final class C1176 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1172 f3002;

    public C1176(C1172 c1172) {
        this.f3002 = c1172;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C1172 c1172 = this.f3002;
        Banner banner = (Banner) arrayList.get(0);
        BannerAdShowListener bannerAdShowListener = (BannerAdShowListener) arrayList.get(1);
        c1172.getClass();
        banner.setAdShowListener(bannerAdShowListener);
        return null;
    }
}
