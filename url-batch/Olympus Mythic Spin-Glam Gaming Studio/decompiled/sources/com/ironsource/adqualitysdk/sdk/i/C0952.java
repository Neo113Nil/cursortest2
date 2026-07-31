package com.ironsource.adqualitysdk.sdk.i;

import com.five_corp.ad.FiveAdInterface;
import com.five_corp.ad.FiveAdListener;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᴈ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C0952 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0894 f2270;

    public C0952(C0894 c0894) {
        this.f2270 = c0894;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C0894 c0894 = this.f2270;
        FiveAdInterface fiveAdInterface = (FiveAdInterface) arrayList.get(0);
        FiveAdListener fiveAdListener = (FiveAdListener) arrayList.get(1);
        c0894.getClass();
        fiveAdInterface.setListener(fiveAdListener);
        return null;
    }
}
