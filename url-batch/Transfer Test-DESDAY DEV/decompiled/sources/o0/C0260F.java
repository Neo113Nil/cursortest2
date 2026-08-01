package o0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.FrameLayout;
import com.football.transfertrivia.R;

/* renamed from: o0.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0260F extends AnimatorListenerAdapter implements InterfaceC0272k {

    /* renamed from: a, reason: collision with root package name */
    public final FrameLayout f3197a;

    /* renamed from: b, reason: collision with root package name */
    public final View f3198b;

    /* renamed from: c, reason: collision with root package name */
    public final View f3199c;
    public boolean d = true;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0269h f3200e;

    public C0260F(C0269h c0269h, FrameLayout frameLayout, View view, View view2) {
        this.f3200e = c0269h;
        this.f3197a = frameLayout;
        this.f3198b = view;
        this.f3199c = view2;
    }

    @Override // o0.InterfaceC0272k
    public final void a() {
    }

    @Override // o0.InterfaceC0272k
    public final void b(AbstractC0274m abstractC0274m) {
    }

    @Override // o0.InterfaceC0272k
    public final void c(AbstractC0274m abstractC0274m) {
        if (this.d) {
            g();
        }
    }

    @Override // o0.InterfaceC0272k
    public final void d(AbstractC0274m abstractC0274m) {
        abstractC0274m.x(this);
    }

    @Override // o0.InterfaceC0272k
    public final void e() {
    }

    public final void g() {
        this.f3199c.setTag(R.id.save_overlay_view, null);
        this.f3197a.getOverlay().remove(this.f3198b);
        this.d = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        g();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.f3197a.getOverlay().remove(this.f3198b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.f3198b;
        if (view.getParent() == null) {
            this.f3197a.getOverlay().add(view);
        } else {
            this.f3200e.c();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z2) {
        if (z2) {
            View view = this.f3199c;
            View view2 = this.f3198b;
            view.setTag(R.id.save_overlay_view, view2);
            this.f3197a.getOverlay().add(view2);
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
