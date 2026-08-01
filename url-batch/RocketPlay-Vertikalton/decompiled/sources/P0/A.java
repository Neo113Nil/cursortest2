package P0;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import g0.C0159l;

/* loaded from: classes.dex */
public final class A implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f917a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f918b;

    public /* synthetic */ A(int i, Object obj) {
        this.f917a = i;
        this.f918b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f917a) {
            case 0:
                ((TextInputLayout) this.f918b).f2420v0.k(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                C0159l c0159l = (C0159l) this.f918b;
                c0159l.f2931c.setAlpha(floatValue);
                c0159l.d.setAlpha(floatValue);
                c0159l.f2944s.invalidate();
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                M0.g gVar = ((BottomSheetBehavior) this.f918b).i;
                if (gVar != null) {
                    M0.f fVar = gVar.f828a;
                    if (fVar.i != floatValue2) {
                        fVar.i = floatValue2;
                        gVar.f831e = true;
                        gVar.invalidateSelf();
                        break;
                    }
                }
                break;
        }
    }
}
