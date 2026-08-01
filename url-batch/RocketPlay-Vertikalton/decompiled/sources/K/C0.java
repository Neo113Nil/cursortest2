package K;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* loaded from: classes.dex */
public final class C0 extends F1.l {

    /* renamed from: e, reason: collision with root package name */
    public final WindowInsetsController f620e;

    /* renamed from: f, reason: collision with root package name */
    public Window f621f;

    public C0(WindowInsetsController windowInsetsController, A1.d dVar) {
        this.f620e = windowInsetsController;
    }

    @Override // F1.l
    public final void N() {
        this.f620e.hide(7);
    }

    @Override // F1.l
    public final void h0(boolean z2) {
        Window window = this.f621f;
        if (z2) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.f620e.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        this.f620e.setSystemBarsAppearance(0, 16);
    }

    @Override // F1.l
    public final void i0(boolean z2) {
        Window window = this.f621f;
        if (z2) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.f620e.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.f620e.setSystemBarsAppearance(0, 8);
    }

    @Override // F1.l
    public final void k0() {
        this.f620e.setSystemBarsBehavior(2);
    }
}
