package l;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import h.C0039a;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class i extends o {

    /* renamed from: h, reason: collision with root package name */
    public static boolean f907h = false;

    /* renamed from: i, reason: collision with root package name */
    public static Method f908i;

    /* renamed from: j, reason: collision with root package name */
    public static Class f909j;

    /* renamed from: k, reason: collision with root package name */
    public static Field f910k;

    /* renamed from: l, reason: collision with root package name */
    public static Field f911l;

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets f912c;

    /* renamed from: d, reason: collision with root package name */
    public C0039a[] f913d;

    /* renamed from: e, reason: collision with root package name */
    public C0039a f914e;

    /* renamed from: f, reason: collision with root package name */
    public q f915f;

    /* renamed from: g, reason: collision with root package name */
    public C0039a f916g;

    public i(q qVar, WindowInsets windowInsets) {
        super(qVar);
        this.f914e = null;
        this.f912c = windowInsets;
    }

    private C0039a r() {
        q qVar = this.f915f;
        return qVar != null ? qVar.f924a.g() : C0039a.f529e;
    }

    private C0039a s(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!f907h) {
            u();
        }
        Method method = f908i;
        if (method != null && f909j != null && f910k != null) {
            try {
                Object invoke = method.invoke(view, null);
                if (invoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f910k.get(f911l.get(invoke));
                if (rect != null) {
                    return C0039a.a(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (ReflectiveOperationException e2) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e2.getMessage(), e2);
            }
        }
        return null;
    }

    private static void u() {
        try {
            f908i = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f909j = cls;
            f910k = cls.getDeclaredField("mVisibleInsets");
            f911l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f910k.setAccessible(true);
            f911l.setAccessible(true);
        } catch (ReflectiveOperationException e2) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e2.getMessage(), e2);
        }
        f907h = true;
    }

    @Override // l.o
    public void d(View view) {
        C0039a s2 = s(view);
        if (s2 == null) {
            s2 = C0039a.f529e;
        }
        v(s2);
    }

    @Override // l.o
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return Objects.equals(this.f916g, ((i) obj).f916g);
        }
        return false;
    }

    @Override // l.o
    public final C0039a i() {
        if (this.f914e == null) {
            WindowInsets windowInsets = this.f912c;
            this.f914e = C0039a.a(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f914e;
    }

    @Override // l.o
    public boolean l() {
        return this.f912c.isRound();
    }

    @Override // l.o
    public boolean m(int i2) {
        for (int i3 = 1; i3 <= 256; i3 <<= 1) {
            if ((i2 & i3) != 0 && !t(i3)) {
                return false;
            }
        }
        return true;
    }

    @Override // l.o
    public void n(C0039a[] c0039aArr) {
        this.f913d = c0039aArr;
    }

    @Override // l.o
    public void o(q qVar) {
        this.f915f = qVar;
    }

    public C0039a q(int i2, boolean z2) {
        C0039a g2;
        int i3;
        if (i2 == 1) {
            return z2 ? C0039a.a(0, Math.max(r().f531b, i().f531b), 0, 0) : C0039a.a(0, i().f531b, 0, 0);
        }
        if (i2 == 2) {
            if (z2) {
                C0039a r2 = r();
                C0039a g3 = g();
                return C0039a.a(Math.max(r2.f530a, g3.f530a), 0, Math.max(r2.f532c, g3.f532c), Math.max(r2.f533d, g3.f533d));
            }
            C0039a i4 = i();
            q qVar = this.f915f;
            g2 = qVar != null ? qVar.f924a.g() : null;
            int i5 = i4.f533d;
            if (g2 != null) {
                i5 = Math.min(i5, g2.f533d);
            }
            return C0039a.a(i4.f530a, 0, i4.f532c, i5);
        }
        C0039a c0039a = C0039a.f529e;
        if (i2 == 8) {
            C0039a[] c0039aArr = this.f913d;
            g2 = c0039aArr != null ? c0039aArr[3] : null;
            if (g2 != null) {
                return g2;
            }
            C0039a i6 = i();
            C0039a r3 = r();
            int i7 = i6.f533d;
            if (i7 > r3.f533d) {
                return C0039a.a(0, 0, 0, i7);
            }
            C0039a c0039a2 = this.f916g;
            return (c0039a2 == null || c0039a2.equals(c0039a) || (i3 = this.f916g.f533d) <= r3.f533d) ? c0039a : C0039a.a(0, 0, 0, i3);
        }
        if (i2 == 16) {
            return h();
        }
        if (i2 == 32) {
            return f();
        }
        if (i2 == 64) {
            return j();
        }
        if (i2 != 128) {
            return c0039a;
        }
        q qVar2 = this.f915f;
        b e2 = qVar2 != null ? qVar2.f924a.e() : e();
        if (e2 == null) {
            return c0039a;
        }
        int i8 = Build.VERSION.SDK_INT;
        return C0039a.a(i8 >= 28 ? a.d(e2.f899a) : 0, i8 >= 28 ? a.f(e2.f899a) : 0, i8 >= 28 ? a.e(e2.f899a) : 0, i8 >= 28 ? a.c(e2.f899a) : 0);
    }

    public boolean t(int i2) {
        if (i2 != 1 && i2 != 2) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 8 && i2 != 128) {
                return true;
            }
        }
        return !q(i2, false).equals(C0039a.f529e);
    }

    public void v(C0039a c0039a) {
        this.f916g = c0039a;
    }
}
