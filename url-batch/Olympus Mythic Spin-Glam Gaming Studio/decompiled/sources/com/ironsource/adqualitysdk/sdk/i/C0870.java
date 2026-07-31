package com.ironsource.adqualitysdk.sdk.i;

import com.inmobi.ads.AdContainer;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᓼ, reason: contains not printable characters */
/* loaded from: classes9.dex */
public final class C0870 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0771 f2096;

    public C0870(C0771 c0771) {
        this.f2096 = c0771;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C0771 c0771 = this.f2096;
        AdContainer adContainer = (AdContainer) arrayList.get(0);
        c0771.getClass();
        return adContainer.getDataModel();
    }
}
