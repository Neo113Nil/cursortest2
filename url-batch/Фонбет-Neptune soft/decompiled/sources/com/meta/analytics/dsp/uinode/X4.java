package com.meta.analytics.dsp.uinode;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;

/* loaded from: assets/audience_network.dex */
public final class X4 implements InterfaceC0353Cy {
    public int A00;
    public int A01;
    public int A03;
    public long A04;
    public long A05;
    public Format A06;
    public C4 A07;
    public String A08;
    public final String A0A;
    public final C0470Hz A09 = new C0470Hz(new byte[18]);
    public int A02 = 0;

    public X4(String str) {
        this.A0A = str;
    }

    private void A00() {
        byte[] bArr = this.A09.A00;
        if (this.A06 == null) {
            Format A03 = B1.A03(bArr, this.A08, this.A0A, null);
            this.A06 = A03;
            this.A07.A5n(A03);
        }
        this.A01 = B1.A01(bArr);
        this.A04 = (int) ((B1.A02(bArr) * 1000000) / this.A06.A0C);
    }

    private boolean A01(C0470Hz c0470Hz) {
        while (c0470Hz.A04() > 0) {
            int i = this.A03 << 8;
            this.A03 = i;
            int A0E = i | c0470Hz.A0E();
            this.A03 = A0E;
            if (B1.A07(A0E)) {
                this.A09.A00[0] = (byte) ((this.A03 >> 24) & 255);
                this.A09.A00[1] = (byte) ((this.A03 >> 16) & 255);
                this.A09.A00[2] = (byte) ((this.A03 >> 8) & 255);
                this.A09.A00[3] = (byte) (this.A03 & 255);
                this.A00 = 4;
                this.A03 = 0;
                return true;
            }
        }
        return false;
    }

    private boolean A02(C0470Hz c0470Hz, byte[] bArr, int i) {
        int min = Math.min(c0470Hz.A04(), i - this.A00);
        int bytesToRead = this.A00;
        c0470Hz.A0c(bArr, bytesToRead, min);
        int bytesToRead2 = this.A00;
        int bytesToRead3 = bytesToRead2 + min;
        this.A00 = bytesToRead3;
        return bytesToRead3 == i;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0353Cy
    public final void A4R(C0470Hz c0470Hz) {
        while (c0470Hz.A04() > 0) {
            switch (this.A02) {
                case 0:
                    if (!A01(c0470Hz)) {
                        break;
                    } else {
                        this.A02 = 1;
                        break;
                    }
                case 1:
                    if (!A02(c0470Hz, this.A09.A00, 18)) {
                        break;
                    } else {
                        A00();
                        this.A09.A0Y(0);
                        this.A07.AFR(this.A09, 18);
                        this.A02 = 2;
                        break;
                    }
                case 2:
                    int min = Math.min(c0470Hz.A04(), this.A01 - this.A00);
                    this.A07.AFR(c0470Hz, min);
                    int bytesToRead = this.A00 + min;
                    this.A00 = bytesToRead;
                    int i = this.A01;
                    if (bytesToRead != i) {
                        break;
                    } else {
                        this.A07.AFS(this.A05, 1, i, 0, null);
                        this.A05 += this.A04;
                        this.A02 = 0;
                        break;
                    }
            }
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0353Cy
    public final void A4p(InterfaceC0329Bu interfaceC0329Bu, DC dc) {
        dc.A05();
        this.A08 = dc.A04();
        this.A07 = interfaceC0329Bu.AGi(dc.A03(), 1);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0353Cy
    public final void ADs() {
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0353Cy
    public final void ADt(long j, boolean z) {
        this.A05 = j;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0353Cy
    public final void AFg() {
        this.A02 = 0;
        this.A00 = 0;
        this.A03 = 0;
    }
}
