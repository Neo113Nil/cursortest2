package org.chromium.net.impl;

import internal.org.jni_zero.GEN_JNI;
import internal.org.jni_zero.JniTestInstanceHolder;
import org.chromium.net.impl.CompletionOnceCallback;

/* loaded from: classes12.dex */
class CompletionOnceCallbackJni implements CompletionOnceCallback.Natives {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static JniTestInstanceHolder sOverride;

    CompletionOnceCallbackJni() {
    }

    public static CompletionOnceCallback.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder != null && (obj = jniTestInstanceHolder.value) != null) {
            return (CompletionOnceCallback.Natives) obj;
        }
        return new CompletionOnceCallbackJni();
    }

    public static void setInstanceForTesting(CompletionOnceCallback.Natives natives) {
        if (sOverride == null) {
            sOverride = JniTestInstanceHolder.create();
        }
        sOverride.value = natives;
    }

    @Override // org.chromium.net.impl.CompletionOnceCallback.Natives
    public void run(long j, int i) {
        GEN_JNI.org_chromium_net_impl_CompletionOnceCallback_run(j, i);
    }
}
