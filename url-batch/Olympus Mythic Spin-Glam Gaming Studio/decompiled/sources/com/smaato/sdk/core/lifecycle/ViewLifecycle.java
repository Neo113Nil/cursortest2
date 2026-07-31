package com.smaato.sdk.core.lifecycle;

import android.view.View;

/* loaded from: classes6.dex */
public class ViewLifecycle extends Lifecycle implements View.OnAttachStateChangeListener {
    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
    }

    public ViewLifecycle(View view) {
        view.addOnAttachStateChangeListener(this);
    }
}
