package com.ironsource.adqualitysdk.sdk.i;

import com.ogury.ad.OguryInterstitialAd;
import com.ogury.ad.OguryInterstitialAdListener;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ɼ, reason: contains not printable characters */
/* loaded from: classes12.dex */
public final class C0439 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0427 f308;

    public C0439(C0427 c0427) {
        this.f308 = c0427;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C0427 c0427 = this.f308;
        OguryInterstitialAd oguryInterstitialAd = (OguryInterstitialAd) arrayList.get(0);
        OguryInterstitialAdListener oguryInterstitialAdListener = (OguryInterstitialAdListener) arrayList.get(1);
        c0427.getClass();
        oguryInterstitialAd.setListener(oguryInterstitialAdListener);
        return null;
    }
}
