package k0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.FrameLayout;
import com.ratebook.luckyconvert.R;

/* renamed from: k0.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0177F extends AnimatorListenerAdapter implements InterfaceC0189k {

    /* renamed from: a, reason: collision with root package name */
    public final FrameLayout f2742a;

    /* renamed from: b, reason: collision with root package name */
    public final View f2743b;

    /* renamed from: c, reason: collision with root package name */
    public final View f2744c;
    public boolean d = true;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0186h f2745e;

    public C0177F(C0186h c0186h, FrameLayout frameLayout, View view, View view2) {
        this.f2745e = c0186h;
        this.f2742a = frameLayout;
        this.f2743b = view;
        this.f2744c = view2;
    }

    @Override // k0.InterfaceC0189k
    public final void a() {
    }

    @Override // k0.InterfaceC0189k
    public final void b(AbstractC0191m abstractC0191m) {
        abstractC0191m.x(this);
    }

    @Override // k0.InterfaceC0189k
    public final void c() {
    }

    @Override // k0.InterfaceC0189k
    public final void d(AbstractC0191m abstractC0191m) {
    }

    @Override // k0.InterfaceC0189k
    public final void e(AbstractC0191m abstractC0191m) {
        if (this.d) {
            g();
        }
    }

    public final void g() {
        this.f2744c.setTag(R.id.save_overlay_view, null);
        this.f2742a.getOverlay().remove(this.f2743b);
        this.d = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        g();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.f2742a.getOverlay().remove(this.f2743b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.f2743b;
        if (view.getParent() == null) {
            this.f2742a.getOverlay().add(view);
        } else {
            this.f2745e.c();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z2) {
        if (z2) {
            View view = this.f2744c;
            View view2 = this.f2743b;
            view.setTag(R.id.save_overlay_view, view2);
            this.f2742a.getOverlay().add(view2);
            this.d = true;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z2) {
        if (z2) {
            return;
        }
        g();
    }
}
