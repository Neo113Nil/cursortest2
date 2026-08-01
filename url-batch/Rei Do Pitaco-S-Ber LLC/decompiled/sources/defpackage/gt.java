package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class gt extends jq implements us {
    public static final Method I;
    public j0 H;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                I = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // defpackage.jq
    public final bg a(Context context, boolean z) {
        ft ftVar = new ft(context, z);
        ftVar.setHoverListener(this);
        return ftVar;
    }

    @Override // defpackage.us
    public final void g(ss ssVar, MenuItem menuItem) {
        j0 j0Var = this.H;
        if (j0Var != null) {
            j0Var.g(ssVar, menuItem);
        }
    }

    @Override // defpackage.us
    public final void j(ss ssVar, vs vsVar) {
        j0 j0Var = this.H;
        if (j0Var != null) {
            j0Var.j(ssVar, vsVar);
        }
    }
}
