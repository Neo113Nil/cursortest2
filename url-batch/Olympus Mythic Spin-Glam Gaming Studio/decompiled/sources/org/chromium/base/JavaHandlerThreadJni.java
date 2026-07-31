package org.chromium.base;

import internal.org.jni_zero.GEN_JNI;
import internal.org.jni_zero.JniTestInstanceHolder;
import org.chromium.base.JavaHandlerThread;

/* loaded from: classes15.dex */
class JavaHandlerThreadJni implements JavaHandlerThread.Natives {
    private static JniTestInstanceHolder sOverride;

    JavaHandlerThreadJni() {
    }

    public static JavaHandlerThread.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder != null && (obj = jniTestInstanceHolder.value) != null) {
            return (JavaHandlerThread.Natives) obj;
        }
        return new JavaHandlerThreadJni();
    }

    @Override // org.chromium.base.JavaHandlerThread.Natives
    public void initializeThread(long j, long j2) {
        GEN_JNI.org_chromium_base_JavaHandlerThread_initializeThread(j, j2);
    }

    @Override // org.chromium.base.JavaHandlerThread.Natives
    public void onLooperStopped(long j) {
        GEN_JNI.org_chromium_base_JavaHandlerThread_onLooperStopped(j);
    }
}
