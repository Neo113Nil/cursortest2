package com.ironsource.adqualitysdk.sdk.i;

import com.vungle.ads.internal.model.AdPayload;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﹳ, reason: contains not printable characters */
/* loaded from: classes15.dex */
public final class C1238 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0482 f3240;

    public C1238(C0482 c0482) {
        this.f3240 = c0482;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C0482 c0482 = this.f3240;
        AdPayload adPayload = (AdPayload) arrayList.get(0);
        c0482.getClass();
        return adPayload.adUnit();
    }
}
