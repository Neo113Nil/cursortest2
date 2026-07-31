package com.ironsource.adqualitysdk.sdk.i;

import com.smaato.sdk.interstitial.InterstitialAdBase;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᑦ, reason: contains not printable characters */
/* loaded from: classes10.dex */
public final class C0802 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0563 f1987;

    public C0802(C0563 c0563) {
        this.f1987 = c0563;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C0563 c0563 = this.f1987;
        InterstitialAdBase interstitialAdBase = (InterstitialAdBase) arrayList.get(0);
        c0563.getClass();
        return interstitialAdBase.getAdSpaceId();
    }
}
