package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class ea0 implements View.OnApplyWindowInsetsListener {
    public final qd a;
    public db0 b;

    public ea0(View view, qd qdVar) {
        db0 db0Var;
        this.a = qdVar;
        WeakHashMap weakHashMap = f80.a;
        db0 a = y70.a(view);
        if (a != null) {
            int i = Build.VERSION.SDK_INT;
            db0Var = (i >= 36 ? new qa0(a) : i >= 35 ? new pa0(a) : i >= 34 ? new oa0(a) : i >= 31 ? new na0(a) : i >= 30 ? new ma0(a) : i >= 29 ? new la0(a) : new ka0(a)).b();
        } else {
            db0Var = null;
        }
        this.b = db0Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        int[] iArr;
        boolean z;
        if (!view.isLaidOut()) {
            this.b = db0.g(view, windowInsets);
            return fa0.j(view, windowInsets);
        }
        db0 g = db0.g(view, windowInsets);
        ab0 ab0Var = g.a;
        if (this.b == null) {
            WeakHashMap weakHashMap = f80.a;
            this.b = y70.a(view);
        }
        if (this.b == null) {
            this.b = g;
            return fa0.j(view, windowInsets);
        }
        qd k = fa0.k(view);
        if (k != null && Objects.equals((db0) k.a, g)) {
            return fa0.j(view, windowInsets);
        }
        int[] iArr2 = new int[1];
        int[] iArr3 = new int[1];
        db0 db0Var = this.b;
        int i = 1;
        while (i <= 512) {
            io h = ab0Var.h(i);
            io h2 = db0Var.a.h(i);
            int i2 = h.a;
            int i3 = h.d;
            int i4 = h.c;
            int i5 = h.b;
            int i6 = h2.a;
            int i7 = h2.d;
            int i8 = h2.c;
            int i9 = h2.b;
            if (i2 > i6 || i5 > i9 || i4 > i8 || i3 > i7) {
                iArr = iArr2;
                z = true;
            } else {
                iArr = iArr2;
                z = false;
            }
            if (z != (i2 < i6 || i5 < i9 || i4 < i8 || i3 < i7)) {
                if (z) {
                    iArr[0] = iArr[0] | i;
                } else {
                    iArr3[0] = iArr3[0] | i;
                }
            }
            i <<= 1;
            iArr2 = iArr;
        }
        int i10 = iArr2[0];
        int i11 = iArr3[0];
        int i12 = i10 | i11;
        if (i12 == 0) {
            this.b = g;
            return fa0.j(view, windowInsets);
        }
        db0 db0Var2 = this.b;
        ja0 ja0Var = new ja0(i12, (i10 & 8) != 0 ? fa0.e : (i11 & 8) != 0 ? fa0.f : (i10 & 519) != 0 ? fa0.g : (i11 & 519) != 0 ? fa0.h : null, (i12 & 8) != 0 ? 160L : 250L);
        ja0Var.a.e(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(ja0Var.a.b());
        io h3 = ab0Var.h(i12);
        io h4 = db0Var2.a.h(i12);
        int min = Math.min(h3.a, h4.a);
        int i13 = h3.b;
        int i14 = h4.b;
        int min2 = Math.min(i13, i14);
        int i15 = h3.c;
        int i16 = h4.c;
        int min3 = Math.min(i15, i16);
        int i17 = h3.d;
        int i18 = h4.d;
        o4 o4Var = new o4(io.c(min, min2, min3, Math.min(i17, i18)), io.c(Math.max(h3.a, h4.a), Math.max(i13, i14), Math.max(i15, i16), Math.max(i17, i18)), 26);
        fa0.g(view, ja0Var, g, false);
        duration.addUpdateListener(new da0(ja0Var, g, db0Var2, i12, view));
        duration.addListener(new rm(ja0Var, view, 3));
        tv.a(view, new g9(view, ja0Var, o4Var, duration));
        this.b = g;
        return fa0.j(view, windowInsets);
    }
}
