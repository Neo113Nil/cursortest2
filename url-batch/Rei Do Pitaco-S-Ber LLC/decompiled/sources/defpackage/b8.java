package defpackage;

import android.animation.ValueAnimator;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class b8 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b8(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ls lsVar = ((BottomSheetBehavior) obj).j;
                if (lsVar != null) {
                    js jsVar = lsVar.g;
                    if (jsVar.i != floatValue) {
                        jsVar.i = floatValue;
                        lsVar.k = true;
                        lsVar.l = true;
                        lsVar.invalidateSelf();
                        break;
                    }
                }
                break;
            case 1:
                int floatValue2 = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                ti tiVar = (ti) obj;
                tiVar.c.setAlpha(floatValue2);
                tiVar.d.setAlpha(floatValue2);
                tiVar.s.invalidate();
                break;
            case 2:
                ((TextInputLayout) obj).B0.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                TextView textView = (TextView) obj;
                textView.setScaleX(floatValue3);
                textView.setScaleY(floatValue3);
                break;
        }
    }
}
