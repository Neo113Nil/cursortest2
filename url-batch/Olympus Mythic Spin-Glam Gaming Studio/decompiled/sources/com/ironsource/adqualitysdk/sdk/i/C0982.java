package com.ironsource.adqualitysdk.sdk.i;

import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᴸ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0982 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1011 f2352;

    public C0982(C1011 c1011) {
        this.f2352 = c1011;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C1011 c1011 = this.f2352;
        DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEvent = (DiagnosticEventRequestOuterClass.DiagnosticEvent) arrayList.get(0);
        c1011.getClass();
        return diagnosticEvent.getStringTagsMap();
    }
}
