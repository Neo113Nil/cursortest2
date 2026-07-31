package com.ironsource.adqualitysdk.sdk.i;

import com.fyber.fairbid.sdk.placements.Placement;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﾐ, reason: contains not printable characters */
/* loaded from: classes15.dex */
public final class C1345 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1161 f3701;

    public C1345(C1161 c1161) {
        this.f3701 = c1161;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C1161 c1161 = this.f3701;
        Placement placement = (Placement) arrayList.get(0);
        c1161.getClass();
        return placement.getName();
    }
}
