package org.chromium.base;

import internal.org.jni_zero.GEN_JNI;
import internal.org.jni_zero.JniTestInstanceHolder;
import org.chromium.base.JavaExceptionReporter;

/* loaded from: classes3.dex */
class JavaExceptionReporterJni implements JavaExceptionReporter.Natives {
    private static JniTestInstanceHolder sOverride;

    JavaExceptionReporterJni() {
    }

    public static JavaExceptionReporter.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder != null && (obj = jniTestInstanceHolder.value) != null) {
            return (JavaExceptionReporter.Natives) obj;
        }
        return new JavaExceptionReporterJni();
    }

    @Override // org.chromium.base.JavaExceptionReporter.Natives
    public void reportJavaException(boolean z, Throwable th) {
        GEN_JNI.org_chromium_base_JavaExceptionReporter_reportJavaException(z, th);
    }
}
