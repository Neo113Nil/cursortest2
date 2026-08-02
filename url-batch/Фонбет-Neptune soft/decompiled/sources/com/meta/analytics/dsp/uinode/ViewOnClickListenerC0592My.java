package com.meta.analytics.dsp.uinode;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.My, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0592My implements View.OnClickListener {
    public final /* synthetic */ C0586Ms A00;
    public final /* synthetic */ U5 A01;

    public ViewOnClickListenerC0592My(U5 u5, C0586Ms c0586Ms) {
        this.A01 = u5;
        this.A00 = c0586Ms;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A00.A01();
            this.A01.A0B.ACI(C2U.A03);
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
