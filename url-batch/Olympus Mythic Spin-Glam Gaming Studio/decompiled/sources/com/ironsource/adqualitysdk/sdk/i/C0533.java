package com.ironsource.adqualitysdk.sdk.i;

import io.presage.interstitial.PresageInterstitial;
import io.presage.interstitial.PresageInterstitialCallback;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ϳ, reason: contains not printable characters */
/* loaded from: classes8.dex */
public final class C0533 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0498 f591;

    public C0533(C0498 c0498) {
        this.f591 = c0498;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C0498 c0498 = this.f591;
        PresageInterstitial presageInterstitial = (PresageInterstitial) arrayList.get(0);
        PresageInterstitialCallback presageInterstitialCallback = (PresageInterstitialCallback) arrayList.get(1);
        c0498.getClass();
        presageInterstitial.setInterstitialCallback(presageInterstitialCallback);
        return null;
    }
}
