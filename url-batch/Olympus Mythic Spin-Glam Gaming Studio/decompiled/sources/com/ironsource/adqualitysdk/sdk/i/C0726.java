package com.ironsource.adqualitysdk.sdk.i;

import io.bidmachine.protobuf.RequestExtension;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ฅ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0726 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0648 f1647;

    public C0726(C0648 c0648) {
        this.f1647 = c0648;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C0648 c0648 = this.f1647;
        RequestExtension requestExtension = (RequestExtension) arrayList.get(0);
        c0648.getClass();
        return requestExtension.getSellerId();
    }
}
