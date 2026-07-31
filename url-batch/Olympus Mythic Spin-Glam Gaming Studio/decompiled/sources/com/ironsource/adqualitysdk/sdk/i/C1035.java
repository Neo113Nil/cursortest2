package com.ironsource.adqualitysdk.sdk.i;

import com.five_corp.ad.FiveAdConfig;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ḭ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1035 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0894 f2623;

    public C1035(C0894 c0894) {
        this.f2623 = c0894;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C0894 c0894 = this.f2623;
        FiveAdConfig fiveAdConfig = (FiveAdConfig) arrayList.get(0);
        c0894.getClass();
        return fiveAdConfig.appId;
    }
}
