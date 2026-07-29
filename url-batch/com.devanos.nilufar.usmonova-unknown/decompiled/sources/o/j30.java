package o;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class j30 implements ServiceConnection {
    public int a = 0;
    public final Messenger b;
    public KX c;
    public final ArrayDeque d;
    public final SparseArray e;
    public final /* synthetic */ n30 f;

    public j30(n30 n30Var) {
        this.f = n30Var;
        E20 e20 = new E20(Looper.getMainLooper(), new f30(0, this));
        Looper.getMainLooper();
        this.b = new Messenger(e20);
        this.d = new ArrayDeque();
        this.e = new SparseArray();
    }

    public final synchronized void a(String str) {
        b(str, null);
    }

    public final synchronized void b(String str, SecurityException securityException) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Disconnected: ".concat(String.valueOf(str)));
            }
            int i = this.a;
            if (i == 0) {
                throw new IllegalStateException();
            }
            if (i != 1 && i != 2) {
                if (i != 3) {
                    return;
                }
                this.a = 4;
                return;
            }
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.a = 4;
            Y1.Z().e0((Context) this.f.b, this);
            F4 f4 = new F4(str, securityException);
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((l30) it.next()).b(f4);
            }
            this.d.clear();
            for (int i2 = 0; i2 < this.e.size(); i2++) {
                ((l30) this.e.valueAt(i2)).b(f4);
            }
            this.e.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c() {
        try {
            if (this.a == 2 && this.d.isEmpty() && this.e.size() == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                }
                this.a = 3;
                Y1.Z().e0((Context) this.f.b, this);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean d(l30 l30Var) {
        Throwable th;
        int i;
        Y1 Z;
        Context context;
        try {
            try {
                i = this.a;
            } catch (Throwable th2) {
                th = th2;
                th = th;
                throw th;
            }
            try {
                if (i != 0) {
                    if (i == 1) {
                        this.d.add(l30Var);
                        return true;
                    }
                    if (i != 2) {
                        return false;
                    }
                    this.d.add(l30Var);
                    ((ScheduledExecutorService) this.f.c).execute(new b30(this, 0));
                    return true;
                }
                this.d.add(l30Var);
                if (this.a != 0) {
                    throw new IllegalStateException();
                }
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Starting bind to GmsCore");
                }
                this.a = 1;
                Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                intent.setPackage("com.google.android.gms");
                try {
                    Z = Y1.Z();
                    context = (Context) this.f.b;
                } catch (SecurityException e) {
                    e = e;
                }
                try {
                    if (Z.j0(context, context.getClass().getName(), intent, this, 1, null)) {
                        ((ScheduledExecutorService) this.f.c).schedule(new b30(this, 1), 30L, TimeUnit.SECONDS);
                    } else {
                        a("Unable to bind to service");
                    }
                } catch (SecurityException e2) {
                    e = e2;
                    b("Unable to bind to service", e);
                    return true;
                }
                return true;
            } catch (Throwable th3) {
                th = th3;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        ((ScheduledExecutorService) this.f.c).execute(new RunnableC1996u1(13, this, iBinder, false));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        ((ScheduledExecutorService) this.f.c).execute(new b30(this, 2));
    }
}
