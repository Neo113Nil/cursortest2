package com.ironsource.adqualitysdk.sdk.i;

import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.sdk.AppLovinAdClickListener;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᖧ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C0918 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0795 f2213;

    public C0918(C0795 c0795) {
        this.f2213 = c0795;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C0795 c0795 = this.f2213;
        AppLovinInterstitialAdDialog appLovinInterstitialAdDialog = (AppLovinInterstitialAdDialog) arrayList.get(0);
        AppLovinAdClickListener appLovinAdClickListener = (AppLovinAdClickListener) arrayList.get(1);
        c0795.getClass();
        appLovinInterstitialAdDialog.setAdClickListener(appLovinAdClickListener);
        return null;
    }
}
