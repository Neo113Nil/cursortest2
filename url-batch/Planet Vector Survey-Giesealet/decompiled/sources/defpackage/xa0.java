package defpackage;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class xa0 implements OnBackAnimationCallback {
    public final /* synthetic */ va0 a;

    public xa0(va0 va0Var) {
        this.a = va0Var;
    }

    public final void onBackCancelled() {
        va0 va0Var = this.a;
        f90 f90Var = va0Var.a;
        if (f90Var == null) {
            g8.s("This input is not added to any dispatcher.");
            return;
        }
        if (!va0Var.b) {
            f90Var.d(va0Var, null);
        }
        k90 k90Var = f90Var.b;
        k90Var.getClass();
        if (va0Var.equals(k90Var.h) && -1 == k90Var.g) {
            h90 h90Var = k90Var.f;
            if (h90Var == null) {
                h90Var = k90Var.c(-1);
            }
            k90Var.f = null;
            k90Var.g = 0;
            k90Var.h = null;
            if (h90Var != null) {
                h90Var.a();
            }
            et0 et0Var = k90Var.a;
            l90 l90Var = l90.u;
            et0Var.getClass();
            et0Var.k(null, l90Var);
        }
        va0Var.b = false;
    }

    public final void onBackInvoked() {
        this.a.a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        backEvent.getClass();
        e90 d = px0.d(backEvent);
        va0 va0Var = this.a;
        f90 f90Var = va0Var.a;
        if (f90Var == null) {
            g8.s("This input is not added to any dispatcher.");
            return;
        }
        if (va0Var.b) {
            k90 k90Var = f90Var.b;
            k90Var.getClass();
            if (va0Var.equals(k90Var.h) && -1 == k90Var.g) {
                h90 h90Var = k90Var.f;
                if (h90Var == null) {
                    h90Var = k90Var.c(-1);
                }
                if (h90Var != null) {
                    h90Var.c(d);
                }
                et0 et0Var = k90Var.a;
                m90 m90Var = new m90(d);
                et0Var.getClass();
                et0Var.k(null, m90Var);
            }
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        backEvent.getClass();
        e90 d = px0.d(backEvent);
        va0 va0Var = this.a;
        f90 f90Var = va0Var.a;
        if (f90Var == null) {
            g8.s("This input is not added to any dispatcher.");
        } else {
            if (va0Var.b) {
                return;
            }
            f90Var.d(va0Var, d);
            va0Var.b = true;
        }
    }
}
