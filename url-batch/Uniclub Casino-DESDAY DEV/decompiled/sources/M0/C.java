package M0;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import f0.C0108l;

/* loaded from: classes.dex */
public final class C implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f498a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f499b;

    public /* synthetic */ C(int i, Object obj) {
        this.f498a = i;
        this.f499b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f498a) {
            case 0:
                ((TextInputLayout) this.f499b).f1830v0.k(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                C0108l c0108l = (C0108l) this.f499b;
                c0108l.f2113c.setAlpha(floatValue);
                c0108l.d.setAlpha(floatValue);
                c0108l.f2126s.invalidate();
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                J0.g gVar = ((BottomSheetBehavior) this.f499b).i;
                if (gVar != null) {
                    J0.f fVar = gVar.f280a;
                    if (fVar.i != floatValue2) {
                        fVar.i = floatValue2;
                        gVar.f283e = true;
                        gVar.invalidateSelf();
                        break;
                    }
                }
                break;
        }
    }
}
