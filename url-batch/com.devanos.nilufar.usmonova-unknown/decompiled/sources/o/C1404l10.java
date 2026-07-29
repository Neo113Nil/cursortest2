package o;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* renamed from: o.l10, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1404l10 extends PO {
    public final WindowInsetsController a;
    public final Window b;

    public C1404l10(Window window) {
        WindowInsetsController insetsController;
        insetsController = window.getInsetsController();
        this.a = insetsController;
        this.b = window;
    }

    @Override // o.PO
    public final void k(boolean z) {
        Window window = this.b;
        if (z) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.a.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        this.a.setSystemBarsAppearance(0, 16);
    }

    @Override // o.PO
    public final void l(boolean z) {
        Window window = this.b;
        if (z) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.a.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.a.setSystemBarsAppearance(0, 8);
    }
}
