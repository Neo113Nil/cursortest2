package com.ironsource.adqualitysdk.sdk.i;

import com.smaato.sdk.core.ad.AdPresenter;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ⅰ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C1122 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0563 f2869;

    public C1122(C0563 c0563) {
        this.f2869 = c0563;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C0563 c0563 = this.f2869;
        AdPresenter adPresenter = (AdPresenter) arrayList.get(0);
        c0563.getClass();
        return adPresenter.getAdSpaceId();
    }
}
