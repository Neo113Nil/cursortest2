package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class d11 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ l11 a;
    public final /* synthetic */ d21 b;
    public final /* synthetic */ d21 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ View e;

    public d11(l11 l11Var, d21 d21Var, d21 d21Var2, int i, View view) {
        this.a = l11Var;
        this.b = d21Var;
        this.c = d21Var2;
        this.d = i;
        this.e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        l11 l11Var = this.a;
        k11 k11Var = l11Var.a;
        k11Var.e(animatedFraction);
        float c = k11Var.c();
        PathInterpolator pathInterpolator = h11.e;
        int i = Build.VERSION.SDK_INT;
        d21 d21Var = this.b;
        r11 q11Var = i >= 34 ? new q11(d21Var) : i >= 31 ? new p11(d21Var) : i >= 30 ? new o11(d21Var) : i >= 29 ? new n11(d21Var) : new m11(d21Var);
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            int i3 = this.d & i2;
            z11 z11Var = d21Var.a;
            if (i3 == 0) {
                q11Var.c(i2, z11Var.f(i2));
            } else {
                oy f = z11Var.f(i2);
                oy f2 = this.c.a.f(i2);
                float f3 = 1.0f - c;
                q11Var.c(i2, d21.a(f, (int) (((f.a - f2.a) * f3) + 0.5d), (int) (((f.b - f2.b) * f3) + 0.5d), (int) (((f.c - f2.c) * f3) + 0.5d), (int) (((f.d - f2.d) * f3) + 0.5d)));
            }
        }
        h11.h(this.e, q11Var.b(), Collections.singletonList(l11Var));
    }
}
