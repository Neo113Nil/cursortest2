package com.ironsource.environment;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.ironsource.C4782n4;
import com.ironsource.Dc;
import com.ironsource.environment.thread.IronSourceThreadManager;

/* loaded from: classes3.dex */
public class NetworkStateReceiver extends BroadcastReceiver {
    private ConnectivityManager a;
    private Dc b;
    private boolean c = false;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NetworkStateReceiver networkStateReceiver = NetworkStateReceiver.this;
            Dc dc = networkStateReceiver.b;
            if (dc != null) {
                dc.a(networkStateReceiver.c);
            }
        }
    }

    public NetworkStateReceiver(Context context, Dc dc) {
        this.b = dc;
        if (context != null) {
            this.a = (ConnectivityManager) context.getSystemService("connectivity");
        }
        a();
    }

    private boolean a() {
        boolean z = this.c;
        ConnectivityManager connectivityManager = this.a;
        if (connectivityManager != null) {
            try {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                this.c = activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
            } catch (Exception e) {
                C4782n4.d().a(e);
                this.c = false;
            }
        } else {
            this.c = false;
        }
        return z != this.c;
    }

    private void b() {
        IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new a());
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null || intent.getExtras() == null || !a()) {
            return;
        }
        b();
    }
}
