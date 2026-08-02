package com.meta.analytics.dsp.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Ch, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0339Ch {
    public final int A00;
    public final int A01;
    public final long A02;
    public final C0336Ce A03;
    public final int[] A04;
    public final int[] A05;
    public final long[] A06;
    public final long[] A07;

    public C0339Ch(C0336Ce c0336Ce, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        AbstractC0445Ha.A03(iArr.length == jArr2.length);
        AbstractC0445Ha.A03(jArr.length == jArr2.length);
        AbstractC0445Ha.A03(iArr2.length == jArr2.length);
        this.A03 = c0336Ce;
        this.A06 = jArr;
        this.A05 = iArr;
        this.A00 = i;
        this.A07 = jArr2;
        this.A04 = iArr2;
        this.A02 = j;
        this.A01 = jArr.length;
    }

    public final int A00(long j) {
        for (int i = IF.A0B(this.A07, j, true, false); i >= 0; i--) {
            int startIndex = this.A04[i];
            if ((startIndex & 1) != 0) {
                return i;
            }
        }
        return -1;
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x000b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int A01(long j) {
        for (int i = IF.A0A(this.A07, j, true, false); i < startIndex; i++) {
            int startIndex = this.A04[i];
            if ((startIndex & 1) != 0) {
                return i;
            }
        }
        return -1;
    }
}
