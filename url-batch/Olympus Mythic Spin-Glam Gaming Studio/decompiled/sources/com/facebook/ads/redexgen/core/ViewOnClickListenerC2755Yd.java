package com.facebook.ads.redexgen.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Yd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC2755Yd implements View.OnClickListener {
    public final /* synthetic */ C2532Pe A00;

    public ViewOnClickListenerC2755Yd(C2532Pe c2532Pe) {
        this.A00 = c2532Pe;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.A0G();
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
