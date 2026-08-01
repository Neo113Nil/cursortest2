package k0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: k0.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0186E extends AnimatorListenerAdapter implements k {

    /* renamed from: a, reason: collision with root package name */
    public final View f2762a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2763b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f2764c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2765e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2766f = false;
    public final boolean d = true;

    public C0186E(View view, int i) {
        this.f2762a = view;
        this.f2763b = i;
        this.f2764c = (ViewGroup) view.getParent();
        g(true);
    }

    @Override // k0.k
    public final void a() {
        g(false);
        if (this.f2766f) {
            return;
        }
        w.b(this.f2762a, this.f2763b);
    }

    @Override // k0.k
    public final void b(m mVar) {
        mVar.x(this);
    }

    @Override // k0.k
    public final void c() {
        g(true);
        if (this.f2766f) {
            return;
        }
        w.b(this.f2762a, 0);
    }

    @Override // k0.k
    public final void d(m mVar) {
    }

    @Override // k0.k
    public final void e(m mVar) {
    }

    public final void g(boolean z2) {
        ViewGroup viewGroup;
        if (!this.d || this.f2765e == z2 || (viewGroup = this.f2764c) == null) {
            return;
        }
        this.f2765e = z2;
        i1.r.i(viewGroup, z2);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f2766f = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f2766f) {
            w.b(this.f2762a, this.f2763b);
            ViewGroup viewGroup = this.f2764c;
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
            w.b(this.f2762a, 0);
            ViewGroup viewGroup = this.f2764c;
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
        if (!this.f2766f) {
            w.b(this.f2762a, this.f2763b);
            ViewGroup viewGroup = this.f2764c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        g(false);
    }
}
