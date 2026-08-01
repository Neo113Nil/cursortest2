package f0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: f0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0107k extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2105a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0108l f2106b;

    public C0107k(C0108l c0108l) {
        this.f2106b = c0108l;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f2105a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f2105a) {
            this.f2105a = false;
            return;
        }
        C0108l c0108l = this.f2106b;
        if (((Float) c0108l.f2133z.getAnimatedValue()).floatValue() == 0.0f) {
            c0108l.f2109A = 0;
            c0108l.f(0);
        } else {
            c0108l.f2109A = 2;
            c0108l.f2126s.invalidate();
        }
    }
}
