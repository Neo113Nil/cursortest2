package com.meta.analytics.dsp.uinode;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.facebook.ads.redexgen.X.Of, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0625Of extends AnimatorListenerAdapter {
    public final /* synthetic */ TT A00;
    public final /* synthetic */ boolean A01;

    public C0625Of(TT tt, boolean z) {
        this.A00 = tt;
        this.A01 = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C0634Oo c0634Oo;
        KP kp;
        KP kp2;
        U1 u1;
        U1 u12;
        super.onAnimationEnd(animator);
        c0634Oo = this.A00.A0M;
        c0634Oo.setTranslationY(0.0f);
        this.A00.A0U();
        if (!this.A01) {
            u1 = this.A00.A0J;
            if (u1 != null) {
                u12 = this.A00.A0J;
                u12.destroy();
            }
        }
        kp = this.A00.A0g;
        if (kp == null) {
            return;
        }
        kp2 = this.A00.A0g;
        kp2.setVisibility(this.A01 ? 8 : 0);
    }
}
