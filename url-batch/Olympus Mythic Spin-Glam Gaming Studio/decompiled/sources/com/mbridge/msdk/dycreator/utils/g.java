package com.mbridge.msdk.dycreator.utils;

import android.util.Log;

/* compiled from: Logger.java */
/* loaded from: classes3.dex */
public class g {
    public static boolean a;

    public static void a(String str) {
        if (a) {
            new SecurityManager();
            Log.e(new Throwable().getStackTrace()[1].getFileName(), str);
        }
    }
}
