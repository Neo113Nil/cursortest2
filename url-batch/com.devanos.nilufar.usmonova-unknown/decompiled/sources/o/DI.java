package o;

import android.util.SparseArray;
import android.view.View;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class DI implements InterfaceC2279yI {
    public final C0208Hx A;
    public AbstractActivityC0560Vm i;
    public C0068Cn j;
    public io.flutter.embedding.engine.renderer.e l;
    public io.flutter.plugin.editing.b m;
    public C1590ns n;
    public FlutterJNI k = null;
    public int v = 0;
    public boolean w = false;
    public boolean x = true;
    public final C1590ns B = new C1590ns(26, this);
    public final C1125gn h = new C1125gn(2);
    public final HashMap p = new HashMap();

    /* renamed from: o, reason: collision with root package name */
    public final D0 f29o = new D0();
    public final HashMap q = new HashMap();
    public final SparseArray t = new SparseArray();
    public final HashSet y = new HashSet();
    public final HashSet z = new HashSet();
    public final SparseArray u = new SparseArray();
    public final SparseArray r = new SparseArray();
    public final SparseArray s = new SparseArray();

    public DI() {
        if (C0208Hx.k == null) {
            C0208Hx.k = new C0208Hx(7);
        }
        this.A = C0208Hx.k;
    }

    public static void a(DI di, C0998es c0998es) {
        int i = c0998es.b;
        if (i == 0 || i == 1) {
            return;
        }
        throw new IllegalStateException("Trying to create a view with unknown direction value: " + i + "(view id: " + c0998es.a + ")");
    }

    @Override // o.InterfaceC2279yI
    public final void L(int i) {
        if (x(i)) {
            ((AbstractC1600o00) this.p.get(Integer.valueOf(i))).getClass();
        } else if (this.r.get(i) != null) {
            throw new ClassCastException();
        }
    }

    public final void b() {
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.t;
            if (i >= sparseArray.size()) {
                return;
            }
            C1422lI c1422lI = (C1422lI) sparseArray.valueAt(i);
            c1422lI.a();
            c1422lI.h.close();
            i++;
        }
    }

    public final void c(boolean z) {
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.t;
            if (i >= sparseArray.size()) {
                break;
            }
            int keyAt = sparseArray.keyAt(i);
            C1422lI c1422lI = (C1422lI) sparseArray.valueAt(i);
            if (this.y.contains(Integer.valueOf(keyAt))) {
                C0862cn c0862cn = this.j.q;
                if (c0862cn != null) {
                    c1422lI.b(c0862cn.b);
                }
                z &= c1422lI.c();
            } else {
                if (!this.w) {
                    c1422lI.a();
                }
                c1422lI.setVisibility(8);
                this.j.removeView(c1422lI);
            }
            i++;
        }
        int i2 = 0;
        while (true) {
            SparseArray sparseArray2 = this.s;
            if (i2 >= sparseArray2.size()) {
                return;
            }
            int keyAt2 = sparseArray2.keyAt(i2);
            View view = (View) sparseArray2.get(keyAt2);
            if (!this.z.contains(Integer.valueOf(keyAt2)) || (!z && this.x)) {
                view.setVisibility(8);
            } else {
                view.setVisibility(0);
            }
            i2++;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View, o.oN] */
    public final void d() {
        if (!this.x || this.w) {
            return;
        }
        C0068Cn c0068Cn = this.j;
        c0068Cn.m.pause();
        C1256in c1256in = c0068Cn.l;
        if (c1256in == null) {
            C1256in c1256in2 = new C1256in(c0068Cn.getContext(), c0068Cn.getWidth(), c0068Cn.getHeight(), 1);
            c0068Cn.l = c1256in2;
            c0068Cn.addView(c1256in2);
        } else {
            c1256in.e(c0068Cn.getWidth(), c0068Cn.getHeight());
        }
        c0068Cn.n = c0068Cn.m;
        C1256in c1256in3 = c0068Cn.l;
        c0068Cn.m = c1256in3;
        C0862cn c0862cn = c0068Cn.q;
        if (c0862cn != null) {
            c1256in3.b(c0862cn.b);
        }
        this.w = true;
    }

    @Override // o.InterfaceC2279yI
    public final void d0() {
        this.f29o.a = null;
    }

    public final int e(double d) {
        return (int) Math.round(d * this.i.getResources().getDisplayMetrics().density);
    }

    @Override // o.InterfaceC2279yI
    public final void n(io.flutter.view.b bVar) {
        this.f29o.a = bVar;
    }

    @Override // o.InterfaceC2279yI
    public final boolean x(int i) {
        return this.p.containsKey(Integer.valueOf(i));
    }
}
