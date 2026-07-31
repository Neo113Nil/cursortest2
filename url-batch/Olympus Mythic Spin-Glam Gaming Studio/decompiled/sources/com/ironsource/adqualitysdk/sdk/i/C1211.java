package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﮃ, reason: contains not printable characters */
/* loaded from: classes11.dex */
public final class C1211 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1027 f3180;

    public C1211(C1027 c1027) {
        this.f3180 = c1027;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C1027 c1027 = this.f3180;
        AdData adData = (AdData) arrayList.get(0);
        c1027.getClass();
        return adData.getServerData();
    }
}
