package K;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* loaded from: classes.dex */
public final class d0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k0 f400a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0 f401b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x0 f402c;
    public final /* synthetic */ int d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ View f403e;

    public d0(k0 k0Var, x0 x0Var, x0 x0Var2, int i, View view) {
        this.f400a = k0Var;
        this.f401b = x0Var;
        this.f402c = x0Var2;
        this.d = i;
        this.f403e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f2;
        k0 k0Var;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        k0 k0Var2 = this.f400a;
        k0Var2.f428a.d(animatedFraction);
        float b2 = k0Var2.f428a.b();
        PathInterpolator pathInterpolator = g0.f411e;
        int i = Build.VERSION.SDK_INT;
        x0 x0Var = this.f401b;
        p0 o0Var = i >= 30 ? new o0(x0Var) : i >= 29 ? new n0(x0Var) : new m0(x0Var);
        int i2 = 1;
        while (i2 <= 256) {
            int i3 = this.d & i2;
            v0 v0Var = x0Var.f468a;
            if (i3 == 0) {
                o0Var.c(i2, v0Var.f(i2));
                f2 = b2;
                k0Var = k0Var2;
            } else {
                C.d f3 = v0Var.f(i2);
                C.d f4 = this.f402c.f468a.f(i2);
                int i4 = (int) (((f3.f148a - f4.f148a) * r10) + 0.5d);
                int i5 = (int) (((f3.f149b - f4.f149b) * r10) + 0.5d);
                f2 = b2;
                int i6 = (int) (((f3.f150c - f4.f150c) * r10) + 0.5d);
                float f5 = (f3.d - f4.d) * (1.0f - b2);
                k0Var = k0Var2;
                o0Var.c(i2, x0.e(f3, i4, i5, i6, (int) (f5 + 0.5d)));
            }
            i2 <<= 1;
            b2 = f2;
            k0Var2 = k0Var;
        }
        g0.g(this.f403e, o0Var.b(), Collections.singletonList(k0Var2));
    }
}
