package com.ironsource.adqualitysdk.sdk.i;

import java.util.ArrayList;
import net.pubnative.lite.sdk.models.AdData;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᴗ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C0960 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1249 f2293;

    public C0960(C1249 c1249) {
        this.f2293 = c1249;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C1249 c1249 = this.f2293;
        AdData adData = (AdData) arrayList.get(0);
        c1249.getClass();
        return adData.getURL();
    }
}
