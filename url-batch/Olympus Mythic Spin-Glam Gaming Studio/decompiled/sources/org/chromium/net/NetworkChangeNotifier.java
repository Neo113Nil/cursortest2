package org.chromium.net;

import android.annotation.SuppressLint;
import androidx.annotation.VisibleForTesting;
import internal.org.jni_zero.CalledByNative;
import java.util.ArrayList;
import java.util.Iterator;
import org.chromium.base.ObserverList;
import org.chromium.base.metrics.ScopedSysTraceEvent;
import org.chromium.net.NetworkChangeNotifierAutoDetect;

/* loaded from: classes8.dex */
public class NetworkChangeNotifier {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    @SuppressLint({"StaticFieldLeak"})
    private static NetworkChangeNotifier sInstance;
    private NetworkChangeNotifierAutoDetect mAutoDetector;
    private int mCurrentConnectionType = 0;
    private int mCurrentConnectionCost = 0;
    private final ArrayList<Long> mNativeChangeNotifiers = new ArrayList<>();
    private final ObserverList mConnectionTypeObservers = new ObserverList();

    public interface ConnectionTypeObserver {
        void onConnectionTypeChanged(int i);
    }

    interface Natives {
        void notifyConnectionCostChanged(long j, int i);

        void notifyConnectionSubtypeChanged(long j, int i);

        void notifyConnectionTypeChanged(long j, int i, long j2);

        void notifyOfNetworkConnect(long j, long j2, int i);

        void notifyOfNetworkDisconnect(long j, long j2);

        void notifyOfNetworkSoonToDisconnect(long j, long j2);

        void notifyPurgeActiveNetworkList(long j, long[] jArr);
    }

    @VisibleForTesting
    protected NetworkChangeNotifier() {
    }

    @CalledByNative
    public static NetworkChangeNotifier init() {
        if (sInstance == null) {
            sInstance = new NetworkChangeNotifier();
        }
        return sInstance;
    }

    public static boolean isInitialized() {
        return sInstance != null;
    }

    public static void resetInstanceForTests() {
        sInstance = new NetworkChangeNotifier();
    }

    public static void resetInstanceForTests(NetworkChangeNotifier networkChangeNotifier) {
        sInstance = networkChangeNotifier;
    }

    @CalledByNative
    public int getCurrentConnectionType() {
        return this.mCurrentConnectionType;
    }

