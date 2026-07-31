package com.five_corp.ad.internal.parser;

import com.five_corp.ad.internal.m;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public abstract class g {
    public static com.five_corp.ad.internal.ad.fullscreen.e a(JSONObject jSONObject) {
        com.five_corp.ad.internal.ad.fullscreen.d dVar;
        int i = jSONObject.getInt("p");
        for (int i2 : com.five_corp.ad.e.b(10)) {
            if (com.five_corp.ad.e.a(i2) == i) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("s");
                com.five_corp.ad.internal.ad.fullscreen.c cVar = new com.five_corp.ad.internal.ad.fullscreen.c(jSONObject2.getDouble("pw"), jSONObject2.getDouble("pr"), jSONObject2.getDouble("lw"), jSONObject2.getDouble("lr"));
                JSONObject jSONObject3 = jSONObject.getJSONObject("o");
                int i3 = jSONObject3.getInt("t");
                for (int i4 : com.five_corp.ad.e.b(2)) {
                    int i5 = 1;
                    if (i4 != 1) {
                        if (i4 != 2) {
                            throw null;
                        }
                        i5 = 2;
                    }
                    if (i5 == i3) {
                        if (jSONObject3.has("tx")) {
                            JSONObject jSONObject4 = jSONObject3.getJSONObject("tx");
                            dVar = new com.five_corp.ad.internal.ad.fullscreen.d(jSONObject4.getString("bg"), jSONObject4.getString("t"), jSONObject4.getString("tc"));
                        } else {
                            dVar = null;
                        }
                        return new com.five_corp.ad.internal.ad.fullscreen.e(i2, cVar, new com.five_corp.ad.internal.ad.fullscreen.a(i4, dVar, jSONObject3.has("iu") ? i.a(jSONObject3.getJSONObject("iu")) : null));
                    }
                }
                throw new com.five_corp.ad.internal.exception.a(m.R0, i3);
            }
        }
        throw new com.five_corp.ad.internal.exception.a(m.P0, i);
    }
}
