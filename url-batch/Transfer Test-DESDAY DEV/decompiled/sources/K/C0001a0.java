package K;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: K.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0001a0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f383a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f384b;

    public /* synthetic */ C0001a0(A0.h hVar, View view) {
        this.f384b = hVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f383a) {
            case 0:
                ((View) ((g.I) ((A0.h) this.f384b).f30b).d.getParent()).invalidate();
                break;
            default:
                R0.k kVar = (R0.k) this.f384b;
                kVar.getClass();
                kVar.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }

    public /* synthetic */ C0001a0(R0.k kVar) {
        this.f384b = kVar;
    }
}
