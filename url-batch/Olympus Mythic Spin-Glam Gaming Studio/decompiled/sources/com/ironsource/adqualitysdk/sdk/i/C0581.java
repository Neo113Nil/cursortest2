package com.ironsource.adqualitysdk.sdk.i;

import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.bannerexpress.BannerExpressView;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ӧ, reason: contains not printable characters */
/* loaded from: classes9.dex */
public final class C0581 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0547 f969;

    public C0581(C0547 c0547) {
        this.f969 = c0547;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C0547 c0547 = this.f969;
        BannerExpressView bannerExpressView = (BannerExpressView) arrayList.get(0);
        PAGBannerAdWrapperListener pAGBannerAdWrapperListener = (PAGBannerAdWrapperListener) arrayList.get(1);
        c0547.getClass();
        bannerExpressView.setExpressInteractionListener(pAGBannerAdWrapperListener);
        return null;
    }
}
