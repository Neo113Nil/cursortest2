package com.smaato.sdk.core.util;

import android.net.UrlQuerySanitizer;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class TextUtils {
    private TextUtils() {
    }

    public static boolean isEmpty(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static Map<String, String> parseQuery(String str) {
        if (isEmpty(str)) {
            return Collections.emptyMap();
        }
        UrlQuerySanitizer urlQuerySanitizer = new UrlQuerySanitizer();
        urlQuerySanitizer.setAllowUnregisteredParamaters(true);
        urlQuerySanitizer.parseQuery(str);
        return null;
    }

    public static Map<String, String> convertJsonStringToMap(String str) {
        if (isEmpty(str)) {
            return Collections.emptyMap();
        }
        try {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
            return hashMap;
        } catch (JSONException unused) {
            return Collections.emptyMap();
        }
    }

    public static TreeMap<String, String> parseQueryToCaseInsensitiveMap(String str) {
        TreeMap<String, String> treeMap = new TreeMap<>((Comparator<? super String>) String.CASE_INSENSITIVE_ORDER);
        treeMap.putAll(parseQuery(str));
        return treeMap;
    }
}
