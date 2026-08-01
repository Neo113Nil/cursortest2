package k0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: k0.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0175E extends AnimatorListenerAdapter implements InterfaceC0188k {

    /* renamed from: a, reason: collision with root package name */
    public final View f2753a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2754b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f2755c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2756e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2757f = false;
    public final boolean d = true;

    public C0175E(View view, int i) {
        this.f2753a = view;
        this.f2754b = i;
        this.f2755c = (ViewGroup) view.getParent();
        g(true);
    }

    @Override // k0.InterfaceC0188k
    public final void a() {
        g(false);
        if (this.f2757f) {
            return;
        }
        AbstractC0200w.b(this.f2753a, this.f2754b);
    }

    @Override // k0.InterfaceC0188k
    public final void b(AbstractC0190m abstractC0190m) {
        abstractC0190m.x(this);
    }

    @Override // k0.InterfaceC0188k
    public final void c() {
        g(true);
        if (this.f2757f) {
            return;
        }
        AbstractC0200w.b(this.f2753a, 0);
    }

    @Override // k0.InterfaceC0188k
    public final void d(AbstractC0190m abstractC0190m) {
    }

    @Override // k0.InterfaceC0188k
    public final void e(AbstractC0190m abstractC0190m) {
    }

    public final void g(boolean z2) {
        ViewGroup viewGroup;
        if (!this.d || this.f2756e == z2 || (viewGroup = this.f2755c) == null) {
            return;
        }
        this.f2756e = z2;
        i1.q.j(viewGroup, z2);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f2757f = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f2757f) {
            AbstractC0200w.b(this.f2753a, this.f2754b);
            ViewGroup viewGroup = this.f2755c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        g(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z2) {
        if (z2) {
            AbstractC0200w.b(this.f2753a, 0);
            ViewGroup viewGroup = this.f2755c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z2) {
        if (z2) {
            return;
        }
        if (!this.f2757f) {
            AbstractC0200w.b(this.f2753a, this.f2754b);
            ViewGroup viewGroup = this.f2755c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        g(false);
    }
}
