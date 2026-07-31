package com.my.target;

import com.pubmatic.sdk.openwrap.core.POBConstants;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import java.net.HttpCookie;
import org.json.JSONObject;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
class nc {
    nc() {
    }

    String a(HttpCookie httpCookie) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", httpCookie.getName());
            jSONObject.putOpt("value", httpCookie.getValue());
            jSONObject.putOpt("comment", httpCookie.getComment());
            jSONObject.putOpt("commentUrl", httpCookie.getCommentURL());
            jSONObject.putOpt("domain", httpCookie.getDomain());
            jSONObject.putOpt("maxage", Long.valueOf(httpCookie.getMaxAge()));
            jSONObject.putOpt("path", httpCookie.getPath());
            jSONObject.putOpt("portlist", httpCookie.getPortlist());
            jSONObject.putOpt("version", Integer.valueOf(httpCookie.getVersion()));
            jSONObject.putOpt(POBConstants.KEY_SECURE, Boolean.valueOf(httpCookie.getSecure()));
            jSONObject.putOpt(FileUploadManager.m, Boolean.valueOf(httpCookie.getDiscard()));
            jSONObject.putOpt("httpOnly", Boolean.valueOf(httpCookie.isHttpOnly()));
            return jSONObject.toString();
        } catch (Throwable th) {
            mi.a("MyTargetJSONCookie: Exception encoding cookie - " + th.getMessage());
            return null;
        }
    }

    HttpCookie a(String str) {
        Throwable th;
        HttpCookie httpCookie;
        try {
            JSONObject jSONObject = new JSONObject(str);
            httpCookie = new HttpCookie(jSONObject.getString("name"), jSONObject.optString("value"));
            try {
                httpCookie.setComment(jSONObject.optString("comment"));
                httpCookie.setCommentURL(jSONObject.optString("commentUrl"));
                httpCookie.setDomain(jSONObject.optString("domain"));
                httpCookie.setMaxAge(jSONObject.optInt("maxage"));
                httpCookie.setPath(jSONObject.optString("path"));
                httpCookie.setPortlist(jSONObject.optString("portlist"));
                httpCookie.setVersion(jSONObject.optInt("version"));
                httpCookie.setSecure(jSONObject.optBoolean(POBConstants.KEY_SECURE));
                httpCookie.setDiscard(jSONObject.optBoolean(FileUploadManager.m));
                httpCookie.setHttpOnly(jSONObject.optBoolean("httpOnly"));
            } catch (Throwable th2) {
                th = th2;
                mi.a("MyTargetJSONCookie: Exception decoding cookie - " + th.getMessage());
                return httpCookie;
            }
        } catch (Throwable th3) {
            th = th3;
            httpCookie = null;
        }
        return httpCookie;
    }
}
