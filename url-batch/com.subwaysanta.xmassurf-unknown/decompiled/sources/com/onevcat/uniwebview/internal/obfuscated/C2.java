package com.onevcat.uniwebview.internal.obfuscated;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class C2 {
    public static D2 a(String str, int i, String str2) {
        HashMap hashMap;
        if (str != null) {
            hashMap = new HashMap();
            hashMap.put("failingURL", str);
        } else {
            hashMap = null;
        }
        String valueOf = String.valueOf(i);
        if (str2 == null) {
            str2 = "";
        }
        return new D2("", valueOf, str2, hashMap);
    }
}
