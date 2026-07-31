package com.ironsource;

import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.je, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C4720je {
    private JSONObject a;

    public C4720je() {
        this.a = IronSourceNetworkBridge.jsonObjectInit();
    }

    private void f(String str) {
        try {
            this.a = IronSourceNetworkBridge.jsonObjectInit(str);
        } catch (Exception e) {
            C4782n4.d().a(e);
            this.a = IronSourceNetworkBridge.jsonObjectInit();
        }
    }

    public JSONObject a() {
        return this.a;
    }

    public Object b(String str) {
        try {
            return a().get(str);
        } catch (JSONException e) {
            C4782n4.d().a(e);
            return null;
        }
    }

    public boolean c(String str) {
        return this.a.optBoolean(str);
    }

    public String d(String str) {
        return this.a.optString(str, null);
    }

    public boolean e(String str) {
        return a().isNull(str);
    }

    public String toString() {
        JSONObject jSONObject = this.a;
        return jSONObject == null ? "" : jSONObject.toString();
    }

    public boolean a(String str) {
        return a().has(str);
    }

    public C4720je(String str) {
        f(str);
    }

    public String a(String str, String str2) {
        return this.a.optString(str, str2);
    }

    public static Object b(Object obj) throws JSONException {
        if (obj instanceof Map) {
            JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
            Map map = (Map) obj;
            for (Object obj2 : map.keySet()) {
                if (obj2 != null) {
                    jsonObjectInit.put(obj2.toString(), b(map.get(obj2)));
                }
            }
            return jsonObjectInit;
        }
        if (!(obj instanceof Iterable)) {
            return obj;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = ((Iterable) obj).iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        return jSONArray;
    }

    public int a(String str, int i) {
        return this.a.optInt(str, i);
    }

    public static boolean a(JSONObject jSONObject) {
        return jSONObject.names() == null;
    }

    public List a(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(a(jSONArray.get(i)));
        }
        return arrayList;
    }

    public void a(String str, JSONObject jSONObject) {
        try {
            this.a.put(str, jSONObject);
        } catch (Exception e) {
            C4782n4.d().a(e);
        }
    }

    private Object a(Object obj) throws JSONException {
        if (obj == JSONObject.NULL) {
            return null;
        }
        if (obj instanceof JSONObject) {
            return b((JSONObject) obj);
        }
        return obj instanceof JSONArray ? a((JSONArray) obj) : obj;
    }

    public void b(String str, String str2) {
        try {
            this.a.put(str, str2);
        } catch (Exception e) {
            C4782n4.d().a(e);
        }
    }

    private Map<String, Object> b(JSONObject jSONObject) throws JSONException {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, a(jSONObject.get(next)));
        }
        return hashMap;
    }
}
