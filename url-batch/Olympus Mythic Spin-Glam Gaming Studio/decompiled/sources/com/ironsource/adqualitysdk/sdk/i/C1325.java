package com.ironsource.adqualitysdk.sdk.i;

import com.fyber.fairbid.ads.Interstitial;
import com.fyber.fairbid.ads.interstitial.InterstitialListener;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ｴ, reason: contains not printable characters */
/* loaded from: classes15.dex */
public final class C1325 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1161 f3669;

    public C1325(C1161 c1161) {
        this.f3669 = c1161;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C1161 c1161 = this.f3669;
        InterstitialListener interstitialListener = (InterstitialListener) arrayList.get(0);
        c1161.getClass();
        Interstitial.setInterstitialListener(interstitialListener);
        return null;
    }
}
