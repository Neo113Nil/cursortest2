package g0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: g0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0158k extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2923a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0159l f2924b;

    public C0158k(C0159l c0159l) {
        this.f2924b = c0159l;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f2923a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f2923a) {
            this.f2923a = false;
            return;
        }
        C0159l c0159l = this.f2924b;
        if (((Float) c0159l.f2951z.getAnimatedValue()).floatValue() == RecyclerView.f1949A0) {
            c0159l.f2927A = 0;
            c0159l.f(0);
        } else {
            c0159l.f2927A = 2;
            c0159l.f2944s.invalidate();
        }
    }
}
