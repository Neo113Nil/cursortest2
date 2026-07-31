package com.fyber.inneractive.sdk.renderers;

import android.view.View;

/* loaded from: classes4.dex */
public final class k implements View.OnAttachStateChangeListener {
    public final /* synthetic */ n a;

    public k(n nVar) {
        this.a = nVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        view.removeOnLayoutChangeListener(this.a.z);
    }
}
