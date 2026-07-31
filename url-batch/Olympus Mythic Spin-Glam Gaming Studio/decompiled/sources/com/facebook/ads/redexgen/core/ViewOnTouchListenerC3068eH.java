package com.facebook.ads.redexgen.core;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.eH, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnTouchListenerC3068eH implements View.OnTouchListener {
    public final /* synthetic */ C3069eI A00;

    public ViewOnTouchListenerC3068eH(C3069eI c3069eI) {
        this.A00 = c3069eI;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        VA va;
        AbstractC3383jd abstractC3383jd;
        if (motionEvent.getAction() == 1) {
            this.A00.A01 = System.currentTimeMillis();
            C3069eI.A00(this.A00);
            va = this.A00.A06;
            abstractC3383jd = this.A00.A03;
            va.ABp(abstractC3383jd.A2E(), new C2875b9().A03(this.A00.getViewabilityChecker()).A02(this.A00.getTouchDataRecorder()).A05());
            return false;
        }
        return false;
    }
}
