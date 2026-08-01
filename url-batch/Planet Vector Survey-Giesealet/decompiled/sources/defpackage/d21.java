package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class d21 {
    public static final d21 b;
    public final z11 a;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            b = y11.s;
        } else if (i >= 30) {
            b = w11.r;
        } else {
            b = z11.b;
        }
    }

    public d21(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            this.a = new y11(this, windowInsets);
            return;
        }
        if (i >= 31) {
            this.a = new x11(this, windowInsets);
            return;
        }
        if (i >= 30) {
            this.a = new w11(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.a = new v11(this, windowInsets);
        } else if (i >= 28) {
            this.a = new u11(this, windowInsets);
        } else {
            this.a = new t11(this, windowInsets);
        }
    }

    public static oy a(oy oyVar, int i, int i2, int i3, int i4) {
        int max = Math.max(0, oyVar.a - i);
        int max2 = Math.max(0, oyVar.b - i2);
        int max3 = Math.max(0, oyVar.c - i3);
        int max4 = Math.max(0, oyVar.d - i4);
        return (max == i && max2 == i2 && max3 == i3 && max4 == i4) ? oyVar : oy.c(max, max2, max3, max4);
    }

    public static d21 c(WindowInsets windowInsets, View view) {
        windowInsets.getClass();
        d21 d21Var = new d21(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            int i = c01.a;
            d21 a = yz0.a(view);
            z11 z11Var = d21Var.a;
            z11Var.r(a);
            z11Var.d(view.getRootView());
            z11Var.t(view.getWindowSystemUiVisibility());
        }
        return d21Var;
    }

    public final WindowInsets b() {
        z11 z11Var = this.a;
        if (z11Var instanceof s11) {
            return ((s11) z11Var).c;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d21) {
            return Objects.equals(this.a, ((d21) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        z11 z11Var = this.a;
        if (z11Var == null) {
            return 0;
        }
        return z11Var.hashCode();
    }

    public d21() {
        this.a = new z11(this);
    }
}
