package com.google.protobuf;

/* loaded from: classes11.dex */
abstract class Android {
    private static final Class MEMORY_CLASS = getClassForName("libcore.io.Memory");
    private static final boolean IS_ROBOLECTRIC = false;

    static boolean isOnAndroidDevice() {
        return true;
    }

    static Class getMemoryClass() {
        return MEMORY_CLASS;
    }

    private static Class getClassForName(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
