package com.ironsource.adqualitysdk.sdk.i;

import java.util.ArrayList;
import net.pubnative.lite.sdk.vpaid.models.vast.VideoClicks;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ڌ, reason: contains not printable characters */
/* loaded from: classes15.dex */
public final class C0655 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1249 f1392;

    public C0655(C1249 c1249) {
        this.f1392 = c1249;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C1249 c1249 = this.f1392;
        VideoClicks videoClicks = (VideoClicks) arrayList.get(0);
        c1249.getClass();
        return videoClicks.getClickTrackingList();
    }
}
