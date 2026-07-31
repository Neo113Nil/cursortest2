package com.ironsource.adqualitysdk.sdk.i;

import com.explorestack.protobuf.Any;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.য, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C0713 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0648 f1580;

    public C0713(C0648 c0648) {
        this.f1580 = c0648;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C0648 c0648 = this.f1580;
        Any any = (Any) arrayList.get(0);
        c0648.getClass();
        return any.getValue();
    }
}
