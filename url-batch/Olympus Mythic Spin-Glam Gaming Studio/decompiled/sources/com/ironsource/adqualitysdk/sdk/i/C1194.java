package com.ironsource.adqualitysdk.sdk.i;

import com.smaato.sdk.video.vast.model.VastMediaFileScenario;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﭔ, reason: contains not printable characters */
/* loaded from: classes11.dex */
public final class C1194 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0563 f3093;

    public C1194(C0563 c0563) {
        this.f3093 = c0563;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C0563 c0563 = this.f3093;
        VastMediaFileScenario vastMediaFileScenario = (VastMediaFileScenario) arrayList.get(0);
        c0563.getClass();
        return vastMediaFileScenario.vastScenarioCreativeData;
    }
}
