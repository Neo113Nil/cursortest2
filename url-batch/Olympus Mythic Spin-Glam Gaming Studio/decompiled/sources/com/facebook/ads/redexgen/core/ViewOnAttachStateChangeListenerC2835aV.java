package com.facebook.ads.redexgen.core;

import android.view.View;
import android.widget.ImageView;

/* renamed from: com.facebook.ads.redexgen.X.aV, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnAttachStateChangeListenerC2835aV implements View.OnAttachStateChangeListener {
    public final /* synthetic */ C2836aW A00;

    public ViewOnAttachStateChangeListenerC2835aV(C2836aW c2836aW) {
        this.A00 = c2836aW;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ImageView imageView;
        this.A00.A09();
        imageView = this.A00.A03;
        imageView.setOnClickListener(null);
    }
}
