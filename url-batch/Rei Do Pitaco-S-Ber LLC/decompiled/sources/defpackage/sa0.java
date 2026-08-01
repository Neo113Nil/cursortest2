package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public abstract class sa0 extends ab0 {
    public static boolean m = false;
    public static Method n;
    public static Class o;
    public static Field p;
    public static Field q;
    public final WindowInsets c;
    public io[] d;
    public io e;
    public db0 f;
    public io g;
    public int h;
    public int i;
    public int j;
    public Rect[][] k;
    public Rect[][] l;

    public sa0(db0 db0Var, WindowInsets windowInsets) {
        super(db0Var);
        this.e = null;
        this.k = new Rect[10][];
        this.l = new Rect[10][];
        this.c = windowInsets;
    }

    private rf A(View view) {
        Display display;
        if (view == null || (display = view.getDisplay()) == null) {
            return null;
        }
        Point point = new Point();
        display.getRealSize(point);
        if (this.a.a.s()) {
            return rf.a(point.x, point.y, true, 0, 0, 0, 0);
        }
        g00 s = oo.s(display, 0);
        g00 s2 = oo.s(display, 1);
        g00 s3 = oo.s(display, 2);
        g00 s4 = oo.s(display, 3);
        return rf.a(point.x, point.y, false, s != null ? s.b : 0, s2 != null ? s2.b : 0, s3 != null ? s3.b : 0, s4 != null ? s4.b : 0);
    }

    private static List<Rect> B(Rect[][] rectArr, int i) {
        Rect[] rectArr2;
        Rect[] rectArr3 = null;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0 && (rectArr2 = rectArr[y80.d(i2)]) != null) {
                if (rectArr3 == null) {
                    rectArr3 = rectArr2;
                } else {
                    Rect[] rectArr4 = new Rect[rectArr3.length + rectArr2.length];
                    System.arraycopy(rectArr3, 0, rectArr4, 0, rectArr3.length);
                    System.arraycopy(rectArr2, 0, rectArr4, rectArr3.length, rectArr2.length);
                    rectArr3 = rectArr4;
                }
            }
        }
        return rectArr3 == null ? Collections.EMPTY_LIST : Arrays.asList(rectArr3);
    }

    private Rect[] C(io ioVar) {
        ArrayList arrayList = new ArrayList();
        int i = ioVar.a;
        int i2 = ioVar.d;
        int i3 = ioVar.c;
        int i4 = ioVar.b;
        if (i != 0) {
            arrayList.add(new Rect(0, 0, ioVar.a, this.i));
        }
        if (i4 != 0) {
            arrayList.add(new Rect(0, 0, this.j, i4));
        }
        if (i3 != 0) {
            int i5 = this.j;
            arrayList.add(new Rect(i5 - i3, 0, i5, this.i));
        }
        if (i2 != 0) {
            int i6 = this.i;
            arrayList.add(new Rect(0, i6 - i2, this.j, i6));
        }
        return (Rect[]) arrayList.toArray(new Rect[arrayList.size()]);
    }

    private io D(int i, boolean z) {
        io ioVar = io.e;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                ioVar = io.a(ioVar, E(i2, z));
            }
        }
        return ioVar;
    }

    private io F() {
        db0 db0Var = this.f;
        return db0Var != null ? db0Var.a.k() : io.e;
    }

    private io G(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            l8.x("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            return null;
        }
        if (!m) {
            H();
        }
        Method method = n;
        if (method != null && o != null && p != null) {
            try {
                Object invoke = method.invoke(view, null);
                if (invoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) p.get(q.get(invoke));
                if (rect != null) {
                    return io.c(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (ReflectiveOperationException e) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
        }
        return null;
    }

    private static void H() {
        try {
            n = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            o = cls;
            p = cls.getDeclaredField("mVisibleInsets");
            q = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            p.setAccessible(true);
            q.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
        }
        m = true;
    }

    public static boolean J(int i, int i2) {
        return (i & 6) == (i2 & 6);
    }

    public io E(int i, boolean z) {
        io k;
        int i2;
        io ioVar = io.e;
        if (i != 1) {
            if (i != 2) {
                if (i == 8) {
                    io[] ioVarArr = this.d;
                    k = ioVarArr != null ? ioVarArr[y80.d(8)] : null;
                    if (k != null) {
                        return k;
                    }
                    io m2 = m();
                    io F = F();
                    int i3 = m2.d;
                    if (i3 > F.d) {
                        return io.c(0, 0, 0, i3);
                    }
                    io ioVar2 = this.g;
                    if (ioVar2 != null && !ioVar2.equals(ioVar) && (i2 = this.g.d) > F.d) {
                        return io.c(0, 0, 0, i2);
                    }
                } else {
                    if (i == 16) {
                        return l();
                    }
                    if (i == 32) {
                        return j();
                    }
                    if (i == 64) {
                        return n();
                    }
                    if (i == 128) {
                        db0 db0Var = this.f;
                        pf g = db0Var != null ? db0Var.a.g() : g();
                        if (g != null) {
                            int i4 = Build.VERSION.SDK_INT;
                            return io.c(i4 >= 28 ? of.d(g.a) : 0, i4 >= 28 ? of.f(g.a) : 0, i4 >= 28 ? of.e(g.a) : 0, i4 >= 28 ? of.c(g.a) : 0);
                        }
                    }
                }
            } else {
                if (z) {
                    io F2 = F();
                    io k2 = k();
                    return io.c(Math.max(F2.a, k2.a), 0, Math.max(F2.c, k2.c), Math.max(F2.d, k2.d));
                }
                if ((this.h & 2) == 0) {
                    io m3 = m();
                    db0 db0Var2 = this.f;
                    k = db0Var2 != null ? db0Var2.a.k() : null;
                    int i5 = m3.d;
                    if (k != null) {
                        i5 = Math.min(i5, k.d);
                    }
                    return io.c(m3.a, 0, m3.c, i5);
                }
            }
        } else {
            if (z) {
                return io.c(0, Math.max(F().b, m().b), 0, 0);
            }
            if ((this.h & 4) == 0) {
                return io.c(0, m().b, 0, 0);
            }
        }
        return ioVar;
    }

    public void I(io ioVar) {
        this.g = ioVar;
    }

    @Override // defpackage.ab0
    public void d(View view) {
        this.j = view.getWidth();
        this.i = view.getHeight();
        io G = G(view);
        if (G == null) {
            G = io.e;
        }
        I(G);
    }

    @Override // defpackage.ab0
    public List<Rect> e(int i) {
        return B(this.k, i);
    }

    @Override // defpackage.ab0
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        sa0 sa0Var = (sa0) obj;
        return Objects.equals(this.g, sa0Var.g) && J(this.h, sa0Var.h);
    }

    @Override // defpackage.ab0
    public List<Rect> f(int i) {
        return B(this.l, i);
    }

    @Override // defpackage.ab0
    public io h(int i) {
        return D(i, false);
    }

    @Override // defpackage.ab0
    public io i(int i) {
        return D(i, true);
    }

    @Override // defpackage.ab0
    public final io m() {
        if (this.e == null) {
            WindowInsets windowInsets = this.c;
            this.e = io.c(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.e;
    }

    @Override // defpackage.ab0
    public void o(View view) {
        A(view);
    }

    @Override // defpackage.ab0
    public void p() {
        for (int i = 1; i <= 512; i <<= 1) {
            int d = y80.d(i);
            this.k[d] = C(h(i));
            if (i != 8) {
                this.l[d] = C(i(i));
            }
        }
    }

    @Override // defpackage.ab0
    public db0 q(int i, int i2, int i3, int i4) {
        db0 g = db0.g(null, this.c);
        int i5 = Build.VERSION.SDK_INT;
        ra0 qa0Var = i5 >= 36 ? new qa0(g) : i5 >= 35 ? new pa0(g) : i5 >= 34 ? new oa0(g) : i5 >= 31 ? new na0(g) : i5 >= 30 ? new ma0(g) : i5 >= 29 ? new la0(g) : new ka0(g);
        qa0Var.h(db0.e(m(), i, i2, i3, i4));
        qa0Var.f(db0.e(k(), i, i2, i3, i4));
        return qa0Var.b();
    }

    @Override // defpackage.ab0
    public boolean s() {
        return this.c.isRound();
    }

    @Override // defpackage.ab0
    public void u(io[] ioVarArr) {
        this.d = ioVarArr;
    }

    @Override // defpackage.ab0
    public void v(db0 db0Var) {
        this.f = db0Var;
    }

    @Override // defpackage.ab0
    public void x(int i) {
        this.h = i;
    }

    @Override // defpackage.ab0
    public void y(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.k = (Rect[][]) rectArr.clone();
    }

    @Override // defpackage.ab0
    public void z(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.l = (Rect[][]) rectArr.clone();
    }

    @Override // defpackage.ab0
    public void t(rf rfVar) {
    }
}
