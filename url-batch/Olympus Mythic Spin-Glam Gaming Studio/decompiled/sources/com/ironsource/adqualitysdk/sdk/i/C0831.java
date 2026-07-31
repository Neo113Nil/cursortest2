package com.ironsource.adqualitysdk.sdk.i;

import com.applovin.sdk.AppLovinAd;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᒴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0831 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0795 f2038;

    public C0831(C0795 c0795) {
        this.f2038 = c0795;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C0795 c0795 = this.f2038;
        AppLovinAd appLovinAd = (AppLovinAd) arrayList.get(0);
        c0795.getClass();
        return Long.valueOf(appLovinAd.getAdIdNumber());
    }
}
