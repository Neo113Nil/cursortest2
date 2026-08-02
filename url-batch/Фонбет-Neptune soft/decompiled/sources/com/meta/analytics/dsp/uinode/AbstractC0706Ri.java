package com.meta.analytics.dsp.uinode;

import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Ri, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0706Ri {
    /* JADX WARN: Incorrect condition in loop: B:7:0x0011 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean A00(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray.length() != jSONArray2.length()) {
            return false;
        }
        for (int i = 0; i < i; i++) {
            EnumC0705Rh t1 = EnumC0705Rh.A00(jSONArray, i);
            if (t1 != EnumC0705Rh.A00(jSONArray2, i) || !t1.A05(jSONArray, jSONArray2, i)) {
                return false;
            }
        }
        return true;
    }

    public static boolean A02(JSONObject jSONObject, JSONObject jSONObject2) {
        EnumC0705Rh A01;
        if (jSONObject.length() != jSONObject2.length()) {
            return false;
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (!jSONObject2.has(next) || (A01 = EnumC0705Rh.A01(jSONObject, next)) != EnumC0705Rh.A01(jSONObject2, next) || !A01.A07(jSONObject, jSONObject2, next)) {
                return false;
            }
        }
        return true;
    }
}
