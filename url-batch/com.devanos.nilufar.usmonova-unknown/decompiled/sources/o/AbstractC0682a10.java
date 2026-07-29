package o;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* renamed from: o.a10, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0682a10 extends C1010f10 {
    public static boolean h = false;
    public static Method i;
    public static Class j;
    public static Field k;
    public static Field l;
    public final WindowInsets c;
    public C0644Ys[] d;
    public C0644Ys e;
    public C1142h10 f;
    public C0644Ys g;

    public AbstractC0682a10(C1142h10 c1142h10, WindowInsets windowInsets) {
        super(c1142h10);
        this.e = null;
        this.c = windowInsets;
    }

    private C0644Ys s() {
        C1142h10 c1142h10 = this.f;
        return c1142h10 != null ? c1142h10.a.g() : C0644Ys.e;
    }

    private C0644Ys t(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!h) {
            v();
        }
        Method method = i;
        if (method != null && j != null && k != null) {
            try {
                Object invoke = method.invoke(view, null);
                if (invoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) k.get(l.get(invoke));
                if (rect != null) {
                    return C0644Ys.a(rect.left, rect.top, rect.right, rect.bottom);
                }
            } catch (ReflectiveOperationException e) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
        }
        return null;
    }

    @SuppressLint({"PrivateApi"})
    private static void v() {
        try {
            i = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            j = cls;
            k = cls.getDeclaredField("mVisibleInsets");
            l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            k.setAccessible(true);
            l.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
        }
        h = true;
    }

    @Override // o.C1010f10
    public void d(View view) {
        C0644Ys t = t(view);
        if (t == null) {
            t = C0644Ys.e;
        }
        w(t);
    }

    @Override // o.C1010f10
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return Objects.equals(this.g, ((AbstractC0682a10) obj).g);
        }
        return false;
    }

    @Override // o.C1010f10
    public final C0644Ys i() {
        if (this.e == null) {
            WindowInsets windowInsets = this.c;
            this.e = C0644Ys.a(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.e;
    }

    @Override // o.C1010f10
    public C1142h10 k(int i2, int i3, int i4, int i5) {
        C1142h10 c = C1142h10.c(this.c, null);
        int i6 = Build.VERSION.SDK_INT;
        Z00 y00 = i6 >= 30 ? new Y00(c) : i6 >= 29 ? new X00(c) : new W00(c);
        y00.d(C1142h10.a(i(), i2, i3, i4, i5));
        y00.c(C1142h10.a(g(), i2, i3, i4, i5));
        return y00.b();
    }

    @Override // o.C1010f10
    public boolean m() {
        return this.c.isRound();
    }

    @Override // o.C1010f10
    @SuppressLint({"WrongConstant"})
    public boolean n(int i2) {
        for (int i3 = 1; i3 <= 256; i3 <<= 1) {
            if ((i2 & i3) != 0 && !u(i3)) {
                return false;
            }
        }
        return true;
    }

    @Override // o.C1010f10
    public void o(C0644Ys[] c0644YsArr) {
        this.d = c0644YsArr;
    }

    @Override // o.C1010f10
    public void p(C1142h10 c1142h10) {
        this.f = c1142h10;
    }

    public C0644Ys r(int i2, boolean z) {
        C0644Ys g;
        int i3;
        if (i2 == 1) {
            return z ? C0644Ys.a(0, Math.max(s().b, i().b), 0, 0) : C0644Ys.a(0, i().b, 0, 0);
        }
        if (i2 == 2) {
            if (z) {
                C0644Ys s = s();
                C0644Ys g2 = g();
                return C0644Ys.a(Math.max(s.a, g2.a), 0, Math.max(s.c, g2.c), Math.max(s.d, g2.d));
            }
            C0644Ys i4 = i();
            C1142h10 c1142h10 = this.f;
            g = c1142h10 != null ? c1142h10.a.g() : null;
            int i5 = i4.d;
            if (g != null) {
                i5 = Math.min(i5, g.d);
            }
            return C0644Ys.a(i4.a, 0, i4.c, i5);
        }
        C0644Ys c0644Ys = C0644Ys.e;
        if (i2 == 8) {
            C0644Ys[] c0644YsArr = this.d;
            g = c0644YsArr != null ? c0644YsArr[3] : null;
            if (g != null) {
                return g;
            }
            C0644Ys i6 = i();
            C0644Ys s2 = s();
            int i7 = i6.d;
            if (i7 > s2.d) {
                return C0644Ys.a(0, 0, 0, i7);
            }
            C0644Ys c0644Ys2 = this.g;
            if (c0644Ys2 != null && !c0644Ys2.equals(c0644Ys) && (i3 = this.g.d) > s2.d) {
                return C0644Ys.a(0, 0, 0, i3);
            }
        } else {
            if (i2 == 16) {
                return h();
            }
            if (i2 == 32) {
                return f();
            }
            if (i2 == 64) {
                return j();
            }
            if (i2 == 128) {
                C1142h10 c1142h102 = this.f;
                C0167Gi e = c1142h102 != null ? c1142h102.a.e() : e();
                if (e != null) {
                    int i8 = Build.VERSION.SDK_INT;
                    return C0644Ys.a(i8 >= 28 ? AbstractC0141Fi.d(e.a) : 0, i8 >= 28 ? AbstractC0141Fi.f(e.a) : 0, i8 >= 28 ? AbstractC0141Fi.e(e.a) : 0, i8 >= 28 ? AbstractC0141Fi.c(e.a) : 0);
                }
            }
        }
        return c0644Ys;
    }

    public boolean u(int i2) {
        if (i2 != 1 && i2 != 2) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 8 && i2 != 128) {
                return true;
            }
        }
        return !r(i2, false).equals(C0644Ys.e);
    }

    public void w(C0644Ys c0644Ys) {
        this.g = c0644Ys;
    }
}
