package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class me extends AnimatorListenerAdapter {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ View b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ u20 d;
    public final /* synthetic */ pe e;

    public me(ViewGroup viewGroup, View view, boolean z, u20 u20Var, pe peVar) {
        this.a = viewGroup;
        this.b = view;
        this.c = z;
        this.d = u20Var;
        this.e = peVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = this.a;
        View view = this.b;
        viewGroup.endViewTransition(view);
        boolean z = this.c;
        u20 u20Var = this.d;
        if (z) {
            n20.a(view, u20Var.a);
        }
        this.e.d();
        if (sk.G(2)) {
            Log.v("FragmentManager", "Animator from operation " + u20Var + " has ended.");
        }
    }
}
