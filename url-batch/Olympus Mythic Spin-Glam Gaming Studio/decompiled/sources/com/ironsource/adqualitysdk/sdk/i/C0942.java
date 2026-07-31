package com.ironsource.adqualitysdk.sdk.i;

import com.five_corp.ad.FiveAdCustomLayout;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᘤ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C0942 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0894 f2246;

    public C0942(C0894 c0894) {
        this.f2246 = c0894;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C0894 c0894 = this.f2246;
        FiveAdCustomLayout fiveAdCustomLayout = (FiveAdCustomLayout) arrayList.get(0);
        c0894.getClass();
        return fiveAdCustomLayout.getAdvertiserName();
    }
}
