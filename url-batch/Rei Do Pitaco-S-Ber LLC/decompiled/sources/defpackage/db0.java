package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class db0 {
    public static final db0 b;
    public final ab0 a;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            b = ya0.w;
        } else if (i >= 30) {
            b = wa0.v;
        } else {
            b = ab0.b;
        }
    }

    public db0(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            this.a = new za0(this, windowInsets);
            return;
        }
        if (i >= 34) {
            this.a = new ya0(this, windowInsets);
            return;
        }
        if (i >= 31) {
            this.a = new xa0(this, windowInsets);
            return;
        }
        if (i >= 30) {
            this.a = new wa0(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.a = new va0(this, windowInsets);
        } else if (i >= 28) {
            this.a = new ua0(this, windowInsets);
        } else {
            this.a = new ta0(this, windowInsets);
        }
    }

    public static io e(io ioVar, int i, int i2, int i3, int i4) {
        int max = Math.max(0, ioVar.a - i);
        int max2 = Math.max(0, ioVar.b - i2);
        int max3 = Math.max(0, ioVar.c - i3);
        int max4 = Math.max(0, ioVar.d - i4);
        return (max == i && max2 == i2 && max3 == i3 && max4 == i4) ? ioVar : io.c(max, max2, max3, max4);
    }

    public static db0 g(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        db0 db0Var = new db0(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = f80.a;
            db0 a = y70.a(view);
            ab0 ab0Var = db0Var.a;
            ab0Var.v(a);
            View rootView = view.getRootView();
            ab0Var.d(rootView);
            ab0Var.o(rootView);
            ab0Var.p();
            ab0Var.x(view.getWindowSystemUiVisibility());
        }
        return db0Var;
    }

    public final int a() {
        return this.a.m().d;
    }

    public final int b() {
        return this.a.m().a;
    }

    public final int c() {
        return this.a.m().c;
    }

    public final int d() {
        return this.a.m().b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof db0) {
            return Objects.equals(this.a, ((db0) obj).a);
        }
        return false;
    }

    public final WindowInsets f() {
        ab0 ab0Var = this.a;
        if (ab0Var instanceof sa0) {
            return ((sa0) ab0Var).c;
        }
        return null;
    }

    public final int hashCode() {
        ab0 ab0Var = this.a;
        if (ab0Var == null) {
            return 0;
        }
        return ab0Var.hashCode();
    }

    public db0() {
        this.a = new ab0(this);
    }
}
