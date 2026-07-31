package org.chromium.net;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.ironsource.T3;
import internal.org.chromium.build.BuildConfig;
import internal.org.chromium.build.NullUtil;
import java.io.IOException;
import java.net.Socket;
import java.util.Arrays;
import org.chromium.base.ApplicationStatus;
import org.chromium.base.ContextUtils;
import org.chromium.base.Log;
import org.chromium.base.ResettersForTesting;
import org.chromium.base.StrictModeContext;
import org.chromium.base.TraceEvent;
import org.chromium.base.metrics.ScopedSysTraceEvent;

@SuppressLint({"NewApi"})
/* loaded from: classes9.dex */
public class NetworkChangeNotifierAutoDetect extends BroadcastReceiver {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String TAG = "NetworkChangeNotifierAutoDetect";
    private ConnectivityManagerDelegate mConnectivityManagerDelegate;
    private ConnectivityManager.NetworkCallback mDefaultNetworkCallback;
    private final Handler mHandler;
    private boolean mIgnoreNextBroadcast;
    private final NetworkConnectivityIntentFilter mIntentFilter;
    private final Looper mLooper;
    private MyNetworkCallback mNetworkCallback;
    private final NetworkRequest mNetworkRequest;
    private NetworkState mNetworkState;
    private final Observer mObserver;
    private boolean mRegisterNetworkCallbackFailed;
    private boolean mRegistered;
    private final RegistrationPolicy mRegistrationPolicy;
    private boolean mShouldSignalObserver;
    private WifiManagerDelegate mWifiManagerDelegate;

    public interface Observer {
        void onConnectionCostChanged(int i);

        void onConnectionSubtypeChanged(int i);

        void onConnectionTypeChanged(int i);

        void onNetworkConnect(long j, int i);

        void onNetworkDisconnect(long j);

        void onNetworkSoonToDisconnect(long j);

