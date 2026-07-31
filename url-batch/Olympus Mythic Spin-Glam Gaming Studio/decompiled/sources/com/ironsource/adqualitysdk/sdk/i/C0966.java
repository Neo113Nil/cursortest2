package com.ironsource.adqualitysdk.sdk.i;

import com.five_corp.ad.FiveAdInterface;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᴣ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C0966 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0894 f2298;

    public C0966(C0894 c0894) {
        this.f2298 = c0894;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C0894 c0894 = this.f2298;
        FiveAdInterface fiveAdInterface = (FiveAdInterface) arrayList.get(0);
        c0894.getClass();
        return fiveAdInterface.getCreativeType();
    }
}
