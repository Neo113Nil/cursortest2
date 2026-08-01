package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public class og {
    public void b(i40 i40Var, i40 i40Var2, Window window, View view, boolean z, boolean z2) {
        i40Var.getClass();
        i40Var2.getClass();
        window.getClass();
        view.getClass();
        k80.a(window, false);
        window.setStatusBarColor(z ? i40Var.b : i40Var.a);
        window.setNavigationBarColor(z2 ? i40Var2.b : i40Var2.a);
        iw iwVar = new iw(view, 13);
        int i = Build.VERSION.SDK_INT;
        g90 hb0Var = i >= 35 ? new hb0(window, iwVar) : i >= 30 ? new gb0(window, iwVar) : new eb0(window, iwVar);
        hb0Var.d(!z);
        hb0Var.c(!z2);
    }

    public void a(Window window) {
    }
}
