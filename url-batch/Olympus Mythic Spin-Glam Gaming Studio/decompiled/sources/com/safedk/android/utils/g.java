package com.safedk.android.utils;

import android.os.SystemClock;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public class g {
    private static final String a = "RegexFactory";
    private static final Map<String, Pattern> b = new HashMap();

    public static Pattern a(String str, int i) {
        Pattern pattern = b.get(str);
        if (pattern == null) {
            try {
                synchronized (b) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    pattern = i == 0 ? Pattern.compile(str) : Pattern.compile(str, i);
                    b.put(str, pattern);
                    Logger.d(a, "pattern initialization completed in ", Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime), "ms, regex: ", str);
                }
            } catch (Throwable th) {
                Logger.d(a, "pattern initialization failed", th);
            }
        }
        return pattern;
    }

    public static Pattern a(String str) {
        return a(str, 0);
    }
}
