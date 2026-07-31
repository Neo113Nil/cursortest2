package com.ironsource.adqualitysdk.sdk.i;

import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ϋ, reason: contains not printable characters */
/* loaded from: classes10.dex */
public final class C0509 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0426 f473;

    public C0509(C0426 c0426) {
        this.f473 = c0426;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C0426 c0426 = this.f473;
        InterstitialAd interstitialAd = (InterstitialAd) arrayList.get(0);
        InterstitialAdListener interstitialAdListener = (InterstitialAdListener) arrayList.get(1);
        c0426.getClass();
        interstitialAd.setAdListener(interstitialAdListener);
        return null;
    }
}
