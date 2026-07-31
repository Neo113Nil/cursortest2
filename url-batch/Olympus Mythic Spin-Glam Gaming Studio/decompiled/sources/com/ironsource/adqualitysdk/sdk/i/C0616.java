package com.ironsource.adqualitysdk.sdk.i;

import com.bytedance.sdk.openadsdk.TTAdConfig;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ס, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C0616 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0547 f1120;

    public C0616(C0547 c0547) {
        this.f1120 = c0547;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C0547 c0547 = this.f1120;
        TTAdConfig tTAdConfig = (TTAdConfig) arrayList.get(0);
        c0547.getClass();
        return tTAdConfig.getAppId();
    }
}
