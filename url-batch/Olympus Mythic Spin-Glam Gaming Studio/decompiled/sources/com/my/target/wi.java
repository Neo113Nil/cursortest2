package com.my.target;

import org.json.JSONObject;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public final class wi {
    private final n0 a;
    private final hi b;

    private wi(hi hiVar, n0 n0Var) {
        this.a = n0Var;
        this.b = hiVar;
    }

    public static wi a() {
        return new wi(hi.a(), n0.a());
    }

    public hk a(JSONObject jSONObject) {
        return hk.a(this.b.a(jSONObject.getJSONObject("text")), this.a.a(jSONObject.getJSONObject("assets")));
    }
}
