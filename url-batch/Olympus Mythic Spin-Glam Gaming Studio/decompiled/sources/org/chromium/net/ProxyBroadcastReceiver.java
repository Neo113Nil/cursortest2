package org.chromium.net;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.RequiresApi;
import org.chromium.base.TraceEvent;

/* loaded from: classes3.dex */
final class ProxyBroadcastReceiver extends BroadcastReceiver {
    private final ProxyChangeListener mListener;

    ProxyBroadcastReceiver(ProxyChangeListener proxyChangeListener) {
        this.mListener = proxyChangeListener;
    }

    @Override // android.content.BroadcastReceiver
    @RequiresApi
    public void onReceive(Context context, Intent intent) {
        TraceEvent scoped = TraceEvent.scoped("ProxyBroadcastReceiver#onReceive");
        try {
            if ("android.intent.action.PROXY_CHANGE".equals(intent.getAction())) {
                this.mListener.updateProxyConfigFromConnectivityManager(intent);
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
