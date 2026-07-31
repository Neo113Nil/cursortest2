package org.chromium.net;

import internal.org.jni_zero.GEN_JNI;
import internal.org.jni_zero.JniTestInstanceHolder;
import org.chromium.net.NetworkActiveNotifier;

/* loaded from: classes14.dex */
class NetworkActiveNotifierJni implements NetworkActiveNotifier.Natives {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static JniTestInstanceHolder sOverride;

    NetworkActiveNotifierJni() {
    }

    public static NetworkActiveNotifier.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder != null && (obj = jniTestInstanceHolder.value) != null) {
            return (NetworkActiveNotifier.Natives) obj;
        }
        return new NetworkActiveNotifierJni();
    }

    public static void setInstanceForTesting(NetworkActiveNotifier.Natives natives) {
        if (sOverride == null) {
            sOverride = JniTestInstanceHolder.create();
        }
        sOverride.value = natives;
    }

    @Override // org.chromium.net.NetworkActiveNotifier.Natives
    public void notifyOfDefaultNetworkActive(long j) {
        GEN_JNI.org_chromium_net_NetworkActiveNotifier_notifyOfDefaultNetworkActive(j);
    }
}
