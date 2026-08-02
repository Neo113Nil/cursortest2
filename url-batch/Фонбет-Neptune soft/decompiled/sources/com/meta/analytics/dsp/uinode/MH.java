package com.meta.analytics.dsp.uinode;

import android.view.animation.Animation;

/* loaded from: assets/audience_network.dex */
public class MH implements Animation.AnimationListener {
    public final /* synthetic */ ViewOnClickListenerC0317Bi A00;

    public MH(ViewOnClickListenerC0317Bi viewOnClickListenerC0317Bi) {
        this.A00 = viewOnClickListenerC0317Bi;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        ((UT) this.A00).A07.finish(16);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
