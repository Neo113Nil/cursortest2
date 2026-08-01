package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class s11 extends z11 {
    public static boolean i = false;
    public static Method j;
    public static Class k;
    public static Field l;
    public static Field m;
    public final WindowInsets c;
    public oy[] d;
    public oy e;
    public d21 f;
    public oy g;
    public int h;

    public s11(d21 d21Var, WindowInsets windowInsets) {
        super(d21Var);
        this.e = null;
        this.c = windowInsets;
    }

    public static boolean B(int i2, int i3) {
        return (i2 & 6) == (i3 & 6);
    }

    private oy u(int i2, boolean z) {
        oy oyVar = oy.e;
        for (int i3 = 1; i3 <= 512; i3 <<= 1) {
            if ((i2 & i3) != 0) {
                oyVar = oy.a(oyVar, v(i3, z));
            }
        }
        return oyVar;
    }

    private oy w() {
        d21 d21Var = this.f;
        return d21Var != null ? d21Var.a.i() : oy.e;
    }

    private oy x(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!i) {
            z();
        }
        Method method = j;
        if (method != null && k != null && l != null) {
            try {
                Object invoke = method.invoke(view, null);
                if (invoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) l.get(m.get(invoke));
                if (rect != null) {
                    return oy.c(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (ReflectiveOperationException e) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
        }
        return null;
    }

    private static void z() {
        try {
            j = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            k = cls;
            l = cls.getDeclaredField("mVisibleInsets");
            m = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            l.setAccessible(true);
            m.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
        }
        i = true;
    }

    public void A(oy oyVar) {
        this.g = oyVar;
    }

    @Override // defpackage.z11
    public void d(View view) {
        oy x = x(view);
        if (x == null) {
            x = oy.e;
        }
        A(x);
    }

    @Override // defpackage.z11
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        s11 s11Var = (s11) obj;
        return Objects.equals(this.g, s11Var.g) && B(this.h, s11Var.h);
    }

    @Override // defpackage.z11
    public oy f(int i2) {
        return u(i2, false);
    }

    @Override // defpackage.z11
    public oy g(int i2) {
        return u(i2, true);
    }

    @Override // defpackage.z11
    public final oy k() {
        if (this.e == null) {
            WindowInsets windowInsets = this.c;
            this.e = oy.c(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.e;
    }

    @Override // defpackage.z11
    public d21 m(int i2, int i3, int i4, int i5) {
        d21 c = d21.c(this.c, null);
        int i6 = Build.VERSION.SDK_INT;
        r11 q11Var = i6 >= 34 ? new q11(c) : i6 >= 31 ? new p11(c) : i6 >= 30 ? new o11(c) : i6 >= 29 ? new n11(c) : new m11(c);
        q11Var.g(d21.a(k(), i2, i3, i4, i5));
        q11Var.e(d21.a(i(), i2, i3, i4, i5));
        return q11Var.b();
    }

    @Override // defpackage.z11
    public boolean o() {
        return this.c.isRound();
    }

    @Override // defpackage.z11
    public boolean p(int i2) {
        for (int i3 = 1; i3 <= 512; i3 <<= 1) {
            if ((i2 & i3) != 0 && !y(i3)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.z11
    public void q(oy[] oyVarArr) {
        this.d = oyVarArr;
    }

    @Override // defpackage.z11
    public void r(d21 d21Var) {
        this.f = d21Var;
    }

    @Override // defpackage.z11
    public void t(int i2) {
        this.h = i2;
    }

    public oy v(int i2, boolean z) {
        oy i3;
        int i4;
        oy oyVar = oy.e;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 8) {
                    oy[] oyVarArr = this.d;
                    i3 = oyVarArr != null ? oyVarArr[ld0.k(8)] : null;
                    if (i3 != null) {
                        return i3;
                    }
                    oy k2 = k();
                    oy w = w();
                    int i5 = k2.d;
                    if (i5 > w.d) {
                        return oy.c(0, 0, 0, i5);
                    }
                    oy oyVar2 = this.g;
                    if (oyVar2 != null && !oyVar2.equals(oyVar) && (i4 = this.g.d) > w.d) {
                        return oy.c(0, 0, 0, i4);
                    }
                } else {
                    if (i2 == 16) {
                        return j();
                    }
                    if (i2 == 32) {
                        return h();
                    }
                    if (i2 == 64) {
                        return l();
                    }
                    if (i2 == 128) {
                        d21 d21Var = this.f;
                        xm e = d21Var != null ? d21Var.a.e() : e();
                        if (e != null) {
                            int i6 = Build.VERSION.SDK_INT;
                            return oy.c(i6 >= 28 ? wm.e(e.a) : 0, i6 >= 28 ? wm.g(e.a) : 0, i6 >= 28 ? wm.f(e.a) : 0, i6 >= 28 ? wm.d(e.a) : 0);
                        }
                    }
                }
            } else {
                if (z) {
                    oy w2 = w();
                    oy i7 = i();
                    return oy.c(Math.max(w2.a, i7.a), 0, Math.max(w2.c, i7.c), Math.max(w2.d, i7.d));
                }
                if ((this.h & 2) == 0) {
                    oy k3 = k();
                    d21 d21Var2 = this.f;
                    i3 = d21Var2 != null ? d21Var2.a.i() : null;
                    int i8 = k3.d;
                    if (i3 != null) {
                        i8 = Math.min(i8, i3.d);
                    }
                    return oy.c(k3.a, 0, k3.c, i8);
                }
            }
        } else {
            if (z) {
                return oy.c(0, Math.max(w().b, k().b), 0, 0);
            }
            if ((this.h & 4) == 0) {
                return oy.c(0, k().b, 0, 0);
            }
        }
        return oyVar;
    }

    public boolean y(int i2) {
        if (i2 != 1 && i2 != 2) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 8 && i2 != 128) {
                return true;
            }
        }
        return !v(i2, false).equals(oy.e);
    }
}
