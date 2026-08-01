package defpackage;

import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public class ya0 extends xa0 {
    public static final db0 w;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        w = db0.g(null, windowInsets);
    }

    public ya0(db0 db0Var, WindowInsets windowInsets) {
        super(db0Var, windowInsets);
    }

    @Override // defpackage.wa0, defpackage.sa0, defpackage.ab0
    public io h(int i) {
        Insets insets;
        insets = this.c.getInsets(cb0.a(i));
        return io.d(insets);
    }

    @Override // defpackage.wa0, defpackage.sa0, defpackage.ab0
    public io i(int i) {
        Insets insetsIgnoringVisibility;
        insetsIgnoringVisibility = this.c.getInsetsIgnoringVisibility(cb0.a(i));
        return io.d(insetsIgnoringVisibility);
    }

    @Override // defpackage.sa0, defpackage.ab0
    public void o(View view) {
    }
}
