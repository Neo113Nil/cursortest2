package com.ironsource.adqualitysdk.sdk.i;

import java.util.ArrayList;
import net.pubnative.lite.sdk.models.AdData;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᴿ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0989 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1249 f2366;

    public C0989(C1249 c1249) {
        this.f2366 = c1249;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C1249 c1249 = this.f2366;
        AdData adData = (AdData) arrayList.get(0);
        c1249.getClass();
        return adData.getHtml();
    }
}
