package com.meta.analytics.dsp.uinode;

/* loaded from: assets/audience_network.dex */
public class BE extends Thread {
    public final /* synthetic */ AbstractC0865Xp A00;

    public BE(AbstractC0865Xp abstractC0865Xp) {
        this.A00 = abstractC0865Xp;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A00.A0M();
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
