package com.ironsource.adqualitysdk.sdk.i;

import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ọ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1068 extends AbstractRunnableC0913 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C1061 f2719;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ JSONObject f2720;

    public C1068(C1061 c1061, JSONObject jSONObject) {
        this.f2719 = c1061;
        this.f2720 = jSONObject;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0913
    /* renamed from: ﾒ */
    public final void mo3946() {
        C1143 c1143 = this.f2719.f2678;
        JSONObject jSONObject = this.f2720;
        c1143.f2893.f2759.m4297(jSONObject);
        C1086 c1086 = c1143.f2893;
        C1151 c1151 = new C1151(c1143);
        synchronized (c1086.f2768) {
        }
        c1086.m4390(jSONObject);
        c1086.f2768.getClass();
        C0515 c0515 = new C0515(jSONObject);
        C1071 c1071 = new C1071(c0515);
        c1071.m4363(c1086.m4385().m4270());
        c1086.f2768.m3998(c0515, c1151);
        c1086.m4383(c1071.m4361());
        AbstractC1026.m4312(c1151);
    }
}
