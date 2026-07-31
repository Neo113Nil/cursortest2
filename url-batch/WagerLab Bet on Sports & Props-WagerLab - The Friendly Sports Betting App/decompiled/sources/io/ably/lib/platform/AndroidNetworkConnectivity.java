package io.ably.lib.platform;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import io.ably.lib.transport.NetworkConnectivity;
import io.ably.lib.types.ErrorInfo;
import java.util.WeakHashMap;

/* loaded from: classes7.dex */
public class AndroidNetworkConnectivity extends NetworkConnectivity {
    private static WeakHashMap<Context, AndroidNetworkConnectivity> contexts = new WeakHashMap<>();
    private final Context applicationContext;
    private NetworkStateReceiver networkStateReceiver;

    AndroidNetworkConnectivity(Context context) {
        this.applicationContext = context;
    }

    public static AndroidNetworkConnectivity getNetworkConnectivity(Context context) {
        AndroidNetworkConnectivity androidNetworkConnectivity;
        synchronized (contexts) {
            androidNetworkConnectivity = contexts.get(context);
            if (androidNetworkConnectivity == null) {
                WeakHashMap<Context, AndroidNetworkConnectivity> weakHashMap = contexts;
                AndroidNetworkConnectivity androidNetworkConnectivity2 = new AndroidNetworkConnectivity(context);
                weakHashMap.put(context, androidNetworkConnectivity2);
                androidNetworkConnectivity = androidNetworkConnectivity2;
            }
        }
        return androidNetworkConnectivity;
    }

    @Override // io.ably.lib.transport.NetworkConnectivity
    protected void onNonempty() {
        activate();
    }

    @Override // io.ably.lib.transport.NetworkConnectivity
    protected void onEmpty() {
        deactivate();
    }

    private void activate() {
        if (this.networkStateReceiver != null || this.applicationContext == null) {
            return;
        }
        NetworkStateReceiver networkStateReceiver = new NetworkStateReceiver();
        this.networkStateReceiver = networkStateReceiver;
        this.applicationContext.registerReceiver(networkStateReceiver, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    private void deactivate() {
        NetworkStateReceiver networkStateReceiver = this.networkStateReceiver;
        if (networkStateReceiver != null) {
            this.applicationContext.unregisterReceiver(networkStateReceiver);
            this.networkStateReceiver = null;
        }
    }

    private class NetworkStateReceiver extends BroadcastReceiver {
        public NetworkStateReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || intent.getExtras() == null) {
                return;
            }
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.getState() == NetworkInfo.State.CONNECTED) {
                AndroidNetworkConnectivity.this.notifyNetworkAvailable();
            } else if (intent.getBooleanExtra("noConnectivity", Boolean.FALSE.booleanValue())) {
                AndroidNetworkConnectivity.this.notifyNetworkUnavailable(new ErrorInfo("No network connection available", TypedValues.PositionType.TYPE_PERCENT_WIDTH, 80003));
            }
        }
    }
}
