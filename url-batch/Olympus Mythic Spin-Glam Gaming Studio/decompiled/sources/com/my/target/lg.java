package com.my.target;

import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public class lg {
    private final JSONArray a;
    private final x0 b;

    private lg(JSONArray jSONArray, x0 x0Var) {
        this.a = jSONArray;
        this.b = x0Var;
    }

    public static lg a(JSONArray jSONArray, x0 x0Var) {
        return new lg(jSONArray, x0Var);
    }

    public int a() {
        return this.a.length();
    }

    public mg a(int i) {
        x0 b = this.b.b(i);
        JSONObject optJSONObject = this.a.optJSONObject(i);
        if (optJSONObject == null) {
            b.c(3007);
            return null;
        }
        return mg.a(optJSONObject, b);
    }
}
