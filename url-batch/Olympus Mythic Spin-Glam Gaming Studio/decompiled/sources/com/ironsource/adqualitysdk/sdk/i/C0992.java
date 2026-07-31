package com.ironsource.adqualitysdk.sdk.i;

import com.five_corp.ad.FiveAdInterface;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᵂ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0992 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0894 f2372;

    public C0992(C0894 c0894) {
        this.f2372 = c0894;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C0894 c0894 = this.f2372;
        FiveAdInterface fiveAdInterface = (FiveAdInterface) arrayList.get(0);
        c0894.getClass();
        return fiveAdInterface.getFiveAdTag();
    }
}
