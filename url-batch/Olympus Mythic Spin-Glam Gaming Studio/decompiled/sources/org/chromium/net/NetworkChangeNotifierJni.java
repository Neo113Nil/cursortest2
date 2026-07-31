package org.chromium.net;

import internal.org.jni_zero.GEN_JNI;
import internal.org.jni_zero.JniTestInstanceHolder;
import org.chromium.net.NetworkChangeNotifier;

/* loaded from: classes3.dex */
class NetworkChangeNotifierJni implements NetworkChangeNotifier.Natives {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static JniTestInstanceHolder sOverride;

    NetworkChangeNotifierJni() {
    }

    public static NetworkChangeNotifier.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder != null && (obj = jniTestInstanceHolder.value) != null) {
            return (NetworkChangeNotifier.Natives) obj;
        }
        return new NetworkChangeNotifierJni();
    }

    public static void setInstanceForTesting(NetworkChangeNotifier.Natives natives) {
        if (sOverride == null) {
            sOverride = JniTestInstanceHolder.create();
        }
        sOverride.value = natives;
    }

    @Override // org.chromium.net.NetworkChangeNotifier.Natives
    public void notifyConnectionCostChanged(long j, int i) {
        GEN_JNI.org_chromium_net_NetworkChangeNotifier_notifyConnectionCostChanged(j, i);
    }

    @Override // org.chromium.net.NetworkChangeNotifier.Natives
    public void notifyConnectionSubtypeChanged(long j, int i) {
        GEN_JNI.org_chromium_net_NetworkChangeNotifier_notifyConnectionSubtypeChanged(j, i);
    }

    @Override // org.chromium.net.NetworkChangeNotifier.Natives
    public void notifyConnectionTypeChanged(long j, int i, long j2) {
        GEN_JNI.org_chromium_net_NetworkChangeNotifier_notifyConnectionTypeChanged(j, i, j2);
    }

    @Override // org.chromium.net.NetworkChangeNotifier.Natives
    public void notifyOfNetworkConnect(long j, long j2, int i) {
        GEN_JNI.org_chromium_net_NetworkChangeNotifier_notifyOfNetworkConnect(j, j2, i);
    }

    @Override // org.chromium.net.NetworkChangeNotifier.Natives
    public void notifyOfNetworkDisconnect(long j, long j2) {
        GEN_JNI.org_chromium_net_NetworkChangeNotifier_notifyOfNetworkDisconnect(j, j2);
    }

    @Override // org.chromium.net.NetworkChangeNotifier.Natives
    public void notifyOfNetworkSoonToDisconnect(long j, long j2) {
        GEN_JNI.org_chromium_net_NetworkChangeNotifier_notifyOfNetworkSoonToDisconnect(j, j2);
    }

    @Override // org.chromium.net.NetworkChangeNotifier.Natives
    public void notifyPurgeActiveNetworkList(long j, long[] jArr) {
        GEN_JNI.org_chromium_net_NetworkChangeNotifier_notifyPurgeActiveNetworkList(j, jArr);
    }
}
