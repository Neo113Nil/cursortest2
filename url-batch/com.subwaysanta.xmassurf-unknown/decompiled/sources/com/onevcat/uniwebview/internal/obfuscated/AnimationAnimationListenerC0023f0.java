package com.onevcat.uniwebview.internal.obfuscated;

import android.view.animation.Animation;

/* renamed from: com.onevcat.uniwebview.internal.obfuscated.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class AnimationAnimationListenerC0023f0 implements Animation.AnimationListener {
    public final /* synthetic */ C0031h0 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ String c;

    public AnimationAnimationListenerC0023f0(C0031h0 c0031h0, boolean z, String str) {
        this.a = c0031h0;
        this.b = z;
        this.c = str;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        C0031h0 c0031h0 = this.a;
        c0031h0.j = null;
        boolean z = this.b;
        String str = this.c;
        if (z) {
            c0031h0.c.a(c0031h0.v.getName(), P2.ShowTransitionFinished, str);
        } else {
            c0031h0.e.setVisibility(4);
            c0031h0.c.a(c0031h0.v.getName(), P2.HideTransitionFinished, str);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
