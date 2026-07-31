package com.facebook.ads.redexgen.core;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;

/* loaded from: assets/audience_network/classes2.dex */
public class GX extends AbstractRunnableC2705Wc {
    public final /* synthetic */ InterfaceC3040dp A00;
    public final /* synthetic */ C3041dq A01;

    public GX(C3041dq c3041dq, InterfaceC3040dp interfaceC3040dp) {
        this.A01 = c3041dq;
        this.A00 = interfaceC3040dp;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2705Wc
    public final void A07() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(300L);
        alphaAnimation.setInterpolator(new AccelerateInterpolator());
        alphaAnimation.setAnimationListener(new GY(this));
        this.A01.startAnimation(alphaAnimation);
    }
}
