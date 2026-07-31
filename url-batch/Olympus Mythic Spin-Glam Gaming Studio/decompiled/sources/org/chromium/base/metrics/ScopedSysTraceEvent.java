package org.chromium.base.metrics;

import android.os.Trace;

/* loaded from: classes5.dex */
public class ScopedSysTraceEvent implements AutoCloseable {
    public static ScopedSysTraceEvent scoped(String str) {
        return new ScopedSysTraceEvent(str);
    }

    private ScopedSysTraceEvent(String str) {
        if (str.length() > 127) {
            str = str.substring(0, 124) + "...";
        }
        Trace.beginSection(str);
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        Trace.endSection();
    }
}
