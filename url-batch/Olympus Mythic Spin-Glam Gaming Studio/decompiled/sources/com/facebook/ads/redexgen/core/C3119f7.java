package com.facebook.ads.redexgen.core;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.f7, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C3119f7 extends AnimatorListenerAdapter {
    public final /* synthetic */ C19823c A00;

    public C3119f7(C19823c c19823c) {
        this.A00 = c19823c;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Handler handler;
        handler = this.A00.A00.A04;
        handler.postDelayed(new C2227Di(this), 2000L);
    }
}
