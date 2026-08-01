package K;

import android.animation.ValueAnimator;
import android.view.View;

/* loaded from: classes.dex */
public final /* synthetic */ class X implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f365a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f366b;

    public /* synthetic */ X(C.g gVar, View view) {
        this.f366b = gVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f365a) {
            case 0:
                ((View) ((g.K) ((C.g) this.f366b).f62b).h.getParent()).invalidate();
                break;
            default:
                M0.l lVar = (M0.l) this.f366b;
                lVar.getClass();
                lVar.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }

    public /* synthetic */ X(M0.l lVar) {
        this.f366b = lVar;
    }
}
