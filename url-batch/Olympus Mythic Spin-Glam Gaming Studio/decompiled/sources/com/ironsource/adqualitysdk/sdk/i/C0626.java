package com.ironsource.adqualitysdk.sdk.i;

import java.util.ArrayList;
import net.pubnative.lite.sdk.vpaid.models.vast.Companion;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ױ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C0626 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1249 f1261;

    public C0626(C1249 c1249) {
        this.f1261 = c1249;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C1249 c1249 = this.f1261;
        Companion companion = (Companion) arrayList.get(0);
        c1249.getClass();
        return companion.getCompanionClickThrough();
    }
}
