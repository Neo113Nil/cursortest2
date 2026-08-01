package androidx.lifecycle;

import Y.DialogInterfaceOnCancelListenerC0045m;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import java.util.Map;
import m.C0251a;

/* loaded from: classes.dex */
public class y {

    /* renamed from: j, reason: collision with root package name */
    public static final Object f1541j = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Object f1542a;

    /* renamed from: b, reason: collision with root package name */
    public final n.f f1543b = new n.f();

    /* renamed from: c, reason: collision with root package name */
    public int f1544c = 0;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f1545e;

    /* renamed from: f, reason: collision with root package name */
    public volatile Object f1546f;

    /* renamed from: g, reason: collision with root package name */
    public int f1547g;
    public boolean h;
    public boolean i;

    public y() {
        Object obj = f1541j;
        this.f1546f = obj;
        this.f1545e = obj;
        this.f1547g = -1;
    }

    public static void a(String str) {
        C0251a.s().f3121g.getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    public final void b(x xVar) {
        if (xVar.f1539b) {
            int i = xVar.f1540c;
            int i2 = this.f1547g;
            if (i >= i2) {
                return;
            }
            xVar.f1540c = i2;
            A0.h hVar = xVar.f1538a;
            Object obj = this.f1545e;
            hVar.getClass();
            if (((t) obj) != null) {
                DialogInterfaceOnCancelListenerC0045m dialogInterfaceOnCancelListenerC0045m = (DialogInterfaceOnCancelListenerC0045m) hVar.f30b;
                if (dialogInterfaceOnCancelListenerC0045m.f1082Y) {
                    View D2 = dialogInterfaceOnCancelListenerC0045m.D();
                    if (D2.getParent() != null) {
                        throw new IllegalStateException("DialogFragment can not be attached to a container view");
                    }
                    if (dialogInterfaceOnCancelListenerC0045m.f1086c0 != null) {
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Log.d("FragmentManager", "DialogFragment " + hVar + " setting the content view on " + dialogInterfaceOnCancelListenerC0045m.f1086c0);
                        }
                        dialogInterfaceOnCancelListenerC0045m.f1086c0.setContentView(D2);
                    }
                }
            }
        }
    }

    public final void c(x xVar) {
        if (this.h) {
            this.i = true;
            return;
        }
        this.h = true;
        do {
            this.i = false;
            if (xVar != null) {
                b(xVar);
                xVar = null;
            } else {
                n.f fVar = this.f1543b;
                fVar.getClass();
                n.d dVar = new n.d(fVar);
                fVar.f3149c.put(dVar, Boolean.FALSE);
                while (dVar.hasNext()) {
                    b((x) ((Map.Entry) dVar.next()).getValue());
                    if (this.i) {
                        break;
                    }
                }
            }
        } while (this.i);
        this.h = false;
    }

    public final void d(Object obj) {
        a("setValue");
        this.f1547g++;
        this.f1545e = obj;
        c(null);
    }
}
