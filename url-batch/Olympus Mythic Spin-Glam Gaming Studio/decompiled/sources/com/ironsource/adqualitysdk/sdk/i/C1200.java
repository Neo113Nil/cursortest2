package com.ironsource.adqualitysdk.sdk.i;

import com.moloco.sdk.publisher.Banner;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﭝ, reason: contains not printable characters */
/* loaded from: classes11.dex */
public final class C1200 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1172 f3127;

    public C1200(C1172 c1172) {
        this.f3127 = c1172;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C1172 c1172 = this.f3127;
        Banner banner = (Banner) arrayList.get(0);
        c1172.getClass();
        return banner.getAdShowListener();
    }
}
