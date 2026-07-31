package io.intercom.android.sdk.utilities.connectivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes8.dex */
class ConnectivityBroadcastReceiver extends BroadcastReceiver {
    private final ConnectivityUpdateListener connectivityUpdateListener;

    interface ConnectivityUpdateListener {
        void onUpdate(NetworkState networkState);
    }

    ConnectivityBroadcastReceiver(ConnectivityUpdateListener connectivityUpdateListener) {
        this.connectivityUpdateListener = connectivityUpdateListener;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        NetworkState networkState;
        if (intent == null || !"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            return;
        }
        if (intent.getBooleanExtra("noConnectivity", false)) {
            networkState = NetworkState.NOT_CONNECTED;
        } else {
            networkState = NetworkState.CONNECTED;
        }
        this.connectivityUpdateListener.onUpdate(networkState);
    }
}
