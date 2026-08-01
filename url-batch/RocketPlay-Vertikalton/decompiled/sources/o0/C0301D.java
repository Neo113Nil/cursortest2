package o0;

import a1.AbstractC0067d;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: o0.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0301D extends AnimatorListenerAdapter implements k {

    /* renamed from: a, reason: collision with root package name */
    public final View f3619a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3620b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f3621c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3622e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3623f = false;
    public final boolean d = true;

    public C0301D(View view, int i) {
        this.f3619a = view;
        this.f3620b = i;
        this.f3621c = (ViewGroup) view.getParent();
        g(true);
    }

    @Override // o0.k
    public final void a() {
        g(false);
        if (this.f3623f) {
            return;
        }
        w.b(this.f3619a, this.f3620b);
    }

    @Override // o0.k
    public final void b(m mVar) {
    }

    @Override // o0.k
    public final void c(m mVar) {
    }

    @Override // o0.k
    public final void d(m mVar) {
        mVar.x(this);
    }

    @Override // o0.k
    public final void e() {
        g(true);
        if (this.f3623f) {
            return;
        }
        w.b(this.f3619a, 0);
    }

    public final void g(boolean z2) {
        ViewGroup viewGroup;
        if (!this.d || this.f3622e == z2 || (viewGroup = this.f3621c) == null) {
            return;
        }
        this.f3622e = z2;
        AbstractC0067d.u(viewGroup, z2);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f3623f = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f3623f) {
            w.b(this.f3619a, this.f3620b);
            ViewGroup viewGroup = this.f3621c;
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
            w.b(this.f3619a, 0);
            ViewGroup viewGroup = this.f3621c;
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
        if (!this.f3623f) {
            w.b(this.f3619a, this.f3620b);
            ViewGroup viewGroup = this.f3621c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        g(false);
    }
}
