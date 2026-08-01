package g0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: g0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0151d extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2860a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Z f2861b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f2862c;
    public final /* synthetic */ ViewPropertyAnimator d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0156i f2863e;

    public C0151d(C0156i c0156i, Z z2, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f2863e = c0156i;
        this.f2861b = z2;
        this.d = viewPropertyAnimator;
        this.f2862c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f2860a) {
            case 1:
                this.f2862c.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f2860a) {
            case 0:
                this.d.setListener(null);
                this.f2862c.setAlpha(1.0f);
                C0156i c0156i = this.f2863e;
                Z z2 = this.f2861b;
                c0156i.c(z2);
                c0156i.f2913q.remove(z2);
                c0156i.i();
                break;
            default:
                this.d.setListener(null);
                C0156i c0156i2 = this.f2863e;
                Z z3 = this.f2861b;
                c0156i2.c(z3);
                c0156i2.f2911o.remove(z3);
                c0156i2.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f2860a) {
            case 0:
                this.f2863e.getClass();
                break;
            default:
                this.f2863e.getClass();
                break;
        }
    }

    public C0151d(C0156i c0156i, Z z2, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f2863e = c0156i;
        this.f2861b = z2;
        this.f2862c = view;
        this.d = viewPropertyAnimator;
    }
}
