package defpackage;

import android.view.View;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class p21 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ View d;
    public final /* synthetic */ wi0 e;

    public p21(View view, wi0 wi0Var) {
        this.d = view;
        this.e = wi0Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.d.removeOnAttachStateChangeListener(this);
        this.e.z();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
