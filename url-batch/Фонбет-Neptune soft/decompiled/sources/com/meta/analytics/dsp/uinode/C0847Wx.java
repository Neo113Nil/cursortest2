package com.meta.analytics.dsp.uinode;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;

/* renamed from: com.facebook.ads.redexgen.X.Wx, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0847Wx implements InterfaceC0353Cy {
    public static String[] A0C = {"M8nxhoQeDkjHEk3tjnypaUsJeky9pUPe", "22wDV1USJ2tZABUEWkFG7fElxPqoDepQ", "WSXmuBny7XXEQ4s813c9BSbsqOjqSskJ", "KVrLQEQFGtTXAXMopyF5dj", "jUO9kFQXOuNF5MkzWpfFf35Wzr3tp3jj", "UgJN", "fATsZHYNQKGGAXuN", "X77CUtb4yEwh8nH4MH"};
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public C4 A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public final By A09;
    public final C0470Hz A0A;
    public final String A0B;

    public C0847Wx() {
        this(null);
    }

    public C0847Wx(String str) {
        this.A02 = 0;
        C0470Hz c0470Hz = new C0470Hz(4);
        this.A0A = c0470Hz;
        c0470Hz.A00[0] = -1;
        this.A09 = new By();
        this.A0B = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003b A[LOOP:0: B:2:0x000a->B:13:0x003b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0026 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A00(C0470Hz c0470Hz) {
        boolean z;
        byte[] bArr = c0470Hz.A00;
        int A07 = c0470Hz.A07();
        for (int A06 = c0470Hz.A06(); A06 < A07; A06++) {
            int startOffset = bArr[A06];
            boolean z2 = (startOffset & 255) == 255;
            if (this.A08) {
                int startOffset2 = bArr[A06];
                if ((startOffset2 & 224) == 224) {
                    z = true;
                    this.A08 = z2;
                    if (!z) {
                        c0470Hz.A0Y(A06 + 1);
                        this.A08 = false;
                        this.A0A.A00[1] = bArr[A06];
                        this.A00 = 2;
                        this.A02 = 1;
                        return;
                    }
                }
            }
            z = false;
            this.A08 = z2;
            if (!z) {
            }
        }
        c0470Hz.A0Y(A07);
    }

    private void A01(C0470Hz c0470Hz) {
        int min = Math.min(c0470Hz.A04(), this.A01 - this.A00);
        this.A05.AFR(c0470Hz, min);
        int bytesToRead = this.A00 + min;
        this.A00 = bytesToRead;
        int i = this.A01;
        if (bytesToRead < i) {
            return;
        }
        C4 c4 = this.A05;
        if (A0C[2].charAt(7) == 'H') {
            throw new RuntimeException();
        }
        String[] strArr = A0C;
        strArr[4] = "Ix3a1KSHqy7cK1t6WtGmlZzK6PY1tVDv";
        strArr[1] = "TW6fubs4zpuEa3cAWqrpZRXJHWdUZhrV";
        c4.AFS(this.A04, 1, i, 0, null);
        this.A04 += this.A03;
        this.A00 = 0;
        this.A02 = 0;
    }

    private void A02(C0470Hz c0470Hz) {
        int min = Math.min(c0470Hz.A04(), 4 - this.A00);
        c0470Hz.A0c(this.A0A.A00, this.A00, min);
        int i = this.A00 + min;
        this.A00 = i;
        if (i < 4) {
            return;
        }
        this.A0A.A0Y(0);
        if (By.A04(this.A0A.A08(), this.A09)) {
            this.A01 = this.A09.A02;
            if (!this.A07) {
                this.A03 = (this.A09.A04 * 1000000) / this.A09.A03;
                this.A05.A5n(Format.A07(this.A06, this.A09.A06, null, -1, 4096, this.A09.A01, this.A09.A03, null, null, 0, this.A0B));
                this.A07 = true;
            }
            this.A0A.A0Y(0);
            this.A05.AFR(this.A0A, 4);
            this.A02 = 2;
            return;
        }
        this.A00 = 0;
        this.A02 = 1;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0353Cy
    public final void A4R(C0470Hz c0470Hz) {
        while (c0470Hz.A04() > 0) {
            switch (this.A02) {
                case 0:
                    A00(c0470Hz);
                    break;
                case 1:
                    A02(c0470Hz);
                    break;
                case 2:
                    A01(c0470Hz);
                    break;
            }
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0353Cy
    public final void A4p(InterfaceC0329Bu interfaceC0329Bu, DC dc) {
        dc.A05();
        this.A06 = dc.A04();
        this.A05 = interfaceC0329Bu.AGi(dc.A03(), 1);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0353Cy
    public final void ADs() {
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0353Cy
    public final void ADt(long j, boolean z) {
        this.A04 = j;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0353Cy
    public final void AFg() {
        this.A02 = 0;
        this.A00 = 0;
        this.A08 = false;
    }
}
