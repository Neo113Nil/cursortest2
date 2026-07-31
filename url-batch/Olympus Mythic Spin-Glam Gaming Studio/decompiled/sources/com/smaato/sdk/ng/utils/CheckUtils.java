package com.smaato.sdk.ng.utils;

/* loaded from: classes14.dex */
public class CheckUtils {
    private static final String a = "CheckUtils";

    public static class NoThrow {
        private static boolean a;

        public static boolean checkArgument(boolean z, String str) {
            return CheckUtils.a(z, a, str);
        }

        public static boolean checkNotNull(Object obj, String str) {
            return CheckUtils.a(obj, a, str);
        }

        public static void setStrictMode(boolean z) {
            a = z;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean a(boolean z, boolean z2, String str) {
        if (z) {
            return true;
        }
        if (z2) {
            throw new IllegalArgumentException(str);
        }
        Logger.e(a, str);
        return false;
    }

    public static void checkArgument(boolean z, String str) {
        a(z, true, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean a(Object obj, boolean z, String str) {
        if (obj != null) {
            return true;
        }
        if (!z) {
            Logger.e(a, str);
            return false;
        }
        throw new NullPointerException(str);
    }
}
