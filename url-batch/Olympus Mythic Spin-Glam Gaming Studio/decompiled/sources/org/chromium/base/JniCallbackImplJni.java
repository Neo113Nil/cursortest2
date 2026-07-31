package org.chromium.base;

import internal.org.jni_zero.GEN_JNI;
import internal.org.jni_zero.JniTestInstanceHolder;
import org.chromium.base.JniCallbackImpl;

/* loaded from: classes6.dex */
class JniCallbackImplJni implements JniCallbackImpl.Natives {
    private static JniTestInstanceHolder sOverride;

    JniCallbackImplJni() {
    }

    public static JniCallbackImpl.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder != null && (obj = jniTestInstanceHolder.value) != null) {
            return (JniCallbackImpl.Natives) obj;
        }
        return new JniCallbackImplJni();
    }

    @Override // org.chromium.base.JniCallbackImpl.Natives
    public void onResult(boolean z, long j, Object obj) {
        GEN_JNI.org_chromium_base_JniCallbackImpl_onResult(z, j, obj);
    }
}
