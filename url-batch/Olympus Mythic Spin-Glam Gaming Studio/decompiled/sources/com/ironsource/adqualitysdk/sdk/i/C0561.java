package com.ironsource.adqualitysdk.sdk.i;

import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ѕ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0561 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0547 f810;

    public C0561(C0547 c0547) {
        this.f810 = c0547;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C0547 c0547 = this.f810;
        PAGBannerAd pAGBannerAd = (PAGBannerAd) arrayList.get(0);
        c0547.getClass();
        return pAGBannerAd.getBannerView();
    }
}
