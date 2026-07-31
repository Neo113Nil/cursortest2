package com.five_corp.ad.internal.parser;

import android.util.Base64;
import com.five_corp.ad.internal.l;
import com.five_corp.ad.internal.m;
import java.nio.charset.StandardCharsets;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public abstract class e {
    public static com.five_corp.ad.internal.util.b a(String str) {
        try {
            try {
                JSONObject jSONObject = new JSONObject(new String(Base64.decode(str, 0), StandardCharsets.UTF_8));
                return new com.five_corp.ad.internal.util.b(true, null, new com.five_corp.ad.internal.ad.b(jSONObject.getString("sl"), jSONObject.getString("ld"), b.a(jSONObject.getJSONObject("ad"))));
            } catch (com.five_corp.ad.internal.exception.b e) {
                return new com.five_corp.ad.internal.util.b(false, new l(e.a, "Input: " + str, e), null);
            } catch (JSONException e2) {
                return new com.five_corp.ad.internal.util.b(false, new l(m.M5, "Input: " + str, e2), null);
            }
        } catch (IllegalArgumentException e3) {
            return new com.five_corp.ad.internal.util.b(false, new l(m.L5, "Input: " + str, e3), null);
        }
    }
}
