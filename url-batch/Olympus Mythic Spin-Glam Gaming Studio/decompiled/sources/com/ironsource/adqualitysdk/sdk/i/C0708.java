package com.ironsource.adqualitysdk.sdk.i;

import com.explorestack.protobuf.adcom.Ad;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.দ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C0708 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0648 f1573;

    public C0708(C0648 c0648) {
        this.f1573 = c0648;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C0648 c0648 = this.f1573;
        Ad.Video video = (Ad.Video) arrayList.get(0);
        c0648.getClass();
        return video.getAdm();
    }
}
