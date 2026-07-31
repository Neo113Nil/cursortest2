package com.ironsource.adqualitysdk.sdk.i;

import com.yandex.mobile.ads.interstitial.InterstitialAd;
import com.yandex.mobile.ads.interstitial.InterstitialAdEventListener;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class G implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ H f96;

    public G(H h) {
        this.f96 = h;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        H h = this.f96;
        InterstitialAd interstitialAd = (InterstitialAd) arrayList.get(0);
        InterstitialAdEventListener interstitialAdEventListener = (InterstitialAdEventListener) arrayList.get(1);
        h.getClass();
        interstitialAd.setAdEventListener(interstitialAdEventListener);
        return null;
    }
}
