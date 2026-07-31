package com.facebook.ads.redexgen.core;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.eh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnTouchListenerC3093eh implements View.OnTouchListener {
    public final /* synthetic */ C2255Ek A00;

    public ViewOnTouchListenerC3093eh(C2255Ek c2255Ek) {
        this.A00 = c2255Ek;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        UM um;
        um = this.A00.A0C;
        um.A02(new C2239Du(view, motionEvent));
        return false;
    }
}
