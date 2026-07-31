package com.ironsource.adqualitysdk.sdk.i;

import com.chartboost.sdk.ChartboostDelegate;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﾜ, reason: contains not printable characters */
/* loaded from: classes15.dex */
public final class C1352 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1308 f3709;

    public C1352(C1308 c1308) {
        this.f3709 = c1308;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C1308 c1308 = this.f3709;
        ChartboostDelegate chartboostDelegate = (ChartboostDelegate) arrayList.get(0);
        c1308.getClass();
        return new C1310(c1308, chartboostDelegate, c1189);
    }
}
