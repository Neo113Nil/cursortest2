package com.ironsource.adqualitysdk.sdk.i;

import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdType;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᘅ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C0937 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0795 f2233;

    public C0937(C0795 c0795) {
        this.f2233 = c0795;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C0795 c0795 = this.f2233;
        boolean z = false;
        AppLovinAd appLovinAd = (AppLovinAd) arrayList.get(0);
        c0795.getClass();
        if (appLovinAd != null && appLovinAd.getType().equals(AppLovinAdType.INCENTIVIZED)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
