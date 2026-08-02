package com.meta.analytics.dsp.uinode;

import android.view.animation.Animation;

/* renamed from: com.facebook.ads.redexgen.X.Sk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0734Sk extends AnimationAnimationListenerC0555Ln {
    public final /* synthetic */ C0733Sj A00;

    public C0734Sk(C0733Sj c0733Sj) {
        this.A00 = c0733Sj;
    }

    @Override // com.meta.analytics.dsp.uinode.AnimationAnimationListenerC0555Ln, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        AbstractC0556Lo.A0H(this.A00.A01);
        this.A00.A00.ABu();
    }
}
