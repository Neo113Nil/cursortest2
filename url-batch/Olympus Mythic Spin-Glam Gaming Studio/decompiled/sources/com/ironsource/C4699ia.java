package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.ia, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C4699ia {
    public static boolean a(String str) {
        try {
            IronSourceNetworkBridge.jsonObjectInit(str);
            return true;
        } catch (JSONException unused) {
            return false;
        }
    }

    public static List<String> b(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        return arrayList;
    }

    public static JSONObject a(JSONObject... jSONObjectArr) {
        JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        if (jSONObjectArr != null) {
            for (JSONObject jSONObject : jSONObjectArr) {
                if (jSONObject != null) {
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        try {
                            jsonObjectInit.put(next, jSONObject.get(next));
                        } catch (JSONException e) {
                            C4782n4.d().a(e);
                            IronLog.INTERNAL.error(e.toString());
                        }
                    }
                }
            }
        }
        return jsonObjectInit;
    }

    public static Object b(Object obj) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof JSONArray) || (obj instanceof JSONObject) || obj.equals(JSONObject.NULL)) {
            return obj;
        }
        try {
            if (obj instanceof Collection) {
                return new JSONArray((Collection) obj);
            }
            if (obj.getClass().isArray()) {
                return new JSONArray((Collection) Arrays.asList(obj));
            }
            if (obj instanceof Map) {
                return new JSONObject((Map) obj);
            }
            if (!(obj instanceof Boolean) && !(obj instanceof Byte) && !(obj instanceof Character) && !(obj instanceof Double) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Long) && !(obj instanceof Short) && !(obj instanceof String)) {
                if (obj instanceof Enum) {
                    return obj.toString();
                }
                return obj.getClass().getPackage().getName().startsWith("java.") ? obj.toString() : obj;
            }
            return obj;
        } catch (Exception e) {
            C4782n4.d().a(e);
            return null;
        }
    }

    @NotNull
    public static Map<String, Object> a(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        if (jSONObject == null) {
            return hashMap;
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                hashMap.put(next, a(jSONObject.get(next)));
            } catch (JSONException e) {
                C4782n4.d().a(e);
                IronLog.INTERNAL.error(String.format("Could not put value in map: %s, %s", next, e.getMessage()));
            }
        }
        return hashMap;
    }

    public static List<Object> a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                arrayList.add(a(jSONArray.get(i)));
            } catch (JSONException e) {
                C4782n4.d().a(e);
                IronLog.INTERNAL.error(String.format("Could not put value into list: %s", e.getMessage()));
            }
        }
        return arrayList;
    }

    private static Object a(Object obj) {
        if (obj instanceof JSONObject) {
            return a((JSONObject) obj);
        }
        return obj instanceof JSONArray ? a((JSONArray) obj) : obj;
    }

    public static JSONObject a(Map<String, Object> map) {
        JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        if (map != null) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                try {
                    jsonObjectInit.put(entry.getKey(), b(entry.getValue()));
                } catch (JSONException e) {
                    C4782n4.d().a(e);
                    IronLog.INTERNAL.error(String.format("Could not map entry to object: %s, %s", entry.getKey(), entry.getValue()));
                }
            }
        }
        return jsonObjectInit;
    }
}
