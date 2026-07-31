package org.chromium.net.impl;

import internal.org.jni_zero.GEN_JNI;
import internal.org.jni_zero.JniTestInstanceHolder;
import org.chromium.net.impl.ProxyCallbackRequestImpl;

/* loaded from: classes5.dex */
class ProxyCallbackRequestImplJni implements ProxyCallbackRequestImpl.Natives {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static JniTestInstanceHolder sOverride;

    ProxyCallbackRequestImplJni() {
    }

    public static ProxyCallbackRequestImpl.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder != null && (obj = jniTestInstanceHolder.value) != null) {
            return (ProxyCallbackRequestImpl.Natives) obj;
        }
        return new ProxyCallbackRequestImplJni();
    }

    public static void setInstanceForTesting(ProxyCallbackRequestImpl.Natives natives) {
        if (sOverride == null) {
            sOverride = JniTestInstanceHolder.create();
        }
        sOverride.value = natives;
    }

    @Override // org.chromium.net.impl.ProxyCallbackRequestImpl.Natives
    public void cancel(long j) {
        GEN_JNI.org_chromium_net_impl_ProxyCallbackRequestImpl_cancel(j);
    }

    @Override // org.chromium.net.impl.ProxyCallbackRequestImpl.Natives
    public boolean proceed(long j, String[] strArr) {
        return GEN_JNI.org_chromium_net_impl_ProxyCallbackRequestImpl_proceed(j, strArr);
    }
}
