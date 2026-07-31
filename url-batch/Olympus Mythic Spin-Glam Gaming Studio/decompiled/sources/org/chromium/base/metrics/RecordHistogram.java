package org.chromium.base.metrics;

/* loaded from: classes15.dex */
public abstract class RecordHistogram {
    public static void recordBooleanHistogram(String str, boolean z) {
        UmaRecorderHolder.get().recordBooleanHistogram(str, z);
    }
}
