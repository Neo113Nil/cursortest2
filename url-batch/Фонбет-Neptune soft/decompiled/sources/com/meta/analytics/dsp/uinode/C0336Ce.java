package com.meta.analytics.dsp.uinode;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;

/* renamed from: com.facebook.ads.redexgen.X.Ce, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0336Ce {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final Format A07;
    public final long[] A08;
    public final long[] A09;
    public final C0337Cf[] A0A;

    public C0336Ce(int i, int i2, long j, long j2, long j3, Format format, int i3, C0337Cf[] c0337CfArr, int i4, long[] jArr, long[] jArr2) {
        this.A00 = i;
        this.A03 = i2;
        this.A06 = j;
        this.A05 = j2;
        this.A04 = j3;
        this.A07 = format;
        this.A02 = i3;
        this.A0A = c0337CfArr;
        this.A01 = i4;
        this.A08 = jArr;
        this.A09 = jArr2;
    }

    public final C0337Cf A00(int i) {
        C0337Cf[] c0337CfArr = this.A0A;
        if (c0337CfArr == null) {
            return null;
        }
        return c0337CfArr[i];
    }
}
