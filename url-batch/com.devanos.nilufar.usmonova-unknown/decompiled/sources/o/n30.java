package o;

import android.content.Context;
import android.util.Log;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class n30 {
    public static n30 e;
    public int a;
    public final Object b;
    public final Object c;
    public Object d;

    public n30(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.d = new j30(this);
        this.a = 1;
        this.c = scheduledExecutorService;
        this.b = context.getApplicationContext();
    }

    public static synchronized n30 a(Context context) {
        n30 n30Var;
        synchronized (n30.class) {
            try {
                if (e == null) {
                    e = new n30(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new ThreadFactoryC1024fE("MessengerIpcClient"))));
                }
                n30Var = e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return n30Var;
    }

    public synchronized p30 b(l30 l30Var) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Queueing ".concat(l30Var.toString()));
            }
            if (!((j30) this.d).d(l30Var)) {
                j30 j30Var = new j30(this);
                this.d = j30Var;
                j30Var.d(l30Var);
            }
        } catch (Throwable th) {
            throw th;
        }
        return l30Var.b.a;
    }

    public n30(int i, H8 h8, InterfaceC0189He interfaceC0189He, InterfaceC2243xm interfaceC2243xm) {
        this.b = interfaceC2243xm;
        this.a = i;
        this.c = h8;
        this.d = interfaceC0189He;
    }
}
