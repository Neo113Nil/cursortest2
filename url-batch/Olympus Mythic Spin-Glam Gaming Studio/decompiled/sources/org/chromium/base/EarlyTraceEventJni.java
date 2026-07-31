package org.chromium.base;

import internal.org.jni_zero.GEN_JNI;
import internal.org.jni_zero.JniTestInstanceHolder;
import org.chromium.base.EarlyTraceEvent;

/* loaded from: classes14.dex */
class EarlyTraceEventJni implements EarlyTraceEvent.Natives {
    private static JniTestInstanceHolder sOverride;

    EarlyTraceEventJni() {
    }

    public static EarlyTraceEvent.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder != null && (obj = jniTestInstanceHolder.value) != null) {
            return (EarlyTraceEvent.Natives) obj;
        }
        return new EarlyTraceEventJni();
    }

    @Override // org.chromium.base.EarlyTraceEvent.Natives
    public void recordEarlyAsyncBeginEvent(String str, long j, long j2) {
        GEN_JNI.org_chromium_base_EarlyTraceEvent_recordEarlyAsyncBeginEvent(str, j, j2);
    }

    @Override // org.chromium.base.EarlyTraceEvent.Natives
    public void recordEarlyAsyncEndEvent(long j, long j2) {
        GEN_JNI.org_chromium_base_EarlyTraceEvent_recordEarlyAsyncEndEvent(j, j2);
    }

    @Override // org.chromium.base.EarlyTraceEvent.Natives
    public void recordEarlyBeginEvent(String str, long j, int i, long j2) {
        GEN_JNI.org_chromium_base_EarlyTraceEvent_recordEarlyBeginEvent(str, j, i, j2);
    }

    @Override // org.chromium.base.EarlyTraceEvent.Natives
    public void recordEarlyEndEvent(String str, long j, int i, long j2) {
        GEN_JNI.org_chromium_base_EarlyTraceEvent_recordEarlyEndEvent(str, j, i, j2);
    }

    @Override // org.chromium.base.EarlyTraceEvent.Natives
    public void recordEarlyToplevelBeginEvent(String str, long j, int i, long j2) {
        GEN_JNI.org_chromium_base_EarlyTraceEvent_recordEarlyToplevelBeginEvent(str, j, i, j2);
    }

    @Override // org.chromium.base.EarlyTraceEvent.Natives
    public void recordEarlyToplevelEndEvent(String str, long j, int i, long j2) {
        GEN_JNI.org_chromium_base_EarlyTraceEvent_recordEarlyToplevelEndEvent(str, j, i, j2);
    }
}
