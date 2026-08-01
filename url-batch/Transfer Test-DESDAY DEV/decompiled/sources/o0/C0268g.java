package o0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.football.transfertrivia.R;

/* renamed from: o0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0268g extends AnimatorListenerAdapter implements InterfaceC0272k {

    /* renamed from: a, reason: collision with root package name */
    public final View f3225a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3226b = false;

    public C0268g(View view) {
        this.f3225a = view;
    }

    @Override // o0.InterfaceC0272k
    public final void a() {
        View view = this.f3225a;
        view.setTag(R.id.transition_pause_alpha, Float.valueOf(view.getVisibility() == 0 ? w.f3274a.e(view) : RecyclerView.f1570A0));
    }

    @Override // o0.InterfaceC0272k
    public final void b(AbstractC0274m abstractC0274m) {
    }

    @Override // o0.InterfaceC0272k
    public final void c(AbstractC0274m abstractC0274m) {
    }

    @Override // o0.InterfaceC0272k
    public final void d(AbstractC0274m abstractC0274m) {
    }

    @Override // o0.InterfaceC0272k
    public final void e() {
        this.f3225a.setTag(R.id.transition_pause_alpha, null);
    }

    @Override // o0.InterfaceC0272k
    public final void f(AbstractC0274m abstractC0274m) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        w.f3274a.n(this.f3225a, 1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.f3225a;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.f3226b = true;
            view.setLayerType(2, null);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z2) {
        boolean z3 = this.f3226b;
        View view = this.f3225a;
        if (z3) {
            view.setLayerType(0, null);
        }
        if (z2) {
            return;
        }
        C0257C c0257c = w.f3274a;
        c0257c.n(view, 1.0f);
        c0257c.getClass();
    }
}
