package com.ironsource.adqualitysdk.sdk.i;

import com.smaato.sdk.video.ad.VastParsingResult;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﹰ, reason: contains not printable characters */
/* loaded from: classes15.dex */
public final class C1235 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0563 f3239;

    public C1235(C0563 c0563) {
        this.f3239 = c0563;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C0563 c0563 = this.f3239;
        VastParsingResult vastParsingResult = (VastParsingResult) arrayList.get(0);
        c0563.getClass();
        return vastParsingResult.vastScenario;
    }
}
