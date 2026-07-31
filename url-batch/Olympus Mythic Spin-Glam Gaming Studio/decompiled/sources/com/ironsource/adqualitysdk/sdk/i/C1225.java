package com.ironsource.adqualitysdk.sdk.i;

import com.smaato.sdk.video.vast.model.VastScenarioResourceData;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﯦ, reason: contains not printable characters */
/* loaded from: classes8.dex */
public final class C1225 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0563 f3224;

    public C1225(C0563 c0563) {
        this.f3224 = c0563;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C0563 c0563 = this.f3224;
        VastScenarioResourceData vastScenarioResourceData = (VastScenarioResourceData) arrayList.get(0);
        c0563.getClass();
        return vastScenarioResourceData.staticResources;
    }
}
