package l;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import k.C0204o;
import k.MenuC0202m;

/* loaded from: classes.dex */
public final class L0 extends G0 implements H0 {

    /* renamed from: D, reason: collision with root package name */
    public static final Method f3337D;

    /* renamed from: C, reason: collision with root package name */
    public A1.d f3338C;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f3337D = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // l.H0
    public final void e(MenuC0202m menuC0202m, C0204o c0204o) {
        A1.d dVar = this.f3338C;
        if (dVar != null) {
            dVar.e(menuC0202m, c0204o);
        }
    }

    @Override // l.H0
    public final void o(MenuC0202m menuC0202m, C0204o c0204o) {
        A1.d dVar = this.f3338C;
        if (dVar != null) {
            dVar.o(menuC0202m, c0204o);
        }
    }

    @Override // l.G0
    public final C0278t0 q(Context context, boolean z2) {
        K0 k02 = new K0(context, z2);
        k02.setHoverListener(this);
        return k02;
    }
}
