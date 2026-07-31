package com.ironsource.adqualitysdk.sdk.i;

import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionListener;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ӭ, reason: contains not printable characters */
/* loaded from: classes9.dex */
public final class C0582 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0547 f970;

    public C0582(C0547 c0547) {
        this.f970 = c0547;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C0547 c0547 = this.f970;
        PAGBannerAd pAGBannerAd = (PAGBannerAd) arrayList.get(0);
        PAGBannerAdInteractionListener pAGBannerAdInteractionListener = (PAGBannerAdInteractionListener) arrayList.get(1);
        c0547.getClass();
        pAGBannerAd.setAdInteractionListener(pAGBannerAdInteractionListener);
        return null;
    }
}
