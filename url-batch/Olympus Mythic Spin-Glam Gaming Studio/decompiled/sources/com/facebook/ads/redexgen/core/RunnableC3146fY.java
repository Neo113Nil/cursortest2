package com.facebook.ads.redexgen.core;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.fY, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC3146fY implements Runnable {
    public final /* synthetic */ C3149fb A00;

    public RunnableC3146fY(C3149fb c3149fb) {
        this.A00 = c3149fb;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Handler handler;
        Handler handler2;
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.A0A();
            handler = this.A00.A01;
            handler.removeCallbacks(this);
            handler2 = this.A00.A01;
            handler2.postDelayed(this, 250L);
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
