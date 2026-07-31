package io.appmetrica.analytics.impl;

import com.ironsource.X3;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.parsing.ParseUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes13.dex */
public abstract class Wm {
    public static HashMap b(Map map) {
        HashMap hashMap = new HashMap();
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (!StringUtils.isNullOrEmpty(str) && !str.contains(":") && !str.contains(StringUtils.COMMA) && !str.contains(X3.j.c)) {
                    String str2 = (String) entry.getValue();
                    if (!StringUtils.isNullOrEmpty(str2) && ParseUtils.parseLong(str2, -1L) != -1) {
                        hashMap.put((String) entry.getKey(), (String) entry.getValue());
                    }
                }
            }
        }
        return hashMap;
    }

    public static String a(Map map) {
        if (Do.a(map)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : map.entrySet()) {
            sb.append((String) entry.getKey());
            sb.append(":");
            sb.append((String) entry.getValue());
            sb.append(StringUtils.COMMA);
        }
        sb.setLength(sb.length() - 1);
        return sb.toString();
    }

    public static HashMap a(String str) {
        HashMap hashMap = new HashMap();
        if (!StringUtils.isNullOrEmpty(str)) {
            for (String str2 : str.split(StringUtils.COMMA)) {
                int indexOf = str2.indexOf(":");
                if (indexOf != -1) {
                    hashMap.put(str2.substring(0, indexOf), str2.substring(indexOf + 1));
                }
            }
        }
        return hashMap;
    }

    public static boolean a(HashMap hashMap) {
        if (hashMap == null || hashMap.isEmpty()) {
            return false;
        }
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            try {
                Integer.parseInt((String) ((Map.Entry) it.next()).getValue());
            } catch (Throwable unused) {
                return false;
            }
        }
        return true;
    }
}
