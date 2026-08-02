package com.meta.analytics.dsp.uinode;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: assets/audience_network.dex */
public class PY extends AnimatorListenerAdapter {
    public static String[] A02 = {"665X2CVNVi5qi0mjwkQllZ1Z3hi7SqJ", "IxMbBgN5orcIqYb5gE7I2VSAtMRKiR19", "DUuEpa5mCFfr8tNdbIs12A8n692GEBy4", "BCx81yYWcJIFbJYbIPtGYr5Yts79gdA8", "TuoPSsX0Ttr7GVLKV65Uo8NHw92QaFBx", "DISqui5OzmKtzneiZfMM3I4nAphI7c5A", "RGs1eSEzkCCuxrcdmM0vBsAuPUV1dHLM", "i2aTxnVrgF4AF1SiY0ePTGr2MrnzxiND"};
    public final /* synthetic */ C0747Sx A00;
    public final /* synthetic */ boolean A01;

    public PY(C0747Sx c0747Sx, boolean z) {
        this.A00 = c0747Sx;
        this.A01 = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C0634Oo c0634Oo;
        U1 u1;
        U1 u12;
        super.onAnimationEnd(animator);
        c0634Oo = this.A00.A0H;
        c0634Oo.setTranslationY(0.0f);
        this.A00.A0W();
        if (this.A01) {
            return;
        }
        u1 = this.A00.A0G;
        if (u1 == null) {
            return;
        }
        u12 = this.A00.A0G;
        String[] strArr = A02;
        if (strArr[2].charAt(0) != strArr[5].charAt(0)) {
            throw new RuntimeException();
        }
        A02[7] = "YuVJDdeMntZwiATJvQeG4uMSFeQioDy3";
        u12.destroy();
    }
}
