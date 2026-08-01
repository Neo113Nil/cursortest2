package g;

import K.T;
import K.o0;
import K.p0;
import K.q0;
import K.r0;
import K.z0;
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
import com.luckycounter.drinkwater.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import k.InterfaceC0213x;
import k.MenuC0202m;
import l.InterfaceC0260k0;
import l.i1;
import l.j1;

/* loaded from: classes.dex */
public final class p implements K.r, InterfaceC0260k0, InterfaceC0213x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2688a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f2689b;

    public /* synthetic */ p(z zVar, int i) {
        this.f2688a = i;
        this.f2689b = zVar;
    }

    @Override // k.InterfaceC0213x
    public void b(MenuC0202m menuC0202m, boolean z2) {
        y yVar;
        switch (this.f2688a) {
            case 2:
                this.f2689b.q(menuC0202m);
                break;
            default:
                MenuC0202m k2 = menuC0202m.k();
                int i = 0;
                boolean z3 = k2 != menuC0202m;
                if (z3) {
                    menuC0202m = k2;
                }
                z zVar = this.f2689b;
                y[] yVarArr = zVar.f2725L;
                int length = yVarArr != null ? yVarArr.length : 0;
                while (true) {
                    if (i >= length) {
                        yVar = null;
                    } else {
                        yVar = yVarArr[i];
                        if (yVar == null || yVar.h != menuC0202m) {
                            i++;
                        }
                    }
                }
                if (yVar != null) {
                    if (!z3) {
                        zVar.r(yVar, z2);
                        break;
                    } else {
                        zVar.p(yVar.f2699a, yVar, k2);
                        zVar.r(yVar, true);
                        break;
                    }
                }
                break;
        }
    }

    @Override // K.r
    public z0 c(View view, z0 z0Var) {
        int i;
        boolean z2;
        z0 z0Var2;
        boolean z3;
        int d = z0Var.d();
        z zVar = this.f2689b;
        zVar.getClass();
        int d2 = z0Var.d();
        ActionBarContextView actionBarContextView = zVar.f2759v;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            i = 0;
            z2 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) zVar.f2759v.getLayoutParams();
            if (zVar.f2759v.isShown()) {
                if (zVar.f2742c0 == null) {
                    zVar.f2742c0 = new Rect();
                    zVar.f2743d0 = new Rect();
                }
                Rect rect = zVar.f2742c0;
                Rect rect2 = zVar.f2743d0;
                rect.set(z0Var.b(), z0Var.d(), z0Var.c(), z0Var.a());
                ViewGroup viewGroup = zVar.f2715A;
                if (Build.VERSION.SDK_INT >= 29) {
                    boolean z4 = j1.f3445a;
                    i1.a(viewGroup, rect, rect2);
                } else {
                    if (!j1.f3445a) {
                        j1.f3445a = true;
                        try {
                            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            j1.f3446b = declaredMethod;
                            if (!declaredMethod.isAccessible()) {
                                j1.f3446b.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
                        }
                    }
                    Method method = j1.f3446b;
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
                ViewGroup viewGroup2 = zVar.f2715A;
                WeakHashMap weakHashMap = T.f633a;
                z0 a2 = K.I.a(viewGroup2);
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
                Context context = zVar.f2748k;
                if (i2 <= 0 || zVar.f2717C != null) {
                    View view2 = zVar.f2717C;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i5 = marginLayoutParams2.height;
                        int i6 = marginLayoutParams.topMargin;
                        if (i5 != i6 || marginLayoutParams2.leftMargin != b2 || marginLayoutParams2.rightMargin != c2) {
                            marginLayoutParams2.height = i6;
                            marginLayoutParams2.leftMargin = b2;
                            marginLayoutParams2.rightMargin = c2;
                            zVar.f2717C.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    zVar.f2717C = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = b2;
                    layoutParams.rightMargin = c2;
                    zVar.f2715A.addView(zVar.f2717C, -1, layoutParams);
                }
                View view4 = zVar.f2717C;
                r11 = view4 != null;
                if (r11 && view4.getVisibility() != 0) {
                    View view5 = zVar.f2717C;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? A.b.a(context, R.color.abc_decor_view_status_guard_light) : A.b.a(context, R.color.abc_decor_view_status_guard));
                }
                if (!zVar.f2721H && r11) {
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
                zVar.f2759v.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = zVar.f2717C;
        if (view6 != null) {
            view6.setVisibility(z2 ? i : 8);
        }
        if (d != d2) {
            int b3 = z0Var.b();
            int c3 = z0Var.c();
            int a3 = z0Var.a();
            int i7 = Build.VERSION.SDK_INT;
            r0 q0Var = i7 >= 30 ? new q0(z0Var) : i7 >= 29 ? new p0(z0Var) : new o0(z0Var);
            q0Var.g(C.d.b(b3, d2, c3, a3));
            z0Var2 = q0Var.b();
        } else {
            z0Var2 = z0Var;
        }
        WeakHashMap weakHashMap2 = T.f633a;
        WindowInsets f2 = z0Var2.f();
        if (f2 == null) {
            return z0Var2;
        }
        WindowInsets b4 = K.F.b(view, f2);
        return !b4.equals(f2) ? z0.g(view, b4) : z0Var2;
    }

    @Override // k.InterfaceC0213x
    public boolean f(MenuC0202m menuC0202m) {
        Window.Callback callback;
        switch (this.f2688a) {
            case 2:
                Window.Callback callback2 = this.f2689b.f2749l.getCallback();
                if (callback2 != null) {
                    callback2.onMenuOpened(108, menuC0202m);
                    break;
                }
                break;
            default:
                if (menuC0202m == menuC0202m.k()) {
                    z zVar = this.f2689b;
                    if (zVar.F && (callback = zVar.f2749l.getCallback()) != null && !zVar.f2730Q) {
                        callback.onMenuOpened(108, menuC0202m);
                        break;
                    }
                }
                break;
        }
        return true;
    }
}
