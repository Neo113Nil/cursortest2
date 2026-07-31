package com.ironsource.adqualitysdk.sdk.i;

import java.util.ArrayList;
import tv.superawesome.lib.samodelspace.saad.SAAd;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.וּ, reason: contains not printable characters */
/* loaded from: classes11.dex */
public final class C1178 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0994 f3004;

    public C1178(C0994 c0994) {
        this.f3004 = c0994;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C0994 c0994 = this.f3004;
        SAAd sAAd = (SAAd) arrayList.get(0);
        c0994.getClass();
        return sAAd.writeToJson();
    }
}
