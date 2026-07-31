package com.my.target;

import android.text.TextUtils;
import com.my.target.hk;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public final class n0 {
    private n0() {
    }

    public static n0 a() {
        return new n0();
    }

    private hk.a.C1683a b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("url", null);
        if (TextUtils.isEmpty(optString)) {
            mi.a("VastYandexAdInfoParser: Invalid first_frame url");
            return null;
        }
        try {
            return new hk.a.C1683a(optString, jSONObject.getInt("width"), jSONObject.getInt("height"));
        } catch (JSONException e) {
            mi.a("VastYandexAdInfoParser: Invalid first_frame dimension: " + e);
            return null;
        }
    }

    public hk.a a(JSONObject jSONObject) {
        return new hk.a(a(jSONObject.optJSONArray("first_frame")));
    }

    private List a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hk.a.C1683a b = b(jSONArray.optJSONObject(i));
            if (b != null) {
                arrayList.add(b);
            }
        }
        return arrayList;
    }
}
