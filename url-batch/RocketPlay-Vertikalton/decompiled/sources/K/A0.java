package K;

import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public final class A0 extends F1.l {

    /* renamed from: e, reason: collision with root package name */
    public final Window f617e;

    /* renamed from: f, reason: collision with root package name */
    public final A1.d f618f;

    public A0(Window window, A1.d dVar) {
        this.f617e = window;
        this.f618f = dVar;
    }

    @Override // F1.l
    public final void N() {
        for (int i = 1; i <= 256; i <<= 1) {
            if ((7 & i) != 0) {
                if (i == 1) {
                    r0(4);
                } else if (i == 2) {
                    r0(2);
                } else if (i == 8) {
                    ((A1.d) this.f618f.f38b).t();
                }
            }
        }
    }

    @Override // F1.l
    public final void h0(boolean z2) {
        if (!z2) {
            s0(16);
            return;
        }
        Window window = this.f617e;
        window.clearFlags(134217728);
        window.addFlags(Integer.MIN_VALUE);
        r0(16);
    }

    @Override // F1.l
    public final void i0(boolean z2) {
        if (!z2) {
            s0(8192);
            return;
        }
        Window window = this.f617e;
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        r0(8192);
    }

    @Override // F1.l
    public final void k0() {
        s0(2048);
        r0(4096);
    }

    public final void r0(int i) {
        View decorView = this.f617e.getDecorView();
        decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
    }

    public final void s0(int i) {
        View decorView = this.f617e.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }
}
