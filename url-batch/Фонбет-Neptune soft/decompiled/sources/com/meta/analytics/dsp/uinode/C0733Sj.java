package com.meta.analytics.dsp.uinode;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;

/* renamed from: com.facebook.ads.redexgen.X.Sj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0733Sj extends KT {
    public final /* synthetic */ InterfaceC0651Pf A00;
    public final /* synthetic */ C0652Pg A01;

    public C0733Sj(C0652Pg c0652Pg, InterfaceC0651Pf interfaceC0651Pf) {
        this.A01 = c0652Pg;
        this.A00 = interfaceC0651Pf;
    }

    @Override // com.meta.analytics.dsp.uinode.KT
    public final void A06() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(300L);
        alphaAnimation.setInterpolator(new AccelerateInterpolator());
        alphaAnimation.setAnimationListener(new C0734Sk(this));
        this.A01.startAnimation(alphaAnimation);
    }
}
