package com.onevcat.uniwebview.internal.obfuscated;

import android.view.animation.Animation;

/* renamed from: com.onevcat.uniwebview.internal.obfuscated.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class AnimationAnimationListenerC0019e0 implements Animation.AnimationListener {
    public final /* synthetic */ C0031h0 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ String f;

    public AnimationAnimationListenerC0019e0(C0031h0 c0031h0, int i, int i2, int i3, int i4, String str) {
        this.a = c0031h0;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = str;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        C0031h0 c0031h0 = this.a;
        c0031h0.j = null;
        c0031h0.a(this.b, this.c, this.d, this.e);
        C0031h0 c0031h02 = this.a;
        c0031h02.c.a(c0031h02.v.getName(), P2.AnimateToFinished, this.f);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
