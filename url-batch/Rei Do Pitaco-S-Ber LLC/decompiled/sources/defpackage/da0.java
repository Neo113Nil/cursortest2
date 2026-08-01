package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class da0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ ja0 a;
    public final /* synthetic */ db0 b;
    public final /* synthetic */ db0 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ View e;

    public da0(ja0 ja0Var, db0 db0Var, db0 db0Var2, int i, View view) {
        this.a = ja0Var;
        this.b = db0Var;
        this.c = db0Var2;
        this.d = i;
        this.e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        ja0 ja0Var = this.a;
        ia0 ia0Var = ja0Var.a;
        ia0Var.e(animatedFraction);
        float c = ia0Var.c();
        PathInterpolator pathInterpolator = fa0.e;
        int i = Build.VERSION.SDK_INT;
        db0 db0Var = this.b;
        ra0 qa0Var = i >= 36 ? new qa0(db0Var) : i >= 35 ? new pa0(db0Var) : i >= 34 ? new oa0(db0Var) : i >= 31 ? new na0(db0Var) : i >= 30 ? new ma0(db0Var) : i >= 29 ? new la0(db0Var) : new ka0(db0Var);
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            int i3 = this.d & i2;
            ab0 ab0Var = db0Var.a;
            if (i3 == 0) {
                qa0Var.d(i2, ab0Var.h(i2));
            } else {
                io h = ab0Var.h(i2);
                io h2 = this.c.a.h(i2);
                float f = 1.0f - c;
                qa0Var.d(i2, db0.e(h, (int) (((h.a - h2.a) * f) + 0.5d), (int) (((h.b - h2.b) * f) + 0.5d), (int) (((h.c - h2.c) * f) + 0.5d), (int) (((h.d - h2.d) * f) + 0.5d)));
            }
        }
        fa0.h(this.e, qa0Var.b(), Collections.singletonList(ja0Var));
    }
}
