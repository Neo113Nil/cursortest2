package com.meta.analytics.dsp.uinode;

import android.os.Handler;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;

/* renamed from: com.facebook.ads.redexgen.X.Ai, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0291Ai {
    public final Handler A00;
    public final InterfaceC0292Aj A01;

    public C0291Ai(Handler handler, InterfaceC0292Aj interfaceC0292Aj) {
        this.A00 = interfaceC0292Aj != null ? (Handler) AbstractC0445Ha.A01(handler) : null;
        this.A01 = interfaceC0292Aj;
    }

    public final void A01(int i) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC0290Ah(this, i));
        }
    }

    public final void A02(int i, long j, long j2) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC0288Af(this, i, j, j2));
        }
    }

    public final void A03(Format format) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC0287Ae(this, format));
        }
    }

    public final void A04(BC bc) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC0289Ag(this, bc));
        }
    }

    public final void A05(BC bc) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC0285Ac(this, bc));
        }
    }

    public final void A06(String str, long j, long j2) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC0286Ad(this, str, j, j2));
        }
    }
}
