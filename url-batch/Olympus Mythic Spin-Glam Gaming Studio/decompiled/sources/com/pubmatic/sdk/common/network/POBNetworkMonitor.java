package com.pubmatic.sdk.common.network;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;
import android.telephony.TelephonyManager;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.taskhandler.POBTaskHandler;
import com.pubmatic.sdk.common.utility.POBUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@SuppressLint({"MissingPermission"})
/* loaded from: classes12.dex */
public class POBNetworkMonitor {
    private final Context a;
    private final ConnectivityManager c;

    @Nullable
    protected List<POBConnectivityListener> connectivityListeners;
    private ConnectionType b = ConnectionType.UNKNOWN;
    private f d = null;
    private boolean e = false;

    public enum ConnectionType {
        UNKNOWN(0),
        ETHERNET(1),
        WIFI(2),
        CELLULAR_NETWORK_UN(3),
        CELLULAR_NETWORK_2G(4),
        CELLULAR_NETWORK_3G(5),
        CELLULAR_NETWORK_4G(6),
        CELLULAR_NETWORK_5G(7);

        private final int a;

        ConnectionType(int i) {
            this.a = i;
        }

        public int getValue() {
            return this.a;
        }
    }

    public static class POBConnectivityListener {
        @MainThread
        public void onNetworkConnectionChanged(boolean z) {
        }

        public void onNetworkPropertiesChanged() {
        }

        public void onNetworkRegistrationFailed() {
        }
    }

    class a implements f.a {
        final /* synthetic */ TelephonyManager a;

        a(TelephonyManager telephonyManager) {
            this.a = telephonyManager;
        }

        @Override // com.pubmatic.sdk.common.network.POBNetworkMonitor.f.a
        public void a(TelephonyDisplayInfo telephonyDisplayInfo) {
            POBNetworkMonitor pOBNetworkMonitor = POBNetworkMonitor.this;
            pOBNetworkMonitor.b = pOBNetworkMonitor.a(telephonyDisplayInfo);
            if (POBNetworkMonitor.this.d != null) {
                this.a.unregisterTelephonyCallback(POBNetworkMonitor.this.d);
            }
        }
    }

    class b extends PhoneStateListener {
        final /* synthetic */ TelephonyManager a;

        b(TelephonyManager telephonyManager) {
            this.a = telephonyManager;
        }

