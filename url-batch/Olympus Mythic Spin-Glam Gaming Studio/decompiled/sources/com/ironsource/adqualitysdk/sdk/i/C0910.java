package com.ironsource.adqualitysdk.sdk.i;

import com.smaato.sdk.video.vast.model.VastBeacon;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᕝ, reason: contains not printable characters */
/* loaded from: classes8.dex */
public final class C0910 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0563 f2203;

    public C0910(C0563 c0563) {
        this.f2203 = c0563;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C0563 c0563 = this.f2203;
        VastBeacon vastBeacon = (VastBeacon) arrayList.get(0);
        c0563.getClass();
        return vastBeacon.uri;
    }
}
