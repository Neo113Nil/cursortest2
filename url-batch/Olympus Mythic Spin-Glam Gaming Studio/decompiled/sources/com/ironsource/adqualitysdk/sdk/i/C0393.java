package com.ironsource.adqualitysdk.sdk.i;

import com.chartboost.sdk.Chartboost;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ŷ, reason: contains not printable characters */
/* loaded from: classes13.dex */
public final class C0393 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1308 f214;

    public C0393(C1308 c1308) {
        this.f214 = c1308;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C1308 c1308 = this.f214;
        c1308.getClass();
        Chartboost.setDelegate(new C1310(c1308, Chartboost.getDelegate(), c1189));
        return null;
    }
}
