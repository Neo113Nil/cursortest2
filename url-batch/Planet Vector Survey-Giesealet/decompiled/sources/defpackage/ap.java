package defpackage;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class ap extends zo {
    @Override // defpackage.yo, defpackage.wo, defpackage.a50
    public void L(pu0 pu0Var, pu0 pu0Var2, Window window, View view, boolean z, boolean z2) {
        pu0Var.getClass();
        pu0Var2.getClass();
        window.getClass();
        view.getClass();
        yc0.o(window, false);
        WindowManager.LayoutParams attributes = window.getAttributes();
        if ((attributes.flags & 256) != 0 || attributes.width != -2 || attributes.height != -2) {
            window.setStatusBarColor(0);
            window.setNavigationBarColor(0);
            ViewGroup viewGroup = (ViewGroup) view;
            viewGroup.addView(new hi0(viewGroup.getContext(), px0.I(new je(2, 0), new je(1, 0), new je(4, 0), new je(8, 0))));
        }
        window.setNavigationBarContrastEnforced(true);
        int i = Build.VERSION.SDK_INT;
        od0 h21Var = i >= 35 ? new h21(window) : i >= 30 ? new g21(window) : i >= 26 ? new f21(window) : new e21(window);
        h21Var.u(!z);
        h21Var.t(!z2);
    }
}
