package com.meta.analytics.dsp.uinode;

/* loaded from: assets/audience_network.dex */
public class PZ implements Runnable {
    public final /* synthetic */ C0747Sx A00;

    public PZ(C0747Sx c0747Sx) {
        this.A00 = c0747Sx;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        if (KL.A02(this)) {
            return;
        }
        try {
            z = this.A00.A0K;
            if (!z) {
                return;
            }
            this.A00.A0Q();
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
