package defpackage;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class zt implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float a;
    public final /* synthetic */ bu b;

    public zt(bu buVar, float f) {
        this.b = buVar;
        this.a = f;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.b.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.a);
    }
}
