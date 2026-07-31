package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.cj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC2973cj implements Runnable {
    public final /* synthetic */ C2381Ji A00;

    public RunnableC2973cj(C2381Ji c2381Ji) {
        this.A00 = c2381Ji;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2935c7 c2935c7;
        C2935c7 c2935c72;
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.A0C = true;
            c2935c7 = this.A00.A0b;
            if (c2935c7.A0D() != null) {
                c2935c72 = this.A00.A0b;
                c2935c72.A0D().AFw(true);
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
