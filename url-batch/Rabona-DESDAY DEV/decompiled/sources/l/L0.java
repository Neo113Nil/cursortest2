package l;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import k.C0160o;
import k.MenuC0158m;

/* loaded from: classes.dex */
public final class L0 extends G0 implements H0 {

    /* renamed from: D, reason: collision with root package name */
    public static final Method f2900D;

    /* renamed from: C, reason: collision with root package name */
    public B0.d f2901C;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f2900D = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // l.H0
    public final void e(MenuC0158m menuC0158m, C0160o c0160o) {
        B0.d dVar = this.f2901C;
        if (dVar != null) {
            dVar.e(menuC0158m, c0160o);
        }
    }

    @Override // l.G0
    public final C0262t0 p(Context context, boolean z2) {
        K0 k02 = new K0(context, z2);
        k02.setHoverListener(this);
        return k02;
    }

    @Override // l.H0
    public final void q(MenuC0158m menuC0158m, C0160o c0160o) {
        B0.d dVar = this.f2901C;
        if (dVar != null) {
            dVar.q(menuC0158m, c0160o);
        }
    }
}
