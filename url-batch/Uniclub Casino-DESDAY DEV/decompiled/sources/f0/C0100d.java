package f0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: f0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0100d extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2049a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ X f2050b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f2051c;
    public final /* synthetic */ ViewPropertyAnimator d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0105i f2052e;

    public C0100d(C0105i c0105i, X x2, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f2052e = c0105i;
        this.f2050b = x2;
        this.d = viewPropertyAnimator;
        this.f2051c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f2049a) {
            case 1:
                this.f2051c.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f2049a) {
            case 0:
                this.d.setListener(null);
                this.f2051c.setAlpha(1.0f);
                C0105i c0105i = this.f2052e;
                X x2 = this.f2050b;
                c0105i.c(x2);
                c0105i.f2102q.remove(x2);
                c0105i.i();
                break;
            default:
                this.d.setListener(null);
                C0105i c0105i2 = this.f2052e;
                X x3 = this.f2050b;
                c0105i2.c(x3);
                c0105i2.f2100o.remove(x3);
                c0105i2.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f2049a) {
            case 0:
                this.f2052e.getClass();
                break;
            default:
                this.f2052e.getClass();
                break;
        }
    }

    public C0100d(C0105i c0105i, X x2, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f2052e = c0105i;
        this.f2050b = x2;
        this.f2051c = view;
        this.d = viewPropertyAnimator;
    }
}
