package defpackage;

import android.graphics.Insets;
import android.view.WindowInsets;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class y11 extends x11 {
    public static final d21 s;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        s = d21.c(windowInsets, null);
    }

    public y11(d21 d21Var, WindowInsets windowInsets) {
        super(d21Var, windowInsets);
    }

    @Override // defpackage.w11, defpackage.s11, defpackage.z11
    public oy f(int i) {
        Insets insets;
        insets = this.c.getInsets(c21.a(i));
        return oy.d(insets);
    }

    @Override // defpackage.w11, defpackage.s11, defpackage.z11
    public oy g(int i) {
        Insets insetsIgnoringVisibility;
        insetsIgnoringVisibility = this.c.getInsetsIgnoringVisibility(c21.a(i));
        return oy.d(insetsIgnoringVisibility);
    }

    @Override // defpackage.w11, defpackage.s11, defpackage.z11
    public boolean p(int i) {
        boolean isVisible;
        isVisible = this.c.isVisible(c21.a(i));
        return isVisible;
    }
}
