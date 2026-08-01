package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public class wo extends a50 {
    @Override // defpackage.a50
    public void L(pu0 pu0Var, pu0 pu0Var2, Window window, View view, boolean z, boolean z2) {
        pu0Var.getClass();
        pu0Var2.getClass();
        window.getClass();
        view.getClass();
        yc0.o(window, false);
        window.setStatusBarColor(z ? pu0Var.b : pu0Var.a);
        window.setNavigationBarColor(z2 ? pu0Var2.b : pu0Var2.a);
        int i = Build.VERSION.SDK_INT;
        od0 h21Var = i >= 35 ? new h21(window) : i >= 30 ? new g21(window) : i >= 26 ? new f21(window) : new e21(window);
        h21Var.u(!z);
        h21Var.t(!z2);
    }
}
