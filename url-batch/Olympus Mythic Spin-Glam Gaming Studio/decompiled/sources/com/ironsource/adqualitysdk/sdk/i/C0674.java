package com.ironsource.adqualitysdk.sdk.i;

import java.util.ArrayList;
import net.pubnative.lite.sdk.vpaid.VideoAdController;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ۃ, reason: contains not printable characters */
/* loaded from: classes15.dex */
public final class C0674 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1249 f1438;

    public C0674(C1249 c1249) {
        this.f1438 = c1249;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C1249 c1249 = this.f1438;
        VideoAdController videoAdController = (VideoAdController) arrayList.get(0);
        c1249.getClass();
        return videoAdController.getAdParams();
    }
}
