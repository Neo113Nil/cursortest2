package com.my.target;

import android.text.TextUtils;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public final class te {
    public re a(String str, String str2, String str3) {
        try {
            if (TextUtils.isEmpty(str)) {
                mi.a("PostMessageParser: can't parse postMessage – type is empty");
                return null;
            }
            if (TextUtils.isEmpty(str2)) {
                mi.a("PostMessageParser: can't parse postMessage – action is empty");
                return null;
            }
            if (!TextUtils.isEmpty(str3)) {
                return re.a(str, str2, str3);
            }
            mi.a("PostMessageParser: can't parse postMessage – params is empty");
            return null;
        } catch (Throwable th) {
            mi.a("PostMessageParser: can't parse postMessage – " + th.getMessage());
            return null;
        }
    }
}
