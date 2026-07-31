package com.ironsource.adqualitysdk.sdk.i;

import java.util.ArrayList;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ƈ, reason: contains not printable characters */
/* loaded from: classes13.dex */
public final class C0398 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1303 f218;

    public C0398(C1303 c1303) {
        this.f218 = c1303;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C1303 c1303 = this.f218;
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) arrayList.get(0);
        c1303.getClass();
        return new C1305(c1303, threadPoolExecutor, c1189);
    }
}
