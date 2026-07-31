package com.mbridge.msdk.advanced.signal;

import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.entity.m;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.mbsignalcommon.communication.d;
import com.mbridge.msdk.mbsignalcommon.windvane.f;
import java.io.File;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: NativeAdvancedJsUtils.java */
/* loaded from: classes11.dex */
public class a {
    private static String a = "NativeAdvancedJsUtils";

    public static void a(Object obj, JSONObject jSONObject) {
        String str;
        JSONArray jSONArray;
        String str2;
        String str3;
        JSONArray jSONArray2;
        int i;
        boolean z;
        String str4;
        File file;
        String str5 = "";
        JSONObject jSONObject2 = new JSONObject();
        String str6 = "message";
        int i2 = 1;
        if (jSONObject == null) {
            try {
                jSONObject2.put("code", 1);
                jSONObject2.put("message", "params is null");
                f.a().b(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                return;
            } catch (JSONException e) {
                q0.a(a, e.getMessage());
                return;
            }
        }
        try {
            jSONObject2.put("code", 0);
            jSONObject2.put("message", "");
            jSONArray = jSONObject.getJSONArray("resource");
        } catch (Throwable th) {
            th = th;
            str = "message";
        }
        try {
            if (jSONArray != null) {
                try {
                    if (jSONArray.length() > 0) {
                        JSONArray jSONArray3 = new JSONArray();
                        int length = jSONArray.length();
                        int i3 = 0;
                        while (i3 < length) {
                            JSONObject jSONObject3 = jSONArray.getJSONObject(i3);
                            String optString = jSONObject3.optString("ref", str5);
                            int i4 = jSONObject3.getInt("type");
                            JSONObject jSONObject4 = new JSONObject();
                            if (i4 != i2 || TextUtils.isEmpty(optString)) {
                                str3 = str5;
                                str2 = str6;
                                jSONArray2 = jSONArray;
                                i = length;
                                z = false;
                                if (i4 == 2 && !TextUtils.isEmpty(optString)) {
                                    JSONObject jSONObject5 = new JSONObject();
                                    jSONObject5.put("type", 2);
                                    jSONObject5.put("path", H5DownLoadManager.getInstance().getH5ResAddress(optString) == null ? str3 : H5DownLoadManager.getInstance().getH5ResAddress(optString));
                                    jSONObject4.put(optString, jSONObject5);
                                    jSONArray3.put(jSONObject4);
                                } else if (i4 == 3 && !TextUtils.isEmpty(optString)) {
                                    try {
                                        file = new File(optString);
                                    } catch (Throwable th2) {
                                        q0.b(a, th2.getMessage());
                                    }
                                    if (file.exists() && file.isFile() && file.canRead()) {
                                        q0.a(a, "getFileInfo Mraid file " + optString);
                                        str4 = "file:////" + optString;
                                        JSONObject jSONObject6 = new JSONObject();
                                        jSONObject6.put("type", 3);
                                        jSONObject6.put("path", str4);
                                        jSONObject4.put(optString, jSONObject6);
                                        jSONArray3.put(jSONObject4);
                                    }
                                    str4 = str3;
                                    JSONObject jSONObject62 = new JSONObject();
                                    jSONObject62.put("type", 3);
                                    jSONObject62.put("path", str4);
                                    jSONObject4.put(optString, jSONObject62);
                                    jSONArray3.put(jSONObject4);
                                } else if (i4 == 4 && !TextUtils.isEmpty(optString)) {
                                    JSONObject jSONObject7 = new JSONObject();
                                    jSONObject7.put("type", 4);
                                    jSONObject7.put("path", u0.a(optString) == null ? str3 : u0.a(optString));
                                    jSONObject4.put(optString, jSONObject7);
                                    jSONArray3.put(jSONObject4);
                                }
                            } else {
                                JSONObject jSONObject8 = new JSONObject();
                                m b = com.mbridge.msdk.foundation.db.m.a(g.a(c.n().d())).b(optString);
                                if (b != null) {
                                    jSONArray2 = jSONArray;
                                    i = length;
                                    q0.a(a, "VideoBean not null");
                                    jSONObject8.put("type", 1);
                                    jSONObject8.put("videoDataLength", b.d());
                                    String e2 = b.e();
                                    str2 = str6;
                                    if (TextUtils.isEmpty(e2)) {
                                        q0.a(a, "VideoPath null");
                                        jSONObject8.put("path", str5);
                                        jSONObject8.put("path4Web", str5);
                                        str3 = str5;
                                    } else {
                                        str3 = str5;
                                        q0.a(a, "VideoPath not null");
                                        jSONObject8.put("path", e2);
                                        jSONObject8.put("path4Web", e2);
                                    }
                                    if (b.b() == 5) {
                                        jSONObject8.put("downloaded", 1);
                                        z = false;
                                    } else {
                                        z = false;
                                        jSONObject8.put("downloaded", 0);
                                    }
                                    jSONObject4.put(optString, jSONObject8);
                                    jSONArray3.put(jSONObject4);
                                } else {
                                    str3 = str5;
                                    str2 = str6;
                                    jSONArray2 = jSONArray;
                                    i = length;
                                    z = false;
                                    q0.a(a, "VideoBean null");
                                }
                            }
                            i3++;
                            jSONArray = jSONArray2;
                            length = i;
                            str6 = str2;
                            str5 = str3;
                            i2 = 1;
                        }
                        jSONObject2.put("resource", jSONArray3);
                        f.a().b(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                        return;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    str2 = str6;
                    str = str2;
                    try {
                        jSONObject2.put("code", 1);
                        jSONObject2.put(str, th.getLocalizedMessage());
                        f.a().b(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                    } catch (JSONException e3) {
                        q0.a(a, e3.getMessage());
                        return;
                    }
                }
            }
            str = 1;
            try {
                try {
                    jSONObject2.put("code", 1);
                    str = "message";
                    try {
                        jSONObject2.put(str, "resource is null");
                        f.a().b(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                    } catch (JSONException e4) {
                        e = e4;
                        q0.a(a, e.getMessage());
                    }
                } catch (Throwable th4) {
                    th = th4;
                    jSONObject2.put("code", 1);
                    jSONObject2.put(str, th.getLocalizedMessage());
                    f.a().b(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                }
            } catch (JSONException e5) {
                e = e5;
                str = "message";
            }
        } catch (Throwable th5) {
            th = th5;
            str = str2;
            jSONObject2.put("code", 1);
            jSONObject2.put(str, th.getLocalizedMessage());
            f.a().b(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
        }
    }

    public static void a(WebView webView, String str, String str2) {
        f.a().a(webView, str, str2);
    }

    public static void a(WebView webView, String str, String str2, Object obj) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sq", 1);
            jSONObject.put("action", str);
            if (!TextUtils.isEmpty(str2)) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(str2, obj);
                jSONObject.put("params", jSONObject2);
            }
            if (TextUtils.isEmpty(str2) && obj != null) {
                jSONObject.put("params", obj);
            }
            f.a().a(webView, "thirdPartyCalled", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (JSONException e) {
            q0.b(a, e.getMessage());
        }
    }

    public static void a(WebView webView) {
        q0.b(a, "fireOnJSBridgeConnected");
        f.a().a(webView);
    }

    public static void a(Object obj) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", d.b);
            f.a().b(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            q0.a(a, e.getMessage());
        }
    }
}
