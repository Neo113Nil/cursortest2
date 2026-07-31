package com.ironsource.adqualitysdk.sdk.i;

import com.five_corp.ad.FiveAdInterface;
import com.five_corp.ad.FiveAdViewEventListener;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ṫ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1051 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0894 f2653;

    public C1051(C0894 c0894) {
        this.f2653 = c0894;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C0894 c0894 = this.f2653;
        FiveAdInterface fiveAdInterface = (FiveAdInterface) arrayList.get(0);
        FiveAdViewEventListener fiveAdViewEventListener = (FiveAdViewEventListener) arrayList.get(1);
        c0894.getClass();
        fiveAdInterface.setViewEventListener(fiveAdViewEventListener);
        return null;
    }
}
