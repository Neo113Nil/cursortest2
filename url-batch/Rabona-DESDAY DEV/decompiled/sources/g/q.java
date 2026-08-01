package g;

import K.T;
import K.m0;
import K.n0;
import K.o0;
import K.p0;
import K.x0;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import com.linetic.luckycross.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import k.InterfaceC0169x;
import k.MenuC0158m;
import l.InterfaceC0244k0;
import l.h1;
import l.i1;

/* loaded from: classes.dex */
public final class q implements K.r, InterfaceC0244k0, InterfaceC0169x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2341a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LayoutInflaterFactory2C0110A f2342b;

    public /* synthetic */ q(LayoutInflaterFactory2C0110A layoutInflaterFactory2C0110A, int i) {
        this.f2341a = i;
        this.f2342b = layoutInflaterFactory2C0110A;
    }

    @Override // k.InterfaceC0169x
    public void b(MenuC0158m menuC0158m, boolean z2) {
        z zVar;
        switch (this.f2341a) {
            case 2:
                this.f2342b.q(menuC0158m);
                break;
            default:
                MenuC0158m k2 = menuC0158m.k();
                int i = 0;
                boolean z3 = k2 != menuC0158m;
                if (z3) {
                    menuC0158m = k2;
                }
                LayoutInflaterFactory2C0110A layoutInflaterFactory2C0110A = this.f2342b;
                z[] zVarArr = layoutInflaterFactory2C0110A.f2205M;
                int length = zVarArr != null ? zVarArr.length : 0;
                while (true) {
                    if (i >= length) {
                        zVar = null;
                    } else {
                        zVar = zVarArr[i];
                        if (zVar == null || zVar.h != menuC0158m) {
                            i++;
                        }
                    }
                }
                if (zVar != null) {
                    if (!z3) {
                        layoutInflaterFactory2C0110A.r(zVar, z2);
                        break;
                    } else {
                        layoutInflaterFactory2C0110A.p(zVar.f2352a, zVar, k2);
                        layoutInflaterFactory2C0110A.r(zVar, true);
                        break;
                    }
                }
                break;
        }
    }

    @Override // K.r
    public x0 c(View view, x0 x0Var) {
        int i;
        boolean z2;
        x0 x0Var2;
        boolean z3;
        int d = x0Var.d();
        LayoutInflaterFactory2C0110A layoutInflaterFactory2C0110A = this.f2342b;
        layoutInflaterFactory2C0110A.getClass();
        int d2 = x0Var.d();
        ActionBarContextView actionBarContextView = layoutInflaterFactory2C0110A.f2239v;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            i = 0;
            z2 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutInflaterFactory2C0110A.f2239v.getLayoutParams();
            if (layoutInflaterFactory2C0110A.f2239v.isShown()) {
                if (layoutInflaterFactory2C0110A.f2222d0 == null) {
                    layoutInflaterFactory2C0110A.f2222d0 = new Rect();
                    layoutInflaterFactory2C0110A.f2223e0 = new Rect();
                }
                Rect rect = layoutInflaterFactory2C0110A.f2222d0;
                Rect rect2 = layoutInflaterFactory2C0110A.f2223e0;
                rect.set(x0Var.b(), x0Var.d(), x0Var.c(), x0Var.a());
                ViewGroup viewGroup = layoutInflaterFactory2C0110A.f2195B;
                if (Build.VERSION.SDK_INT >= 29) {
                    boolean z4 = i1.f3004a;
                    h1.a(viewGroup, rect, rect2);
                } else {
                    if (!i1.f3004a) {
                        i1.f3004a = true;
                        try {
                            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            i1.f3005b = declaredMethod;
                            if (!declaredMethod.isAccessible()) {
                                i1.f3005b.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
                        }
                    }
                    Method method = i1.f3005b;
                    if (method != null) {
                        try {
                            method.invoke(viewGroup, rect, rect2);
                        } catch (Exception e2) {
                            Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e2);
                        }
                    }
                }
                int i2 = rect.top;
                int i3 = rect.left;
                int i4 = rect.right;
                ViewGroup viewGroup2 = layoutInflaterFactory2C0110A.f2195B;
                WeakHashMap weakHashMap = T.f381a;
                x0 a2 = K.I.a(viewGroup2);
                int b2 = a2 == null ? 0 : a2.b();
                int c2 = a2 == null ? 0 : a2.c();
                if (marginLayoutParams.topMargin == i2 && marginLayoutParams.leftMargin == i3 && marginLayoutParams.rightMargin == i4) {
                    z3 = false;
                } else {
                    marginLayoutParams.topMargin = i2;
                    marginLayoutParams.leftMargin = i3;
                    marginLayoutParams.rightMargin = i4;
                    z3 = true;
                }
                Context context = layoutInflaterFactory2C0110A.f2228k;
                if (i2 <= 0 || layoutInflaterFactory2C0110A.f2197D != null) {
                    View view2 = layoutInflaterFactory2C0110A.f2197D;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i5 = marginLayoutParams2.height;
                        int i6 = marginLayoutParams.topMargin;
                        if (i5 != i6 || marginLayoutParams2.leftMargin != b2 || marginLayoutParams2.rightMargin != c2) {
                            marginLayoutParams2.height = i6;
                            marginLayoutParams2.leftMargin = b2;
                            marginLayoutParams2.rightMargin = c2;
                            layoutInflaterFactory2C0110A.f2197D.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    layoutInflaterFactory2C0110A.f2197D = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = b2;
                    layoutParams.rightMargin = c2;
                    layoutInflaterFactory2C0110A.f2195B.addView(layoutInflaterFactory2C0110A.f2197D, -1, layoutParams);
                }
                View view4 = layoutInflaterFactory2C0110A.f2197D;
                r11 = view4 != null;
                if (r11 && view4.getVisibility() != 0) {
                    View view5 = layoutInflaterFactory2C0110A.f2197D;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? A.b.a(context, R.color.abc_decor_view_status_guard_light) : A.b.a(context, R.color.abc_decor_view_status_guard));
                }
                if (!layoutInflaterFactory2C0110A.f2201I && r11) {
                    d2 = 0;
                }
                z2 = r11;
                r11 = z3;
                i = 0;
            } else {
                i = 0;
                if (marginLayoutParams.topMargin != 0) {
                    marginLayoutParams.topMargin = 0;
                    z2 = false;
                } else {
                    z2 = false;
                    r11 = false;
                }
            }
            if (r11) {
                layoutInflaterFactory2C0110A.f2239v.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = layoutInflaterFactory2C0110A.f2197D;
        if (view6 != null) {
            view6.setVisibility(z2 ? i : 8);
        }
        if (d != d2) {
            int b3 = x0Var.b();
            int c3 = x0Var.c();
            int a3 = x0Var.a();
            int i7 = Build.VERSION.SDK_INT;
            p0 o0Var = i7 >= 30 ? new o0(x0Var) : i7 >= 29 ? new n0(x0Var) : new m0(x0Var);
            o0Var.g(C.d.b(b3, d2, c3, a3));
            x0Var2 = o0Var.b();
        } else {
            x0Var2 = x0Var;
        }
        WeakHashMap weakHashMap2 = T.f381a;
        WindowInsets f2 = x0Var2.f();
        if (f2 == null) {
            return x0Var2;
        }
        WindowInsets b4 = K.F.b(view, f2);
        return !b4.equals(f2) ? x0.g(view, b4) : x0Var2;
    }

    @Override // k.InterfaceC0169x
    public boolean f(MenuC0158m menuC0158m) {
        Window.Callback callback;
        switch (this.f2341a) {
            case 2:
                Window.Callback callback2 = this.f2342b.f2229l.getCallback();
                if (callback2 != null) {
                    callback2.onMenuOpened(108, menuC0158m);
                    break;
                }
                break;
            default:
                if (menuC0158m == menuC0158m.k()) {
                    LayoutInflaterFactory2C0110A layoutInflaterFactory2C0110A = this.f2342b;
                    if (layoutInflaterFactory2C0110A.f2199G && (callback = layoutInflaterFactory2C0110A.f2229l.getCallback()) != null && !layoutInflaterFactory2C0110A.f2210R) {
                        callback.onMenuOpened(108, menuC0158m);
                        break;
                    }
                }
                break;
        }
        return true;
    }
}
