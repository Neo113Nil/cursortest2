package com.my.target;

import android.text.TextUtils;
import android.webkit.WebView;
import com.my.target.common.webform.UserInfo;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import org.json.JSONObject;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public abstract class bk {
    public static void a(ek ekVar, UserInfo userInfo, String str, int i) {
        WebView webView = ekVar.getWebView();
        if (webView == null) {
            return;
        }
        String a = a(userInfo, str, i);
        if (TextUtils.isEmpty(a)) {
            return;
        }
        webView.evaluateJavascript(a, null);
    }

    private static String a(UserInfo userInfo, String str, int i) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        try {
            JSONObject jSONObject3 = new JSONObject();
            UserInfo.Contact contact = userInfo.contact;
            if (contact != null) {
                UserInfo.Contact.DecodingParameters decodingParameters = contact.decodingParameters;
                if (decodingParameters != null) {
                    jSONObject = new JSONObject();
                    jSONObject.put("app_id", decodingParameters.appId);
                    jSONObject.put("user_id", decodingParameters.userId);
                    jSONObject.put("access_token", decodingParameters.accessToken);
                } else {
                    jSONObject = null;
                }
                jSONObject3.put("email", contact.email);
                jSONObject3.put("email_sign", contact.emailSign);
                jSONObject3.put("phone", contact.phone);
                jSONObject3.put("phone_sign", contact.phoneSign);
                jSONObject3.put("decode_params", jSONObject);
            }
            Date date = userInfo.birthday;
            if (date != null) {
                jSONObject3.put("bdate", new SimpleDateFormat("dd.MM.yyyy", Locale.ROOT).format(date));
            }
            jSONObject3.put("country", userInfo.country);
            jSONObject3.put(POBConstants.KEY_CITY, userInfo.city);
            jSONObject3.put("request_id", i);
            jSONObject3.put("first_name", userInfo.firstName);
            jSONObject3.put("last_name", userInfo.lastName);
            int i2 = userInfo.vkId;
            if (i2 > 0) {
                jSONObject3.put("vk_id", i2);
            } else if (!TextUtils.isEmpty(str) && Integer.parseInt(str.replaceAll("id", "")) > 0) {
                jSONObject3.put("vk_id", str);
            }
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("data", jSONObject3);
            jSONObject4.put("type", "VKWebAppGetCustomSdkUserInfoResult");
            jSONObject2.put("detail", jSONObject4);
            if (jSONObject2.length() == 0) {
                return null;
            }
            String jSONObject5 = jSONObject2.toString();
            if (TextUtils.isEmpty(jSONObject5)) {
                return null;
            }
            return "window.dispatchEvent(new CustomEvent('VKWebAppEvent', " + jSONObject5 + "));";
        } catch (Throwable th) {
            mi.b("WebFormInteractor", th.getMessage());
            return null;
        }
    }
}
