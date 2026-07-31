package com.ironsource.adqualitysdk.sdk.i;

import com.vungle.warren.model.Placement;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᵔ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C1010 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0610 f2450;

    public C1010(C0610 c0610) {
        this.f2450 = c0610;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C0610 c0610 = this.f2450;
        Placement placement = (Placement) arrayList.get(0);
        c0610.getClass();
        return Boolean.valueOf(placement.isIncentivized());
    }
}
