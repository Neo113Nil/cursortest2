package f0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: f0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0102f extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2068a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0103g f2069b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f2070c;
    public final /* synthetic */ View d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0105i f2071e;

    public /* synthetic */ C0102f(C0105i c0105i, C0103g c0103g, ViewPropertyAnimator viewPropertyAnimator, View view, int i) {
        this.f2068a = i;
        this.f2071e = c0105i;
        this.f2069b = c0103g;
        this.f2070c = viewPropertyAnimator;
        this.d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f2068a) {
            case 0:
                this.f2070c.setListener(null);
                View view = this.d;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                C0103g c0103g = this.f2069b;
                X x2 = c0103g.f2077a;
                C0105i c0105i = this.f2071e;
                c0105i.c(x2);
                c0105i.f2103r.remove(c0103g.f2077a);
                c0105i.i();
                break;
            default:
                this.f2070c.setListener(null);
                View view2 = this.d;
                view2.setAlpha(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                C0103g c0103g2 = this.f2069b;
                X x3 = c0103g2.f2078b;
                C0105i c0105i2 = this.f2071e;
                c0105i2.c(x3);
                c0105i2.f2103r.remove(c0103g2.f2078b);
                c0105i2.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f2068a) {
            case 0:
                X x2 = this.f2069b.f2077a;
                this.f2071e.getClass();
                break;
            default:
                X x3 = this.f2069b.f2078b;
                this.f2071e.getClass();
                break;
        }
    }
}
