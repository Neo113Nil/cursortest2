package org.chromium.net;

import android.net.ConnectivityManager;
import internal.org.jni_zero.CalledByNative;
import org.chromium.base.ContextUtils;

/* loaded from: classes6.dex */
public class NetworkActiveNotifier implements ConnectivityManager.OnNetworkActiveListener {
    private boolean mAreNotificationsEnabled;
    private final ConnectivityManager mConnectivityManager = (ConnectivityManager) ContextUtils.getApplicationContext().getSystemService("connectivity");
    private final long mNativeNetworkActiveObserver;

    interface Natives {
        void notifyOfDefaultNetworkActive(long j);
    }

    @CalledByNative
    public static NetworkActiveNotifier build(long j) {
        return new NetworkActiveNotifier(j);
    }

    @CalledByNative
    public void enableNotifications() {
        this.mAreNotificationsEnabled = true;
        this.mConnectivityManager.addDefaultNetworkActiveListener(this);
    }

    @CalledByNative
    public void disableNotifications() {
        this.mAreNotificationsEnabled = false;
        this.mConnectivityManager.removeDefaultNetworkActiveListener(this);
    }

    @CalledByNative
    public boolean isDefaultNetworkActive() {
        return this.mConnectivityManager.isDefaultNetworkActive();
    }

    @Override // android.net.ConnectivityManager.OnNetworkActiveListener
    public void onNetworkActive() {
        NetworkActiveNotifierJni.get().notifyOfDefaultNetworkActive(this.mNativeNetworkActiveObserver);
    }

    @CalledByNative
    public void fakeDefaultNetworkActive() {
        if (this.mAreNotificationsEnabled) {
            onNetworkActive();
        }
    }

    private NetworkActiveNotifier(long j) {
        this.mNativeNetworkActiveObserver = j;
    }
}
