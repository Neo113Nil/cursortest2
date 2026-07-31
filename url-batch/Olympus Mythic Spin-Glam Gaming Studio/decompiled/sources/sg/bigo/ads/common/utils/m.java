package sg.bigo.ads.common.utils;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class m {
    @Nullable
    public static String a(Map<?, ?> map) {
        if (l.a(map)) {
            return null;
        }
        try {
            return new JSONObject(map).toString();
        } catch (Exception unused) {
            return null;
        }
    }

    @Nullable
    public static String a(@Nullable Map map, @Nullable Object obj) {
        Object obj2;
        if (map == null || (obj2 = map.get(obj)) == null) {
            return null;
        }
        return obj2 instanceof String ? (String) obj2 : String.valueOf(obj2);
    }

    @NonNull
    public static Map<String, String> a(String str) {
        JSONObject jSONObject;
        String optString;
        HashMap hashMap = new HashMap();
        if (r.a((CharSequence) str)) {
            return hashMap;
        }
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException unused) {
            jSONObject = null;
        }
        if (jSONObject == null) {
            return hashMap;
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (next != null && (optString = jSONObject.optString(next)) != null) {
                hashMap.put(next, optString);
            }
        }
        return hashMap;
    }
}
