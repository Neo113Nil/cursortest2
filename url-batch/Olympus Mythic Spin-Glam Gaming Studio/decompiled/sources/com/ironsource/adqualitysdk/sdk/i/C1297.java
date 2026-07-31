package com.ironsource.adqualitysdk.sdk.i;

import com.smaato.sdk.core.mvvm.model.AdResponse;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.＿, reason: contains not printable characters */
/* loaded from: classes14.dex */
public final class C1297 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0563 f3469;

    public C1297(C0563 c0563) {
        this.f3469 = c0563;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C0563 c0563 = this.f3469;
        AdResponse adResponse = (AdResponse) arrayList.get(0);
        c0563.getClass();
        return adResponse.getRichMediaContent();
    }
}
