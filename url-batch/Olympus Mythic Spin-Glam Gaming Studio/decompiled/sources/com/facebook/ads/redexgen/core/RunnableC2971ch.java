package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.ch, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC2971ch implements Runnable {
    public final /* synthetic */ C2381Ji A00;

    public RunnableC2971ch(C2381Ji c2381Ji) {
        this.A00 = c2381Ji;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2895bT c2895bT;
        C2895bT c2895bT2;
        if (WU.A02(this)) {
            return;
        }
        try {
            c2895bT = this.A00.A09;
            if (c2895bT != null && this.A00.getResources().getConfiguration().orientation == 1) {
                c2895bT2 = this.A00.A09;
                c2895bT2.A0A();
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
