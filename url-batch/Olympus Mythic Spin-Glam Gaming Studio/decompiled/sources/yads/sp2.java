package yads;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Handler;
import android.os.HandlerThread;

/* loaded from: classes14.dex */
public final class sp2 {
    public final Context a;
    public final qp2 b;
    public final op2 c;
    public final Handler d;
    public int e;
    public rp2 f;
    public final Handler g;

    public sp2(Context context, qp2 qp2Var) {
        op2 op2Var = zj0.h;
        this.a = context.getApplicationContext();
        this.b = qp2Var;
        this.c = op2Var;
        this.d = sb3.b((Handler.Callback) null);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:RequirementsWatcherBackground");
        handlerThread.start();
        this.g = new Handler(handlerThread.getLooper());
    }

    public final void a() {
        this.g.post(new Runnable() { // from class: yads.sp2$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                sp2.this.b();
            }
        });
    }

    public final /* synthetic */ void b() {
        final int a = this.c.a(this.a);
        if (this.e != a) {
            this.e = a;
            this.d.post(new Runnable() { // from class: yads.sp2$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    sp2.this.a(a);
                }
            });
        }
    }

    public final int c() {
        a();
        IntentFilter intentFilter = new IntentFilter();
        if ((this.c.b & 1) != 0) {
            if (sb3.a >= 24) {
                ConnectivityManager connectivityManager = (ConnectivityManager) this.a.getSystemService("connectivity");
                connectivityManager.getClass();
                rp2 rp2Var = new rp2(this);
                this.f = rp2Var;
                connectivityManager.registerDefaultNetworkCallback(rp2Var);
            } else {
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            }
        }
        if ((this.c.b & 8) != 0) {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        }
        if ((this.c.b & 4) != 0) {
            if (sb3.a >= 23) {
                intentFilter.addAction("android.os.action.DEVICE_IDLE_MODE_CHANGED");
            } else {
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
            }
        }
        if ((this.c.b & 16) != 0) {
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        }
        this.a.registerReceiver(new pp2(this), intentFilter, null, this.d);
        return this.e;
    }

    public final /* synthetic */ void a(int i) {
        this.b.a(this, i);
    }
}
