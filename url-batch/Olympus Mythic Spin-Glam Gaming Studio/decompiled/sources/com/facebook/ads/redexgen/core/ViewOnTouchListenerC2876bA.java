package com.facebook.ads.redexgen.core;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.bA, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnTouchListenerC2876bA implements View.OnTouchListener {
    public final /* synthetic */ ViewOnClickListenerC2877bB A00;

    public ViewOnTouchListenerC2876bA(ViewOnClickListenerC2877bB viewOnClickListenerC2877bB) {
        this.A00 = viewOnClickListenerC2877bB;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            this.A00.A00(motionEvent.getX(), motionEvent.getY());
            return false;
        }
        return false;
    }
}
