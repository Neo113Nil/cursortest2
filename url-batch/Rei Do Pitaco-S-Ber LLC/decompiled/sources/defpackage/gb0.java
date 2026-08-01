package defpackage;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public class gb0 extends g90 {
    public final WindowInsetsController a;
    public final Window b;

    public gb0(Window window, iw iwVar) {
        WindowInsetsController insetsController;
        insetsController = window.getInsetsController();
        this.a = insetsController;
        this.b = window;
    }

    @Override // defpackage.g90
    public void c(boolean z) {
        e(16, 16, z);
    }

    @Override // defpackage.g90
    public void d(boolean z) {
        e(8192, 8, z);
    }

    public final void e(int i, int i2, boolean z) {
        Window window = this.b;
        if (window == null) {
            WindowInsetsController windowInsetsController = this.a;
            if (z) {
                windowInsetsController.setSystemBarsAppearance(i2, i2);
                return;
            } else {
                windowInsetsController.setSystemBarsAppearance(0, i2);
                return;
            }
        }
        if (z) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        } else {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility((~i) & decorView2.getSystemUiVisibility());
        }
    }
}
