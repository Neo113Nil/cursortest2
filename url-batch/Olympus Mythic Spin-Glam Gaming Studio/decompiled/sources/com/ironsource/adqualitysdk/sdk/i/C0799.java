package com.ironsource.adqualitysdk.sdk.i;

import com.smaato.sdk.interstitial.InterstitialAdBase;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᑉ, reason: contains not printable characters */
/* loaded from: classes11.dex */
public final class C0799 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0563 f1985;

    public C0799(C0563 c0563) {
        this.f1985 = c0563;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C0563 c0563 = this.f1985;
        InterstitialAdBase interstitialAdBase = (InterstitialAdBase) arrayList.get(0);
        c0563.getClass();
        return interstitialAdBase.getCreativeId();
    }
}
