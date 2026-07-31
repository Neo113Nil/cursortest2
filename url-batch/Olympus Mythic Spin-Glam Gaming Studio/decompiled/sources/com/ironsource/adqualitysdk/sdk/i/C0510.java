package com.ironsource.adqualitysdk.sdk.i;

import java.util.ArrayList;
import net.pubnative.lite.sdk.vpaid.VideoAd;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ί, reason: contains not printable characters */
/* loaded from: classes11.dex */
public final class C0510 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1249 f474;

    public C0510(C1249 c1249) {
        this.f474 = c1249;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C1249 c1249 = this.f474;
        VideoAd videoAd = (VideoAd) arrayList.get(0);
        c1249.getClass();
        return Boolean.valueOf(videoAd.isRewarded());
    }
}
