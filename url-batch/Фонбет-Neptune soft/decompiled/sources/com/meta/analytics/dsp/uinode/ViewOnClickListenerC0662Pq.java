package com.meta.analytics.dsp.uinode;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Pq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0662Pq implements View.OnClickListener {
    public final /* synthetic */ C0663Pr A00;

    public ViewOnClickListenerC0662Pq(C0663Pr c0663Pr) {
        this.A00 = c0663Pr;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C7C c7c;
        if (KL.A02(this)) {
            return;
        }
        try {
            c7c = this.A00.A05;
            c7c.performClick();
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
