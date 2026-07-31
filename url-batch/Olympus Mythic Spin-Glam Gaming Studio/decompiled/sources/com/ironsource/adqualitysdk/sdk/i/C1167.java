package com.ironsource.adqualitysdk.sdk.i;

import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.爫, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1167 extends AbstractRunnableC0913 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ C1147 f2966;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C1000 f2967;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ JSONObject f2968;

    public C1167(C1147 c1147, JSONObject jSONObject, C1000 c1000) {
        this.f2966 = c1147;
        this.f2968 = jSONObject;
        this.f2967 = c1000;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0913
    /* renamed from: ﾒ */
    public final void mo3946() {
        String m4446 = C1147.m4446(this.f2966, this.f2968);
        s sVar = (s) this.f2966.f2900.get(m4446);
        if (sVar == null) {
            sVar = new s(this.f2968);
            this.f2966.f2900.put(m4446, sVar);
        } else {
            sVar.m3970(this.f2968);
        }
        sVar.f2897 = this.f2967;
    }
}
