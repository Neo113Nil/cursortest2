package com.fyber.inneractive.sdk.ui;

import android.animation.ValueAnimator;

/* loaded from: classes11.dex */
public final class g implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ IAsmoothProgressBar a;

    public g(IAsmoothProgressBar iAsmoothProgressBar) {
        this.a = iAsmoothProgressBar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        super/*android.widget.ProgressBar*/.setProgress(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
