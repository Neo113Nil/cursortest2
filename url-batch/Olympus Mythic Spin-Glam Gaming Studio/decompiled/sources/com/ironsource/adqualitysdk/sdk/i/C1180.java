package com.ironsource.adqualitysdk.sdk.i;

import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.טּ, reason: contains not printable characters */
/* loaded from: classes11.dex */
public final class C1180 extends AbstractRunnableC0913 {

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final /* synthetic */ C1147 f3008;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ C1204 f3009;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ C1022 f3010;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C1150 f3011;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ JSONObject f3012;

    public C1180(C1147 c1147, JSONObject jSONObject, C1150 c1150, C1022 c1022, C1204 c1204) {
        this.f3008 = c1147;
        this.f3012 = jSONObject;
        this.f3011 = c1150;
        this.f3010 = c1022;
        this.f3009 = c1204;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0913
    /* renamed from: ﾒ */
    public final void mo3946() {
        String m4446 = C1147.m4446(this.f3008, this.f3012);
        C1187 c1187 = (C1187) this.f3008.f2901.get(m4446);
        if (c1187 == null) {
            c1187 = new C1187(this.f3012, this.f3011);
            this.f3008.f2901.put(m4446, c1187);
        } else {
            c1187.f2099 = this.f3011;
            C1196 c1196 = new C1196(this.f3012);
            c1187.f2098 = c1196;
            c1187.f3076 = c1196;
            AbstractC1026.m4313(new C1279(c1187));
        }
        c1187.f2897 = this.f3010;
        c1187.f3082 = this.f3009;
    }
}
