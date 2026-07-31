package com.my.target;

import android.text.TextUtils;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public class mg {
    private final JSONObject a;
    public final x0 b;

    private mg(JSONObject jSONObject, x0 x0Var) {
        this.a = jSONObject;
        this.b = x0Var;
    }

    public static mg a(JSONObject jSONObject, x0 x0Var) {
        return new mg(jSONObject, x0Var);
    }

    public lg b(String str) {
        x0 a = this.b.a(str);
        if (!this.a.has(str)) {
            a.c(3006);
            return null;
        }
        JSONArray optJSONArray = this.a.optJSONArray(str);
        if (optJSONArray != null && optJSONArray.length() != 0) {
            return lg.a(optJSONArray, a);
        }
        a.c(3007);
        return null;
    }

    public mg c(String str) {
        x0 a = this.b.a(str);
        if (!this.a.has(str)) {
            a.c(3006);
            return null;
        }
        JSONObject optJSONObject = this.a.optJSONObject(str);
        if (optJSONObject != null) {
            return a(optJSONObject, a);
        }
        a.c(3007);
        return null;
    }

    public String d(String str) {
        if (!this.a.has(str)) {
            this.b.a(str).c(3006);
            return null;
        }
        String optString = this.a.optString(str, "D00DC568-C315-4A5C-AE45-3C177B095B35-2165462B-6EC5-49BA-AD28-F48420D9A7DA");
        if (!"D00DC568-C315-4A5C-AE45-3C177B095B35-2165462B-6EC5-49BA-AD28-F48420D9A7DA".equals(optString) && !TextUtils.isEmpty(optString)) {
            return optString;
        }
        this.b.a(str).c(3007);
        return null;
    }

    public mg a(String str) {
        JSONObject optJSONObject = this.a.optJSONObject(str);
        if (optJSONObject == null) {
            return null;
        }
        return a(optJSONObject, this.b.a(str));
    }

    public int a(String str, int i) {
        if (!this.a.has(str)) {
            this.b.a(str).c(3006);
            return i;
        }
        int optInt = this.a.optInt(str, i);
        if (optInt == i) {
            this.b.a(str).c(3007);
        }
        return optInt;
    }
}
