package g0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: g0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0117f extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Z f2435a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2436b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f2437c;
    public final /* synthetic */ int d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f2438e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0121j f2439f;

    public C0117f(C0121j c0121j, Z z2, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.f2439f = c0121j;
        this.f2435a = z2;
        this.f2436b = i;
        this.f2437c = view;
        this.d = i2;
        this.f2438e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.f2436b;
        View view = this.f2437c;
        if (i != 0) {
            view.setTranslationX(RecyclerView.f1570A0);
        }
        if (this.d != 0) {
            view.setTranslationY(RecyclerView.f1570A0);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f2438e.setListener(null);
        C0121j c0121j = this.f2439f;
        Z z2 = this.f2435a;
        c0121j.c(z2);
        c0121j.f2480p.remove(z2);
        c0121j.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f2439f.getClass();
    }
}
