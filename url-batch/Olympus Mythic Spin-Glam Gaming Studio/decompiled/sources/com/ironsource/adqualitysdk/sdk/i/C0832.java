package com.ironsource.adqualitysdk.sdk.i;

import com.applovin.adview.AppLovinAdView;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᒵ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0832 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0795 f2039;

    public C0832(C0795 c0795) {
        this.f2039 = c0795;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C0795 c0795 = this.f2039;
        AppLovinAdView appLovinAdView = (AppLovinAdView) arrayList.get(0);
        c0795.getClass();
        return appLovinAdView.getAdViewController();
    }
}
