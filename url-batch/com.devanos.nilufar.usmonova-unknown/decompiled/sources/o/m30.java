package o;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class m30 {
    public static final Object g = new Object();
    public static m30 h;
    public static HandlerThread i;
    public final HashMap a = new HashMap();
    public final Context b;
    public volatile E20 c;
    public final Y1 d;
    public final long e;
    public final long f;

    public m30(Context context, Looper looper) {
        f30 f30Var = new f30(1, this);
        this.b = context.getApplicationContext();
        E20 e20 = new E20(looper, f30Var);
        Looper.getMainLooper();
        this.c = e20;
        this.d = Y1.Z();
        this.e = 5000L;
        this.f = 300000L;
    }

    public final void a(String str, ServiceConnection serviceConnection, boolean z) {
        h30 h30Var = new h30(str, z);
        AbstractC1473m3.o(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.a) {
            try {
                i30 i30Var = (i30) this.a.get(h30Var);
                if (i30Var == null) {
                    throw new IllegalStateException("Nonexistent connection status for service config: ".concat(h30Var.toString()));
                }
                if (!i30Var.a.containsKey(serviceConnection)) {
                    throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=".concat(h30Var.toString()));
                }
                i30Var.a.remove(serviceConnection);
                if (i30Var.a.isEmpty()) {
                    this.c.sendMessageDelayed(this.c.obtainMessage(0, h30Var), this.e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b(h30 h30Var, U20 u20, String str) {
        boolean z;
        synchronized (this.a) {
            try {
                i30 i30Var = (i30) this.a.get(h30Var);
                if (i30Var == null) {
                    i30Var = new i30(this, h30Var);
                    i30Var.a.put(u20, u20);
                    i30Var.a(str, null);
                    this.a.put(h30Var, i30Var);
                } else {
                    this.c.removeMessages(0, h30Var);
                    if (i30Var.a.containsKey(u20)) {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=".concat(h30Var.toString()));
                    }
                    i30Var.a.put(u20, u20);
                    int i2 = i30Var.b;
                    if (i2 == 1) {
                        u20.onServiceConnected(i30Var.f, i30Var.d);
                    } else if (i2 == 2) {
                        i30Var.a(str, null);
                    }
                }
                z = i30Var.c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }
}
