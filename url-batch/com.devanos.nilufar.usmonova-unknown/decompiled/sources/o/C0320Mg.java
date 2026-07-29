package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;

/* renamed from: o.Mg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0320Mg extends AnimatorListenerAdapter {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ C0346Ng c;

    public C0320Mg(ViewGroup viewGroup, boolean z, RS rs, C0346Ng c0346Ng) {
        this.a = viewGroup;
        this.b = z;
        this.c = c0346Ng;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        AbstractC0048Bt.n(animator, "anim");
        this.a.endViewTransition(null);
        if (!this.b) {
            throw null;
        }
        throw null;
    }
}
