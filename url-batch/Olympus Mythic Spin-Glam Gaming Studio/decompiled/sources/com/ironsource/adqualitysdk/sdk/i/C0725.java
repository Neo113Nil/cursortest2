package com.ironsource.adqualitysdk.sdk.i;

import io.bidmachine.interstitial.InterstitialAd;
import io.bidmachine.interstitial.InterstitialListener;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ค, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0725 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0648 f1646;

    public C0725(C0648 c0648) {
        this.f1646 = c0648;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C0648 c0648 = this.f1646;
        InterstitialAd interstitialAd = (InterstitialAd) arrayList.get(0);
        InterstitialListener interstitialListener = (InterstitialListener) arrayList.get(1);
        c0648.getClass();
        interstitialAd.setListener(interstitialListener);
        return null;
    }
}
