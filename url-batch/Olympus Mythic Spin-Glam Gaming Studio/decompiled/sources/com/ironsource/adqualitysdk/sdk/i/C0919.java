package com.ironsource.adqualitysdk.sdk.i;

import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdEventListener;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᖨ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C0919 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0795 f2214;

    public C0919(C0795 c0795) {
        this.f2214 = c0795;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C0795 c0795 = this.f2214;
        AppLovinNativeAdImpl appLovinNativeAdImpl = (AppLovinNativeAdImpl) arrayList.get(0);
        AppLovinNativeAdEventListener appLovinNativeAdEventListener = (AppLovinNativeAdEventListener) arrayList.get(1);
        c0795.getClass();
        appLovinNativeAdImpl.setEventListener(appLovinNativeAdEventListener);
        return null;
    }
}
