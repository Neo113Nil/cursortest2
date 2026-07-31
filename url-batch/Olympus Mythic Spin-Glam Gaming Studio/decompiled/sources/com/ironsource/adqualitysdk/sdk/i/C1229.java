package com.ironsource.adqualitysdk.sdk.i;

import com.smaato.sdk.video.vast.model.VastScenario;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﯾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1229 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0563 f3228;

    public C1229(C0563 c0563) {
        this.f3228 = c0563;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C0563 c0563 = this.f3228;
        VastScenario vastScenario = (VastScenario) arrayList.get(0);
        c0563.getClass();
        return vastScenario.vastCompanionScenario;
    }
}
