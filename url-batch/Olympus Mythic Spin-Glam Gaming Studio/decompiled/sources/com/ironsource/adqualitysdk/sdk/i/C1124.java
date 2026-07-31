package com.ironsource.adqualitysdk.sdk.i;

import java.util.ArrayList;
import jp.maio.sdk.android.MaioAds;
import jp.maio.sdk.android.MaioAdsListenerInterface;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ⅴ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C1124 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1120 f2871;

    public C1124(C1120 c1120) {
        this.f2871 = c1120;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C1120 c1120 = this.f2871;
        MaioAdsListenerInterface maioAdsListenerInterface = (MaioAdsListenerInterface) arrayList.get(0);
        c1120.getClass();
        MaioAds.setMaioAdsListener(maioAdsListenerInterface);
        return null;
    }
}
