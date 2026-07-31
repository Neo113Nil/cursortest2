package com.ironsource.adqualitysdk.sdk.i;

import java.util.ArrayList;
import net.pubnative.lite.sdk.vpaid.models.vast.VideoClicks;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ڍ, reason: contains not printable characters */
/* loaded from: classes15.dex */
public final class C0656 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1249 f1393;

    public C0656(C1249 c1249) {
        this.f1393 = c1249;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C1249 c1249 = this.f1393;
        VideoClicks videoClicks = (VideoClicks) arrayList.get(0);
        c1249.getClass();
        return videoClicks.getClickThrough();
    }
}
