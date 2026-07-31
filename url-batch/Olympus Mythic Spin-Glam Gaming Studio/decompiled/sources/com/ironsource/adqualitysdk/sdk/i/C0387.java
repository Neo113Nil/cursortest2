package com.ironsource.adqualitysdk.sdk.i;

import java.util.ArrayList;
import net.pubnative.lite.sdk.vpaid.models.vpaid.CreativeParams;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ŗ, reason: contains not printable characters */
/* loaded from: classes13.dex */
public final class C0387 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1249 f207;

    public C0387(C1249 c1249) {
        this.f207 = c1249;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C1249 c1249 = this.f207;
        CreativeParams creativeParams = (CreativeParams) arrayList.get(0);
        c1249.getClass();
        return creativeParams.getCreativeData();
    }
}
