package com.ironsource.adqualitysdk.sdk.i;

import com.vungle.warren.model.Advertisement;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᵎ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C1004 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0610 f2432;

    public C1004(C0610 c0610) {
        this.f2432 = c0610;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C0610 c0610 = this.f2432;
        Advertisement advertisement = (Advertisement) arrayList.get(0);
        c0610.getClass();
        return advertisement.getAdMarketId();
    }
}
