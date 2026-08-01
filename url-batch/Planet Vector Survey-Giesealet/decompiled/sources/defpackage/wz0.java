package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class wz0 implements View.OnApplyWindowInsetsListener {
    public d21 a = null;
    public final /* synthetic */ View b;
    public final /* synthetic */ ua0 c;

    public wz0(View view, ua0 ua0Var) {
        this.b = view;
        this.c = ua0Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        d21 c = d21.c(windowInsets, view);
        int i = Build.VERSION.SDK_INT;
        ua0 ua0Var = this.c;
        if (i < 30) {
            xz0.a(windowInsets, this.b);
            if (c.equals(this.a)) {
                return ua0Var.a(view, c).b();
            }
        }
        this.a = c;
        d21 a = ua0Var.a(view, c);
        if (i >= 30) {
            return a.b();
        }
        int i2 = c01.a;
        vz0.a(view);
        return a.b();
    }
}
