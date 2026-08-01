package defpackage;

import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class eb0 extends g90 {
    public final Window a;

    public eb0(Window window, iw iwVar) {
        this.a = window;
    }

    @Override // defpackage.g90
    public final void c(boolean z) {
        if (!z) {
            e(16);
            return;
        }
        Window window = this.a;
        window.clearFlags(134217728);
        window.addFlags(Integer.MIN_VALUE);
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
    }

    @Override // defpackage.g90
    public final void d(boolean z) {
        if (!z) {
            e(8192);
            return;
        }
        Window window = this.a;
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
    }

    public final void e(int i) {
        View decorView = this.a.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }
}
