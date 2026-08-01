package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class e11 extends AnimatorListenerAdapter {
    public final /* synthetic */ l11 a;
    public final /* synthetic */ View b;

    public e11(l11 l11Var, View view) {
        this.a = l11Var;
        this.b = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        l11 l11Var = this.a;
        l11Var.a.e(1.0f);
        h11.f(l11Var, this.b);
    }
}
