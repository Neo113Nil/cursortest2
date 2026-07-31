package com.ironsource.adqualitysdk.sdk.i;

import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.丫, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C1154 extends AbstractRunnableC0913 {

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ C1147 f2910;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ C0999 f2911;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C1149 f2912;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ JSONObject f2913;

    public C1154(C1147 c1147, JSONObject jSONObject, C1149 c1149, C0999 c0999) {
        this.f2910 = c1147;
        this.f2913 = jSONObject;
        this.f2912 = c1149;
        this.f2911 = c0999;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0913
    /* renamed from: ﾒ */
    public final void mo3946() {
        String m4446 = C1147.m4446(this.f2910, this.f2913);
        C1244 c1244 = (C1244) this.f2910.f2899.get(m4446);
        if (c1244 == null) {
            c1244 = new C1244(this.f2913, this.f2912);
            this.f2910.f2899.put(m4446, c1244);
        } else {
            JSONObject jSONObject = this.f2913;
            C1149 c1149 = this.f2912;
            c1244.f3250 = new C1321(jSONObject);
            c1244.f3256 = c1149;
        }
        c1244.f2897 = this.f2911;
    }
}
