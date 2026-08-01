package l;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import k.C0170o;
import k.MenuC0168m;

/* loaded from: classes.dex */
public final class L0 extends G0 implements H0 {

    /* renamed from: D, reason: collision with root package name */
    public static final Method f2903D;

    /* renamed from: C, reason: collision with root package name */
    public C.g f2904C;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f2903D = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // l.H0
    public final void e(MenuC0168m menuC0168m, C0170o c0170o) {
        C.g gVar = this.f2904C;
        if (gVar != null) {
            gVar.e(menuC0168m, c0170o);
        }
    }

    @Override // l.H0
    public final void p(MenuC0168m menuC0168m, C0170o c0170o) {
        C.g gVar = this.f2904C;
        if (gVar != null) {
            gVar.p(menuC0168m, c0170o);
        }
    }

    @Override // l.G0
    public final C0251t0 q(Context context, boolean z2) {
        K0 k02 = new K0(context, z2);
        k02.setHoverListener(this);
        return k02;
    }
}
