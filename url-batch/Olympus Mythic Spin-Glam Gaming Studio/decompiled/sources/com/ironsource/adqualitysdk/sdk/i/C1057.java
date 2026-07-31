package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAd;
import com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAdListener;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ẋ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1057 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1027 f2673;

    public C1057(C1027 c1027) {
        this.f2673 = c1027;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C1027 c1027 = this.f2673;
        LevelPlayNativeAd levelPlayNativeAd = (LevelPlayNativeAd) arrayList.get(0);
        LevelPlayNativeAdListener levelPlayNativeAdListener = (LevelPlayNativeAdListener) arrayList.get(1);
        c1027.getClass();
        levelPlayNativeAd.setListener(levelPlayNativeAdListener);
        return null;
    }
}
