package defpackage;

import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public class wa0 extends va0 {
    public static final db0 v;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        v = db0.g(null, windowInsets);
    }

    public wa0(db0 db0Var, WindowInsets windowInsets) {
        super(db0Var, windowInsets);
    }

    @Override // defpackage.sa0, defpackage.ab0
    public io h(int i) {
        Insets insets;
        insets = this.c.getInsets(bb0.a(i));
        return io.d(insets);
    }

    @Override // defpackage.sa0, defpackage.ab0
    public io i(int i) {
        Insets insetsIgnoringVisibility;
        insetsIgnoringVisibility = this.c.getInsetsIgnoringVisibility(bb0.a(i));
        return io.d(insetsIgnoringVisibility);
    }

    @Override // defpackage.sa0, defpackage.ab0
    public final void d(View view) {
    }
}
