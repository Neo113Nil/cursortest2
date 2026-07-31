package com.ironsource.adqualitysdk.sdk.i;

import com.vungle.ads.internal.model.Placement;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ˑ, reason: contains not printable characters */
/* loaded from: classes12.dex */
public final class C0490 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0482 f433;

    public C0490(C0482 c0482) {
        this.f433 = c0482;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C0482 c0482 = this.f433;
        Placement placement = (Placement) arrayList.get(0);
        c0482.getClass();
        return placement.getReferenceId();
    }
}
