package com.meta.analytics.dsp.uinode;

import android.os.Handler;
import android.view.animation.Animation;

/* loaded from: assets/audience_network.dex */
public class MG implements Animation.AnimationListener {
    public final /* synthetic */ ViewOnClickListenerC0317Bi A00;

    public MG(ViewOnClickListenerC0317Bi viewOnClickListenerC0317Bi) {
        this.A00 = viewOnClickListenerC0317Bi;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        int i;
        Handler handler;
        Runnable runnable;
        int i2;
        this.A00.A06();
        i = this.A00.A04;
        if (i > 0) {
            handler = this.A00.A05;
            runnable = this.A00.A07;
            i2 = this.A00.A04;
            handler.postDelayed(runnable, i2);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
