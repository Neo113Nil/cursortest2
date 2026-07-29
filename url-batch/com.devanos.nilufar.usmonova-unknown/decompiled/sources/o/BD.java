package o;

import android.os.Looper;
import java.util.Map;

/* loaded from: classes.dex */
public class BD {
    public static final Object j = new Object();
    public final Object a = new Object();
    public final C2088vP b = new C2088vP();
    public int c = 0;
    public boolean d;
    public volatile Object e;
    public volatile Object f;
    public int g;
    public boolean h;
    public boolean i;

    public BD() {
        Object obj = j;
        this.f = obj;
        this.e = obj;
        this.g = -1;
    }

    public static void a(String str) {
        A6.H().a.getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(AbstractC1888sN.k("Cannot invoke ", str, " on a background thread"));
        }
    }

    public final void b(C2337zA c2337zA) {
        if (c2337zA.b) {
            int i = c2337zA.c;
            int i2 = this.g;
            if (i >= i2) {
                return;
            }
            c2337zA.c = i2;
            Y1 y1 = c2337zA.a;
            Object obj = this.e;
            y1.getClass();
            InterfaceC0365Nz interfaceC0365Nz = (InterfaceC0365Nz) obj;
            DialogInterfaceOnCancelListenerC2107vi dialogInterfaceOnCancelListenerC2107vi = (DialogInterfaceOnCancelListenerC2107vi) y1.i;
            if (interfaceC0365Nz == null || !dialogInterfaceOnCancelListenerC2107vi.e0) {
                return;
            }
            dialogInterfaceOnCancelListenerC2107vi.getClass();
            throw new IllegalStateException("Fragment " + dialogInterfaceOnCancelListenerC2107vi + " did not return a View from onCreateView() or this was called before onCreateView().");
        }
    }

    public final void c(C2337zA c2337zA) {
        if (this.h) {
            this.i = true;
            return;
        }
        this.h = true;
        do {
            this.i = false;
            if (c2337zA != null) {
                b(c2337zA);
                c2337zA = null;
            } else {
                C2088vP c2088vP = this.b;
                c2088vP.getClass();
                C1956tP c1956tP = new C1956tP(c2088vP);
                c2088vP.j.put(c1956tP, Boolean.FALSE);
                while (c1956tP.hasNext()) {
                    b((C2337zA) ((Map.Entry) c1956tP.next()).getValue());
                    if (this.i) {
                        break;
                    }
                }
            }
        } while (this.i);
        this.h = false;
    }
}
