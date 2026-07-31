package com.five_corp.ad.internal.parser;

import org.json.JSONObject;

/* loaded from: classes5.dex */
public abstract class i {
    public static com.five_corp.ad.internal.ad.h a(JSONObject jSONObject) {
        return new com.five_corp.ad.internal.ad.h(jSONObject.getString("u"), jSONObject.has("i") ? jSONObject.getString("i") : null, jSONObject.has("rr") ? jSONObject.getBoolean("rr") : false);
    }
}
