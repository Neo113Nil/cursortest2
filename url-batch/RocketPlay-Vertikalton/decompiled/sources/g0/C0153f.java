package g0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: g0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0153f extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2876a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0154g f2877b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f2878c;
    public final /* synthetic */ View d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0156i f2879e;

    public /* synthetic */ C0153f(C0156i c0156i, C0154g c0154g, ViewPropertyAnimator viewPropertyAnimator, View view, int i) {
        this.f2876a = i;
        this.f2879e = c0156i;
        this.f2877b = c0154g;
        this.f2878c = viewPropertyAnimator;
        this.d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f2876a) {
            case 0:
                this.f2878c.setListener(null);
                View view = this.d;
                view.setAlpha(1.0f);
                view.setTranslationX(RecyclerView.f1949A0);
                view.setTranslationY(RecyclerView.f1949A0);
                C0154g c0154g = this.f2877b;
                Z z2 = c0154g.f2883a;
                C0156i c0156i = this.f2879e;
                c0156i.c(z2);
                c0156i.f2914r.remove(c0154g.f2883a);
                c0156i.i();
                break;
            default:
                this.f2878c.setListener(null);
                View view2 = this.d;
                view2.setAlpha(1.0f);
                view2.setTranslationX(RecyclerView.f1949A0);
                view2.setTranslationY(RecyclerView.f1949A0);
                C0154g c0154g2 = this.f2877b;
                Z z3 = c0154g2.f2884b;
                C0156i c0156i2 = this.f2879e;
                c0156i2.c(z3);
                c0156i2.f2914r.remove(c0154g2.f2884b);
                c0156i2.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f2876a) {
            case 0:
                Z z2 = this.f2877b.f2883a;
                this.f2879e.getClass();
                break;
            default:
                Z z3 = this.f2877b.f2884b;
                this.f2879e.getClass();
                break;
        }
    }
}
