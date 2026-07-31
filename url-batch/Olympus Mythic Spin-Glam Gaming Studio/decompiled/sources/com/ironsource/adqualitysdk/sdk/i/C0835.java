package com.ironsource.adqualitysdk.sdk.i;

import com.applovin.adview.AdViewController;
import com.applovin.sdk.AppLovinAdDisplayListener;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᒸ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0835 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0795 f2046;

    public C0835(C0795 c0795) {
        this.f2046 = c0795;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C0795 c0795 = this.f2046;
        AdViewController adViewController = (AdViewController) arrayList.get(0);
        AppLovinAdDisplayListener appLovinAdDisplayListener = (AppLovinAdDisplayListener) arrayList.get(1);
        c0795.getClass();
        adViewController.setAdDisplayListener(appLovinAdDisplayListener);
        return null;
    }
}
