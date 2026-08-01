package K;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class q0 extends v0 {
    public static boolean h = false;
    public static Method i;

    /* renamed from: j, reason: collision with root package name */
    public static Class f449j;

    /* renamed from: k, reason: collision with root package name */
    public static Field f450k;

    /* renamed from: l, reason: collision with root package name */
    public static Field f451l;

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets f452c;
    public C.d[] d;

    /* renamed from: e, reason: collision with root package name */
    public C.d f453e;

    /* renamed from: f, reason: collision with root package name */
    public x0 f454f;

    /* renamed from: g, reason: collision with root package name */
    public C.d f455g;

    public q0(x0 x0Var, WindowInsets windowInsets) {
        super(x0Var);
        this.f453e = null;
        this.f452c = windowInsets;
    }

    private C.d r(int i2, boolean z2) {
        C.d dVar = C.d.f147e;
        for (int i3 = 1; i3 <= 256; i3 <<= 1) {
            if ((i2 & i3) != 0) {
                dVar = C.d.a(dVar, s(i3, z2));
            }
        }
        return dVar;
    }

    private C.d t() {
        x0 x0Var = this.f454f;
        return x0Var != null ? x0Var.f468a.h() : C.d.f147e;
    }

    private C.d u(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!h) {
            v();
        }
        Method method = i;
        if (method != null && f449j != null && f450k != null) {
            try {
                Object invoke = method.invoke(view, null);
                if (invoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f450k.get(f451l.get(invoke));
                if (rect != null) {
                    return C.d.b(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (ReflectiveOperationException e2) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e2.getMessage(), e2);
            }
        }
        return null;
    }

    private static void v() {
        try {
            i = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f449j = cls;
            f450k = cls.getDeclaredField("mVisibleInsets");
            f451l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f450k.setAccessible(true);
            f451l.setAccessible(true);
        } catch (ReflectiveOperationException e2) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e2.getMessage(), e2);
        }
        h = true;
    }

    @Override // K.v0
    public void d(View view) {
        C.d u2 = u(view);
        if (u2 == null) {
            u2 = C.d.f147e;
        }
        w(u2);
    }

    @Override // K.v0
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return Objects.equals(this.f455g, ((q0) obj).f455g);
        }
        return false;
    }

    @Override // K.v0
    public C.d f(int i2) {
        return r(i2, false);
    }

    @Override // K.v0
    public final C.d j() {
        if (this.f453e == null) {
            WindowInsets windowInsets = this.f452c;
            this.f453e = C.d.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f453e;
    }

    @Override // K.v0
    public x0 l(int i2, int i3, int i4, int i5) {
        x0 g2 = x0.g(null, this.f452c);
        int i6 = Build.VERSION.SDK_INT;
        p0 o0Var = i6 >= 30 ? new o0(g2) : i6 >= 29 ? new n0(g2) : new m0(g2);
        o0Var.g(x0.e(j(), i2, i3, i4, i5));
        o0Var.e(x0.e(h(), i2, i3, i4, i5));
        return o0Var.b();
    }

    @Override // K.v0
    public boolean n() {
        return this.f452c.isRound();
    }

    @Override // K.v0
    public void o(C.d[] dVarArr) {
        this.d = dVarArr;
    }

    @Override // K.v0
    public void p(x0 x0Var) {
        this.f454f = x0Var;
    }

    public C.d s(int i2, boolean z2) {
        C.d h2;
        int i3;
        if (i2 == 1) {
            return z2 ? C.d.b(0, Math.max(t().f149b, j().f149b), 0, 0) : C.d.b(0, j().f149b, 0, 0);
        }
        if (i2 == 2) {
            if (z2) {
                C.d t2 = t();
                C.d h3 = h();
                return C.d.b(Math.max(t2.f148a, h3.f148a), 0, Math.max(t2.f150c, h3.f150c), Math.max(t2.d, h3.d));
            }
            C.d j2 = j();
            x0 x0Var = this.f454f;
            h2 = x0Var != null ? x0Var.f468a.h() : null;
            int i4 = j2.d;
            if (h2 != null) {
                i4 = Math.min(i4, h2.d);
            }
            return C.d.b(j2.f148a, 0, j2.f150c, i4);
        }
        C.d dVar = C.d.f147e;
        if (i2 == 8) {
            C.d[] dVarArr = this.d;
            h2 = dVarArr != null ? dVarArr[q1.l.C(8)] : null;
            if (h2 != null) {
                return h2;
            }
            C.d j3 = j();
            C.d t3 = t();
            int i5 = j3.d;
            if (i5 > t3.d) {
                return C.d.b(0, 0, 0, i5);
            }
            C.d dVar2 = this.f455g;
            return (dVar2 == null || dVar2.equals(dVar) || (i3 = this.f455g.d) <= t3.d) ? dVar : C.d.b(0, 0, 0, i3);
        }
        if (i2 == 16) {
            return i();
        }
        if (i2 == 32) {
            return g();
        }
        if (i2 == 64) {
            return k();
        }
        if (i2 != 128) {
            return dVar;
        }
        x0 x0Var2 = this.f454f;
        C0010j e2 = x0Var2 != null ? x0Var2.f468a.e() : e();
        if (e2 == null) {
            return dVar;
        }
        int i6 = Build.VERSION.SDK_INT;
        return C.d.b(i6 >= 28 ? AbstractC0009i.d(e2.f424a) : 0, i6 >= 28 ? AbstractC0009i.f(e2.f424a) : 0, i6 >= 28 ? AbstractC0009i.e(e2.f424a) : 0, i6 >= 28 ? AbstractC0009i.c(e2.f424a) : 0);
    }

    public void w(C.d dVar) {
        this.f455g = dVar;
    }
}
