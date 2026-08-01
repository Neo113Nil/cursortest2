package f0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: f0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0090f extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2066a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0091g f2067b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f2068c;
    public final /* synthetic */ View d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0093i f2069e;

    public /* synthetic */ C0090f(C0093i c0093i, C0091g c0091g, ViewPropertyAnimator viewPropertyAnimator, View view, int i) {
        this.f2066a = i;
        this.f2069e = c0093i;
        this.f2067b = c0091g;
        this.f2068c = viewPropertyAnimator;
        this.d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f2066a) {
            case 0:
                this.f2068c.setListener(null);
                View view = this.d;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                C0091g c0091g = this.f2067b;
                X x2 = c0091g.f2075a;
                C0093i c0093i = this.f2069e;
                c0093i.c(x2);
                c0093i.f2101r.remove(c0091g.f2075a);
                c0093i.i();
                break;
            default:
                this.f2068c.setListener(null);
                View view2 = this.d;
                view2.setAlpha(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                C0091g c0091g2 = this.f2067b;
                X x3 = c0091g2.f2076b;
                C0093i c0093i2 = this.f2069e;
                c0093i2.c(x3);
                c0093i2.f2101r.remove(c0091g2.f2076b);
                c0093i2.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f2066a) {
            case 0:
                X x2 = this.f2067b.f2075a;
                this.f2069e.getClass();
                break;
            default:
                X x3 = this.f2067b.f2076b;
                this.f2069e.getClass();
                break;
        }
    }
}
