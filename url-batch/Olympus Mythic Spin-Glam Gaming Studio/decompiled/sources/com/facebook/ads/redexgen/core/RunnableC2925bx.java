package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.bx, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC2925bx implements Runnable {
    public final /* synthetic */ C2401Kc A00;

    public RunnableC2925bx(C2401Kc c2401Kc) {
        this.A00 = c2401Kc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.A03 = true;
            if (((AbstractC2931c3) this.A00).A07.A0D() != null) {
                ((AbstractC2931c3) this.A00).A07.A0D().AFw(true);
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
