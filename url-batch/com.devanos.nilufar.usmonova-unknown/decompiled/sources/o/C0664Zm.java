package o;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Trace;
import android.util.Log;
import android.util.SparseArray;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: o.Zm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0664Zm {
    public AbstractActivityC0560Vm a;
    public C0862cn b;
    public C0068Cn c;
    public C1333jz d;
    public C1739q5 e;
    public ViewTreeObserverOnPreDrawListenerC0612Xm f;
    public boolean g;
    public boolean h;
    public boolean j;
    public Integer k;
    public final C0586Wm l = new C0586Wm(0, this);
    public boolean i = false;

    public C0664Zm(AbstractActivityC0560Vm abstractActivityC0560Vm) {
        this.a = abstractActivityC0560Vm;
    }

    public final void a(C0584Wk c0584Wk) {
        String a = this.a.a();
        if (a == null || a.isEmpty()) {
            a = (String) ((C1717pn) C0950e6.D().i).d.c;
        }
        C1117gf c1117gf = new C1117gf(a, this.a.d());
        String e = this.a.e();
        if (e == null) {
            AbstractActivityC0560Vm abstractActivityC0560Vm = this.a;
            abstractActivityC0560Vm.getClass();
            e = d(abstractActivityC0560Vm.getIntent());
            if (e == null) {
                e = "/";
            }
        }
        c0584Wk.d = c1117gf;
        c0584Wk.e = e;
        c0584Wk.f = (List) this.a.getIntent().getSerializableExtra("dart_entrypoint_args");
    }

    public final void b() {
        if (this.a.h()) {
            throw new AssertionError("The internal FlutterEngine created by " + this.a + " has been attached to by another activity. To persist a FlutterEngine beyond the ownership of this activity, explicitly create a FlutterEngine");
        }
        AbstractActivityC0560Vm abstractActivityC0560Vm = this.a;
        abstractActivityC0560Vm.getClass();
        Log.w("FlutterActivity", "FlutterActivity " + abstractActivityC0560Vm + " connection to the engine " + abstractActivityC0560Vm.i.b + " evicted by another attaching activity");
        C0664Zm c0664Zm = abstractActivityC0560Vm.i;
        if (c0664Zm != null) {
            c0664Zm.e();
            abstractActivityC0560Vm.i.f();
        }
    }

    public final void c() {
        if (this.a == null) {
            throw new IllegalStateException("Cannot execute method on a destroyed FlutterActivityAndFragmentDelegate.");
        }
    }

    public final String d(Intent intent) {
        boolean z;
        Uri data;
        AbstractActivityC0560Vm abstractActivityC0560Vm = this.a;
        abstractActivityC0560Vm.getClass();
        try {
            Bundle f = abstractActivityC0560Vm.f();
            z = (f == null || !f.containsKey("flutter_deeplinking_enabled")) ? true : f.getBoolean("flutter_deeplinking_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            z = false;
        }
        if (!z || (data = intent.getData()) == null) {
            return null;
        }
        return data.toString();
    }

    public final void e() {
        c();
        if (this.f != null) {
            this.c.getViewTreeObserver().removeOnPreDrawListener(this.f);
            this.f = null;
        }
        C0068Cn c0068Cn = this.c;
        if (c0068Cn != null) {
            c0068Cn.a();
            C0068Cn c0068Cn2 = this.c;
            c0068Cn2.f24o.remove(this.l);
        }
    }

    public final void f() {
        if (this.j) {
            c();
            this.a.getClass();
            this.a.getClass();
            AbstractActivityC0560Vm abstractActivityC0560Vm = this.a;
            abstractActivityC0560Vm.getClass();
            if (abstractActivityC0560Vm.isChangingConfigurations()) {
                C0928dn c0928dn = this.b.d;
                if (c0928dn.e()) {
                    AbstractC1568nW.c("FlutterEngineConnectionRegistry#detachFromActivityForConfigChanges");
                    try {
                        c0928dn.a = true;
                        for (C1950tJ c1950tJ : ((HashMap) c0928dn.c).values()) {
                            ((HashSet) c1950tJ.b.j).remove(c1950tJ);
                            c1950tJ.b = null;
                        }
                        c0928dn.c();
                        Trace.endSection();
                    } catch (Throwable th) {
                        throw th;
                    }
                } else {
                    Log.e("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
                }
            } else {
                this.b.d.b();
            }
            C1333jz c1333jz = this.d;
            if (c1333jz != null) {
                ((C0208Hx) c1333jz.j).j = null;
                this.d = null;
            }
            C1739q5 c1739q5 = this.e;
            if (c1739q5 != null) {
                ((C1818rJ) c1739q5.d).i = null;
                c1739q5.c = null;
                this.e = null;
            }
            this.a.getClass();
            C0862cn c0862cn = this.b;
            if (c0862cn != null) {
                C0158Fz c0158Fz = c0862cn.g;
                c0158Fz.a(1, c0158Fz.c);
            }
            if (this.a.h()) {
                C0862cn c0862cn2 = this.b;
                FlutterJNI flutterJNI = c0862cn2.a;
                Iterator it = c0862cn2.v.iterator();
                while (it.hasNext()) {
                    ((InterfaceC0797bn) it.next()).a();
                }
                C0928dn c0928dn2 = c0862cn2.d;
                c0928dn2.d();
                HashMap hashMap = (HashMap) c0928dn2.b;
                Iterator it2 = new HashSet(hashMap.keySet()).iterator();
                while (it2.hasNext()) {
                    Class cls = (Class) it2.next();
                    C1950tJ c1950tJ2 = (C1950tJ) hashMap.get(cls);
                    if (c1950tJ2 != null) {
                        AbstractC1568nW.c("FlutterEngineConnectionRegistry#remove ".concat(cls.getSimpleName()));
                        try {
                            if (c0928dn2.e()) {
                                ((HashSet) c1950tJ2.b.j).remove(c1950tJ2);
                                c1950tJ2.b = null;
                            }
                            ((HashMap) c0928dn2.c).remove(cls);
                            hashMap.remove(cls);
                            Trace.endSection();
                        } finally {
                            try {
                                Trace.endSection();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                    }
                }
                hashMap.clear();
                DI di = c0862cn2.s;
                SparseArray sparseArray = di.r;
                while (sparseArray.size() > 0) {
                    di.B.r0(sparseArray.keyAt(0));
                }
                CI ci = c0862cn2.t;
                SparseArray sparseArray2 = ci.n;
                while (sparseArray2.size() > 0) {
                    ci.t.r0(sparseArray2.keyAt(0));
                }
                ((FlutterJNI) c0862cn2.c.j).setPlatformMessageHandler(null);
                flutterJNI.removeEngineLifecycleListener(c0862cn2.x);
                flutterJNI.setDeferredComponentManager(null);
                flutterJNI.detachFromNativeAndReleaseResources();
                C0950e6.D().getClass();
                C0862cn.z.remove(Long.valueOf(c0862cn2.w));
                if (this.a.c() != null) {
                    if (C1125gn.c == null) {
                        C1125gn.c = new C1125gn(1);
                    }
                    C1125gn c1125gn = C1125gn.c;
                    c1125gn.a.remove(this.a.c());
                }
                this.b = null;
            }
            this.j = false;
        }
    }
}
