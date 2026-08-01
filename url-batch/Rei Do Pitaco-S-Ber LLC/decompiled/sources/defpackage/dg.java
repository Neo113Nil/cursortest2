package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import com.ionia.reidopitaco.libya.MainActivity2;
import java.util.List;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class dg implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dg(uv uvVar, View view) {
        this.a = 2;
        this.b = uvVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((hg) obj).d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                List list = MainActivity2.O;
                valueAnimator.getClass();
                Object animatedValue = valueAnimator.getAnimatedValue();
                animatedValue.getClass();
                ((TextView) obj).setText(String.valueOf(((Integer) animatedValue).intValue()));
                break;
            default:
                ((View) ((ca0) ((uv) obj).f).d.getParent()).invalidate();
                break;
        }
    }

    public /* synthetic */ dg(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
