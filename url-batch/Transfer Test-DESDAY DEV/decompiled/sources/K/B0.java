package K;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* loaded from: classes.dex */
public final class B0 extends A.c {

    /* renamed from: e, reason: collision with root package name */
    public final WindowInsetsController f358e;

    /* renamed from: f, reason: collision with root package name */
    public Window f359f;

    public B0(WindowInsetsController windowInsetsController, O0.e eVar) {
        this.f358e = windowInsetsController;
    }

    @Override // A.c
    public final void s0(boolean z2) {
        Window window = this.f359f;
        if (z2) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.f358e.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        this.f358e.setSystemBarsAppearance(0, 16);
    }

    @Override // A.c
    public final void t0(boolean z2) {
        Window window = this.f359f;
        if (z2) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.f358e.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.f358e.setSystemBarsAppearance(0, 8);
    }
}
