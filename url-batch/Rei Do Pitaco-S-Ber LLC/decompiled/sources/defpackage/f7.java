package defpackage;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class f7 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ n7 b;

    public /* synthetic */ f7(n7 n7Var, int i) {
        this.a = i;
        this.b = n7Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        n7 n7Var = this.b;
        switch (i) {
            case 0:
                n7Var.i.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m7 m7Var = n7Var.i;
                m7Var.setScaleX(floatValue);
                m7Var.setScaleY(floatValue);
                break;
            case 2:
                n7Var.i.setTranslationY(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            default:
                n7Var.i.setTranslationY(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
        }
    }
}
