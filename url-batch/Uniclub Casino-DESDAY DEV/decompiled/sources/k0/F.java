package k0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.FrameLayout;
import com.fortuneodd.shadegrid.R;

/* loaded from: classes.dex */
public final class F extends AnimatorListenerAdapter implements k {

    /* renamed from: a, reason: collision with root package name */
    public final FrameLayout f2767a;

    /* renamed from: b, reason: collision with root package name */
    public final View f2768b;

    /* renamed from: c, reason: collision with root package name */
    public final View f2769c;
    public boolean d = true;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h f2770e;

    public F(h hVar, FrameLayout frameLayout, View view, View view2) {
        this.f2770e = hVar;
        this.f2767a = frameLayout;
        this.f2768b = view;
        this.f2769c = view2;
    }

    @Override // k0.k
    public final void a() {
    }

    @Override // k0.k
    public final void b(m mVar) {
        mVar.x(this);
    }

    @Override // k0.k
    public final void c() {
    }

    @Override // k0.k
    public final void d(m mVar) {
    }

    @Override // k0.k
    public final void e(m mVar) {
        if (this.d) {
            g();
        }
    }

    public final void g() {
        this.f2769c.setTag(R.id.save_overlay_view, null);
        this.f2767a.getOverlay().remove(this.f2768b);
        this.d = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        g();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.f2767a.getOverlay().remove(this.f2768b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.f2768b;
        if (view.getParent() == null) {
            this.f2767a.getOverlay().add(view);
        } else {
            this.f2770e.c();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z2) {
        if (z2) {
            View view = this.f2769c;
            View view2 = this.f2768b;
            view.setTag(R.id.save_overlay_view, view2);
            this.f2767a.getOverlay().add(view2);
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
