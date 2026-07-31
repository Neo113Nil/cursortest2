package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.mediationsdk.model.Placement;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.לּ, reason: contains not printable characters */
/* loaded from: classes11.dex */
public final class C1184 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1027 f3070;

    public C1184(C1027 c1027) {
        this.f3070 = c1027;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C1027 c1027 = this.f3070;
        Placement placement = (Placement) arrayList.get(0);
        c1027.getClass();
        if (placement != null) {
            return placement.getPlacementName();
        }
        return null;
    }
}
