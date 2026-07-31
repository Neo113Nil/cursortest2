package io.appmetrica.analytics.impl;

import android.net.Uri;
import com.ironsource.X3;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public final class Ag {
    public static C5225b8 a(String str) {
        HashMap hashMap;
        HashMap b = b(str);
        if (b.isEmpty()) {
            b = b(Uri.decode(str));
        }
        String decode = Uri.decode((String) b.get("appmetrica_deep_link"));
        if (StringUtils.isNullOrEmpty(decode)) {
            hashMap = null;
        } else {
            HashMap b2 = b(decode);
            hashMap = new HashMap(b2.size());
            for (Map.Entry entry : b2.entrySet()) {
                hashMap.put(Uri.decode((String) entry.getKey()), Uri.decode((String) entry.getValue()));
            }
        }
        return new C5225b8(decode, hashMap, str);
    }

    public static HashMap b(String str) {
        HashMap hashMap = new HashMap();
        if (str != null) {
            int lastIndexOf = str.lastIndexOf(63);
            if (lastIndexOf >= 0) {
                str = str.substring(lastIndexOf + 1);
            }
            if (str.contains("=")) {
                for (String str2 : str.split(X3.j.c)) {
                    int indexOf = str2.indexOf("=");
                    if (indexOf >= 0) {
                        hashMap.put(str2.substring(0, indexOf), str2.substring(indexOf + 1));
                    } else {
                        hashMap.put(str2, "");
                    }
                }
            }
        }
        return hashMap;
    }
}
