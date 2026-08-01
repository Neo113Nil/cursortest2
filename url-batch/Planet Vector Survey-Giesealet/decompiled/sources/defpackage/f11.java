package defpackage;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class f11 implements Runnable {
    public final /* synthetic */ View d;
    public final /* synthetic */ l11 e;
    public final /* synthetic */ j3 f;
    public final /* synthetic */ ValueAnimator g;

    public f11(View view, l11 l11Var, j3 j3Var, ValueAnimator valueAnimator) {
        this.d = view;
        this.e = l11Var;
        this.f = j3Var;
        this.g = valueAnimator;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h11.i(this.d, this.e, this.f);
        this.g.start();
    }
}
