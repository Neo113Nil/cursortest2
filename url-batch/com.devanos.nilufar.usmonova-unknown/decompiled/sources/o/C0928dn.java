package o;

import android.os.Trace;
import android.util.Log;
import android.view.Surface;
import io.flutter.embedding.engine.plugins.lifecycle.HiddenLifecycleReference;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: o.dn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0928dn {
    public boolean a;
    public final Object b;
    public final Object c;
    public final Object d;
    public Object e;
    public Object f;

    public C0928dn(C0408Pq c0408Pq, D4 d4, G4 g4) {
        this.f = c0408Pq;
        this.d = null;
        this.e = null;
        this.a = false;
        this.b = d4;
        this.c = g4;
    }

    public void a(AbstractActivityC0560Vm abstractActivityC0560Vm, C0417Pz c0417Pz) {
        C1343k5 c1343k5 = new C1343k5();
        c1343k5.i = new HashSet();
        c1343k5.j = new HashSet();
        c1343k5.k = new HashSet();
        c1343k5.l = new HashSet();
        new HashSet();
        c1343k5.m = new HashSet();
        c1343k5.h = abstractActivityC0560Vm;
        new HiddenLifecycleReference(c0417Pz);
        this.f = c1343k5;
        if (abstractActivityC0560Vm.getIntent() != null) {
            abstractActivityC0560Vm.getIntent().getBooleanExtra("enable-software-rendering", false);
        }
        C0862cn c0862cn = (C0862cn) this.d;
        c0862cn.s.getClass();
        C0208Hx c0208Hx = c0862cn.u;
        io.flutter.embedding.engine.renderer.e eVar = c0862cn.b;
        C1183hf c1183hf = c0862cn.c;
        DI di = (DI) c0208Hx.i;
        if (di.i != null) {
            throw new AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
        }
        di.i = abstractActivityC0560Vm;
        di.l = eVar;
        di.n = new C1590ns(c1183hf, 25);
        CI ci = (CI) c0208Hx.j;
        if (ci.i != null) {
            throw new AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
        }
        ci.i = abstractActivityC0560Vm;
        C1590ns c1590ns = new C1590ns(c1183hf, 24);
        ci.l = c1590ns;
        c1590ns.i = ci.t;
        di.n.i = c0208Hx;
        for (C1950tJ c1950tJ : ((HashMap) this.c).values()) {
            if (this.a) {
                C1343k5 c1343k52 = (C1343k5) this.f;
                c1950tJ.b = c1343k52;
                ((HashSet) c1343k52.j).add(c1950tJ);
            } else {
                C1343k5 c1343k53 = (C1343k5) this.f;
                c1950tJ.b = c1343k53;
                ((HashSet) c1343k53.j).add(c1950tJ);
            }
        }
        this.a = false;
    }

    public void b() {
        if (!e()) {
            Log.e("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
            return;
        }
        AbstractC1568nW.c("FlutterEngineConnectionRegistry#detachFromActivity");
        try {
            for (C1950tJ c1950tJ : ((HashMap) this.c).values()) {
                ((HashSet) c1950tJ.b.j).remove(c1950tJ);
                c1950tJ.b = null;
            }
            c();
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public void c() {
        C0862cn c0862cn = (C0862cn) this.d;
        DI di = c0862cn.s;
        C1590ns c1590ns = di.n;
        if (c1590ns != null) {
            c1590ns.i = null;
        }
        di.b();
        di.n = null;
        di.i = null;
        di.l = null;
        CI ci = c0862cn.t;
        C1590ns c1590ns2 = ci.l;
        if (c1590ns2 != null) {
            c1590ns2.i = null;
        }
        Surface surface = ci.r;
        if (surface != null) {
            surface.release();
            ci.r = null;
            ci.s = null;
        }
        ci.l = null;
        ci.i = null;
        this.e = null;
        this.f = null;
    }

    public void d() {
        if (e()) {
            b();
        }
    }

    public boolean e() {
        return ((C0664Zm) this.e) != null;
    }

    public void f(C0162Gd c0162Gd) {
        ((C0408Pq) this.f).m.post(new RunnableC1996u1(this, 9, c0162Gd));
    }

    public void g(C0162Gd c0162Gd) {
        C1274j20 c1274j20 = (C1274j20) ((C0408Pq) this.f).j.get((G4) this.c);
        if (c1274j20 != null) {
            AbstractC1473m3.j(c1274j20.k.m);
            D4 d4 = c1274j20.b;
            d4.d("onSignInFailed for " + d4.getClass().getName() + " with " + String.valueOf(c0162Gd));
            c1274j20.o(c0162Gd, null);
        }
    }

    public C0928dn(C0862cn c0862cn) {
        this.b = new HashMap();
        this.c = new HashMap();
        this.a = false;
        new HashMap();
        new HashMap();
        new HashMap();
        this.d = c0862cn;
        C1125gn c1125gn = c0862cn.s.h;
    }
}
