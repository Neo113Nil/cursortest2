package com.my.target;

import android.content.Context;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
abstract class t4 {
    protected t4() {
    }

    static boolean a(String str, Context context) {
        int i;
        try {
            i = context.checkCallingOrSelfPermission(str);
        } catch (Throwable th) {
            mi.a("FPDataProvider: Unable to check " + str + " permission! Unexpected throwable in Context.checkCallingOrSelfPermission() method - " + th.getMessage());
            i = -1;
        }
        return i == 0;
    }
}
