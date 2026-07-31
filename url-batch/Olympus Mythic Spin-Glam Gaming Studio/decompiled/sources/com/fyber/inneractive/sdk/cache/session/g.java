package com.fyber.inneractive.sdk.cache.session;

import com.pubmatic.sdk.openwrap.core.POBConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class g {
    public int a;
    public int b;
    public int c;
    public final long d;

    public g(int i, int i2, int i3, long j) {
        this.d = j;
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final JSONObject a(boolean z, boolean z2) {
        JSONObject jSONObject = new JSONObject();
        if (z) {
            try {
                jSONObject.put("time", this.d);
            } catch (JSONException unused) {
            }
        }
        jSONObject.put(POBConstants.KEY_IMPRESSION, this.a);
        if (z2) {
            jSONObject.put("com", this.c);
        }
        jSONObject.put("cli", this.b);
        return jSONObject;
    }

    public static g a(JSONObject jSONObject) {
        if (jSONObject != null) {
            long optLong = jSONObject.optLong("time");
            int optInt = jSONObject.optInt("cli", -1);
            int optInt2 = jSONObject.optInt(POBConstants.KEY_IMPRESSION, -1);
            int optInt3 = jSONObject.optInt("com", -1);
            if (optLong != 0 && optInt >= 0 && optInt2 >= 0 && optInt3 >= 0) {
                return new g(optInt2, optInt, optInt3, optLong);
            }
        }
        return null;
    }
}
