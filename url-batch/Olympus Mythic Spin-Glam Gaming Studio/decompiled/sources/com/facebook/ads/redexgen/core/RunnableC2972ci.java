package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.ci, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC2972ci implements Runnable {
    public final /* synthetic */ C2381Ji A00;

    public RunnableC2972ci(C2381Ji c2381Ji) {
        this.A00 = c2381Ji;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        if (WU.A02(this)) {
            return;
        }
        try {
            z = this.A00.A0D;
            if (z) {
                this.A00.A0M();
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
