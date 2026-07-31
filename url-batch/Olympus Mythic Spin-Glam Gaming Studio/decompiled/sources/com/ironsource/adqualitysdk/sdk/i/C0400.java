package com.ironsource.adqualitysdk.sdk.i;

import com.smaato.sdk.core.mvvm.model.AdResponse;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ɩ, reason: contains not printable characters */
/* loaded from: classes13.dex */
public final class C0400 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0563 f220;

    public C0400(C0563 c0563) {
        this.f220 = c0563;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C0563 c0563 = this.f220;
        AdResponse adResponse = (AdResponse) arrayList.get(0);
        c0563.getClass();
        return adResponse.getImageUrl();
    }
}
