package com.ironsource.adqualitysdk.sdk.i;

import com.facebook.ads.internal.adapters.AdAdapter;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ʡ, reason: contains not printable characters */
/* loaded from: classes12.dex */
public final class C0458 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0426 f345;

    public C0458(C0426 c0426) {
        this.f345 = c0426;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C0426 c0426 = this.f345;
        AdAdapter adAdapter = (AdAdapter) arrayList.get(0);
        c0426.getClass();
        return adAdapter.getPlacementType();
    }
}
