package com.ironsource.adqualitysdk.sdk.i;

import com.smaato.sdk.video.vast.model.VastBeacon;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ӏ, reason: contains not printable characters */
/* loaded from: classes9.dex */
public final class C0578 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0563 f968;

    public C0578(C0563 c0563) {
        this.f968 = c0563;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C0563 c0563 = this.f968;
        VastBeacon vastBeacon = (VastBeacon) arrayList.get(0);
        c0563.getClass();
        return vastBeacon.uri;
    }
}
