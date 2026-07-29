package o;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* renamed from: o.uC, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2009uC extends AbstractC1809rA implements InterfaceC1220iC {
    public static final Method J;
    public Y1 I;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                J = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // o.InterfaceC1220iC
    public final void c(MenuC0825cC menuC0825cC, MenuItem menuItem) {
        Y1 y1 = this.I;
        if (y1 != null) {
            y1.c(menuC0825cC, menuItem);
        }
    }

    @Override // o.InterfaceC1220iC
    public final void j(MenuC0825cC menuC0825cC, C1284jC c1284jC) {
        Y1 y1 = this.I;
        if (y1 != null) {
            y1.j(menuC0825cC, c1284jC);
        }
    }

    @Override // o.AbstractC1809rA
    public final C1713pj q(Context context, boolean z) {
        C1943tC c1943tC = new C1943tC(context, z);
        c1943tC.setHoverListener(this);
        return c1943tC;
    }
}
