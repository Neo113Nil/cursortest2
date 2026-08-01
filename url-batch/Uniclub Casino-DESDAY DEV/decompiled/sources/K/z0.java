package K;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* loaded from: classes.dex */
public final class z0 extends q1.d {

    /* renamed from: e, reason: collision with root package name */
    public final WindowInsetsController f455e;

    /* renamed from: f, reason: collision with root package name */
    public Window f456f;

    public z0(WindowInsetsController windowInsetsController, C.g gVar) {
        this.f455e = windowInsetsController;
    }

    @Override // q1.d
    public final void B() {
        this.f455e.hide(7);
    }

    @Override // q1.d
    public final void O(boolean z2) {
        Window window = this.f456f;
        if (z2) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.f455e.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        this.f455e.setSystemBarsAppearance(0, 16);
    }

    @Override // q1.d
    public final void P(boolean z2) {
        Window window = this.f456f;
        if (z2) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.f455e.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.f455e.setSystemBarsAppearance(0, 8);
    }

    @Override // q1.d
    public final void W() {
        this.f455e.setSystemBarsBehavior(2);
    }
}
