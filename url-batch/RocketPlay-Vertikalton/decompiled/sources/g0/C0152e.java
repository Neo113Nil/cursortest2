package g0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: g0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0152e extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Z f2870a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2871b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f2872c;
    public final /* synthetic */ int d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f2873e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0156i f2874f;

    public C0152e(C0156i c0156i, Z z2, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.f2874f = c0156i;
        this.f2870a = z2;
        this.f2871b = i;
        this.f2872c = view;
        this.d = i2;
        this.f2873e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.f2871b;
        View view = this.f2872c;
        if (i != 0) {
            view.setTranslationX(RecyclerView.f1949A0);
        }
        if (this.d != 0) {
            view.setTranslationY(RecyclerView.f1949A0);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f2873e.setListener(null);
        C0156i c0156i = this.f2874f;
        Z z2 = this.f2870a;
        c0156i.c(z2);
        c0156i.f2912p.remove(z2);
        c0156i.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f2874f.getClass();
    }
}
