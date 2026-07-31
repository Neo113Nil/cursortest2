package sg.bigo.ads.common.utils;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class k {
    @Nullable
    public static Integer a(Object obj) {
        if (obj instanceof Integer) {
            return (Integer) obj;
        }
        if (obj instanceof Number) {
            return Integer.valueOf(((Number) obj).intValue());
        }
        if (!(obj instanceof String)) {
            return null;
        }
        try {
            return Integer.valueOf((int) Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Map<String, String> a(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, jSONObject.optString(next));
        }
        return hashMap;
    }

    public static void a(@NonNull JSONObject jSONObject, @Nullable String str, @Nullable Object obj) {
        try {
            jSONObject.putOpt(str, obj);
        } catch (JSONException unused) {
        }
    }

    @Nullable
    public static Float b(Object obj) {
        if (obj instanceof Float) {
            return (Float) obj;
        }
        if (obj instanceof Number) {
            return Float.valueOf(((Number) obj).floatValue());
        }
        if (!(obj instanceof String)) {
            return null;
        }
        try {
            return Float.valueOf((String) obj);
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
