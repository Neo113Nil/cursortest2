package g;

import K.InterfaceC0019s;
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
import com.football.transfertrivia.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import k.InterfaceC0175x;
import k.MenuC0164m;
import l.InterfaceC0215i0;
import l.g1;
import l.h1;

/* loaded from: classes.dex */
public final class o implements InterfaceC0019s, InterfaceC0215i0, InterfaceC0175x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2248a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f2249b;

    public /* synthetic */ o(y yVar, int i) {
        this.f2248a = i;
        this.f2249b = yVar;
    }

    @Override // k.InterfaceC0175x
    public void b(MenuC0164m menuC0164m, boolean z2) {
        x xVar;
        switch (this.f2248a) {
            case 2:
                this.f2249b.o(menuC0164m);
                break;
            default:
                MenuC0164m k2 = menuC0164m.k();
                int i = 0;
                boolean z3 = k2 != menuC0164m;
                if (z3) {
                    menuC0164m = k2;
                }
                y yVar = this.f2249b;
                x[] xVarArr = yVar.f2286M;
                int length = xVarArr != null ? xVarArr.length : 0;
                while (true) {
                    if (i >= length) {
                        xVar = null;
                    } else {
                        xVar = xVarArr[i];
                        if (xVar == null || xVar.h != menuC0164m) {
                            i++;
                        }
                    }
                }
                if (xVar != null) {
                    if (!z3) {
                        yVar.r(xVar, z2);
                        break;
                    } else {
                        yVar.n(xVar.f2259a, xVar, k2);
                        yVar.r(xVar, true);
                        break;
                    }
                }
                break;
        }
    }

    @Override // K.InterfaceC0019s
    public z0 c(View view, z0 z0Var) {
        int i;
        boolean z2;
        z0 z0Var2;
        boolean z3;
        int d = z0Var.d();
        y yVar = this.f2249b;
        yVar.getClass();
        int d2 = z0Var.d();
        ActionBarContextView actionBarContextView = yVar.f2320v;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            i = 0;
            z2 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) yVar.f2320v.getLayoutParams();
            if (yVar.f2320v.isShown()) {
                if (yVar.f2303d0 == null) {
                    yVar.f2303d0 = new Rect();
                    yVar.f2304e0 = new Rect();
                }
                Rect rect = yVar.f2303d0;
                Rect rect2 = yVar.f2304e0;
                rect.set(z0Var.b(), z0Var.d(), z0Var.c(), z0Var.a());
                ViewGroup viewGroup = yVar.f2276B;
                if (Build.VERSION.SDK_INT >= 29) {
                    boolean z4 = h1.f3011a;
                    g1.a(viewGroup, rect, rect2);
                } else {
                    if (!h1.f3011a) {
                        h1.f3011a = true;
                        try {
                            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            h1.f3012b = declaredMethod;
                            if (!declaredMethod.isAccessible()) {
                                h1.f3012b.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
                        }
                    }
                    Method method = h1.f3012b;
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
                ViewGroup viewGroup2 = yVar.f2276B;
                WeakHashMap weakHashMap = T.f372a;
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
                Context context = yVar.f2309k;
                if (i2 <= 0 || yVar.f2278D != null) {
                    View view2 = yVar.f2278D;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i5 = marginLayoutParams2.height;
                        int i6 = marginLayoutParams.topMargin;
                        if (i5 != i6 || marginLayoutParams2.leftMargin != b2 || marginLayoutParams2.rightMargin != c2) {
                            marginLayoutParams2.height = i6;
                            marginLayoutParams2.leftMargin = b2;
                            marginLayoutParams2.rightMargin = c2;
                            yVar.f2278D.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    yVar.f2278D = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = b2;
                    layoutParams.rightMargin = c2;
                    yVar.f2276B.addView(yVar.f2278D, -1, layoutParams);
                }
                View view4 = yVar.f2278D;
                r11 = view4 != null;
                if (r11 && view4.getVisibility() != 0) {
                    View view5 = yVar.f2278D;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? A.b.a(context, R.color.abc_decor_view_status_guard_light) : A.b.a(context, R.color.abc_decor_view_status_guard));
                }
                if (!yVar.f2282I && r11) {
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
                yVar.f2320v.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = yVar.f2278D;
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
        WeakHashMap weakHashMap2 = T.f372a;
        WindowInsets f2 = z0Var2.f();
        if (f2 == null) {
            return z0Var2;
        }
        WindowInsets b4 = K.F.b(view, f2);
        return !b4.equals(f2) ? z0.g(view, b4) : z0Var2;
    }

    @Override // k.InterfaceC0175x
    public boolean g(MenuC0164m menuC0164m) {
        Window.Callback callback;
        switch (this.f2248a) {
            case 2:
                Window.Callback callback2 = this.f2249b.f2310l.getCallback();
                if (callback2 != null) {
                    callback2.onMenuOpened(108, menuC0164m);
                    break;
                }
                break;
            default:
                if (menuC0164m == menuC0164m.k()) {
                    y yVar = this.f2249b;
                    if (yVar.f2280G && (callback = yVar.f2310l.getCallback()) != null && !yVar.f2291R) {
                        callback.onMenuOpened(108, menuC0164m);
                        break;
                    }
                }
                break;
        }
        return true;
    }
}
