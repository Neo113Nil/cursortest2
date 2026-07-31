package com.ironsource.adqualitysdk.sdk.i;

import com.bytedance.sdk.openadsdk.TTAdConfig;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ט, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C0609 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0547 f1071;

    public C0609(C0547 c0547) {
        this.f1071 = c0547;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C0547 c0547 = this.f1071;
        TTAdConfig tTAdConfig = (TTAdConfig) arrayList.get(0);
        c0547.getClass();
        return tTAdConfig.getData();
    }
}
