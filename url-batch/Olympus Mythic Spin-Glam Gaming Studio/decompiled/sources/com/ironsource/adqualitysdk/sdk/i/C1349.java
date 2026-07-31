package com.ironsource.adqualitysdk.sdk.i;

import com.chartboost.sdk.Chartboost;
import com.chartboost.sdk.ChartboostDelegate;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﾗ, reason: contains not printable characters */
/* loaded from: classes15.dex */
public final class C1349 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1308 f3706;

    public C1349(C1308 c1308) {
        this.f3706 = c1308;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C1308 c1308 = this.f3706;
        ChartboostDelegate chartboostDelegate = (ChartboostDelegate) arrayList.get(0);
        c1308.getClass();
        Chartboost.setDelegate(chartboostDelegate);
        return null;
    }
}
