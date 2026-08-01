package K;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: K.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0006a0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f645a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f646b;

    public /* synthetic */ C0006a0(A1.d dVar, View view) {
        this.f646b = dVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f645a) {
            case 0:
                ((View) ((g.J) ((A1.d) this.f646b).f38b).f2610g.getParent()).invalidate();
                break;
            default:
                P0.k kVar = (P0.k) this.f646b;
                kVar.getClass();
                kVar.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }

    public /* synthetic */ C0006a0(P0.k kVar) {
        this.f646b = kVar;
    }
}