        void purgeActiveNetworkList(long[] jArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int convertToConnectionType(int i, int i2) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            if (i != 4 && i != 5) {
                if (i == 6) {
                    return 5;
                }
                if (i != 7) {
                    return i != 9 ? 0 : 1;
                }
                return 7;
            }
        }
        if (i2 == 20) {
            return 8;
        }
        switch (i2) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return 3;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
                return 4;
            case 13:
                return 5;
            default:
                return 0;
        }
    }

    public static class NetworkState {
        private final boolean mConnected;
        private final boolean mIsMetered;
        private final boolean mIsPrivateDnsActive;
        private final String mNetworkIdentifier;
        private final String mPrivateDnsServerName;
        private final int mSubtype;
        private final int mType;

        public NetworkState(boolean z, int i, int i2, boolean z2, String str, boolean z3, String str2) {
            this.mConnected = z;
            this.mType = i;
            this.mSubtype = i2;
            this.mIsMetered = z2;
            this.mNetworkIdentifier = str == null ? "" : str;
            this.mIsPrivateDnsActive = z3;
            this.mPrivateDnsServerName = str2 == null ? "" : str2;
        }

        public boolean isConnected() {
            return this.mConnected;
        }

        public int getNetworkType() {
            return this.mType;
        }

        public boolean isMetered() {
            return this.mIsMetered;
        }

        public int getNetworkSubType() {
            return this.mSubtype;
        }

        public String getNetworkIdentifier() {
            return this.mNetworkIdentifier;
        }

        public int getConnectionType() {
            if (isConnected()) {
                return NetworkChangeNotifierAutoDetect.convertToConnectionType(getNetworkType(), getNetworkSubType());
            }
            return 6;
        }

        public int getConnectionCost() {
            return isMetered() ? 2 : 1;
        }

        public int getConnectionSubtype() {
            if (!isConnected()) {
                return 1;
            }
            int networkType = getNetworkType();
            if (networkType != 0 && networkType != 4 && networkType != 5) {
                return 0;
            }
            switch (getNetworkSubType()) {
            }
            return 0;
        }

        public boolean isPrivateDnsActive() {
            return this.mIsPrivateDnsActive;
        }

        public String getPrivateDnsServerName() {
            return this.mPrivateDnsServerName;
        }
    }

    static class ConnectivityManagerDelegate {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final ConnectivityManager mConnectivityManager;

        ConnectivityManagerDelegate(Context context) {
            this.mConnectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        }

        @VisibleForTesting
        ConnectivityManagerDelegate() {
            this.mConnectivityManager = null;
        }

        private NetworkInfo processActiveNetworkInfo(NetworkInfo networkInfo) {
            if (networkInfo == null) {
                return null;
            }
            if (networkInfo.isConnected()) {
                return networkInfo;
            }
            if (networkInfo.getDetailedState() == NetworkInfo.DetailedState.BLOCKED && ApplicationStatus.getStateForApplication() == 1) {
                return networkInfo;
            }
            return null;
        }

        NetworkState getNetworkState(WifiManagerDelegate wifiManagerDelegate) {
            Network defaultNetwork = getDefaultNetwork();
            NetworkInfo processActiveNetworkInfo = processActiveNetworkInfo(getNetworkInfo(defaultNetwork));
            if (processActiveNetworkInfo == null) {
                return new NetworkState(false, -1, -1, false, null, false, "");
            }
            if (defaultNetwork != null) {
                NetworkCapabilitiesWrapper networkCapabilities = getNetworkCapabilities(defaultNetwork);
                boolean z = (networkCapabilities == null || networkCapabilities.hasCapability(11)) ? false : true;
                DnsStatus dnsStatus = AndroidNetworkLibrary.getDnsStatus(defaultNetwork);
                if (dnsStatus == null) {
                    return new NetworkState(true, processActiveNetworkInfo.getType(), processActiveNetworkInfo.getSubtype(), z, String.valueOf(NetworkChangeNotifierAutoDetect.networkToNetId(defaultNetwork)), false, "");
                }
                return new NetworkState(true, processActiveNetworkInfo.getType(), processActiveNetworkInfo.getSubtype(), z, String.valueOf(NetworkChangeNotifierAutoDetect.networkToNetId(defaultNetwork)), dnsStatus.getPrivateDnsActive(), dnsStatus.getPrivateDnsServerName());
            }
            if (processActiveNetworkInfo.getType() == 1) {
                if (processActiveNetworkInfo.getExtraInfo() != null && !"".equals(processActiveNetworkInfo.getExtraInfo())) {
                    return new NetworkState(true, processActiveNetworkInfo.getType(), processActiveNetworkInfo.getSubtype(), false, processActiveNetworkInfo.getExtraInfo(), false, "");
                }
                return new NetworkState(true, processActiveNetworkInfo.getType(), processActiveNetworkInfo.getSubtype(), false, ((WifiManagerDelegate) NullUtil.assumeNonNull(wifiManagerDelegate)).getWifiSsid(), false, "");
            }
            return new NetworkState(true, processActiveNetworkInfo.getType(), processActiveNetworkInfo.getSubtype(), false, null, false, "");
        }

        NetworkInfo getRawNetworkInfo(Network network) {
            try {
                try {
                    return this.mConnectivityManager.getNetworkInfo(network);
                } catch (NullPointerException unused) {
                    return null;
                }
            } catch (NullPointerException unused2) {
                return this.mConnectivityManager.getNetworkInfo(network);
            }
        }

        NetworkInfo getNetworkInfo(Network network) {
            NetworkInfo rawNetworkInfo = getRawNetworkInfo(network);
            return (rawNetworkInfo == null || rawNetworkInfo.getType() != 17) ? rawNetworkInfo : this.mConnectivityManager.getActiveNetworkInfo();
        }

        int getConnectionType(Network network) {
            NetworkInfo networkInfo = getNetworkInfo(network);
            if (networkInfo == null || !networkInfo.isConnected()) {
                return 6;
            }
            return NetworkChangeNotifierAutoDetect.convertToConnectionType(networkInfo.getType(), networkInfo.getSubtype());
        }

        @VisibleForTesting
        protected Network[] getAllNetworksUnfiltered() {
            Network[] allNetworks = this.mConnectivityManager.getAllNetworks();
            return allNetworks == null ? new Network[0] : allNetworks;
        }

        @VisibleForTesting
        protected boolean vpnAccessible(Network network) {
            Socket socket = new Socket();
            try {
                try {
                    StrictModeContext allowAllVmPolicies = StrictModeContext.allowAllVmPolicies();
                    try {
                        network.bindSocket(socket);
                        if (allowAllVmPolicies != null) {
                            allowAllVmPolicies.close();
                        }
                        try {
                            socket.close();
                            return true;
                        } catch (IOException unused) {
                            return true;
                        }
                    } catch (Throwable th) {
                        if (allowAllVmPolicies != null) {
                            try {
                                allowAllVmPolicies.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } catch (IOException unused2) {
                    return false;
                }
            } catch (IOException unused3) {
                socket.close();
                return false;
            } catch (Throwable th3) {
                try {
                    socket.close();
                } catch (IOException unused4) {
                }
                throw th3;
            }
        }

        @VisibleForTesting
        protected NetworkCapabilitiesWrapper getNetworkCapabilities(Network network) {
            for (int i = 0; i < 2; i++) {
                try {
                    return new NetworkCapabilitiesWrapper(this.mConnectivityManager.getNetworkCapabilities(network));
                } catch (SecurityException unused) {
                }
            }
            return null;
        }

        void registerNetworkCallback(NetworkRequest networkRequest, ConnectivityManager.NetworkCallback networkCallback, Handler handler) {
            if (Build.VERSION.SDK_INT >= 26) {
                StrictModeContext allowDiskReads = StrictModeContext.allowDiskReads();
                try {
                    this.mConnectivityManager.registerNetworkCallback(networkRequest, networkCallback, handler);
                    if (allowDiskReads != null) {
                        allowDiskReads.close();
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    if (allowDiskReads != null) {
                        try {
                            allowDiskReads.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
            this.mConnectivityManager.registerNetworkCallback(networkRequest, networkCallback);
        }

        @RequiresApi
        void registerDefaultNetworkCallback(ConnectivityManager.NetworkCallback networkCallback, Handler handler) {
            this.mConnectivityManager.registerDefaultNetworkCallback(networkCallback, handler);
        }

        void unregisterNetworkCallback(ConnectivityManager.NetworkCallback networkCallback) {
            this.mConnectivityManager.unregisterNetworkCallback(networkCallback);
        }

        Network getDefaultNetwork() {
            Network activeNetwork = this.mConnectivityManager.getActiveNetwork();
            if (activeNetwork != null) {
                return activeNetwork;
            }
            NetworkInfo activeNetworkInfo = this.mConnectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return null;
            }
            for (Network network : NetworkChangeNotifierAutoDetect.getAllNetworksFiltered(this, null)) {
                NetworkInfo rawNetworkInfo = getRawNetworkInfo(network);
                if (rawNetworkInfo != null && (rawNetworkInfo.getType() == activeNetworkInfo.getType() || rawNetworkInfo.getType() == 17)) {
                    if (activeNetwork != null && Build.VERSION.SDK_INT >= 29) {
                        NetworkInfo.DetailedState detailedState = rawNetworkInfo.getDetailedState();
                        NetworkInfo.DetailedState detailedState2 = NetworkInfo.DetailedState.CONNECTING;
                        if (detailedState != detailedState2) {
                            NetworkInfo rawNetworkInfo2 = getRawNetworkInfo(activeNetwork);
                            if (rawNetworkInfo2 != null && rawNetworkInfo2.getDetailedState() == detailedState2) {
                                activeNetwork = null;
                            }
                        }
                    }
                    if (activeNetwork != null) {
                        Log.e(NetworkChangeNotifierAutoDetect.TAG, "There should not be multiple connected networks of the same type. At least as of Android Marshmallow this is not supported. If this becomes supported this assertion may trigger.");
                    }
                    activeNetwork = network;
                }
            }
            return activeNetwork;
        }
    }

    static class WifiManagerDelegate {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final Context mContext;
        private boolean mHasWifiPermission;
        private boolean mHasWifiPermissionComputed;
        private final Object mLock;
        private WifiManager mWifiManager;

        WifiManagerDelegate(Context context) {
            this.mLock = new Object();
            this.mContext = context;
        }

        @VisibleForTesting
        WifiManagerDelegate() {
            this.mLock = new Object();
            this.mContext = null;
        }

        @SuppressLint({"WifiManagerPotentialLeak"})
        private boolean hasPermissionLocked() {
            if (this.mHasWifiPermissionComputed) {
                return this.mHasWifiPermission;
            }
            boolean z = this.mContext.getPackageManager().checkPermission("android.permission.ACCESS_WIFI_STATE", this.mContext.getPackageName()) == 0;
            this.mHasWifiPermission = z;
            this.mWifiManager = z ? (WifiManager) this.mContext.getSystemService(T3.b) : null;
            this.mHasWifiPermissionComputed = true;
            return this.mHasWifiPermission;
        }

        String getWifiSsid() {
            synchronized (this.mLock) {
                try {
                    if (hasPermissionLocked()) {
                        WifiInfo wifiInfoLocked = getWifiInfoLocked();
                        if (wifiInfoLocked != null) {
                            return wifiInfoLocked.getSSID();
                        }
                        return "";
                    }
                    return AndroidNetworkLibrary.getWifiSSID();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        private WifiInfo getWifiInfoLocked() {
            try {
                try {
                    return this.mWifiManager.getConnectionInfo();
                } catch (NullPointerException unused) {
                    return null;
                }
            } catch (NullPointerException unused2) {
                return this.mWifiManager.getConnectionInfo();
            }
        }
    }

    private class DefaultNetworkCallback extends ConnectivityManager.NetworkCallback {
        private DefaultNetworkCallback() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            if (NetworkChangeNotifierAutoDetect.this.mRegistered) {
                NetworkChangeNotifierAutoDetect.this.connectionTypeChanged();
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            onAvailable(null);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
            onAvailable(null);
        }
    }

    @RequiresApi
    private class AndroidRDefaultNetworkCallback extends ConnectivityManager.NetworkCallback {
        LinkProperties mLinkProperties;
        NetworkCapabilitiesWrapper mNetworkCapabilities;

        private AndroidRDefaultNetworkCallback() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            this.mLinkProperties = null;
            this.mNetworkCapabilities = null;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            this.mLinkProperties = null;
            this.mNetworkCapabilities = null;
            if (NetworkChangeNotifierAutoDetect.this.mRegistered) {
                NetworkChangeNotifierAutoDetect.this.connectionTypeChangedTo(new NetworkState(false, -1, -1, false, null, false, ""));
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
            this.mLinkProperties = linkProperties;
            if (!NetworkChangeNotifierAutoDetect.this.mRegistered || this.mLinkProperties == null || this.mNetworkCapabilities == null) {
                return;
            }
            NetworkChangeNotifierAutoDetect.this.connectionTypeChangedTo(getNetworkState(network));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            this.mNetworkCapabilities = new NetworkCapabilitiesWrapper(networkCapabilities);
            if (!NetworkChangeNotifierAutoDetect.this.mRegistered || this.mLinkProperties == null || this.mNetworkCapabilities == null) {
                return;
            }
            NetworkChangeNotifierAutoDetect.this.connectionTypeChangedTo(getNetworkState(network));
        }

        private NetworkState getNetworkState(Network network) {
            int i;
            int i2;
            boolean isPrivateDnsActive;
            String privateDnsServerName;
            int type;
            if (!this.mNetworkCapabilities.hasTransport(1) && !this.mNetworkCapabilities.hasTransport(5)) {
                if (this.mNetworkCapabilities.hasTransport(0)) {
                    NetworkInfo rawNetworkInfo = NetworkChangeNotifierAutoDetect.this.mConnectivityManagerDelegate.getRawNetworkInfo(network);
                    i2 = rawNetworkInfo != null ? rawNetworkInfo.getSubtype() : -1;
                    i = 0;
                } else {
                    if (this.mNetworkCapabilities.hasTransport(3)) {
                        type = 9;
                    } else if (this.mNetworkCapabilities.hasTransport(2)) {
                        type = 7;
                    } else if (this.mNetworkCapabilities.hasTransport(4)) {
                        NetworkInfo networkInfo = NetworkChangeNotifierAutoDetect.this.mConnectivityManagerDelegate.getNetworkInfo(network);
                        type = networkInfo != null ? networkInfo.getType() : 17;
                    } else {
                        i = -1;
                        i2 = -1;
                    }
                    i = type;
                }
                boolean z = !this.mNetworkCapabilities.hasCapability(11);
                String valueOf = String.valueOf(NetworkChangeNotifierAutoDetect.networkToNetId(network));
                isPrivateDnsActive = this.mLinkProperties.isPrivateDnsActive();
                privateDnsServerName = this.mLinkProperties.getPrivateDnsServerName();
                return new NetworkState(true, i, i2, z, valueOf, isPrivateDnsActive, privateDnsServerName);
            }
            i = 1;
            i2 = -1;
            boolean z2 = !this.mNetworkCapabilities.hasCapability(11);
            String valueOf2 = String.valueOf(NetworkChangeNotifierAutoDetect.networkToNetId(network));
            isPrivateDnsActive = this.mLinkProperties.isPrivateDnsActive();
            privateDnsServerName = this.mLinkProperties.getPrivateDnsServerName();
            return new NetworkState(true, i, i2, z2, valueOf2, isPrivateDnsActive, privateDnsServerName);
        }
    }

    private class MyNetworkCallback extends ConnectivityManager.NetworkCallback {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private Network mVpnInPlace;

        private MyNetworkCallback() {
        }

        void initializeVpnInPlace() {
            NetworkCapabilitiesWrapper networkCapabilities;
            ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("NetworkChangeNotifierAutoDetect.initializeVpnInPlace");
            try {
                Network[] allNetworksFiltered = NetworkChangeNotifierAutoDetect.getAllNetworksFiltered(NetworkChangeNotifierAutoDetect.this.mConnectivityManagerDelegate, null);
                this.mVpnInPlace = null;
                if (allNetworksFiltered.length == 1 && (networkCapabilities = NetworkChangeNotifierAutoDetect.this.mConnectivityManagerDelegate.getNetworkCapabilities(allNetworksFiltered[0])) != null && networkCapabilities.hasTransport(4)) {
                    this.mVpnInPlace = allNetworksFiltered[0];
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

        private boolean ignoreNetworkDueToVpn(Network network) {
            Network network2 = this.mVpnInPlace;
            return (network2 == null || network2.equals(network)) ? false : true;
        }

        private boolean ignoreConnectedInaccessibleVpn(Network network, NetworkCapabilitiesWrapper networkCapabilitiesWrapper) {
            return networkCapabilitiesWrapper == null || (networkCapabilitiesWrapper.hasTransport(4) && !NetworkChangeNotifierAutoDetect.this.mConnectivityManagerDelegate.vpnAccessible(network));
        }

        private boolean ignoreConnectedNetwork(Network network, NetworkCapabilitiesWrapper networkCapabilitiesWrapper) {
            return ignoreNetworkDueToVpn(network) || ignoreConnectedInaccessibleVpn(network, networkCapabilitiesWrapper);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x003d A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:3:0x0006, B:10:0x001c, B:12:0x0029, B:14:0x002d, B:20:0x003d, B:21:0x003f), top: B:2:0x0006 }] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x005b  */
        /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
        @Override // android.net.ConnectivityManager.NetworkCallback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onAvailable(Network network) {
            boolean z;
            final boolean z2;
            Network network2;
            TraceEvent scoped = TraceEvent.scoped("NetworkChangeNotifierCallback::onAvailable");
            try {
                NetworkCapabilitiesWrapper networkCapabilities = NetworkChangeNotifierAutoDetect.this.mConnectivityManagerDelegate.getNetworkCapabilities(network);
                if (ignoreConnectedNetwork(network, networkCapabilities)) {
                    if (scoped != null) {
                        scoped.close();
                        return;
                    }
                    return;
                }
                if (!((NetworkCapabilitiesWrapper) NullUtil.assumeNonNull(networkCapabilities)).hasTransport(4) || ((network2 = this.mVpnInPlace) != null && network.equals(network2))) {
                    z = false;
                    z2 = z;
                    if (z2) {
                        this.mVpnInPlace = network;
                    }
                    final long networkToNetId = NetworkChangeNotifierAutoDetect.networkToNetId(network);
                    final int connectionType = NetworkChangeNotifierAutoDetect.this.mConnectivityManagerDelegate.getConnectionType(network);
                    NetworkChangeNotifierAutoDetect.this.runOnThread(new Runnable(this) { // from class: org.chromium.net.NetworkChangeNotifierAutoDetect.MyNetworkCallback.1
                        final /* synthetic */ MyNetworkCallback this$1;

                        {
                            this.this$1 = this;
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            NetworkChangeNotifierAutoDetect.this.mObserver.onNetworkConnect(networkToNetId, connectionType);
                            if (z2) {
                                NetworkChangeNotifierAutoDetect.this.mObserver.onConnectionTypeChanged(connectionType);
                                NetworkChangeNotifierAutoDetect.this.mObserver.purgeActiveNetworkList(new long[]{networkToNetId});
                            }
                        }
                    });
                    if (scoped == null) {
                        scoped.close();
                        return;
                    }
                    return;
                }
                z = true;
                z2 = z;
                if (z2) {
                }
                final long networkToNetId2 = NetworkChangeNotifierAutoDetect.networkToNetId(network);
                final int connectionType2 = NetworkChangeNotifierAutoDetect.this.mConnectivityManagerDelegate.getConnectionType(network);
                NetworkChangeNotifierAutoDetect.this.runOnThread(new Runnable(this) { // from class: org.chromium.net.NetworkChangeNotifierAutoDetect.MyNetworkCallback.1
                    final /* synthetic */ MyNetworkCallback this$1;

                    {
                        this.this$1 = this;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        NetworkChangeNotifierAutoDetect.this.mObserver.onNetworkConnect(networkToNetId2, connectionType2);
                        if (z2) {
                            NetworkChangeNotifierAutoDetect.this.mObserver.onConnectionTypeChanged(connectionType2);
                            NetworkChangeNotifierAutoDetect.this.mObserver.purgeActiveNetworkList(new long[]{networkToNetId2});
                        }
                    }
                });
                if (scoped == null) {
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

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            TraceEvent scoped = TraceEvent.scoped("NetworkChangeNotifierCallback::onCapabilitiesChanged");
            try {
                if (ignoreConnectedNetwork(network, new NetworkCapabilitiesWrapper(networkCapabilities))) {
                    if (scoped != null) {
                        scoped.close();
                    }
                } else {
                    final long networkToNetId = NetworkChangeNotifierAutoDetect.networkToNetId(network);
                    final int connectionType = NetworkChangeNotifierAutoDetect.this.mConnectivityManagerDelegate.getConnectionType(network);
                    NetworkChangeNotifierAutoDetect.this.runOnThread(new Runnable(this) { // from class: org.chromium.net.NetworkChangeNotifierAutoDetect.MyNetworkCallback.2
                        final /* synthetic */ MyNetworkCallback this$1;

                        {
                            this.this$1 = this;
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            NetworkChangeNotifierAutoDetect.this.mObserver.onNetworkConnect(networkToNetId, connectionType);
                        }
                    });
                    if (scoped != null) {
                        scoped.close();
                    }
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

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLosing(Network network, int i) {
            TraceEvent scoped = TraceEvent.scoped("NetworkChangeNotifierCallback::onLosing");
            try {
                if (ignoreConnectedNetwork(network, NetworkChangeNotifierAutoDetect.this.mConnectivityManagerDelegate.getNetworkCapabilities(network))) {
                    if (scoped != null) {
                        scoped.close();
                    }
                } else {
                    final long networkToNetId = NetworkChangeNotifierAutoDetect.networkToNetId(network);
                    NetworkChangeNotifierAutoDetect.this.runOnThread(new Runnable(this) { // from class: org.chromium.net.NetworkChangeNotifierAutoDetect.MyNetworkCallback.3
                        final /* synthetic */ MyNetworkCallback this$1;

                        {
                            this.this$1 = this;
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            NetworkChangeNotifierAutoDetect.this.mObserver.onNetworkSoonToDisconnect(networkToNetId);
                        }
                    });
                    if (scoped != null) {
                        scoped.close();
                    }
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

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(final Network network) {
            TraceEvent scoped = TraceEvent.scoped("NetworkChangeNotifierCallback::onLost");
            try {
                if (ignoreNetworkDueToVpn(network)) {
                    if (scoped != null) {
                        scoped.close();
                        return;
                    }
                    return;
                }
                NetworkChangeNotifierAutoDetect.this.runOnThread(new Runnable(this) { // from class: org.chromium.net.NetworkChangeNotifierAutoDetect.MyNetworkCallback.4
                    final /* synthetic */ MyNetworkCallback this$1;

                    {
                        this.this$1 = this;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        NetworkChangeNotifierAutoDetect.this.mObserver.onNetworkDisconnect(NetworkChangeNotifierAutoDetect.networkToNetId(network));
                    }
                });
                if (this.mVpnInPlace != null) {
                    this.mVpnInPlace = null;
                    for (Network network2 : NetworkChangeNotifierAutoDetect.getAllNetworksFiltered(NetworkChangeNotifierAutoDetect.this.mConnectivityManagerDelegate, network)) {
                        onAvailable(network2);
                    }
                    NetworkChangeNotifierAutoDetect.this.updateCurrentNetworkState();
                    final int connectionType = NetworkChangeNotifierAutoDetect.this.getCurrentNetworkState().getConnectionType();
                    NetworkChangeNotifierAutoDetect.this.runOnThread(new Runnable(this) { // from class: org.chromium.net.NetworkChangeNotifierAutoDetect.MyNetworkCallback.5
                        final /* synthetic */ MyNetworkCallback this$1;

                        {
                            this.this$1 = this;
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            NetworkChangeNotifierAutoDetect.this.mObserver.onConnectionTypeChanged(connectionType);
                        }
                    });
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
    }

    public static abstract class RegistrationPolicy {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private NetworkChangeNotifierAutoDetect mNotifier;

        protected abstract void destroy();

        protected final void register() {
            this.mNotifier.register();
        }

        protected final void unregister() {
            this.mNotifier.unregister();
        }

        protected void init(NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect) {
            this.mNotifier = networkChangeNotifierAutoDetect;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NetworkChangeNotifierAutoDetect(Observer observer, RegistrationPolicy registrationPolicy) {
        ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("NetworkChangeNotifierAutoDetect.constructor");
        try {
            Looper myLooper = Looper.myLooper();
            this.mLooper = myLooper;
            this.mHandler = new Handler(myLooper);
            this.mObserver = observer;
            this.mConnectivityManagerDelegate = new ConnectivityManagerDelegate(ContextUtils.getApplicationContext());
            int i = Build.VERSION.SDK_INT;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            this.mNetworkCallback = new MyNetworkCallback();
            this.mNetworkRequest = new NetworkRequest.Builder().addCapability(12).removeCapability(15).build();
            if (i >= 30) {
                this.mDefaultNetworkCallback = new AndroidRDefaultNetworkCallback();
            } else {
                this.mDefaultNetworkCallback = i >= 28 ? new DefaultNetworkCallback() : null;
            }
            updateCurrentNetworkState();
            this.mIntentFilter = new NetworkConnectivityIntentFilter();
            this.mIgnoreNextBroadcast = false;
            this.mShouldSignalObserver = false;
            this.mRegistrationPolicy = registrationPolicy;
            registrationPolicy.init(this);
            this.mShouldSignalObserver = true;
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

    private boolean onThread() {
        return this.mLooper == Looper.myLooper();
    }

    private void assertOnThread() {
        if (BuildConfig.ENABLE_ASSERTS && !onThread()) {
            throw new IllegalStateException("Must be called on NetworkChangeNotifierAutoDetect thread.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void runOnThread(final Runnable runnable) {
        if (onThread()) {
            runnable.run();
        } else {
            this.mHandler.post(new Runnable() { // from class: org.chromium.net.NetworkChangeNotifierAutoDetect$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    NetworkChangeNotifierAutoDetect.this.lambda$runOnThread$0(runnable);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$runOnThread$0(Runnable runnable) {
        if (this.mRegistered) {
            runnable.run();
        }
    }

    void setConnectivityManagerDelegateForTests(ConnectivityManagerDelegate connectivityManagerDelegate) {
        final ConnectivityManagerDelegate connectivityManagerDelegate2 = this.mConnectivityManagerDelegate;
        this.mConnectivityManagerDelegate = connectivityManagerDelegate;
        ResettersForTesting.register(new Runnable() { // from class: org.chromium.net.NetworkChangeNotifierAutoDetect$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                NetworkChangeNotifierAutoDetect.this.lambda$setConnectivityManagerDelegateForTests$1(connectivityManagerDelegate2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setConnectivityManagerDelegateForTests$1(ConnectivityManagerDelegate connectivityManagerDelegate) {
        this.mConnectivityManagerDelegate = connectivityManagerDelegate;
    }

    void setWifiManagerDelegateForTests(WifiManagerDelegate wifiManagerDelegate) {
        final WifiManagerDelegate wifiManagerDelegate2 = this.mWifiManagerDelegate;
        this.mWifiManagerDelegate = wifiManagerDelegate;
        ResettersForTesting.register(new Runnable() { // from class: org.chromium.net.NetworkChangeNotifierAutoDetect$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                NetworkChangeNotifierAutoDetect.this.lambda$setWifiManagerDelegateForTests$2(wifiManagerDelegate2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setWifiManagerDelegateForTests$2(WifiManagerDelegate wifiManagerDelegate) {
        this.mWifiManagerDelegate = wifiManagerDelegate;
    }

    @VisibleForTesting
    RegistrationPolicy getRegistrationPolicy() {
        return this.mRegistrationPolicy;
    }

    boolean isReceiverRegisteredForTesting() {
        return this.mRegistered;
    }

    public void destroy() {
        assertOnThread();
        this.mRegistrationPolicy.destroy();
        unregister();
    }

    public void register() {
        ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("NetworkChangeNotifierAutoDetect.register");
        try {
            assertOnThread();
            if (this.mRegistered) {
                connectionTypeChanged();
                if (scoped != null) {
                    scoped.close();
                    return;
                }
                return;
            }
            if (this.mShouldSignalObserver) {
                connectionTypeChanged();
            }
            ConnectivityManager.NetworkCallback networkCallback = this.mDefaultNetworkCallback;
            if (networkCallback != null) {
                try {
                    this.mConnectivityManagerDelegate.registerDefaultNetworkCallback(networkCallback, this.mHandler);
                } catch (RuntimeException unused) {
                    this.mDefaultNetworkCallback = null;
                }
            }
            if (this.mDefaultNetworkCallback == null) {
                this.mIgnoreNextBroadcast = ContextUtils.registerProtectedBroadcastReceiver(ContextUtils.getApplicationContext(), this, this.mIntentFilter) != null;
            }
            this.mRegistered = true;
            MyNetworkCallback myNetworkCallback = this.mNetworkCallback;
            if (myNetworkCallback != null) {
                myNetworkCallback.initializeVpnInPlace();
                try {
                    this.mConnectivityManagerDelegate.registerNetworkCallback(this.mNetworkRequest, this.mNetworkCallback, this.mHandler);
                } catch (RuntimeException unused2) {
                    this.mRegisterNetworkCallbackFailed = true;
                    this.mNetworkCallback = null;
                }
                if (!this.mRegisterNetworkCallbackFailed && this.mShouldSignalObserver) {
                    Network[] allNetworksFiltered = getAllNetworksFiltered(this.mConnectivityManagerDelegate, null);
                    long[] jArr = new long[allNetworksFiltered.length];
                    for (int i = 0; i < allNetworksFiltered.length; i++) {
                        jArr[i] = networkToNetId(allNetworksFiltered[i]);
                    }
                    this.mObserver.purgeActiveNetworkList(jArr);
                }
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

    public void unregister() {
        assertOnThread();
        if (this.mRegistered) {
            this.mRegistered = false;
            MyNetworkCallback myNetworkCallback = this.mNetworkCallback;
            if (myNetworkCallback != null) {
                this.mConnectivityManagerDelegate.unregisterNetworkCallback(myNetworkCallback);
            }
            ConnectivityManager.NetworkCallback networkCallback = this.mDefaultNetworkCallback;
            if (networkCallback != null) {
                this.mConnectivityManagerDelegate.unregisterNetworkCallback(networkCallback);
            } else {
                ContextUtils.getApplicationContext().unregisterReceiver(this);
            }
        }
    }

    public void updateCurrentNetworkState() {
        ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("NetworkChangeNotifierAutoDetect.updateCurrentNetworkState");
        try {
            this.mNetworkState = this.mConnectivityManagerDelegate.getNetworkState(this.mWifiManagerDelegate);
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

    public NetworkState getCurrentNetworkState() {
        ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("NetworkChangeNotifierAutoDetect.getCurrentNetworkState");
        try {
            NetworkState networkState = this.mNetworkState;
            if (scoped != null) {
                scoped.close();
            }
            return networkState;
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

    /* JADX INFO: Access modifiers changed from: private */
    public static Network[] getAllNetworksFiltered(ConnectivityManagerDelegate connectivityManagerDelegate, Network network) {
        NetworkCapabilitiesWrapper networkCapabilities;
        Network[] allNetworksUnfiltered = connectivityManagerDelegate.getAllNetworksUnfiltered();
        int i = 0;
        for (Network network2 : allNetworksUnfiltered) {
            if (!network2.equals(network) && (networkCapabilities = connectivityManagerDelegate.getNetworkCapabilities(network2)) != null && networkCapabilities.hasCapability(12)) {
                if (networkCapabilities.hasTransport(4)) {
                    if (connectivityManagerDelegate.vpnAccessible(network2)) {
                        return new Network[]{network2};
                    }
                } else {
                    allNetworksUnfiltered[i] = network2;
                    i++;
                }
            }
        }
        return (Network[]) Arrays.copyOf(allNetworksUnfiltered, i);
    }

    public Network[] getNetworksForTesting() {
        return getAllNetworksFiltered(this.mConnectivityManagerDelegate, null);
    }

    public long[] getNetworksAndTypes() {
        ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("NetworkChangeNotifierAutoDetect.getNetworksAndTypes");
        try {
            Network[] allNetworksFiltered = getAllNetworksFiltered(this.mConnectivityManagerDelegate, null);
            long[] jArr = new long[allNetworksFiltered.length * 2];
            int i = 0;
            for (Network network : allNetworksFiltered) {
                int i2 = i + 1;
                jArr[i] = networkToNetId(network);
                i += 2;
                jArr[i2] = this.mConnectivityManagerDelegate.getConnectionType(r6);
            }
            if (scoped != null) {
                scoped.close();
            }
            return jArr;
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

    public Network getDefaultNetwork() {
        return this.mConnectivityManagerDelegate.getDefaultNetwork();
    }

    public long getDefaultNetId() {
        Network defaultNetwork = getDefaultNetwork();
        if (defaultNetwork == null) {
            return -1L;
        }
        return networkToNetId(defaultNetwork);
    }

    public boolean registerNetworkCallbackFailed() {
        return this.mRegisterNetworkCallbackFailed;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        runOnThread(new Runnable() { // from class: org.chromium.net.NetworkChangeNotifierAutoDetect.1
            @Override // java.lang.Runnable
            public void run() {
                if (NetworkChangeNotifierAutoDetect.this.mIgnoreNextBroadcast) {
                    NetworkChangeNotifierAutoDetect.this.mIgnoreNextBroadcast = false;
                } else {
                    NetworkChangeNotifierAutoDetect.this.connectionTypeChanged();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void connectionTypeChanged() {
        ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("NetworkChangeNotifierAutoDetect.connectionTypeChanged");
        try {
            connectionTypeChangedTo(this.mConnectivityManagerDelegate.getNetworkState(this.mWifiManagerDelegate));
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

    /* JADX INFO: Access modifiers changed from: private */
    public void connectionTypeChangedTo(NetworkState networkState) {
        if (networkState.getConnectionType() != this.mNetworkState.getConnectionType() || !networkState.getNetworkIdentifier().equals(this.mNetworkState.getNetworkIdentifier()) || networkState.isPrivateDnsActive() != this.mNetworkState.isPrivateDnsActive() || !networkState.getPrivateDnsServerName().equals(this.mNetworkState.getPrivateDnsServerName())) {
            this.mObserver.onConnectionTypeChanged(networkState.getConnectionType());
        }
        if (networkState.getConnectionType() != this.mNetworkState.getConnectionType() || networkState.getConnectionSubtype() != this.mNetworkState.getConnectionSubtype()) {
            this.mObserver.onConnectionSubtypeChanged(networkState.getConnectionSubtype());
        }
        if (networkState.getConnectionCost() != this.mNetworkState.getConnectionCost()) {
            this.mObserver.onConnectionCostChanged(networkState.getConnectionCost());
        }
        this.mNetworkState = networkState;
    }

    private static class NetworkConnectivityIntentFilter extends IntentFilter {
        NetworkConnectivityIntentFilter() {
            addAction("android.net.conn.CONNECTIVITY_CHANGE");
        }
    }

    public static long networkToNetId(Network network) {
        return network.getNetworkHandle();
    }
}
