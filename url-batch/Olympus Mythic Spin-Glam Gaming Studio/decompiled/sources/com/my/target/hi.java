package com.my.target;

import com.my.target.hk;
import org.json.JSONObject;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public final class hi {
    private hi() {
    }

    public static hi a() {
        return new hi();
    }

    public hk.b a(JSONObject jSONObject) {
        return new hk.b(jSONObject.optString("title", null), jSONObject.optString("body", null), jSONObject.optString("domain", null));
    }
}
