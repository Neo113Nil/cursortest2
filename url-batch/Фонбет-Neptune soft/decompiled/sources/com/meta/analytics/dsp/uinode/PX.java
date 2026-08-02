package com.meta.analytics.dsp.uinode;

import android.animation.ValueAnimator;

/* loaded from: assets/audience_network.dex */
public class PX implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C0747Sx A00;

    public PX(C0747Sx c0747Sx) {
        this.A00 = c0747Sx;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        SA sa;
        SA sa2;
        Integer num = (Integer) valueAnimator.getAnimatedValue();
        sa = this.A00.A0Z;
        sa.getLayoutParams().height = num.intValue();
        sa2 = this.A00.A0Z;
        sa2.requestLayout();
    }
}
