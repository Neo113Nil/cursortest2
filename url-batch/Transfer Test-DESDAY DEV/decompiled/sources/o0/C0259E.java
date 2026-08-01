package o0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: o0.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0259E extends AnimatorListenerAdapter implements InterfaceC0272k {

    /* renamed from: a, reason: collision with root package name */
    public final View f3192a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3193b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f3194c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3195e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3196f = false;
    public final boolean d = true;

    public C0259E(View view, int i) {
        this.f3192a = view;
        this.f3193b = i;
        this.f3194c = (ViewGroup) view.getParent();
        g(true);
    }

    @Override // o0.InterfaceC0272k
    public final void a() {
        g(false);
        if (this.f3196f) {
            return;
        }
        w.b(this.f3192a, this.f3193b);
    }

    @Override // o0.InterfaceC0272k
    public final void b(AbstractC0274m abstractC0274m) {
    }

    @Override // o0.InterfaceC0272k
    public final void c(AbstractC0274m abstractC0274m) {
    }

    @Override // o0.InterfaceC0272k
    public final void d(AbstractC0274m abstractC0274m) {
        abstractC0274m.x(this);
    }

    @Override // o0.InterfaceC0272k
    public final void e() {
        g(true);
        if (this.f3196f) {
            return;
        }
        w.b(this.f3192a, 0);
    }

    public final void g(boolean z2) {
        ViewGroup viewGroup;
        if (!this.d || this.f3195e == z2 || (viewGroup = this.f3194c) == null) {
            return;
        }
        this.f3195e = z2;
        h0.f.r(viewGroup, z2);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f3196f = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f3196f) {
            w.b(this.f3192a, this.f3193b);
            ViewGroup viewGroup = this.f3194c;
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
            w.b(this.f3192a, 0);
            ViewGroup viewGroup = this.f3194c;
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
        if (!this.f3196f) {
            w.b(this.f3192a, this.f3193b);
            ViewGroup viewGroup = this.f3194c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        g(false);
    }
}
