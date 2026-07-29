package o;

import android.app.Application;
import android.graphics.Typeface;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Method;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: o.u1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1996u1 implements Runnable {
    public final /* synthetic */ int h;
    public Object i;
    public final Object j;

    public /* synthetic */ RunnableC1996u1(int i, Object obj, Object obj2, boolean z) {
        this.h = i;
        this.i = obj;
        this.j = obj2;
    }

    private final void a() {
        j30 j30Var = (j30) this.i;
        int i = ((l30) this.j).a;
        synchronized (j30Var) {
            l30 l30Var = (l30) j30Var.e.get(i);
            if (l30Var != null) {
                Log.w("MessengerIpcClient", "Timing out request: " + i);
                j30Var.e.remove(i);
                l30Var.b(new F4("Timed out waiting for response", null));
                j30Var.c();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0694aC interfaceC0694aC;
        InterfaceC1130gs interfaceC1130gs;
        switch (this.h) {
            case 0:
                C1864s1 c1864s1 = (C1864s1) this.i;
                C2128w1 c2128w1 = (C2128w1) this.j;
                MenuC0825cC menuC0825cC = c2128w1.j;
                if (menuC0825cC != null && (interfaceC0694aC = menuC0825cC.e) != null) {
                    interfaceC0694aC.Q(menuC0825cC);
                }
                View view = (View) c2128w1.f236o;
                if (view != null && view.getWindowToken() != null) {
                    if (!c1864s1.b()) {
                        if (c1864s1.e != null) {
                            c1864s1.d(0, 0, false, false);
                        }
                    }
                    c2128w1.z = c1864s1;
                }
                c2128w1.B = null;
                return;
            case 1:
                ((H1) this.i).h = this.j;
                return;
            case 2:
                ((Application) this.i).unregisterActivityLifecycleCallbacks((H1) this.j);
                return;
            case 3:
                Object obj = this.j;
                Object obj2 = this.i;
                try {
                    Method method = I1.d;
                    if (method != null) {
                        method.invoke(obj2, obj, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        I1.e.invoke(obj2, obj, Boolean.FALSE);
                    }
                    return;
                } catch (RuntimeException e) {
                    if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                        throw e;
                    }
                    return;
                } catch (Throwable th) {
                    Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
                    return;
                }
            case 4:
                C1818rJ c1818rJ = (C1818rJ) this.i;
                Typeface typeface = (Typeface) this.j;
                M5 m5 = (M5) c1818rJ.i;
                if (m5 != null) {
                    m5.q(typeface);
                    return;
                }
                return;
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                ((C0849ca) this.i).B((C1325jr) this.j);
                return;
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                C0469Rz c0469Rz = (C0469Rz) this.j;
                AbstractC0267Ke abstractC0267Ke = c0469Rz.k;
                int i = 0;
                while (true) {
                    try {
                        ((Runnable) this.i).run();
                    } catch (Throwable th2) {
                        AbstractC1807r8.J(th2, C1188hk.h);
                    }
                    Runnable O = c0469Rz.O();
                    if (O == null) {
                        return;
                    }
                    this.i = O;
                    i++;
                    if (i >= 16 && abstractC0267Ke.M(c0469Rz)) {
                        abstractC0267Ke.L(c0469Rz, this);
                        return;
                    }
                }
                break;
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                ((C0798bo) this.i).accept(this.j);
                return;
            case 8:
                ((C0849ca) this.j).B((C0860cl) this.i);
                return;
            case 9:
                C0162Gd c0162Gd = (C0162Gd) this.i;
                C0928dn c0928dn = (C0928dn) this.j;
                D4 d4 = (D4) c0928dn.b;
                C1274j20 c1274j20 = (C1274j20) ((C0408Pq) c0928dn.f).j.get((G4) c0928dn.c);
                if (c1274j20 == null) {
                    return;
                }
                if (c0162Gd.i != 0) {
                    c1274j20.o(c0162Gd, null);
                    return;
                }
                c0928dn.a = true;
                if (d4.m()) {
                    if (!c0928dn.a || (interfaceC1130gs = (InterfaceC1130gs) c0928dn.d) == null) {
                        return;
                    }
                    d4.b(interfaceC1130gs, (Set) c0928dn.e);
                    return;
                }
                try {
                    d4.b(null, d4.c());
                    return;
                } catch (SecurityException e2) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e2);
                    d4.d("Failed to get service from broker.");
                    c1274j20.o(new C0162Gd(10), null);
                    return;
                }
            case 10:
                if (((p30) ((MU) this.i)).d) {
                    ((S20) this.j).k.l();
                    return;
                }
                try {
                    ((S20) this.j).k.k(((S20) this.j).j.n((MU) this.i));
                    return;
                } catch (ZO e3) {
                    if (e3.getCause() instanceof Exception) {
                        ((S20) this.j).k.j((Exception) e3.getCause());
                        return;
                    } else {
                        ((S20) this.j).k.j(e3);
                        return;
                    }
                } catch (Exception e4) {
                    ((S20) this.j).k.j(e4);
                    return;
                }
            case 11:
                S20 s20 = (S20) this.j;
                p30 p30Var = s20.k;
                try {
                    MU mu = (MU) s20.j.n((MU) this.i);
                    if (mu == null) {
                        s20.d(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    ExecutorC2239xi executorC2239xi = OU.b;
                    mu.c(executorC2239xi, s20);
                    mu.b(executorC2239xi, s20);
                    p30 p30Var2 = (p30) mu;
                    p30Var2.b.e(new Y20((Executor) executorC2239xi, (InterfaceC0698aG) s20));
                    p30Var2.n();
                    return;
                } catch (ZO e5) {
                    if (e5.getCause() instanceof Exception) {
                        p30Var.j((Exception) e5.getCause());
                        return;
                    } else {
                        p30Var.j(e5);
                        return;
                    }
                } catch (Exception e6) {
                    p30Var.j(e6);
                    return;
                }
            case 12:
                synchronized (((Y20) this.j).j) {
                    ((InterfaceC0764bG) ((Y20) this.j).k).onComplete((MU) this.i);
                }
                return;
            case 13:
                j30 j30Var = (j30) this.i;
                IBinder iBinder = (IBinder) this.j;
                synchronized (j30Var) {
                    if (iBinder == null) {
                        j30Var.a("Null service connection");
                    } else {
                        try {
                            j30Var.c = new KX(iBinder);
                            j30Var.a = 2;
                            ((ScheduledExecutorService) j30Var.f.c).execute(new b30(j30Var, 0));
                        } catch (RemoteException e7) {
                            j30Var.a(e7.getMessage());
                        }
                    }
                }
                return;
            case 14:
                synchronized (((Y20) this.j).j) {
                    InterfaceC0960eG interfaceC0960eG = (InterfaceC0960eG) ((Y20) this.j).k;
                    Exception f = ((MU) this.i).f();
                    AbstractC1473m3.n(f);
                    interfaceC0960eG.d(f);
                }
                return;
            case 15:
                synchronized (((Y20) this.j).j) {
                    ((InterfaceC1224iG) ((Y20) this.j).k).c(((MU) this.i).g());
                }
                return;
            case 16:
                a();
                return;
            case 17:
                Y20 y20 = (Y20) this.j;
                try {
                    MU m = ((InterfaceC1302jU) y20.j).m(((MU) this.i).g());
                    if (m == null) {
                        y20.d(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    ExecutorC2239xi executorC2239xi2 = OU.b;
                    m.c(executorC2239xi2, y20);
                    m.b(executorC2239xi2, y20);
                    p30 p30Var3 = (p30) m;
                    p30Var3.b.e(new Y20((Executor) executorC2239xi2, (InterfaceC0698aG) y20));
                    p30Var3.n();
                    return;
                } catch (CancellationException unused) {
                    y20.b();
                    return;
                } catch (ZO e8) {
                    if (e8.getCause() instanceof Exception) {
                        y20.d((Exception) e8.getCause());
                        return;
                    } else {
                        y20.d(e8);
                        return;
                    }
                } catch (Exception e9) {
                    y20.d(e9);
                    return;
                }
            default:
                p30 p30Var4 = (p30) this.i;
                try {
                    p30Var4.k(((Callable) this.j).call());
                    return;
                } catch (Exception e10) {
                    p30Var4.j(e10);
                    return;
                } catch (Throwable th3) {
                    p30Var4.j(new RuntimeException(th3));
                    return;
                }
        }
    }

    public /* synthetic */ RunnableC1996u1(Object obj, int i, Object obj2) {
        this.h = i;
        this.j = obj;
        this.i = obj2;
    }
}
