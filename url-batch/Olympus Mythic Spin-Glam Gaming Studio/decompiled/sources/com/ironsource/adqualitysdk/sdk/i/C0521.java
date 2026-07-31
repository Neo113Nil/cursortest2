package com.ironsource.adqualitysdk.sdk.i;

import com.smaato.sdk.core.api.ApiAdResponse;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ϊ, reason: contains not printable characters */
/* loaded from: classes10.dex */
public final class C0521 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0563 f494;

    public C0521(C0563 c0563) {
        this.f494 = c0563;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C0563 c0563 = this.f494;
        ApiAdResponse apiAdResponse = (ApiAdResponse) arrayList.get(0);
        c0563.getClass();
        return apiAdResponse.getBody();
    }
}
