package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.dc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC3028dc implements Runnable {
    public final /* synthetic */ AnonymousClass55 A00;

    public RunnableC3028dc(AnonymousClass55 anonymousClass55) {
        this.A00 = anonymousClass55;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2895bT c2895bT;
        C2895bT c2895bT2;
        if (WU.A02(this)) {
            return;
        }
        try {
            c2895bT = this.A00.A07;
            if (c2895bT != null && this.A00.getResources().getConfiguration().orientation == 1) {
                c2895bT2 = this.A00.A07;
                c2895bT2.A0A();
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
