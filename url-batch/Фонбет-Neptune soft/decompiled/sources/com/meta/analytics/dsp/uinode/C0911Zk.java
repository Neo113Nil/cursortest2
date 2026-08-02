package com.meta.analytics.dsp.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Zk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0911Zk implements C5D {
    public final /* synthetic */ C0372Eb A00;

    public C0911Zk(C0372Eb c0372Eb) {
        this.A00 = c0372Eb;
    }

    @Override // com.meta.analytics.dsp.uinode.C5D
    public final void AE9(AnonymousClass56 anonymousClass56, C01504j c01504j, C01504j c01504j2) {
        this.A00.A1j(anonymousClass56, c01504j, c01504j2);
    }

    @Override // com.meta.analytics.dsp.uinode.C5D
    public final void AEB(AnonymousClass56 anonymousClass56, C01504j c01504j, C01504j c01504j2) {
        this.A00.A0r.A0Y(anonymousClass56);
        this.A00.A1k(anonymousClass56, c01504j, c01504j2);
    }

    @Override // com.meta.analytics.dsp.uinode.C5D
    public final void AED(AnonymousClass56 anonymousClass56, C01504j c01504j, C01504j c01504j2) {
        anonymousClass56.A0X(false);
        if (this.A00.A0C) {
            if (this.A00.A05.A0H(anonymousClass56, anonymousClass56, c01504j, c01504j2)) {
                this.A00.A1M();
            }
        } else {
            if (!this.A00.A05.A0G(anonymousClass56, c01504j, c01504j2)) {
                return;
            }
            this.A00.A1M();
        }
    }

    @Override // com.meta.analytics.dsp.uinode.C5D
    public final void AGo(AnonymousClass56 anonymousClass56) {
        this.A00.A06.A1D(anonymousClass56.A0H, this.A00.A0r);
    }
}
