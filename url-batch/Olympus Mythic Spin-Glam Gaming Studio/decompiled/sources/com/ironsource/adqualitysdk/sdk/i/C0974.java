package com.ironsource.adqualitysdk.sdk.i;

import com.mintegral.msdk.out.BannerAdListener;
import com.mintegral.msdk.out.MTGBannerView;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᴰ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C0974 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0759 f2336;

    public C0974(C0759 c0759) {
        this.f2336 = c0759;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C0759 c0759 = this.f2336;
        MTGBannerView mTGBannerView = (MTGBannerView) arrayList.get(0);
        BannerAdListener bannerAdListener = (BannerAdListener) arrayList.get(1);
        c0759.getClass();
        mTGBannerView.setBannerAdListener(bannerAdListener);
        return null;
    }
}
