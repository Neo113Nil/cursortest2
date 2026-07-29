package com.onevcat.uniwebview.internal.obfuscated;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class D2 {
    public final String a;
    public final String b;
    public final String c;
    public final JSONObject d;

    public D2(String identifier, String resultCode, String data, HashMap hashMap) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
        Intrinsics.checkNotNullParameter(data, "data");
        this.a = identifier;
        this.b = resultCode;
        this.c = data;
        if (hashMap != null) {
            this.d = new JSONObject(hashMap);
        }
    }

    public final String a() {
        HashMap hashMap = new HashMap();
        hashMap.put("identifier", this.a);
        hashMap.put("resultCode", this.b);
        hashMap.put("data", this.c);
        JSONObject jSONObject = this.d;
        if (jSONObject != null) {
            hashMap.put("extra", String.valueOf(jSONObject));
        }
        String jSONObject2 = new JSONObject(hashMap).toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "obj.toString()");
        return jSONObject2;
    }

    public final String toString() {
        return a();
    }
}
