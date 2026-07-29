package o;

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
import com.devanos.nilufar.usmonova.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class X4 implements QF, InterfaceC1248ie, InterfaceC2075vC {
    public final /* synthetic */ int h;
    public final /* synthetic */ LayoutInflaterFactory2C1213i5 i;

    public /* synthetic */ X4(LayoutInflaterFactory2C1213i5 layoutInflaterFactory2C1213i5, int i) {
        this.h = i;
        this.i = layoutInflaterFactory2C1213i5;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00ac A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1142h10 a(View view, C1142h10 c1142h10) {
        int i;
        boolean z;
        View view2;
        C1142h10 c1142h102;
        WindowInsets b;
        boolean z2;
        boolean z3;
        Method method;
        Method declaredMethod;
        int i2;
        int i3;
        int i4;
        boolean z4;
        View view3;
        boolean z5;
        C1010f10 c1010f10 = c1142h10.a;
        int i5 = c1010f10.i().b;
        LayoutInflaterFactory2C1213i5 layoutInflaterFactory2C1213i5 = this.i;
        Context context = layoutInflaterFactory2C1213i5.r;
        int i6 = c1010f10.i().b;
        ActionBarContextView actionBarContextView = layoutInflaterFactory2C1213i5.C;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            i = 0;
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutInflaterFactory2C1213i5.C.getLayoutParams();
            if (layoutInflaterFactory2C1213i5.C.isShown()) {
                if (layoutInflaterFactory2C1213i5.j0 == null) {
                    layoutInflaterFactory2C1213i5.j0 = new Rect();
                    layoutInflaterFactory2C1213i5.k0 = new Rect();
                }
                Rect rect = layoutInflaterFactory2C1213i5.j0;
                Rect rect2 = layoutInflaterFactory2C1213i5.k0;
                rect.set(c1010f10.i().a, c1010f10.i().b, c1010f10.i().c, c1010f10.i().d);
                ViewGroup viewGroup = layoutInflaterFactory2C1213i5.H;
                if (Build.VERSION.SDK_INT >= 29) {
                    boolean z6 = AbstractC1468m00.a;
                    AbstractC1336k00.a(viewGroup, rect, rect2);
                    z3 = true;
                } else {
                    if (!AbstractC1468m00.a) {
                        AbstractC1468m00.a = true;
                        try {
                            declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            AbstractC1468m00.b = declaredMethod;
                        } catch (NoSuchMethodException unused) {
                            z3 = true;
                        }
                        if (!declaredMethod.isAccessible()) {
                            z3 = true;
                            try {
                                AbstractC1468m00.b.setAccessible(true);
                            } catch (NoSuchMethodException unused2) {
                                Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
                                method = AbstractC1468m00.b;
                                if (method != null) {
                                }
                                i2 = rect.top;
                                i3 = rect.left;
                                i4 = rect.right;
                                ViewGroup viewGroup2 = layoutInflaterFactory2C1213i5.H;
                                WeakHashMap weakHashMap = AZ.a;
                                C1142h10 a = AbstractC1834rZ.a(viewGroup2);
                                if (a != null) {
                                }
                                if (a != null) {
                                }
                                if (marginLayoutParams.topMargin != i2) {
                                }
                                marginLayoutParams.topMargin = i2;
                                marginLayoutParams.leftMargin = i3;
                                marginLayoutParams.rightMargin = i4;
                                z4 = z3;
                                if (i2 > 0) {
                                }
                                view3 = layoutInflaterFactory2C1213i5.J;
                                if (view3 != null) {
                                }
                                View view4 = layoutInflaterFactory2C1213i5.J;
                                if (view4 == null) {
                                }
                                if (z5) {
                                    View view5 = layoutInflaterFactory2C1213i5.J;
                                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) == 0 ? AbstractC1839re.a(context, R.color.abc_decor_view_status_guard_light) : AbstractC1839re.a(context, R.color.abc_decor_view_status_guard));
                                }
                                if (!layoutInflaterFactory2C1213i5.O) {
                                    i6 = 0;
                                }
                                z2 = z4;
                                z = z5;
                                i = 0;
                                if (z2) {
                                }
                                view2 = layoutInflaterFactory2C1213i5.J;
                                if (view2 != null) {
                                }
                                if (i5 == i6) {
                                }
                                WeakHashMap weakHashMap2 = AZ.a;
                                b = c1142h102.b();
                                if (b != null) {
                                }
                            }
                            method = AbstractC1468m00.b;
                            if (method != null) {
                                try {
                                    method.invoke(viewGroup, rect, rect2);
                                } catch (Exception e) {
                                    Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e);
                                }
                            }
                        }
                    }
                    z3 = true;
                    method = AbstractC1468m00.b;
                    if (method != null) {
                    }
                }
                i2 = rect.top;
                i3 = rect.left;
                i4 = rect.right;
                ViewGroup viewGroup22 = layoutInflaterFactory2C1213i5.H;
                WeakHashMap weakHashMap3 = AZ.a;
                C1142h10 a2 = AbstractC1834rZ.a(viewGroup22);
                int i7 = a2 != null ? 0 : a2.a.i().a;
                int i8 = a2 != null ? 0 : a2.a.i().c;
                if (marginLayoutParams.topMargin != i2 && marginLayoutParams.leftMargin == i3 && marginLayoutParams.rightMargin == i4) {
                    z4 = false;
                } else {
                    marginLayoutParams.topMargin = i2;
                    marginLayoutParams.leftMargin = i3;
                    marginLayoutParams.rightMargin = i4;
                    z4 = z3;
                }
                if (i2 > 0 || layoutInflaterFactory2C1213i5.J != null) {
                    view3 = layoutInflaterFactory2C1213i5.J;
                    if (view3 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view3.getLayoutParams();
                        int i9 = marginLayoutParams2.height;
                        int i10 = marginLayoutParams.topMargin;
                        if (i9 != i10 || marginLayoutParams2.leftMargin != i7 || marginLayoutParams2.rightMargin != i8) {
                            marginLayoutParams2.height = i10;
                            marginLayoutParams2.leftMargin = i7;
                            marginLayoutParams2.rightMargin = i8;
                            layoutInflaterFactory2C1213i5.J.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view6 = new View(context);
                    layoutInflaterFactory2C1213i5.J = view6;
                    view6.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = i7;
                    layoutParams.rightMargin = i8;
                    layoutInflaterFactory2C1213i5.H.addView(layoutInflaterFactory2C1213i5.J, -1, layoutParams);
                }
                View view42 = layoutInflaterFactory2C1213i5.J;
                z5 = view42 == null;
                if (z5 && view42.getVisibility() != 0) {
                    View view52 = layoutInflaterFactory2C1213i5.J;
                    view52.setBackgroundColor((view52.getWindowSystemUiVisibility() & 8192) == 0 ? AbstractC1839re.a(context, R.color.abc_decor_view_status_guard_light) : AbstractC1839re.a(context, R.color.abc_decor_view_status_guard));
                }
                if (!layoutInflaterFactory2C1213i5.O && z5) {
                    i6 = 0;
                }
                z2 = z4;
                z = z5;
                i = 0;
            } else {
                i = 0;
                if (marginLayoutParams.topMargin != 0) {
                    marginLayoutParams.topMargin = 0;
                    z = false;
                    z2 = true;
                } else {
                    z = false;
                    z2 = false;
                }
            }
            if (z2) {
                layoutInflaterFactory2C1213i5.C.setLayoutParams(marginLayoutParams);
            }
        }
        view2 = layoutInflaterFactory2C1213i5.J;
        if (view2 != null) {
            view2.setVisibility(z ? i : 8);
        }
        if (i5 == i6) {
            int i11 = c1010f10.i().a;
            int i12 = c1010f10.i().c;
            int i13 = c1010f10.i().d;
            int i14 = Build.VERSION.SDK_INT;
            Z00 y00 = i14 >= 30 ? new Y00(c1142h10) : i14 >= 29 ? new X00(c1142h10) : new W00(c1142h10);
            y00.d(C0644Ys.a(i11, i6, i12, i13));
            c1142h102 = y00.b();
        } else {
            c1142h102 = c1142h10;
        }
        WeakHashMap weakHashMap22 = AZ.a;
        b = c1142h102.b();
        if (b != null) {
            return c1142h102;
        }
        WindowInsets b2 = AbstractC1637oZ.b(view, b);
        return !b2.equals(b) ? C1142h10.c(b2, view) : c1142h102;
    }

    @Override // o.InterfaceC2075vC
    public void b(MenuC0825cC menuC0825cC, boolean z) {
        C1147h5 c1147h5;
        switch (this.h) {
            case 2:
                this.i.q(menuC0825cC);
                break;
            default:
                MenuC0825cC k = menuC0825cC.k();
                int i = 0;
                boolean z2 = k != menuC0825cC;
                if (z2) {
                    menuC0825cC = k;
                }
                LayoutInflaterFactory2C1213i5 layoutInflaterFactory2C1213i5 = this.i;
                C1147h5[] c1147h5Arr = layoutInflaterFactory2C1213i5.S;
                int length = c1147h5Arr != null ? c1147h5Arr.length : 0;
                while (true) {
                    if (i >= length) {
                        c1147h5 = null;
                    } else {
                        c1147h5 = c1147h5Arr[i];
                        if (c1147h5 == null || c1147h5.h != menuC0825cC) {
                            i++;
                        }
                    }
                }
                if (c1147h5 != null) {
                    if (!z2) {
                        layoutInflaterFactory2C1213i5.r(c1147h5, z);
                        break;
                    } else {
                        layoutInflaterFactory2C1213i5.p(c1147h5.a, c1147h5, k);
                        layoutInflaterFactory2C1213i5.r(c1147h5, true);
                        break;
                    }
                }
                break;
        }
    }

    @Override // o.InterfaceC2075vC
    public boolean z(MenuC0825cC menuC0825cC) {
        Window.Callback callback;
        switch (this.h) {
            case 2:
                Window.Callback callback2 = this.i.s.getCallback();
                if (callback2 != null) {
                    callback2.onMenuOpened(108, menuC0825cC);
                    break;
                }
                break;
            default:
                if (menuC0825cC == menuC0825cC.k()) {
                    LayoutInflaterFactory2C1213i5 layoutInflaterFactory2C1213i5 = this.i;
                    if (layoutInflaterFactory2C1213i5.M && (callback = layoutInflaterFactory2C1213i5.s.getCallback()) != null && !layoutInflaterFactory2C1213i5.X) {
                        callback.onMenuOpened(108, menuC0825cC);
                        break;
                    }
                }
                break;
        }
        return true;
    }
}
