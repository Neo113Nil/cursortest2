package com.my.target;

import android.graphics.Color;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes3.dex */
public abstract class ya {
    public static int a(JSONObject jSONObject, String str, int i) {
        String optString = jSONObject.optString(str);
        if (!TextUtils.isEmpty(optString)) {
            try {
                return Color.parseColor(optString);
            } catch (Throwable unused) {
                mi.b("JsonParser: Error parsing color " + optString);
            }
        }
        return i;
    }

    public static List b(JSONObject jSONObject, String str) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            int optInt = optJSONArray.optInt(i, -1);
            if (optInt != -1) {
                arrayList.add(Integer.valueOf(optInt));
            }
        }
        return arrayList;
    }

    public static String c(JSONObject jSONObject, String str) {
        if (jSONObject.has(str)) {
            return jSONObject.optString(str);
        }
        return null;
    }

    public static Integer a(JSONObject jSONObject, String str) {
        int optInt;
        if (!jSONObject.has(str) || jSONObject.isNull(str) || (optInt = jSONObject.optInt(str, -1)) == -1) {
            return null;
        }
        return Integer.valueOf(optInt);
    }
}
