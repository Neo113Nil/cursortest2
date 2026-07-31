package com.facebook.ads.redexgen.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.bN, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC2889bN implements View.OnClickListener {
    public final /* synthetic */ C2422Kx A00;

    public ViewOnClickListenerC2889bN(C2422Kx c2422Kx) {
        this.A00 = c2422Kx;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.A02();
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
