package com.ironsource.adqualitysdk.sdk.i;

import com.mbridge.msdk.out.MBridgeIds;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ʖ, reason: contains not printable characters */
/* loaded from: classes12.dex */
public final class C0454 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1301 f341;

    public C0454(C1301 c1301) {
        this.f341 = c1301;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C1301 c1301 = this.f341;
        MBridgeIds mBridgeIds = (MBridgeIds) arrayList.get(0);
        c1301.getClass();
        return mBridgeIds.getPlacementId();
    }
}
