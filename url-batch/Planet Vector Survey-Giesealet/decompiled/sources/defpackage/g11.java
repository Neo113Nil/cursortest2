package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import com.vectorharbor.planetvectorsurvey.R;
import java.util.Objects;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class g11 implements View.OnApplyWindowInsetsListener {
    public final c11 a;
    public d21 b;

    public g11(View view, c11 c11Var) {
        d21 d21Var;
        this.a = c11Var;
        int i = c01.a;
        d21 a = yz0.a(view);
        if (a != null) {
            int i2 = Build.VERSION.SDK_INT;
            d21Var = (i2 >= 34 ? new q11(a) : i2 >= 31 ? new p11(a) : i2 >= 30 ? new o11(a) : i2 >= 29 ? new n11(a) : new m11(a)).b();
        } else {
            d21Var = null;
        }
        this.b = d21Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        int[] iArr;
        boolean z;
        if (!view.isLaidOut()) {
            this.b = d21.c(windowInsets, view);
            return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }
        d21 c = d21.c(windowInsets, view);
        z11 z11Var = c.a;
        if (this.b == null) {
            int i = c01.a;
            this.b = yz0.a(view);
        }
        if (this.b == null) {
            this.b = c;
            if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                return view.onApplyWindowInsets(windowInsets);
            }
        } else {
            c11 j = h11.j(view);
            if (j == null || !Objects.equals(j.d, c)) {
                int[] iArr2 = new int[1];
                int[] iArr3 = new int[1];
                d21 d21Var = this.b;
                int i2 = 1;
                while (i2 <= 512) {
                    oy f = z11Var.f(i2);
                    oy f2 = d21Var.a.f(i2);
                    int i3 = f.a;
                    int i4 = f.d;
                    int i5 = f.c;
                    int i6 = f.b;
                    int i7 = f2.a;
                    int i8 = f2.d;
                    int[] iArr4 = iArr2;
                    int i9 = f2.c;
                    int i10 = f2.b;
                    if (i3 > i7 || i6 > i10 || i5 > i9 || i4 > i8) {
                        iArr = iArr3;
                        z = true;
                    } else {
                        iArr = iArr3;
                        z = false;
                    }
                    if (z != (i3 < i7 || i6 < i10 || i5 < i9 || i4 < i8)) {
                        if (z) {
                            iArr4[0] = iArr4[0] | i2;
                        } else {
                            iArr[0] = iArr[0] | i2;
                        }
                    }
                    i2 <<= 1;
                    iArr2 = iArr4;
                    iArr3 = iArr;
                }
                int i11 = iArr2[0];
                int i12 = iArr3[0];
                int i13 = i11 | i12;
                if (i13 == 0) {
                    this.b = c;
                    if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                        return view.onApplyWindowInsets(windowInsets);
                    }
                } else {
                    d21 d21Var2 = this.b;
                    l11 l11Var = new l11(i13, (i11 & 8) != 0 ? h11.e : (i12 & 8) != 0 ? h11.f : (i11 & 519) != 0 ? h11.g : (i12 & 519) != 0 ? h11.h : null, (i13 & 8) != 0 ? 160L : 250L);
                    l11Var.a.e(0.0f);
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(l11Var.a.b());
                    oy f3 = z11Var.f(i13);
                    oy f4 = d21Var2.a.f(i13);
                    int min = Math.min(f3.a, f4.a);
                    int i14 = f3.b;
                    int i15 = f4.b;
                    int min2 = Math.min(i14, i15);
                    int i16 = f3.c;
                    int i17 = f4.c;
                    int min3 = Math.min(i16, i17);
                    int i18 = f3.d;
                    int i19 = f4.d;
                    j3 j3Var = new j3(17, oy.c(min, min2, min3, Math.min(i18, i19)), oy.c(Math.max(f3.a, f4.a), Math.max(i14, i15), Math.max(i16, i17), Math.max(i18, i19)));
                    h11.g(view, l11Var, c, false);
                    duration.addUpdateListener(new d11(l11Var, c, d21Var2, i13, view));
                    duration.addListener(new e11(l11Var, view));
                    ib0 ib0Var = new ib0(view, new f11(view, l11Var, j3Var, duration));
                    view.getViewTreeObserver().addOnPreDrawListener(ib0Var);
                    view.addOnAttachStateChangeListener(ib0Var);
                    this.b = c;
                    if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                        return view.onApplyWindowInsets(windowInsets);
                    }
                }
            } else if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                return view.onApplyWindowInsets(windowInsets);
            }
        }
        return windowInsets;
    }
}
