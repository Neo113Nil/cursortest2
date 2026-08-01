package defpackage;

import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public class w11 extends v11 {
    public static final d21 r;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        r = d21.c(windowInsets, null);
    }

    public w11(d21 d21Var, WindowInsets windowInsets) {
        super(d21Var, windowInsets);
    }

    @Override // defpackage.s11, defpackage.z11
    public oy f(int i) {
        Insets insets;
        insets = this.c.getInsets(b21.a(i));
        return oy.d(insets);
    }

    @Override // defpackage.s11, defpackage.z11
    public oy g(int i) {
        Insets insetsIgnoringVisibility;
        insetsIgnoringVisibility = this.c.getInsetsIgnoringVisibility(b21.a(i));
        return oy.d(insetsIgnoringVisibility);
    }

    @Override // defpackage.s11, defpackage.z11
    public boolean p(int i) {
        boolean isVisible;
        isVisible = this.c.isVisible(b21.a(i));
        return isVisible;
    }

    @Override // defpackage.s11, defpackage.z11
    public final void d(View view) {
    }
}
