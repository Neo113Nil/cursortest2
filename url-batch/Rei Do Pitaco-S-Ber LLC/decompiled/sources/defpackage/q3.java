package defpackage;

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
import com.ionia.reidopitaco.libya.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class q3 implements hv, xc, ht {
    public final /* synthetic */ int f;
    public final /* synthetic */ c4 g;

    public /* synthetic */ q3(c4 c4Var, int i) {
        this.f = i;
        this.g = c4Var;
    }

    @Override // defpackage.ht
    public void a(ss ssVar, boolean z) {
        b4 b4Var;
        int i = this.f;
        c4 c4Var = this.g;
        switch (i) {
            case 2:
                c4Var.q(ssVar);
                break;
            default:
                ss k = ssVar.k();
                int i2 = 0;
                boolean z2 = k != ssVar;
                if (z2) {
                    ssVar = k;
                }
                b4[] b4VarArr = c4Var.P;
                int length = b4VarArr != null ? b4VarArr.length : 0;
                while (true) {
                    if (i2 >= length) {
                        b4Var = null;
                    } else {
                        b4Var = b4VarArr[i2];
                        if (b4Var == null || b4Var.h != ssVar) {
                            i2++;
                        }
                    }
                }
                if (b4Var != null) {
                    if (!z2) {
                        c4Var.r(b4Var, z);
                        break;
                    } else {
                        c4Var.p(b4Var.a, b4Var, k);
                        c4Var.r(b4Var, true);
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.hv
    public db0 k(View view, db0 db0Var) {
        int i;
        int i2;
        boolean z;
        db0 db0Var2;
        boolean z2;
        int d = db0Var.d();
        c4 c4Var = this.g;
        Context context = c4Var.p;
        int d2 = db0Var.d();
        ActionBarContextView actionBarContextView = c4Var.z;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            i = 0;
            i2 = 8;
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) c4Var.z.getLayoutParams();
            if (c4Var.z.isShown()) {
                if (c4Var.g0 == null) {
                    c4Var.g0 = new Rect();
                    c4Var.h0 = new Rect();
                }
                Rect rect = c4Var.g0;
                Rect rect2 = c4Var.h0;
                rect.set(db0Var.b(), db0Var.d(), db0Var.c(), db0Var.a());
                ViewGroup viewGroup = c4Var.E;
                if (Build.VERSION.SDK_INT >= 29) {
                    boolean z3 = h90.a;
                    c90.a(viewGroup, rect, rect2);
                } else {
                    if (!h90.a) {
                        h90.a = true;
                        try {
                            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            h90.b = declaredMethod;
                            if (!declaredMethod.isAccessible()) {
                                h90.b.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
                        }
                    }
                    Method method = h90.b;
                    if (method != null) {
                        try {
                            method.invoke(viewGroup, rect, rect2);
                        } catch (Exception e) {
                            Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e);
                        }
                    }
                }
                int i3 = rect.top;
                int i4 = rect.left;
                int i5 = rect.right;
                ViewGroup viewGroup2 = c4Var.E;
                WeakHashMap weakHashMap = f80.a;
                db0 a = y70.a(viewGroup2);
                int b = a == null ? 0 : a.b();
                int c = a == null ? 0 : a.c();
                if (marginLayoutParams.topMargin == i3 && marginLayoutParams.leftMargin == i4 && marginLayoutParams.rightMargin == i5) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i3;
                    marginLayoutParams.leftMargin = i4;
                    marginLayoutParams.rightMargin = i5;
                    z2 = true;
                }
                if (i3 <= 0 || c4Var.G != null) {
                    i2 = 8;
                    View view2 = c4Var.G;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i6 = marginLayoutParams2.height;
                        int i7 = marginLayoutParams.topMargin;
                        if (i6 != i7 || marginLayoutParams2.leftMargin != b || marginLayoutParams2.rightMargin != c) {
                            marginLayoutParams2.height = i7;
                            marginLayoutParams2.leftMargin = b;
                            marginLayoutParams2.rightMargin = c;
                            c4Var.G.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    c4Var.G = view3;
                    i2 = 8;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = b;
                    layoutParams.rightMargin = c;
                    c4Var.E.addView(c4Var.G, -1, layoutParams);
                }
                View view4 = c4Var.G;
                r11 = view4 != null;
                if (r11 && view4.getVisibility() != 0) {
                    View view5 = c4Var.G;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? context.getColor(R.color.abc_decor_view_status_guard_light) : context.getColor(R.color.abc_decor_view_status_guard));
                }
                if (!c4Var.L && r11) {
                    d2 = 0;
                }
                i = 0;
                z = r11;
                r11 = z2;
            } else {
                i2 = 8;
                i = 0;
                if (marginLayoutParams.topMargin != 0) {
                    marginLayoutParams.topMargin = 0;
                    z = false;
                } else {
                    z = false;
                    r11 = false;
                }
            }
            if (r11) {
                c4Var.z.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = c4Var.G;
        if (view6 != null) {
            if (z) {
                i2 = i;
            }
            view6.setVisibility(i2);
        }
        if (d != d2) {
            int b2 = db0Var.b();
            int c2 = db0Var.c();
            int a2 = db0Var.a();
            int i8 = Build.VERSION.SDK_INT;
            ra0 qa0Var = i8 >= 36 ? new qa0(db0Var) : i8 >= 35 ? new pa0(db0Var) : i8 >= 34 ? new oa0(db0Var) : i8 >= 31 ? new na0(db0Var) : i8 >= 30 ? new ma0(db0Var) : i8 >= 29 ? new la0(db0Var) : new ka0(db0Var);
            qa0Var.h(io.c(b2, d2, c2, a2));
            db0Var2 = qa0Var.b();
        } else {
            db0Var2 = db0Var;
        }
        WeakHashMap weakHashMap2 = f80.a;
        WindowInsets f = db0Var2.f();
        if (f == null) {
            return db0Var2;
        }
        WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(f);
        return !onApplyWindowInsets.equals(f) ? db0.g(view, onApplyWindowInsets) : db0Var2;
    }

    @Override // defpackage.ht
    public boolean v(ss ssVar) {
        Window.Callback callback;
        int i = this.f;
        c4 c4Var = this.g;
        switch (i) {
            case 2:
                Window.Callback callback2 = c4Var.q.getCallback();
                if (callback2 != null) {
                    callback2.onMenuOpened(108, ssVar);
                    break;
                }
                break;
            default:
                if (ssVar == ssVar.k() && c4Var.J && (callback = c4Var.q.getCallback()) != null && !c4Var.U) {
                    callback.onMenuOpened(108, ssVar);
                    break;
                }
                break;
        }
        return true;
    }
}
