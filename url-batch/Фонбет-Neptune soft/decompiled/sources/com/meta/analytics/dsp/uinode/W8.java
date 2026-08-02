package com.meta.analytics.dsp.uinode;

import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup;

/* loaded from: assets/audience_network.dex */
public final class W8 implements InterfaceC0425Gf {
    public final float A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final long A05;
    public final InterfaceC0435Gp A06;
    public final InterfaceC0448Hd A07;

    public W8(InterfaceC0435Gp interfaceC0435Gp) {
        this(interfaceC0435Gp, 10000, 25000, 25000, 0.75f, 0.75f, 2000L, InterfaceC0448Hd.A00);
    }

    public W8(InterfaceC0435Gp interfaceC0435Gp, int i, int i2, int i3, float f, float f2, long j, InterfaceC0448Hd interfaceC0448Hd) {
        this.A06 = interfaceC0435Gp;
        this.A03 = i;
        this.A02 = i2;
        this.A04 = i3;
        this.A00 = f;
        this.A01 = f2;
        this.A05 = j;
        this.A07 = interfaceC0448Hd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meta.analytics.dsp.uinode.InterfaceC0425Gf
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C0324Bp A4o(TrackGroup trackGroup, int... iArr) {
        return new C0324Bp(trackGroup, iArr, this.A06, this.A03, this.A02, this.A04, this.A00, this.A01, this.A05, this.A07);
    }
}
