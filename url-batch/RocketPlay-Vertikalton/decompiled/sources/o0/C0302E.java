package o0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.FrameLayout;
import com.luckycounter.drinkwater.R;

/* renamed from: o0.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0302E extends AnimatorListenerAdapter implements k {

    /* renamed from: a, reason: collision with root package name */
    public final FrameLayout f3624a;

    /* renamed from: b, reason: collision with root package name */
    public final View f3625b;

    /* renamed from: c, reason: collision with root package name */
    public final View f3626c;
    public boolean d = true;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h f3627e;

    public C0302E(h hVar, FrameLayout frameLayout, View view, View view2) {
        this.f3627e = hVar;
        this.f3624a = frameLayout;
        this.f3625b = view;
        this.f3626c = view2;
    }

    @Override // o0.k
    public final void a() {
    }

    @Override // o0.k
    public final void b(m mVar) {
    }

    @Override // o0.k
    public final void c(m mVar) {
        if (this.d) {
            g();
        }
    }

    @Override // o0.k
    public final void d(m mVar) {
        mVar.x(this);
    }

    @Override // o0.k
    public final void e() {
    }

    public final void g() {
        this.f3626c.setTag(R.id.save_overlay_view, null);
        this.f3624a.getOverlay().remove(this.f3625b);
        this.d = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        g();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.f3624a.getOverlay().remove(this.f3625b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.f3625b;
        if (view.getParent() == null) {
            this.f3624a.getOverlay().add(view);
        } else {
            this.f3627e.c();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z2) {
        if (z2) {
            View view = this.f3626c;
            View view2 = this.f3625b;
            view.setTag(R.id.save_overlay_view, view2);
            this.f3624a.getOverlay().add(view2);
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
