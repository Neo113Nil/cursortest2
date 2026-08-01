package K;

import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public final class x0 extends q1.d {

    /* renamed from: e, reason: collision with root package name */
    public final Window f448e;

    /* renamed from: f, reason: collision with root package name */
    public final C.g f449f;

    public x0(Window window, C.g gVar) {
        this.f448e = window;
        this.f449f = gVar;
    }

    @Override // q1.d
    public final void B() {
        for (int i = 1; i <= 256; i <<= 1) {
            if ((7 & i) != 0) {
                if (i == 1) {
                    b0(4);
                } else if (i == 2) {
                    b0(2);
                } else if (i == 8) {
                    ((C.g) this.f449f.f62b).x();
                }
            }
        }
    }

    @Override // q1.d
    public final void O(boolean z2) {
        if (!z2) {
            c0(16);
            return;
        }
        Window window = this.f448e;
        window.clearFlags(134217728);
        window.addFlags(Integer.MIN_VALUE);
        b0(16);
    }

    @Override // q1.d
    public final void P(boolean z2) {
        if (!z2) {
            c0(8192);
            return;
        }
        Window window = this.f448e;
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        b0(8192);
    }

    @Override // q1.d
    public final void W() {
        c0(2048);
        b0(4096);
    }

    public final void b0(int i) {
        View decorView = this.f448e.getDecorView();
        decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
    }

    public final void c0(int i) {
        View decorView = this.f448e.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }
}
