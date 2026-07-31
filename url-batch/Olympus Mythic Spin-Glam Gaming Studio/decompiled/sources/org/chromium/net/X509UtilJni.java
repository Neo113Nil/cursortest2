package org.chromium.net;

import internal.org.jni_zero.GEN_JNI;
import internal.org.jni_zero.JniTestInstanceHolder;
import org.chromium.net.X509Util;

/* loaded from: classes5.dex */
class X509UtilJni implements X509Util.Natives {
    private static JniTestInstanceHolder sOverride;

    X509UtilJni() {
    }

    public static X509Util.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder != null && (obj = jniTestInstanceHolder.value) != null) {
            return (X509Util.Natives) obj;
        }
        return new X509UtilJni();
    }

    public static void setInstanceForTesting(X509Util.Natives natives) {
        if (sOverride == null) {
            sOverride = JniTestInstanceHolder.create();
        }
        sOverride.value = natives;
    }

    @Override // org.chromium.net.X509Util.Natives
    public void notifyClientCertStoreChanged() {
        GEN_JNI.org_chromium_net_X509Util_notifyClientCertStoreChanged();
    }

    @Override // org.chromium.net.X509Util.Natives
    public void notifyTrustStoreChanged() {
        GEN_JNI.org_chromium_net_X509Util_notifyTrustStoreChanged();
    }
}
