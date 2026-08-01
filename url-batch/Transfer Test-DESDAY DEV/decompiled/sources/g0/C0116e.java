package g0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: g0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0116e extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2430a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Z f2431b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f2432c;
    public final /* synthetic */ ViewPropertyAnimator d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0121j f2433e;

    public C0116e(C0121j c0121j, Z z2, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f2433e = c0121j;
        this.f2431b = z2;
        this.d = viewPropertyAnimator;
        this.f2432c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f2430a) {
            case 1:
                this.f2432c.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f2430a) {
            case 0:
                this.d.setListener(null);
                this.f2432c.setAlpha(1.0f);
                C0121j c0121j = this.f2433e;
                Z z2 = this.f2431b;
                c0121j.c(z2);
                c0121j.f2481q.remove(z2);
                c0121j.i();
                break;
            default:
                this.d.setListener(null);
                C0121j c0121j2 = this.f2433e;
                Z z3 = this.f2431b;
                c0121j2.c(z3);
                c0121j2.f2479o.remove(z3);
                c0121j2.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f2430a) {
            case 0:
                this.f2433e.getClass();
                break;
            default:
                this.f2433e.getClass();
                break;
        }
    }

    public C0116e(C0121j c0121j, Z z2, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f2433e = c0121j;
        this.f2431b = z2;
        this.f2432c = view;
        this.d = viewPropertyAnimator;
    }
}
