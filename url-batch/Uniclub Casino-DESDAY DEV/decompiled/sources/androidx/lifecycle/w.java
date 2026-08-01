package androidx.lifecycle;

import X.DialogInterfaceOnCancelListenerC0044m;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import java.util.Map;
import m.C0269a;

/* loaded from: classes.dex */
public class w {

    /* renamed from: j, reason: collision with root package name */
    public static final Object f1381j = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Object f1382a;

    /* renamed from: b, reason: collision with root package name */
    public final n.f f1383b = new n.f();

    /* renamed from: c, reason: collision with root package name */
    public int f1384c = 0;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f1385e;

    /* renamed from: f, reason: collision with root package name */
    public volatile Object f1386f;

    /* renamed from: g, reason: collision with root package name */
    public int f1387g;
    public boolean h;
    public boolean i;

    public w() {
        Object obj = f1381j;
        this.f1386f = obj;
        this.f1385e = obj;
        this.f1387g = -1;
    }

    public static void a(String str) {
        ((C0269a) C0269a.k().f3194b).getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    public final void b(v vVar) {
        if (vVar.f1379b) {
            int i = vVar.f1380c;
            int i2 = this.f1387g;
            if (i >= i2) {
                return;
            }
            vVar.f1380c = i2;
            C.g gVar = vVar.f1378a;
            Object obj = this.f1385e;
            gVar.getClass();
            if (((r) obj) != null) {
                DialogInterfaceOnCancelListenerC0044m dialogInterfaceOnCancelListenerC0044m = (DialogInterfaceOnCancelListenerC0044m) gVar.f62b;
                if (dialogInterfaceOnCancelListenerC0044m.f933Y) {
                    View D2 = dialogInterfaceOnCancelListenerC0044m.D();
                    if (D2.getParent() != null) {
                        throw new IllegalStateException("DialogFragment can not be attached to a container view");
                    }
                    if (dialogInterfaceOnCancelListenerC0044m.f937c0 != null) {
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Log.d("FragmentManager", "DialogFragment " + gVar + " setting the content view on " + dialogInterfaceOnCancelListenerC0044m.f937c0);
                        }
                        dialogInterfaceOnCancelListenerC0044m.f937c0.setContentView(D2);
                    }
                }
            }
        }
    }

    public final void c(v vVar) {
        if (this.h) {
            this.i = true;
            return;
        }
        this.h = true;
        do {
            this.i = false;
            if (vVar != null) {
                b(vVar);
                vVar = null;
            } else {
                n.f fVar = this.f1383b;
                fVar.getClass();
                n.d dVar = new n.d(fVar);
                fVar.f3285c.put(dVar, Boolean.FALSE);
                while (dVar.hasNext()) {
                    b((v) ((Map.Entry) dVar.next()).getValue());
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
        this.f1387g++;
        this.f1385e = obj;
        c(null);
    }
}
