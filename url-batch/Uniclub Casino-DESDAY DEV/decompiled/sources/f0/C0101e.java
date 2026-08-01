package f0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: f0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0101e extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ X f2056a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2057b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f2058c;
    public final /* synthetic */ int d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f2059e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0105i f2060f;

    public C0101e(C0105i c0105i, X x2, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.f2060f = c0105i;
        this.f2056a = x2;
        this.f2057b = i;
        this.f2058c = view;
        this.d = i2;
        this.f2059e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.f2057b;
        View view = this.f2058c;
        if (i != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.d != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f2059e.setListener(null);
        C0105i c0105i = this.f2060f;
        X x2 = this.f2056a;
        c0105i.c(x2);
        c0105i.f2101p.remove(x2);
        c0105i.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f2060f.getClass();
    }
}
