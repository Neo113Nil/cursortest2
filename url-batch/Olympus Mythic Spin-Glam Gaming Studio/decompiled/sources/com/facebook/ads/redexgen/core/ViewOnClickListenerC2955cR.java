package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.cR, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC2955cR implements View.OnClickListener {
    public final /* synthetic */ KE A00;

    public ViewOnClickListenerC2955cR(KE ke) {
        this.A00 = ke;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z;
        boolean z2;
        AbstractC2470Mt abstractC2470Mt;
        AbstractC3383jd abstractC3383jd;
        Handler handler;
        Runnable runnable;
        AbstractC3383jd abstractC3383jd2;
        AbstractC2470Mt abstractC2470Mt2;
        if (WU.A02(this)) {
            return;
        }
        try {
            z = this.A00.A0M;
            if (!z) {
                this.A00.A0N = true;
                abstractC2470Mt = this.A00.A0b;
                if (abstractC2470Mt != null) {
                    KE ke = this.A00;
                    abstractC2470Mt2 = this.A00.A0b;
                    ke.A0f(((AnonymousClass85) abstractC2470Mt2).A0M().toString());
                }
                abstractC3383jd = this.A00.A0E;
                if (abstractC3383jd.A0q() >= 0) {
                    handler = this.A00.A08;
                    runnable = this.A00.A0h;
                    abstractC3383jd2 = this.A00.A0E;
                    handler.postDelayed(runnable, abstractC3383jd2.A0q());
                }
            }
            KE ke2 = this.A00;
            z2 = this.A00.A0M;
            ke2.A0i(z2 ? false : true);
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
