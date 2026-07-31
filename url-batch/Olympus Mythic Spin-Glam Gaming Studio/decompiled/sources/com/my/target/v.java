package com.my.target;

import android.text.TextUtils;
import com.my.target.tb;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes5.dex */
public abstract class v {
    public static boolean a(String str) {
        if (str == null) {
            mi.a("AdResponseParser: Null data");
            return false;
        }
        String trim = str.trim();
        if (trim.length() == 0) {
            mi.a("AdResponseParser: Empty data");
            return false;
        }
        if (b(trim)) {
            mi.a("AdResponseParser: Vast is received");
            return true;
        }
        if (trim.startsWith("{") && trim.endsWith("}")) {
            mi.a("AdResponseParser: JSON is received");
            return true;
        }
        mi.a("AdResponseParser: Unsupported data is received");
        return false;
    }

    static boolean b(String str) {
        String trim = str.trim();
        return trim.startsWith("<VAST") || trim.startsWith("<?xml");
    }

    private static void c(JSONObject jSONObject, u uVar) {
        boolean optBoolean;
        if (jSONObject != null) {
            try {
                optBoolean = jSONObject.optBoolean("isHitMapEnabled");
            } catch (Throwable unused) {
            }
            uVar.a(optBoolean);
        }
        optBoolean = false;
        uVar.a(optBoolean);
    }

    private static void d(JSONObject jSONObject, u uVar) {
        boolean z;
        if (jSONObject != null) {
            if (jSONObject.has("sendMonitoring")) {
                z = jSONObject.getBoolean("sendMonitoring");
                uVar.b(z);
            }
        }
        z = false;
        uVar.b(z);
    }

    private static void e(JSONObject jSONObject, u uVar) {
        if (jSONObject == null) {
            return;
        }
        c(jSONObject.optJSONObject("interstitial"), uVar);
    }

    abstract x a(String str, y yVar, x xVar, n nVar, tb.a aVar, tb tbVar, List list, s sVar);

    private static void b(JSONObject jSONObject, u uVar) {
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("featureFlags");
            b(optJSONObject);
            d(optJSONObject, uVar);
            e(optJSONObject, uVar);
        } catch (Throwable th) {
            mi.a("AdResponseParser: Parsing ad response error: " + th.getMessage());
            uVar.a(3001, "Feature-flag json parse, exception=" + gi.b(th) + ", data=" + jSONObject);
        }
    }

    private static void b(JSONObject jSONObject) {
        JSONObject optJSONObject;
        if (jSONObject == null || (optJSONObject = jSONObject.optJSONObject("sendStatisticV2")) == null) {
            return;
        }
        ci.a(optJSONObject.optLong("ttl", 7200L) * 1000);
    }

    static JSONObject a(String str, tb.a aVar, tb tbVar, List list, s sVar) {
        return a(str, aVar, tbVar, list, sVar, u.c);
    }

    public static JSONObject a(String str, tb.a aVar, tb tbVar, List list, s sVar, u uVar) {
        String trim = str != null ? str.trim() : null;
        if (trim != null && !"".equals(trim)) {
            mi.a("AdResponseParser: Converting to JSON...");
            try {
                JSONObject jSONObject = new JSONObject(trim);
                a(jSONObject);
                if (!a(jSONObject, uVar)) {
                    mi.a("AdResponseParser: Invalid json version");
                    sVar.b(q.k);
                    return null;
                }
                a(list, jSONObject, uVar);
                boolean optBoolean = jSONObject.optBoolean("sdk_ms", false);
                aVar.a(optBoolean);
                tbVar.a(optBoolean);
                r4.e.a(jSONObject.optLong("timestamp", 0L));
                b(jSONObject, uVar);
                mi.a("AdResponseParser: Done");
                return jSONObject;
            } catch (Throwable th) {
                mi.a("AdResponseParser: Parsing ad response error: " + th.getMessage());
                sVar.b(q.k);
                uVar.a(3001, "Get Json, exception=" + gi.b(th) + ", data=" + str);
                return null;
            }
        }
        mi.a("AdResponseParser: Parsing ad response: empty data");
        sVar.b(q.j);
        uVar.a(3002, "Input json is empty, data=" + str);
        return null;
    }

    static void a(List list, JSONObject jSONObject, u uVar) {
        if (list == null) {
            return;
        }
        u a = uVar.a("hosts");
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("hosts");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    String optString = optJSONArray.optString(i, null);
                    if (TextUtils.isEmpty(optString)) {
                        mi.a("AdResponseParser: Invalid host-string at position " + i);
                    } else {
                        list.add(optString);
                    }
                }
            }
        } catch (Throwable th) {
            mi.a("AdResponseParser Error: Exception while handling hosts");
            a.b(3001, "Handle hosts: exception=" + gi.b(th));
        }
    }

    static void a(JSONObject jSONObject) {
        if (!mi.a && jSONObject.optBoolean("sdk_debug_mode", false)) {
            mi.a = true;
        }
    }

    static boolean a(JSONObject jSONObject, u uVar) {
        String string;
        int indexOf;
        try {
            string = jSONObject.getString("version");
            mi.a("AdResponseParser: JSON version " + string);
            indexOf = string.indexOf(".");
        } catch (Throwable th) {
            mi.a("AdResponseParser Error: Check version failed - " + th.getMessage());
            uVar.a(3001, "Check version exception: " + gi.a(th));
        }
        if (indexOf > 0 && Integer.parseInt(string.substring(0, indexOf), 10) == 2) {
            return true;
        }
        uVar.a(3003, "Unsupported version=" + string);
        return false;
    }

    public static rj a(JSONObject jSONObject, x0 x0Var) {
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("viewabilityTrackerV2");
            if (optJSONObject == null || !optJSONObject.optBoolean("enabled", false)) {
                return null;
            }
            boolean optBoolean = optJSONObject.optBoolean("scroll", false);
            long optDouble = (long) (((float) optJSONObject.optDouble("timerPeriodSecs", 0.0d)) * 1000.0f);
            if (optDouble <= 0) {
                optDouble = 50;
            }
            return rj.a(optBoolean, optDouble, optJSONObject.optString("algorithm", ""));
        } catch (Throwable th) {
            x0Var.a(3001, "vvtv2: exception=" + gi.b(th));
            return null;
        }
    }
}