    @CalledByNative
    public int getCurrentConnectionSubtype(boolean z) {
        ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("NetworkChangeNotifier.getCurrentConnectionSubtype");
        try {
            NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.mAutoDetector;
            if (networkChangeNotifierAutoDetect == null) {
                if (scoped == null) {
                    return 0;
                }
                scoped.close();
                return 0;
            }
            if (z) {
                networkChangeNotifierAutoDetect.updateCurrentNetworkState();
            }
            int connectionSubtype = this.mAutoDetector.getCurrentNetworkState().getConnectionSubtype();
            if (scoped != null) {
                scoped.close();
            }
            return connectionSubtype;
        } catch (Throwable th) {
            if (scoped != null) {
                try {
                    scoped.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @CalledByNative
    public int getCurrentConnectionCost() {
        return this.mCurrentConnectionCost;
    }

    @CalledByNative
    public long getCurrentDefaultNetId() {
        NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.mAutoDetector;
        if (networkChangeNotifierAutoDetect == null) {
            return -1L;
        }
        return networkChangeNotifierAutoDetect.getDefaultNetId();
    }

    @CalledByNative
    public long[] getCurrentNetworksAndTypes() {
        ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("NetworkChangeNotifierAutoDetect.getCurrentNetworksAndTypes");
        try {
            NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.mAutoDetector;
            long[] networksAndTypes = networkChangeNotifierAutoDetect == null ? new long[0] : networkChangeNotifierAutoDetect.getNetworksAndTypes();
            if (scoped != null) {
                scoped.close();
            }
            return networksAndTypes;
        } catch (Throwable th) {
            if (scoped != null) {
                try {
                    scoped.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @CalledByNative
    public void addNativeObserver(long j) {
        this.mNativeChangeNotifiers.add(Long.valueOf(j));
    }

    @CalledByNative
    public void removeNativeObserver(long j) {
        this.mNativeChangeNotifiers.remove(Long.valueOf(j));
    }

    @CalledByNative
    public boolean registerNetworkCallbackFailed() {
        NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.mAutoDetector;
        if (networkChangeNotifierAutoDetect == null) {
            return false;
        }
        return networkChangeNotifierAutoDetect.registerNetworkCallbackFailed();
    }

    public static NetworkChangeNotifier getInstance() {
        return sInstance;
    }

    @CalledByNative
    public static void setAutoDetectConnectivityState(boolean z) {
        getInstance().setAutoDetectConnectivityStateInternal(z, new RegistrationPolicyApplicationStatus());
    }

    public static void registerToReceiveNotificationsAlways() {
        getInstance().setAutoDetectConnectivityStateInternal(true, new RegistrationPolicyAlwaysRegister());
    }

    public static void setAutoDetectConnectivityState(NetworkChangeNotifierAutoDetect.RegistrationPolicy registrationPolicy, boolean z) {
        getInstance().setAutoDetectConnectivityStateInternal(true, registrationPolicy, z);
    }

    private void destroyAutoDetector() {
        NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.mAutoDetector;
        if (networkChangeNotifierAutoDetect != null) {
            networkChangeNotifierAutoDetect.destroy();
            this.mAutoDetector = null;
        }
    }

    private void setAutoDetectConnectivityStateInternal(boolean z, NetworkChangeNotifierAutoDetect.RegistrationPolicy registrationPolicy) {
        setAutoDetectConnectivityStateInternal(z, registrationPolicy, true);
    }

    private void setAutoDetectConnectivityStateInternal(boolean z, NetworkChangeNotifierAutoDetect.RegistrationPolicy registrationPolicy, boolean z2) {
        ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("NetworkChangeNotifier.setAutoDetectConnectivityStateInternal");
        try {
            if (z) {
                if (this.mAutoDetector == null) {
                    NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = new NetworkChangeNotifierAutoDetect(new NetworkChangeNotifierAutoDetect.Observer() { // from class: org.chromium.net.NetworkChangeNotifier.1
                        @Override // org.chromium.net.NetworkChangeNotifierAutoDetect.Observer
                        public void onConnectionTypeChanged(int i) {
                            NetworkChangeNotifier.this.updateCurrentConnectionType(i);
                        }

                        @Override // org.chromium.net.NetworkChangeNotifierAutoDetect.Observer
                        public void onConnectionCostChanged(int i) {
                            NetworkChangeNotifier.this.notifyObserversOfConnectionCostChange(i);
                        }

                        @Override // org.chromium.net.NetworkChangeNotifierAutoDetect.Observer
                        public void onConnectionSubtypeChanged(int i) {
                            NetworkChangeNotifier.this.notifyObserversOfConnectionSubtypeChange(i);
                        }

                        @Override // org.chromium.net.NetworkChangeNotifierAutoDetect.Observer
                        public void onNetworkConnect(long j, int i) {
                            NetworkChangeNotifier.this.notifyObserversOfNetworkConnect(j, i);
                        }

                        @Override // org.chromium.net.NetworkChangeNotifierAutoDetect.Observer
                        public void onNetworkSoonToDisconnect(long j) {
                            NetworkChangeNotifier.this.notifyObserversOfNetworkSoonToDisconnect(j);
                        }

                        @Override // org.chromium.net.NetworkChangeNotifierAutoDetect.Observer
                        public void onNetworkDisconnect(long j) {
                            NetworkChangeNotifier.this.notifyObserversOfNetworkDisconnect(j);
                        }

                        @Override // org.chromium.net.NetworkChangeNotifierAutoDetect.Observer
                        public void purgeActiveNetworkList(long[] jArr) {
                            NetworkChangeNotifier.this.notifyObserversToPurgeActiveNetworkList(jArr);
                        }
                    }, registrationPolicy);
                    this.mAutoDetector = networkChangeNotifierAutoDetect;
                    if (z2) {
                        networkChangeNotifierAutoDetect.updateCurrentNetworkState();
                    }
                    NetworkChangeNotifierAutoDetect.NetworkState currentNetworkState = this.mAutoDetector.getCurrentNetworkState();
                    updateCurrentConnectionType(currentNetworkState.getConnectionType());
                    updateCurrentConnectionCost(currentNetworkState.getConnectionCost());
                    notifyObserversOfConnectionSubtypeChange(currentNetworkState.getConnectionSubtype());
                }
            } else {
                destroyAutoDetector();
            }
            if (scoped != null) {
                scoped.close();
            }
        } catch (Throwable th) {
            if (scoped != null) {
                try {
                    scoped.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @CalledByNative
    public static void forceConnectivityState(boolean z) {
        setAutoDetectConnectivityState(false);
        getInstance().forceConnectivityStateInternal(z);
    }

    private void forceConnectivityStateInternal(boolean z) {
        if ((this.mCurrentConnectionType != 6) != z) {
            updateCurrentConnectionType(z ? 0 : 6);
            notifyObserversOfConnectionSubtypeChange(!z ? 1 : 0);
        }
    }

    @CalledByNative
    public static void fakeNetworkConnected(long j, int i) {
        setAutoDetectConnectivityState(false);
        getInstance().notifyObserversOfNetworkConnect(j, i);
    }

    @CalledByNative
    public static void fakeNetworkSoonToBeDisconnected(long j) {
        setAutoDetectConnectivityState(false);
        getInstance().notifyObserversOfNetworkSoonToDisconnect(j);
    }

    @CalledByNative
    public static void fakeNetworkDisconnected(long j) {
        setAutoDetectConnectivityState(false);
        getInstance().notifyObserversOfNetworkDisconnect(j);
    }

    @CalledByNative
    public static void fakePurgeActiveNetworkList(long[] jArr) {
        setAutoDetectConnectivityState(false);
        getInstance().notifyObserversToPurgeActiveNetworkList(jArr);
    }

    @CalledByNative
    public static void fakeDefaultNetwork(long j, int i) {
        setAutoDetectConnectivityState(false);
        getInstance().notifyObserversOfConnectionTypeChange(i, j);
    }

    @CalledByNative
    @VisibleForTesting
    public static void fakeConnectionCostChanged(int i) {
        setAutoDetectConnectivityState(false);
        getInstance().notifyObserversOfConnectionCostChange(i);
    }

    @CalledByNative
    public static void fakeConnectionSubtypeChanged(int i) {
        setAutoDetectConnectivityState(false);
        getInstance().notifyObserversOfConnectionSubtypeChange(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateCurrentConnectionType(int i) {
        this.mCurrentConnectionType = i;
        notifyObserversOfConnectionTypeChange(i);
    }

    void notifyObserversOfConnectionTypeChange(int i) {
        notifyObserversOfConnectionTypeChange(i, getCurrentDefaultNetId());
    }

    private void notifyObserversOfConnectionTypeChange(int i, long j) {
        Iterator<Long> it = this.mNativeChangeNotifiers.iterator();
        while (it.hasNext()) {
            NetworkChangeNotifierJni.get().notifyConnectionTypeChanged(it.next().longValue(), i, j);
        }
        Iterator it2 = this.mConnectionTypeObservers.iterator();
        while (it2.hasNext()) {
            ((ConnectionTypeObserver) it2.next()).onConnectionTypeChanged(i);
        }
    }

    private void updateCurrentConnectionCost(int i) {
        this.mCurrentConnectionCost = i;
        notifyObserversOfConnectionCostChange(i);
    }

    void notifyObserversOfConnectionCostChange(int i) {
        Iterator<Long> it = this.mNativeChangeNotifiers.iterator();
        while (it.hasNext()) {
            NetworkChangeNotifierJni.get().notifyConnectionCostChanged(it.next().longValue(), i);
        }
    }

    void notifyObserversOfConnectionSubtypeChange(int i) {
        Iterator<Long> it = this.mNativeChangeNotifiers.iterator();
        while (it.hasNext()) {
            NetworkChangeNotifierJni.get().notifyConnectionSubtypeChanged(it.next().longValue(), i);
        }
    }

    void notifyObserversOfNetworkConnect(long j, int i) {
        Iterator<Long> it = this.mNativeChangeNotifiers.iterator();
        while (it.hasNext()) {
            NetworkChangeNotifierJni.get().notifyOfNetworkConnect(it.next().longValue(), j, i);
        }
    }

    void notifyObserversOfNetworkSoonToDisconnect(long j) {
        Iterator<Long> it = this.mNativeChangeNotifiers.iterator();
        while (it.hasNext()) {
            NetworkChangeNotifierJni.get().notifyOfNetworkSoonToDisconnect(it.next().longValue(), j);
        }
    }

    void notifyObserversOfNetworkDisconnect(long j) {
        Iterator<Long> it = this.mNativeChangeNotifiers.iterator();
        while (it.hasNext()) {
            NetworkChangeNotifierJni.get().notifyOfNetworkDisconnect(it.next().longValue(), j);
        }
    }

    void notifyObserversToPurgeActiveNetworkList(long[] jArr) {
        Iterator<Long> it = this.mNativeChangeNotifiers.iterator();
        while (it.hasNext()) {
            NetworkChangeNotifierJni.get().notifyPurgeActiveNetworkList(it.next().longValue(), jArr);
        }
    }

    public static void addConnectionTypeObserver(ConnectionTypeObserver connectionTypeObserver) {
        getInstance().addConnectionTypeObserverInternal(connectionTypeObserver);
    }

    private void addConnectionTypeObserverInternal(ConnectionTypeObserver connectionTypeObserver) {
        this.mConnectionTypeObservers.addObserver(connectionTypeObserver);
    }

    public static void removeConnectionTypeObserver(ConnectionTypeObserver connectionTypeObserver) {
        getInstance().removeConnectionTypeObserverInternal(connectionTypeObserver);
    }

    private void removeConnectionTypeObserverInternal(ConnectionTypeObserver connectionTypeObserver) {
        this.mConnectionTypeObservers.removeObserver(connectionTypeObserver);
    }

    public static NetworkChangeNotifierAutoDetect getAutoDetectorForTest() {
        return getInstance().mAutoDetector;
    }

    public static boolean isOnline() {
        return getInstance().getCurrentConnectionType() != 6;
    }
}
