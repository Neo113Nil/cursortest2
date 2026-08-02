package com.meta.analytics.dsp.uinode;

import android.os.Handler;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Pb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0647Pb implements View.OnClickListener {
    public final /* synthetic */ C0747Sx A00;

    public ViewOnClickListenerC0647Pb(C0747Sx c0747Sx) {
        this.A00 = c0747Sx;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z;
        boolean z2;
        AbstractC00460h abstractC00460h;
        Handler handler;
        Runnable runnable;
        if (KL.A02(this)) {
            return;
        }
        try {
            z = this.A00.A0K;
            if (!z) {
                this.A00.A0L = true;
                C0747Sx c0747Sx = this.A00;
                abstractC00460h = c0747Sx.A0T;
                c0747Sx.A0h(((C0402Ff) abstractC00460h).A0G().toString());
                if (((PQ) this.A00).A05.A0H() >= 0) {
                    handler = this.A00.A08;
                    runnable = this.A00.A0j;
                    handler.postDelayed(runnable, ((PQ) this.A00).A05.A0H());
                }
            }
            C0747Sx c0747Sx2 = this.A00;
            z2 = c0747Sx2.A0K;
            c0747Sx2.A0k(z2 ? false : true);
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
