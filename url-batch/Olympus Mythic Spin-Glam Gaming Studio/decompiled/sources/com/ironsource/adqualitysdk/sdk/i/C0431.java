package com.ironsource.adqualitysdk.sdk.i;

import com.qq.e.ads.interstitial2.UnifiedInterstitialAD;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ɩ, reason: contains not printable characters */
/* loaded from: classes12.dex */
public final class C0431 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1248 f300;

    public C0431(C1248 c1248) {
        this.f300 = c1248;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C1248 c1248 = this.f300;
        UnifiedInterstitialAD unifiedInterstitialAD = (UnifiedInterstitialAD) arrayList.get(0);
        c1248.getClass();
        return unifiedInterstitialAD.getExt();
    }
}
