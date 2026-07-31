package com.ironsource.adqualitysdk.sdk.i;

import java.util.ArrayList;
import net.pubnative.lite.sdk.vpaid.response.AdParams;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ฯ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0745 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1249 f1672;

    public C0745(C1249 c1249) {
        this.f1672 = c1249;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C1249 c1249 = this.f1672;
        AdParams adParams = (AdParams) arrayList.get(0);
        c1249.getClass();
        return adParams.getVideoFileUrlsList();
    }
}
