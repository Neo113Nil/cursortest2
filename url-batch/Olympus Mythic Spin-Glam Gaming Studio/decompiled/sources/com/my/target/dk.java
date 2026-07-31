package com.my.target;

import android.graphics.Color;
import android.text.TextUtils;
import com.my.target.common.webform.WebFormSetViewSettings;
import org.json.JSONObject;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
abstract class dk {
    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            mi.a("WebFormVKBridgeParser: json is null, parsing CopyText has been failed");
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("text")) {
                return jSONObject.optString("text");
            }
            return null;
        } catch (Throwable unused) {
            mi.a("WebFormVKBridgeParser: json is null, parsing copyText has been failed");
            return null;
        }
    }

    public static int b(String str) {
        if (TextUtils.isEmpty(str)) {
            mi.a("WebFormVKBridgeParser: json is null, parsing requestId has been failed");
            return -1;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("request_id")) {
                return jSONObject.optInt("request_id");
            }
            return -1;
        } catch (Throwable unused) {
            mi.a("WebFormVKBridgeParser: json is null, parsing requestId has been failed");
            return -1;
        }
    }

    public static WebFormSetViewSettings c(String str) {
        if (TextUtils.isEmpty(str)) {
            mi.a("WebFormVKBridgeParser: can't parse CopyText post message");
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.has("status_bar_style") ? jSONObject.optString("status_bar_style") : null;
            String optString2 = jSONObject.optString("action_bar_color");
            int parseColor = !TextUtils.isEmpty(optString2) ? Color.parseColor(optString2) : 0;
            String optString3 = jSONObject.optString("navigation_bar_color");
            return new WebFormSetViewSettings(optString, parseColor, TextUtils.isEmpty(optString3) ? 0 : Color.parseColor(optString3));
        } catch (Throwable th) {
            mi.a("WebFormVKBridgeParser: can't parse SetViewSettings post message: " + th.getMessage());
            return null;
        }
    }
}
