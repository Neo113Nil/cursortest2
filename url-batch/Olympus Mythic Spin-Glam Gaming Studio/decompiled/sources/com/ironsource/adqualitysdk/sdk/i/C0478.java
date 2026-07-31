package com.ironsource.adqualitysdk.sdk.i;

import com.qq.e.comm.managers.status.APPStatus;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ˁ, reason: contains not printable characters */
/* loaded from: classes12.dex */
public final class C0478 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1248 f376;

    public C0478(C1248 c1248) {
        this.f376 = c1248;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C1248 c1248 = this.f376;
        APPStatus aPPStatus = (APPStatus) arrayList.get(0);
        c1248.getClass();
        return aPPStatus.getAPPID();
    }
}
