package org.chromium.net.impl;

import internal.org.jni_zero.GEN_JNI;
import internal.org.jni_zero.JniTestInstanceHolder;
import org.chromium.net.impl.CronetLibraryLoader;

/* loaded from: classes15.dex */
class CronetLibraryLoaderJni implements CronetLibraryLoader.Natives {
    private static JniTestInstanceHolder sOverride;

    CronetLibraryLoaderJni() {
    }

    public static CronetLibraryLoader.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder != null && (obj = jniTestInstanceHolder.value) != null) {
            return (CronetLibraryLoader.Natives) obj;
        }
        return new CronetLibraryLoaderJni();
    }

    public static void setInstanceForTesting(CronetLibraryLoader.Natives natives) {
        if (sOverride == null) {
            sOverride = JniTestInstanceHolder.create();
        }
        sOverride.value = natives;
    }

    @Override // org.chromium.net.impl.CronetLibraryLoader.Natives
    public void cronetInitOnInitThread(int i) {
        GEN_JNI.org_chromium_net_impl_CronetLibraryLoader_cronetInitOnInitThread(i);
    }

    @Override // org.chromium.net.impl.CronetLibraryLoader.Natives
    public String getCronetVersion() {
        return (String) GEN_JNI.org_chromium_net_impl_CronetLibraryLoader_getCronetVersion();
    }

    @Override // org.chromium.net.impl.CronetLibraryLoader.Natives
    public int getTraceNetLogCaptureModeForTesting() {
        return GEN_JNI.org_chromium_net_impl_CronetLibraryLoader_getTraceNetLogCaptureModeForTesting();
    }

    @Override // org.chromium.net.impl.CronetLibraryLoader.Natives
    public void nativeInit(boolean z) {
        GEN_JNI.org_chromium_net_impl_CronetLibraryLoader_nativeInit(z);
    }

    @Override // org.chromium.net.impl.CronetLibraryLoader.Natives
    public void setMinLogLevel(int i) {
        GEN_JNI.org_chromium_net_impl_CronetLibraryLoader_setMinLogLevel(i);
    }
}
