package com.facebook.ads.redexgen.core;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.f8, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C3120f8 extends AnimatorListenerAdapter {
    public final /* synthetic */ C2226Dh A00;

    public C3120f8(C2226Dh c2226Dh) {
        this.A00 = c2226Dh;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        View view;
        view = this.A00.A00;
        view.setVisibility(8);
    }
}
