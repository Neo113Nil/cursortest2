package com.ironsource.adqualitysdk.sdk.i;

import com.smaato.sdk.video.vast.model.VastScenarioCreativeData;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ⅰ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C1117 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0563 f2857;

    public C1117(C0563 c0563) {
        this.f2857 = c0563;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C0563 c0563 = this.f2857;
        VastScenarioCreativeData vastScenarioCreativeData = (VastScenarioCreativeData) arrayList.get(0);
        c0563.getClass();
        return vastScenarioCreativeData.adId;
    }
}
