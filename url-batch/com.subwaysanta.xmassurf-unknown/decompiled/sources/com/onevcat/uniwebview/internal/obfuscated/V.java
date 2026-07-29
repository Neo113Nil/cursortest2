package com.onevcat.uniwebview.internal.obfuscated;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class V {
    public final String a;
    public final JSONObject b;

    public V(String resultStr) {
        JSONObject jSONObject;
        Intrinsics.checkNotNullParameter(resultStr, "resultStr");
        this.a = resultStr;
        try {
            jSONObject = new JSONObject(resultStr);
        } catch (JSONException unused) {
            jSONObject = new JSONObject("{}");
        }
        this.b = jSONObject;
    }
}
