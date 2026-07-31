package com.ironsource.adqualitysdk.sdk.i;

import java.util.ArrayList;
import net.pubnative.lite.sdk.vpaid.models.vast.Wrapper;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ſ, reason: contains not printable characters */
/* loaded from: classes13.dex */
public final class C0396 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1249 f216;

    public C0396(C1249 c1249) {
        this.f216 = c1249;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C1249 c1249 = this.f216;
        Wrapper wrapper = (Wrapper) arrayList.get(0);
        c1249.getClass();
        return wrapper.getVastAdTagURI();
    }
}
