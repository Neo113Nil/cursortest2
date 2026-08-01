package K;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class z0 {

    /* renamed from: b, reason: collision with root package name */
    public static final z0 f728b;

    /* renamed from: a, reason: collision with root package name */
    public final x0 f729a;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f728b = w0.f721q;
        } else {
            f728b = x0.f725b;
        }
    }

    public z0(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.f729a = new w0(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.f729a = new v0(this, windowInsets);
        } else if (i >= 28) {
            this.f729a = new u0(this, windowInsets);
        } else {
            this.f729a = new t0(this, windowInsets);
        }
    }

    public static C.d e(C.d dVar, int i, int i2, int i3, int i4) {
        int max = Math.max(0, dVar.f232a - i);
        int max2 = Math.max(0, dVar.f233b - i2);
        int max3 = Math.max(0, dVar.f234c - i3);
        int max4 = Math.max(0, dVar.d - i4);
        return (max == i && max2 == i2 && max3 == i3 && max4 == i4) ? dVar : C.d.b(max, max2, max3, max4);
    }

    public static z0 g(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        z0 z0Var = new z0(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = T.f633a;
            z0 a2 = I.a(view);
            x0 x0Var = z0Var.f729a;
            x0Var.p(a2);
            x0Var.d(view.getRootView());
        }
        return z0Var;
    }

    public final int a() {
        return this.f729a.j().d;
    }

    public final int b() {
        return this.f729a.j().f232a;
    }

    public final int c() {
        return this.f729a.j().f234c;
    }

    public final int d() {
        return this.f729a.j().f233b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return false;
        }
        return Objects.equals(this.f729a, ((z0) obj).f729a);
    }

    public final WindowInsets f() {
        x0 x0Var = this.f729a;
        if (x0Var instanceof s0) {
            return ((s0) x0Var).f709c;
        }
        return null;
    }

    public final int hashCode() {
        x0 x0Var = this.f729a;
        if (x0Var == null) {
            return 0;
        }
        return x0Var.hashCode();
    }

    public z0() {
        this.f729a = new x0(this);
    }
}
