package com.ironsource.adqualitysdk.sdk.i;

import com.applovin.sdk.AppLovinAd;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᒏ, reason: contains not printable characters */
/* loaded from: classes8.dex */
public final class C0810 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0795 f1996;

    public C0810(C0795 c0795) {
        this.f1996 = c0795;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C0795 c0795 = this.f1996;
        AppLovinAd appLovinAd = (AppLovinAd) arrayList.get(0);
        c0795.getClass();
        return appLovinAd.getZoneId();
    }
}
