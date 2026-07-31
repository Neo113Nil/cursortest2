package com.facebook.ads.redexgen.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.bg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC2908bg implements View.OnClickListener {
    public final /* synthetic */ C2910bi A00;

    public ViewOnClickListenerC2908bg(C2910bi c2910bi) {
        this.A00 = c2910bi;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.A05();
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
