package org.chromium.net;

import internal.org.jni_zero.GEN_JNI;
import internal.org.jni_zero.JniTestInstanceHolder;
import org.chromium.net.ProxyChangeListener;

/* loaded from: classes15.dex */
class ProxyChangeListenerJni implements ProxyChangeListener.Natives {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static JniTestInstanceHolder sOverride;

    ProxyChangeListenerJni() {
    }

    public static ProxyChangeListener.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder != null && (obj = jniTestInstanceHolder.value) != null) {
            return (ProxyChangeListener.Natives) obj;
        }
        return new ProxyChangeListenerJni();
    }

    public static void setInstanceForTesting(ProxyChangeListener.Natives natives) {
        if (sOverride == null) {
            sOverride = JniTestInstanceHolder.create();
        }
        sOverride.value = natives;
    }

    @Override // org.chromium.net.ProxyChangeListener.Natives
    public void proxySettingsChanged(long j) {
        GEN_JNI.org_chromium_net_ProxyChangeListener_proxySettingsChanged(j);
    }

    @Override // org.chromium.net.ProxyChangeListener.Natives
    public void proxySettingsChangedTo(long j, String str, int i, String str2, String[] strArr) {
        GEN_JNI.org_chromium_net_ProxyChangeListener_proxySettingsChangedTo(j, str, i, str2, strArr);
    }
}
