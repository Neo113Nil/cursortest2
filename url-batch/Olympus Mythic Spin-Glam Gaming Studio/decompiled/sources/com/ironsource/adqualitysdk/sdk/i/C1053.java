package com.ironsource.adqualitysdk.sdk.i;

import com.five_corp.ad.FiveAdInterface;
import com.five_corp.ad.FiveAdLoadListener;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ṭ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1053 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0894 f2660;

    public C1053(C0894 c0894) {
        this.f2660 = c0894;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C0894 c0894 = this.f2660;
        FiveAdInterface fiveAdInterface = (FiveAdInterface) arrayList.get(0);
        FiveAdLoadListener fiveAdLoadListener = (FiveAdLoadListener) arrayList.get(1);
        c0894.getClass();
        fiveAdInterface.setLoadListener(fiveAdLoadListener);
        return null;
    }
}
