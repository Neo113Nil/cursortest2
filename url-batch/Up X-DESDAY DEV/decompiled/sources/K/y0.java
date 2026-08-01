package K;

import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public final class y0 extends q1.d {

    /* renamed from: e, reason: collision with root package name */
    public final Window f469e;

    /* renamed from: f, reason: collision with root package name */
    public final B0.d f470f;

    public y0(Window window, B0.d dVar) {
        this.f469e = window;
        this.f470f = dVar;
    }

    @Override // q1.d
    public final void P() {
        for (int i = 1; i <= 256; i <<= 1) {
            if ((7 & i) != 0) {
                if (i == 1) {
                    v0(4);
                } else if (i == 2) {
                    v0(2);
                } else if (i == 8) {
                    ((B0.d) this.f470f.f59b).x();
                }
            }
        }
    }

    @Override // q1.d
    public final void k0(boolean z2) {
        if (!z2) {
            w0(16);
            return;
        }
        Window window = this.f469e;
        window.clearFlags(134217728);
        window.addFlags(Integer.MIN_VALUE);
        v0(16);
    }

    @Override // q1.d
    public final void l0(boolean z2) {
        if (!z2) {
            w0(8192);
            return;
        }
        Window window = this.f469e;
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        v0(8192);
    }

    @Override // q1.d
    public final void p0() {
        w0(2048);
        v0(4096);
    }

    public final void v0(int i) {
        View decorView = this.f469e.getDecorView();
        decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
    }

    public final void w0(int i) {
        View decorView = this.f469e.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }
}
