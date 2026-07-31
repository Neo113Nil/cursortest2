package com.smaato.sdk.ng.utils;

import android.util.Log;
import com.ironsource.X3;

/* loaded from: classes5.dex */
public class Logger {
    private static Level a = Level.info;

    public enum Level {
        verbose(1),
        debug(2),
        info(3),
        warning(4),
        error(5),
        none(6);

        private final int a;

        Level(int i) {
            this.a = i;
        }

        public int getValue() {
            return this.a;
        }
    }

    public static void d(String str, String str2) {
        d(str, str2, null);
    }

    public static void e(String str, String str2) {
        e(str, str2, null);
    }

    public static void setLogLevel(Level level) {
        a = level;
    }

    public static void w(String str, String str2) {
        w(str, str2, null);
    }

    public static void d(String str, String str2, Throwable th) {
        Level level = a;
        if (level != null) {
            level.getValue();
            Level.debug.getValue();
        }
    }

    public static void e(String str, String str2, Throwable th) {
        Level level = a;
        if (level == null || level.getValue() > Level.error.getValue()) {
            return;
        }
        Log.e("NextGen", X3.j.d + str + "] " + str2, th);
    }

    public static void w(String str, String str2, Throwable th) {
        Level level = a;
        if (level == null || level.getValue() > Level.warning.getValue()) {
            return;
        }
        Log.w("NextGen", X3.j.d + str + "] " + str2, th);
    }
}
