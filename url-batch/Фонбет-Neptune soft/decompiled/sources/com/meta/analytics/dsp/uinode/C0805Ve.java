package com.meta.analytics.dsp.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Ve, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0805Ve implements InterfaceC0461Hq {
    public long A00;
    public long A01;
    public C02809x A02 = C02809x.A04;
    public boolean A03;
    public final InterfaceC0448Hd A04;

    public C0805Ve(InterfaceC0448Hd interfaceC0448Hd) {
        this.A04 = interfaceC0448Hd;
    }

    public final void A00() {
        if (!this.A03) {
            this.A00 = this.A04.A5T();
            this.A03 = true;
        }
    }

    public final void A01() {
        if (this.A03) {
            A02(A7k());
            this.A03 = false;
        }
    }

    public final void A02(long j) {
        this.A01 = j;
        if (this.A03) {
            this.A00 = this.A04.A5T();
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0461Hq
    public final C02809x A7h() {
        return this.A02;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0461Hq
    public final long A7k() {
        long elapsedSinceBaseMs = this.A01;
        if (this.A03) {
            long A5T = this.A04.A5T();
            long positionUs = this.A00;
            long j = A5T - positionUs;
            if (this.A02.A01 == 1.0f) {
                long positionUs2 = C9W.A00(j);
                return elapsedSinceBaseMs + positionUs2;
            }
            long positionUs3 = this.A02.A00(j);
            return elapsedSinceBaseMs + positionUs3;
        }
        return elapsedSinceBaseMs;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0461Hq
    public final C02809x AGA(C02809x c02809x) {
        if (this.A03) {
            A02(A7k());
        }
        this.A02 = c02809x;
        return c02809x;
    }
}
