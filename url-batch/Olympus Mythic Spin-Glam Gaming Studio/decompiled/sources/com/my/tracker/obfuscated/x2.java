package com.my.tracker.obfuscated;

import android.util.Log;
import com.pubmatic.sdk.common.POBCommonConstants;

/* loaded from: classes8.dex */
public abstract class x2 {
    private static volatile boolean a;

    public static boolean a() {
        return a;
    }

    public static void b(String str) {
        if (a) {
            if (str == null) {
                str = POBCommonConstants.NULL_VALUE;
            }
            Log.e("[myTracker]", str);
        }
    }

    public static void c(String str) {
        if (Log.isLoggable("[myTracker]", 4)) {
            if (str == null) {
                str = POBCommonConstants.NULL_VALUE;
            }
            Log.i("[myTracker]", str);
        }
    }

    public static void a(boolean z) {
        a = z;
    }

    public static void a(String str) {
        if (a) {
            if (str == null) {
                str = POBCommonConstants.NULL_VALUE;
            }
            Log.d("[myTracker]", str);
        }
    }

    public static void b(String str, Throwable th) {
        if (a) {
            if (str == null) {
                str = POBCommonConstants.NULL_VALUE;
            }
            Log.e("[myTracker]", str, th);
        }
    }

    public static void a(String str, Throwable th) {
        if (a) {
            if (str == null) {
                str = POBCommonConstants.NULL_VALUE;
            }
            Log.d("[myTracker]", str, th);
        }
    }
}
