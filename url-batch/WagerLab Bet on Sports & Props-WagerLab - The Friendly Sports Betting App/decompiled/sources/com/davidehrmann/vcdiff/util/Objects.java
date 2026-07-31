package com.davidehrmann.vcdiff.util;

/* loaded from: classes3.dex */
public class Objects {
    public static <T> T requireNotNull(T t) {
        t.getClass();
        return t;
    }

    public static <T> T requireNotNull(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }
}
