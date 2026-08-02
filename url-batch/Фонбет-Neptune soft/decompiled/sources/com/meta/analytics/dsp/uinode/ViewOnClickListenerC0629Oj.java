package com.meta.analytics.dsp.uinode;

import android.os.Handler;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Oj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0629Oj implements View.OnClickListener {
    public final /* synthetic */ TT A00;

    public ViewOnClickListenerC0629Oj(TT tt) {
        this.A00 = tt;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z;
        boolean z2;
        AbstractC00460h abstractC00460h;
        AbstractC0992b5 abstractC0992b5;
        Handler handler;
        Runnable runnable;
        AbstractC0992b5 abstractC0992b52;
        if (KL.A02(this)) {
            return;
        }
        try {
            z = this.A00.A0O;
            if (!z) {
                this.A00.A0P = true;
                TT tt = this.A00;
                abstractC00460h = tt.A0c;
                tt.A0d(((C0402Ff) abstractC00460h).A0G().toString());
                abstractC0992b5 = this.A00.A0G;
                if (abstractC0992b5.A0H() >= 0) {
                    handler = this.A00.A09;
                    runnable = this.A00.A0i;
                    abstractC0992b52 = this.A00.A0G;
                    handler.postDelayed(runnable, abstractC0992b52.A0H());
                }
            }
            TT tt2 = this.A00;
            z2 = tt2.A0O;
            tt2.A0g(z2 ? false : true);
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
