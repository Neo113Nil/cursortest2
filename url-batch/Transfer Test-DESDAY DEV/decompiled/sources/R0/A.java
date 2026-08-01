package R0;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import g0.C0124m;

/* loaded from: classes.dex */
public final class A implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f651a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f652b;

    public /* synthetic */ A(int i, Object obj) {
        this.f651a = i;
        this.f652b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f651a) {
            case 0:
                ((TextInputLayout) this.f652b).f2054v0.k(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                C0124m c0124m = (C0124m) this.f652b;
                c0124m.f2495c.setAlpha(floatValue);
                c0124m.d.setAlpha(floatValue);
                c0124m.f2508s.invalidate();
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                O0.g gVar = ((BottomSheetBehavior) this.f652b).i;
                if (gVar != null) {
                    O0.f fVar = gVar.f532a;
                    if (fVar.i != floatValue2) {
                        fVar.i = floatValue2;
                        gVar.f535e = true;
                        gVar.invalidateSelf();
                        break;
                    }
                }
                break;
        }
    }
}
