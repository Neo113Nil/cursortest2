package org.chromium.base;

import internal.org.jni_zero.CalledByNative;

/* loaded from: classes6.dex */
public class EventLog {
    @CalledByNative
    public static void writeEvent(int i, int i2) {
        android.util.EventLog.writeEvent(i, i2);
    }
}