        @Override // android.telephony.PhoneStateListener
        public void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
            super.onDisplayInfoChanged(telephonyDisplayInfo);
            POBNetworkMonitor pOBNetworkMonitor = POBNetworkMonitor.this;
            pOBNetworkMonitor.b = pOBNetworkMonitor.a(telephonyDisplayInfo);
            this.a.listen(this, 0);
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            POBNetworkMonitor.this.c();
        }
    }

    private class d extends ConnectivityManager.NetworkCallback {
        private d() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            POBNetworkMonitor.this.b();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
            POBNetworkMonitor.this.a();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            POBNetworkMonitor.this.b();
        }

        /* synthetic */ d(POBNetworkMonitor pOBNetworkMonitor, a aVar) {
            this();
        }
    }

    private class e extends ConnectivityManager.NetworkCallback {
        private e() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            if (POBNetworkMonitor.this.c != null) {
                POBNetworkMonitor pOBNetworkMonitor = POBNetworkMonitor.this;
                if (pOBNetworkMonitor.a(pOBNetworkMonitor.c, network)) {
                    POBNetworkMonitor.this.b();
                }
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
            if (POBNetworkMonitor.this.c != null) {
                POBNetworkMonitor pOBNetworkMonitor = POBNetworkMonitor.this;
                if (pOBNetworkMonitor.a(pOBNetworkMonitor.c, network)) {
                    POBNetworkMonitor.this.a();
                }
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            if (POBNetworkMonitor.this.c != null) {
                POBNetworkMonitor pOBNetworkMonitor = POBNetworkMonitor.this;
                if (pOBNetworkMonitor.a(pOBNetworkMonitor.c, network)) {
                    POBNetworkMonitor.this.b();
                }
            }
        }

        /* synthetic */ e(POBNetworkMonitor pOBNetworkMonitor, a aVar) {
            this();
        }
    }

    private static class f extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {
        private final a a;

        interface a {
            void a(TelephonyDisplayInfo telephonyDisplayInfo);
        }

        public f(a aVar) {
            this.a = aVar;
        }

        public void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
            this.a.a(telephonyDisplayInfo);
        }
    }

    public POBNetworkMonitor(@NonNull Context context) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.c = (ConnectivityManager) applicationContext.getSystemService("connectivity");
        d();
        updateConnectionType();
    }

    public boolean isNetworkAvailable() {
        return isNetworkAvailable(this.a);
    }

    @MainThread
    public void registerConnectivityListener(POBConnectivityListener pOBConnectivityListener) {
        if (this.e) {
            pOBConnectivityListener.onNetworkRegistrationFailed();
            return;
        }
        if (this.connectivityListeners == null) {
            this.connectivityListeners = new ArrayList(1);
        }
        this.connectivityListeners.add(pOBConnectivityListener);
    }

    @MainThread
    public void unregisterConnectivityListener(@Nullable POBConnectivityListener pOBConnectivityListener) {
        List<POBConnectivityListener> list;
        if (pOBConnectivityListener == null || (list = this.connectivityListeners) == null || !list.contains(pOBConnectivityListener)) {
            return;
        }
        this.connectivityListeners.remove(pOBConnectivityListener);
        if (this.connectivityListeners.isEmpty()) {
            this.connectivityListeners = null;
        }
    }

    public void updateConnectionType() {
        NetworkInfo networkInfo;
        if (this.c == null || !POBUtils.hasPermission(this.a, "android.permission.ACCESS_NETWORK_STATE")) {
            this.b = ConnectionType.UNKNOWN;
            return;
        }
        try {
            networkInfo = this.c.getActiveNetworkInfo();
        } catch (Exception e2) {
            POBLog.warn("POBNetworkMonitor", "Failed to get active network info :" + e2.getMessage(), new Object[0]);
            networkInfo = null;
        }
        if (networkInfo == null) {
            this.b = ConnectionType.UNKNOWN;
            return;
        }
        int type = networkInfo.getType();
        if (type == 0) {
            e();
        } else if (type == 1) {
            this.b = ConnectionType.WIFI;
        } else {
            if (type != 9) {
                return;
            }
            this.b = ConnectionType.ETHERNET;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        POBTaskHandler.getInstance().runOnMainThread(new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        updateConnectionType();
        if (this.connectivityListeners != null) {
            for (int i = 0; i < this.connectivityListeners.size(); i++) {
                POBConnectivityListener pOBConnectivityListener = this.connectivityListeners.get(i);
                if (pOBConnectivityListener != null) {
                    pOBConnectivityListener.onNetworkConnectionChanged(isNetworkAvailable(this.a));
                }
            }
        }
    }

    private void d() {
        ConnectivityManager connectivityManager = this.c;
        if (connectivityManager != null) {
            try {
                connectivityManager.registerDefaultNetworkCallback(new d(this, null));
                this.e = false;
            } catch (RuntimeException e2) {
                this.e = true;
                POBLog.warn("POBNetworkMonitor", "Failed to register network callback :" + e2.getMessage(), new Object[0]);
            }
        }
    }

    private void e() {
        int i;
        TelephonyManager telephonyManager = (TelephonyManager) this.a.getSystemService("phone");
        if (telephonyManager == null) {
            this.b = ConnectionType.CELLULAR_NETWORK_UN;
            return;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            a(telephonyManager);
            return;
        }
        try {
            i = telephonyManager.getNetworkType();
        } catch (Exception e2) {
            POBLog.error("POBNetworkMonitor", "Failed to get telephony manager :" + e2.getMessage(), new Object[0]);
            i = 0;
        }
        this.b = a(i);
    }

    public static boolean isNetworkAvailable(Context context) {
        NetworkInfo activeNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null && POBUtils.hasPermission(context, "android.permission.ACCESS_NETWORK_STATE") && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null) {
                if (activeNetworkInfo.isConnectedOrConnecting()) {
                    return true;
                }
            }
            return false;
        } catch (Exception e2) {
            POBLog.warn("POBNetworkMonitor", "Failed to check network availability :" + e2.getMessage(), new Object[0]);
        }
        return false;
    }

    @NonNull
    public ConnectionType getConnectionType() {
        return this.b;
    }

    public boolean isWiFiConnected() {
        return this.b == ConnectionType.WIFI;
    }

    private void a(TelephonyManager telephonyManager) {
        if (POBUtils.hasPermission(this.a, "android.permission.READ_PHONE_STATE")) {
            try {
                if (Build.VERSION.SDK_INT >= 31) {
                    ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
                    f fVar = new f(new a(telephonyManager));
                    this.d = fVar;
                    telephonyManager.registerTelephonyCallback(newSingleThreadExecutor, fVar);
                    return;
                }
                telephonyManager.listen(new b(telephonyManager), 1048576);
                return;
            } catch (Exception e2) {
                this.b = ConnectionType.CELLULAR_NETWORK_UN;
                POBLog.warn("POBNetworkMonitor", "Not able fetch connection type due to " + e2.getMessage(), new Object[0]);
                return;
            }
        }
        this.b = ConnectionType.CELLULAR_NETWORK_UN;
        POBLog.warn("POBNetworkMonitor", "Not able fetch connection type due to android.permission.READ_PHONE_STATE permission is not available for the app!", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ConnectionType a(TelephonyDisplayInfo telephonyDisplayInfo) {
        int overrideNetworkType;
        int overrideNetworkType2;
        int overrideNetworkType3;
        int networkType;
        overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
        if (overrideNetworkType != 2) {
            overrideNetworkType2 = telephonyDisplayInfo.getOverrideNetworkType();
            if (overrideNetworkType2 != 3) {
                overrideNetworkType3 = telephonyDisplayInfo.getOverrideNetworkType();
                if (overrideNetworkType3 != 5) {
                    networkType = telephonyDisplayInfo.getNetworkType();
                    return a(networkType);
                }
            }
        }
        return ConnectionType.CELLULAR_NETWORK_5G;
    }

    private ConnectionType a(int i) {
        if (i != 20) {
            switch (i) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                    return ConnectionType.CELLULAR_NETWORK_2G;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                    return ConnectionType.CELLULAR_NETWORK_3G;
                case 13:
                    return ConnectionType.CELLULAR_NETWORK_4G;
                default:
                    return ConnectionType.CELLULAR_NETWORK_UN;
            }
        }
        return ConnectionType.CELLULAR_NETWORK_5G;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(ConnectivityManager connectivityManager, Network network) {
        return network.equals(connectivityManager.getActiveNetwork());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (this.connectivityListeners != null) {
            for (int i = 0; i < this.connectivityListeners.size(); i++) {
                POBConnectivityListener pOBConnectivityListener = this.connectivityListeners.get(i);
                if (pOBConnectivityListener != null) {
                    pOBConnectivityListener.onNetworkPropertiesChanged();
                }
            }
        }
    }
}
