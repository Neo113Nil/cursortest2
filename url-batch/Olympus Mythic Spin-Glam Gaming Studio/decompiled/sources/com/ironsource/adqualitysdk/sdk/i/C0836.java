package com.ironsource.adqualitysdk.sdk.i;

import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᒹ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0836 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0795 f2047;

    public C0836(C0795 c0795) {
        this.f2047 = c0795;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C0795 c0795 = this.f2047;
        AppLovinInterstitialAdDialog appLovinInterstitialAdDialog = (AppLovinInterstitialAdDialog) arrayList.get(0);
        AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener = (AppLovinAdVideoPlaybackListener) arrayList.get(1);
        c0795.getClass();
        appLovinInterstitialAdDialog.setAdVideoPlaybackListener(appLovinAdVideoPlaybackListener);
        return null;
    }
}
