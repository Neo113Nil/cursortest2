package o0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.luckycounter.drinkwater.R;

/* loaded from: classes.dex */
public final class g extends AnimatorListenerAdapter implements k {

    /* renamed from: a, reason: collision with root package name */
    public final View f3652a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3653b = false;

    public g(View view) {
        this.f3652a = view;
    }

    @Override // o0.k
    public final void a() {
        View view = this.f3652a;
        view.setTag(R.id.transition_pause_alpha, Float.valueOf(view.getVisibility() == 0 ? w.f3701a.q(view) : RecyclerView.f1949A0));
    }

    @Override // o0.k
    public final void b(m mVar) {
    }

    @Override // o0.k
    public final void c(m mVar) {
    }

    @Override // o0.k
    public final void d(m mVar) {
    }

    @Override // o0.k
    public final void e() {
        this.f3652a.setTag(R.id.transition_pause_alpha, null);
    }

    @Override // o0.k
    public final void f(m mVar) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        w.f3701a.x(this.f3652a, 1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.f3652a;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.f3653b = true;
            view.setLayerType(2, null);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z2) {
        boolean z3 = this.f3653b;
        View view = this.f3652a;
        if (z3) {
            view.setLayerType(0, null);
        }
        if (z2) {
            return;
        }
        C0299B c0299b = w.f3701a;
        c0299b.x(view, 1.0f);
        c0299b.getClass();
    }
}
