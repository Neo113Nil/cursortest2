package com.ironsource.adqualitysdk.sdk.i;

import java.util.HashMap;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ʺ, reason: contains not printable characters */
/* loaded from: classes12.dex */
public abstract class AbstractC0471 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static final HashMap f358 = new HashMap();

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static String m4008(String str) {
        HashMap hashMap = f358;
        String str2 = (String) hashMap.get(str);
        if (str2 != null) {
            return str2;
        }
        hashMap.put(str, str);
        return str;
    }
}
