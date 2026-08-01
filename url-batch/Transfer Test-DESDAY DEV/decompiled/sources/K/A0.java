package K;

import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public final class A0 extends A.c {

    /* renamed from: e, reason: collision with root package name */
    public final Window f357e;

    public A0(Window window, O0.e eVar) {
        this.f357e = window;
    }

    public final void E0(int i) {
        View decorView = this.f357e.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }

    @Override // A.c
    public final void s0(boolean z2) {
        if (!z2) {
            E0(16);
            return;
        }
        Window window = this.f357e;
        window.clearFlags(134217728);
        window.addFlags(Integer.MIN_VALUE);
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(16 | decorView.getSystemUiVisibility());
    }

    @Override // A.c
    public final void t0(boolean z2) {
        if (!z2) {
            E0(8192);
            return;
        }
        Window window = this.f357e;
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(8192 | decorView.getSystemUiVisibility());
    }
}
