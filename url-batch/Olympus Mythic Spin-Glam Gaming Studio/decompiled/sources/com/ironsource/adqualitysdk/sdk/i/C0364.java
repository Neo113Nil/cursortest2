package com.ironsource.adqualitysdk.sdk.i;

import com.mbridge.msdk.out.BannerAdListener;
import com.mbridge.msdk.out.MBBannerView;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ī, reason: contains not printable characters */
/* loaded from: classes12.dex */
public final class C0364 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1301 f181;

    public C0364(C1301 c1301) {
        this.f181 = c1301;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C1301 c1301 = this.f181;
        MBBannerView mBBannerView = (MBBannerView) arrayList.get(0);
        BannerAdListener bannerAdListener = (BannerAdListener) arrayList.get(1);
        c1301.getClass();
        mBBannerView.setBannerAdListener(bannerAdListener);
        return null;
    }
}
