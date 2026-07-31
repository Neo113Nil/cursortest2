package org.chromium.base;

import internal.org.jni_zero.GEN_JNI;
import internal.org.jni_zero.JniTestInstanceHolder;
import org.chromium.base.TraceEvent;

/* loaded from: classes10.dex */
class TraceEventJni implements TraceEvent.Natives {
    private static JniTestInstanceHolder sOverride;

    TraceEventJni() {
    }

    public static TraceEvent.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder != null && (obj = jniTestInstanceHolder.value) != null) {
            return (TraceEvent.Natives) obj;
        }
        return new TraceEventJni();
    }

    @Override // org.chromium.base.TraceEvent.Natives
    public void addViewDump(int i, int i2, boolean z, boolean z2, String str, String str2, long j) {
        GEN_JNI.org_chromium_base_TraceEvent_addViewDump(i, i2, z, z2, str, str2, j);
    }

    @Override // org.chromium.base.TraceEvent.Natives
    public void begin(String str, String str2) {
        GEN_JNI.org_chromium_base_TraceEvent_begin(str, str2);
    }

    @Override // org.chromium.base.TraceEvent.Natives
    public void beginToplevel(String str) {
        GEN_JNI.org_chromium_base_TraceEvent_beginToplevel(str);
    }

    @Override // org.chromium.base.TraceEvent.Natives
    public void end(String str, long j) {
        GEN_JNI.org_chromium_base_TraceEvent_end(str, j);
    }

    @Override // org.chromium.base.TraceEvent.Natives
    public void endToplevel() {
        GEN_JNI.org_chromium_base_TraceEvent_endToplevel();
    }

    @Override // org.chromium.base.TraceEvent.Natives
    public void finishAsync(long j) {
        GEN_JNI.org_chromium_base_TraceEvent_finishAsync(j);
    }

    @Override // org.chromium.base.TraceEvent.Natives
    public void initViewHierarchyDump(long j, Object obj) {
        GEN_JNI.org_chromium_base_TraceEvent_initViewHierarchyDump(j, obj);
    }

    @Override // org.chromium.base.TraceEvent.Natives
    public void instant(String str, String str2) {
        GEN_JNI.org_chromium_base_TraceEvent_instant(str, str2);
    }

    @Override // org.chromium.base.TraceEvent.Natives
    public void registerEnabledObserver() {
        GEN_JNI.org_chromium_base_TraceEvent_registerEnabledObserver();
    }

    @Override // org.chromium.base.TraceEvent.Natives
    public long startActivityDump(String str, long j) {
        return GEN_JNI.org_chromium_base_TraceEvent_startActivityDump(str, j);
    }

    @Override // org.chromium.base.TraceEvent.Natives
    public boolean viewHierarchyDumpEnabled() {
        return GEN_JNI.org_chromium_base_TraceEvent_viewHierarchyDumpEnabled();
    }
}
