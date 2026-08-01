package g0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: g0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0118g extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2443a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0119h f2444b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f2445c;
    public final /* synthetic */ View d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0121j f2446e;

    public /* synthetic */ C0118g(C0121j c0121j, C0119h c0119h, ViewPropertyAnimator viewPropertyAnimator, View view, int i) {
        this.f2443a = i;
        this.f2446e = c0121j;
        this.f2444b = c0119h;
        this.f2445c = viewPropertyAnimator;
        this.d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f2443a) {
            case 0:
                this.f2445c.setListener(null);
                View view = this.d;
                view.setAlpha(1.0f);
                view.setTranslationX(RecyclerView.f1570A0);
                view.setTranslationY(RecyclerView.f1570A0);
                C0119h c0119h = this.f2444b;
                Z z2 = c0119h.f2454a;
                C0121j c0121j = this.f2446e;
                c0121j.c(z2);
                c0121j.f2482r.remove(c0119h.f2454a);
                c0121j.i();
                break;
            default:
                this.f2445c.setListener(null);
                View view2 = this.d;
                view2.setAlpha(1.0f);
                view2.setTranslationX(RecyclerView.f1570A0);
                view2.setTranslationY(RecyclerView.f1570A0);
                C0119h c0119h2 = this.f2444b;
                Z z3 = c0119h2.f2455b;
                C0121j c0121j2 = this.f2446e;
                c0121j2.c(z3);
                c0121j2.f2482r.remove(c0119h2.f2455b);
                c0121j2.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f2443a) {
            case 0:
                Z z2 = this.f2444b.f2454a;
                this.f2446e.getClass();
                break;
            default:
                Z z3 = this.f2444b.f2455b;
                this.f2446e.getClass();
                break;
        }
    }
}
