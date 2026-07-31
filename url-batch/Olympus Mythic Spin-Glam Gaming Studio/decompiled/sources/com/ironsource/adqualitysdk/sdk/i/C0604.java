package com.ironsource.adqualitysdk.sdk.i;

import java.util.ArrayList;
import net.pubnative.lite.sdk.vpaid.models.vast.Creative;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ד, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C0604 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1249 f1040;

    public C0604(C1249 c1249) {
        this.f1040 = c1249;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C1249 c1249 = this.f1040;
        Creative creative = (Creative) arrayList.get(0);
        c1249.getClass();
        return creative.getCompanionAds();
    }
}
