package com.ironsource.adqualitysdk.sdk.i;

import com.applovin.sdk.AppLovinAd;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᘦ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C0944 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0795 f2248;

    public C0944(C0795 c0795) {
        this.f2248 = c0795;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C0795 c0795 = this.f2248;
        AppLovinAd appLovinAd = (AppLovinAd) arrayList.get(0);
        c0795.getClass();
        return Boolean.valueOf(appLovinAd.isVideoAd());
    }
}
