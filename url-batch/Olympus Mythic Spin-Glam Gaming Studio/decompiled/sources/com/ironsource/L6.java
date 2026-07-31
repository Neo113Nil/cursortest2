package com.ironsource;

import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class L6 {
    public static final String b = "userId";
    public static final String c = "appKey";
    private static L6 d;
    private final JSONObject a = IronSourceNetworkBridge.jsonObjectInit();

    private L6() {
    }

    public static synchronized L6 a() {
        L6 l6;
        synchronized (L6.class) {
            try {
                if (d == null) {
                    d = new L6();
                }
                l6 = d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return l6;
    }

    public synchronized JSONObject b() throws JSONException {
        if (Kb.Y().h().v()) {
            return IronSourceNetworkBridge.jsonObjectInit(this.a.toString());
        }
        return this.a;
    }

    public synchronized void a(Map<String, Object> map) {
        if (map != null) {
            for (String str : map.keySet()) {
                a(str, map.get(str));
            }
        }
    }

    public synchronized void a(String str, Object obj) {
        try {
            this.a.put(str, obj);
        } catch (Exception e) {
            C4782n4.d().a(e);
        }
    }

    public synchronized String a(String str) {
        return this.a.optString(str);
    }
}
