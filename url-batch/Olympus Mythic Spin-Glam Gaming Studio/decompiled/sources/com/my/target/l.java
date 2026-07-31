package com.my.target;

import android.text.TextUtils;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.my.target.common.models.ImageData;
import com.my.target.e;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes5.dex */
public final class l {
    private l() {
    }

    public static l a() {
        return new l();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private List b(JSONObject jSONObject, String str, String str2, int i, boolean z, x0 x0Var) {
        int length;
        ArrayList arrayList;
        int i2;
        JSONArray optJSONArray = jSONObject.optJSONArray(SDKConstants.PARAM_GAME_REQUESTS_OPTIONS);
        if (optJSONArray == null || (length = optJSONArray.length()) == 0) {
            return null;
        }
        String optString = jSONObject.optString("closeUrl");
        if (!optString.isEmpty()) {
            if (!ti.e(optString)) {
                x0Var.a("closeUrl").a(3007, optString);
            }
            x0 a = x0Var.a(SDKConstants.PARAM_GAME_REQUESTS_OPTIONS);
            arrayList = new ArrayList();
            for (i2 = 0; i2 < length; i2++) {
                e.a a2 = a(optJSONArray.optJSONObject(i2), optString, str, str2, i, z, a.b(i2));
                if (a2 != null) {
                    arrayList.add(a2);
                }
            }
            if (arrayList.isEmpty()) {
                return arrayList;
            }
            return null;
        }
        optString = null;
        x0 a3 = x0Var.a(SDKConstants.PARAM_GAME_REQUESTS_OPTIONS);
        arrayList = new ArrayList();
        while (i2 < length) {
        }
        if (arrayList.isEmpty()) {
        }
    }

    private String c(JSONObject jSONObject) {
        if (jSONObject.has("copyText")) {
            return jSONObject.optString("copyText");
        }
        return null;
    }

    private String d(JSONObject jSONObject) {
        return jSONObject.optString("name");
    }

    private boolean e(JSONObject jSONObject) {
        return jSONObject.optBoolean("shouldCloseAd", true);
    }

    private d3 f(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("complain");
        if (optJSONObject == null || optJSONObject.length() == 0) {
            return null;
        }
        d3 d3Var = new d3();
        d3Var.c(optJSONObject.optString("fromTitle"));
        d3Var.b(optJSONObject.optString("fromOptionsTitle"));
        d3Var.a(optJSONObject.optString("fromActionText"));
        d3Var.f(optJSONObject.optString("resultIconLink"));
        d3Var.g(optJSONObject.optString("resultTitle"));
        d3Var.e(optJSONObject.optString("resultDescription"));
        d3Var.d(optJSONObject.optString("resultActionText"));
        return d3Var;
    }

    private c5 g(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("hide");
        if (optJSONObject == null || optJSONObject.length() == 0) {
            return null;
        }
        c5 c5Var = new c5();
        c5Var.f(optJSONObject.optString("iconLink"));
        c5Var.c(optJSONObject.optString("fromIconLink"));
        c5Var.e(optJSONObject.optString("fromTitle"));
        c5Var.b(optJSONObject.optString("fromDescription"));
        c5Var.d(optJSONObject.optString("fromOptionsTitle"));
        c5Var.a(optJSONObject.optString("fromActionText"));
        return c5Var;
    }

    public e a(JSONObject jSONObject, String str, String str2, int i, boolean z, x0 x0Var) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("iconLink");
        if (TextUtils.isEmpty(optString) || !ti.e(optString)) {
            x0 a = x0Var.a("iconLink");
            if (TextUtils.isEmpty(optString)) {
                a.a(3006);
            } else {
                a.a(3007, optString);
            }
            return null;
        }
        String optString2 = jSONObject.optString("clickLink");
        if (TextUtils.isEmpty(optString2)) {
            x0Var.a("clickLink").a(3006);
        } else if (!ti.e(optString2)) {
            x0Var.a("clickLink").a(3007, optString2);
        }
        List b = b(jSONObject, str, str2, i, z, x0Var);
        if (b == null && (TextUtils.isEmpty(optString2) || !ti.e(optString2))) {
            if (!jSONObject.has(SDKConstants.PARAM_GAME_REQUESTS_OPTIONS)) {
                x0Var.a(SDKConstants.PARAM_GAME_REQUESTS_OPTIONS).a(3007);
            }
            return null;
        }
        String a2 = a(jSONObject);
        e a3 = e.a(ImageData.newImageData(optString), optString2);
        a3.b(b);
        a3.a(a2);
        a3.a(g(jSONObject));
        a3.a(f(jSONObject));
        return a3;
    }

    private e.a a(JSONObject jSONObject, String str, String str2, String str3, int i, boolean z, x0 x0Var) {
        if (jSONObject == null) {
            x0Var.c(3007);
            return null;
        }
        x0 a = x0Var.a("type");
        if (!jSONObject.has("type")) {
            a.a(3006);
            return null;
        }
        String optString = jSONObject.optString("type");
        if (!optString.equals("default") && !optString.equals("hide") && !optString.equals("complain")) {
            if (optString.equals("copy")) {
                return b(jSONObject, str, str2, str3, i, z, x0Var);
            }
            a.a(3007, optString);
            return null;
        }
        return a(jSONObject, optString, str, str2, str3, i, z, x0Var);
    }

    private e.a b(JSONObject jSONObject, String str, String str2, String str3, int i, boolean z, x0 x0Var) {
        String d = d(jSONObject);
        if (TextUtils.isEmpty(d)) {
            x0Var.a("name").a(3006);
            return null;
        }
        boolean e = e(jSONObject);
        String a = a(jSONObject, str, e, str2, str3, i, z, x0Var);
        String c = c(jSONObject);
        if (TextUtils.isEmpty(c)) {
            x0Var.a("copyText").a(3006);
            return null;
        }
        return e.a.a(d, "copy", a, null, c, b(jSONObject), e);
    }

    private e.a a(JSONObject jSONObject, String str, String str2, String str3, String str4, int i, boolean z, x0 x0Var) {
        String d = d(jSONObject);
        if (TextUtils.isEmpty(d)) {
            x0Var.a("name").a(3006);
            return null;
        }
        boolean e = e(jSONObject);
        String optString = jSONObject.optString("clickLink");
        String a = a(jSONObject, str2, e, str3, str4, i, z, x0Var);
        if (!optString.isEmpty() && !ti.e(optString)) {
            x0Var.a("clickLink").a(3007, optString);
            if (a == null) {
                return null;
            }
        }
        return e.a.a(d, str, a, optString, null, b(jSONObject), e);
    }

    private String b(JSONObject jSONObject) {
        if (jSONObject.has("alias")) {
            return jSONObject.optString("alias");
        }
        return null;
    }

    private String a(JSONObject jSONObject, String str, boolean z, String str2, String str3, int i, boolean z2, x0 x0Var) {
        String optString = jSONObject.optString("url");
        if (ti.e(optString)) {
            return optString;
        }
        if (!optString.isEmpty()) {
            x0Var.a("url").a(3007, optString);
        }
        if (str == null || !z) {
            return null;
        }
        String str4 = str + "&reason=";
        boolean isNull = jSONObject.isNull("id");
        int optInt = jSONObject.optInt("id");
        if (!isNull) {
            if (optInt >= 1) {
                return str4 + optInt;
            }
            x0Var.a("id").a(3007);
        }
        return str4;
    }

    private String a(JSONObject jSONObject) {
        try {
            return jSONObject.getString("aboutCompany");
        } catch (JSONException unused) {
            return null;
        }
    }
}
