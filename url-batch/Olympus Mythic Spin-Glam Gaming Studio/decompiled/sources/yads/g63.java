package yads;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.widget.TextView;

/* loaded from: classes8.dex */
public final class g63 implements yd {
    public final int a;
    public final int b;
    public final ArgbEvaluator c;
    public ValueAnimator d;

    public g63(int i) {
        ArgbEvaluator argbEvaluator = new ArgbEvaluator();
        this.a = 500;
        this.b = i;
        this.c = argbEvaluator;
    }

    @Override // yads.yd
    public final void a(TextView textView) {
        ValueAnimator ofObject = ValueAnimator.ofObject(this.c, Integer.valueOf(textView.getCurrentTextColor()), Integer.valueOf(this.b));
        this.d = ofObject;
        f63 f63Var = new f63(textView);
        if (ofObject != null) {
            ofObject.addUpdateListener(f63Var);
        }
        ValueAnimator valueAnimator = this.d;
        if (valueAnimator != null) {
            valueAnimator.setDuration(this.a);
        }
        ValueAnimator valueAnimator2 = this.d;
        if (valueAnimator2 != null) {
            valueAnimator2.start();
        }
    }

    @Override // yads.yd
    public final void cancel() {
        ValueAnimator valueAnimator = this.d;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
        }
        ValueAnimator valueAnimator2 = this.d;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
    }
}
