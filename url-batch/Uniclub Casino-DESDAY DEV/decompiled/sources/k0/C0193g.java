package k0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.fortuneodd.shadegrid.R;

/* renamed from: k0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0193g extends AnimatorListenerAdapter implements k {

    /* renamed from: a, reason: collision with root package name */
    public final View f2795a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2796b = false;

    public C0193g(View view) {
        this.f2795a = view;
    }

    @Override // k0.k
    public final void a() {
        View view = this.f2795a;
        view.setTag(R.id.transition_pause_alpha, Float.valueOf(view.getVisibility() == 0 ? w.f2844a.l(view) : 0.0f));
    }

    @Override // k0.k
    public final void b(m mVar) {
    }

    @Override // k0.k
    public final void c() {
        this.f2795a.setTag(R.id.transition_pause_alpha, null);
    }

    @Override // k0.k
    public final void d(m mVar) {
    }

    @Override // k0.k
    public final void e(m mVar) {
    }

    @Override // k0.k
    public final void f(m mVar) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        w.f2844a.u(this.f2795a, 1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.f2795a;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.f2796b = true;
            view.setLayerType(2, null);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z2) {
        boolean z3 = this.f2796b;
        View view = this.f2795a;
        if (z3) {
            view.setLayerType(0, null);
        }
        if (z2) {
            return;
        }
        C0184C c0184c = w.f2844a;
        c0184c.u(view, 1.0f);
        c0184c.getClass();
    }
}
