package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᵛ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C1017 implements InterfaceC1212 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1015 f2526;

    public C1017(C1015 c1015) {
        this.f2526 = c1015;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC1212
    /* renamed from: ﾒ */
    public final void mo3995() {
        JSONObject jSONObject;
        C0972 c0972 = ((C0600) AbstractC0590.m4087()).f1016;
        synchronized (c0972) {
            jSONObject = c0972.f2998;
        }
        long optLong = jSONObject.optLong(C0972.f2330, 0L);
        if (optLong == 0) {
            this.f2526.f2525 = Boolean.FALSE;
            optLong = c0972.m4269();
            AbstractC0577.m4068(StringFog.decrypt("de2zWe9cAjdR16dS/0ARNU/tpFnu\n", "IYTePJwoY1o=\n"), StringFog.decrypt("9oNTcwHi8oCTlkRoB6v1iZOCRG4Fp+nOx5hMeQC2+oPD\n", "s/EhHHPCm+4=\n"), (Throwable) null, false);
        } else {
            this.f2526.f2525 = Boolean.TRUE;
        }
        this.f2526.f2524 = c0972.m4268();
        this.f2526.f2523 = c0972.m4269();
        C1015 c1015 = this.f2526;
        c1015.f2522 = optLong - c1015.f2524;
        c1015.f2521 = optLong - c1015.f2523;
    }
}
