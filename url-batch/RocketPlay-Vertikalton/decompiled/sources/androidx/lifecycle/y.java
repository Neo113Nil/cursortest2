package androidx.lifecycle;

import Y.DialogInterfaceOnCancelListenerC0051m;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import java.util.Map;
import m.C0293a;

/* loaded from: classes.dex */
public class y {

    /* renamed from: j, reason: collision with root package name */
    public static final Object f1920j = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Object f1921a;

    /* renamed from: b, reason: collision with root package name */
    public final n.f f1922b = new n.f();

    /* renamed from: c, reason: collision with root package name */
    public int f1923c = 0;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f1924e;

    /* renamed from: f, reason: collision with root package name */
    public volatile Object f1925f;

    /* renamed from: g, reason: collision with root package name */
    public int f1926g;
    public boolean h;
    public boolean i;

    public y() {
        Object obj = f1920j;
        this.f1925f = obj;
        this.f1924e = obj;
        this.f1926g = -1;
    }

    public static void a(String str) {
        C0293a.w().d.getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    public final void b(x xVar) {
        if (xVar.f1918b) {
            int i = xVar.f1919c;
            int i2 = this.f1926g;
            if (i >= i2) {
                return;
            }
            xVar.f1919c = i2;
            A1.d dVar = xVar.f1917a;
            Object obj = this.f1924e;
            dVar.getClass();
            if (((t) obj) != null) {
                DialogInterfaceOnCancelListenerC0051m dialogInterfaceOnCancelListenerC0051m = (DialogInterfaceOnCancelListenerC0051m) dVar.f38b;
                if (dialogInterfaceOnCancelListenerC0051m.f1463Y) {
                    View D2 = dialogInterfaceOnCancelListenerC0051m.D();
                    if (D2.getParent() != null) {
                        throw new IllegalStateException("DialogFragment can not be attached to a container view");
                    }
                    if (dialogInterfaceOnCancelListenerC0051m.f1467c0 != null) {
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Log.d("FragmentManager", "DialogFragment " + dVar + " setting the content view on " + dialogInterfaceOnCancelListenerC0051m.f1467c0);
                        }
                        dialogInterfaceOnCancelListenerC0051m.f1467c0.setContentView(D2);
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
                n.f fVar = this.f1922b;
                fVar.getClass();
                n.d dVar = new n.d(fVar);
                fVar.f3575c.put(dVar, Boolean.FALSE);
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
        this.f1926g++;
        this.f1924e = obj;
        c(null);
    }
}
