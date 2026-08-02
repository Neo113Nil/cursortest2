package com.meta.analytics.dsp.uinode;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.google.common.base.Ascii;

/* loaded from: assets/audience_network.dex */
public final class X9 implements InterfaceC0353Cy {
    public static String[] A0C = {"jvuSXyRxFwWN5M53JxqXTqjBlHPmO5yS", "Nx6fwt5mIYqSRgPxQoB61NXpIqViXreb", "NbRu72XFqCPxMxVeHFzrnyrjREaihhdr", "Z3KBXmMomO9rJfjLZz1JQz2Kw0Fx28Ab", "zLbRIBf4nYWkQfyOEtwQDAQMGMEl8", "zvpubyWaUoinARhzufpjCqD1DbWF7ekR", "kxIGpaDKqbCPDUN5La7nQCmFVSx", "CqFgkkKKOYx1Bj1EdbgCjsaN4ksOOdQn"};
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public Format A05;
    public C4 A06;
    public String A07;
    public boolean A08;
    public final C0469Hy A09;
    public final C0470Hz A0A;
    public final String A0B;

    public X9() {
        this(null);
    }

    public X9(String str) {
        C0469Hy c0469Hy = new C0469Hy(new byte[128]);
        this.A09 = c0469Hy;
        this.A0A = new C0470Hz(c0469Hy.A00);
        this.A02 = 0;
        this.A0B = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
    
        if (r2.A05 == r14.A05.A0O) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A00() {
        this.A09.A07(0);
        AP A09 = AQ.A09(this.A09);
        if (this.A05 != null && A09.A00 == this.A05.A05) {
            int i = A09.A03;
            int i2 = this.A05.A0C;
            if (A0C[6].length() != 27) {
                throw new RuntimeException();
            }
            String[] strArr = A0C;
            strArr[2] = "rmTuGOWOeoxLIH1QLptnusvxizN1V0jV";
            strArr[5] = "2RMufqWRuZFq3WutxyrHt00cbPeHqbYj";
            if (i == i2) {
            }
        }
        Format A07 = Format.A07(this.A07, A09.A05, null, -1, -1, A09.A00, A09.A03, null, null, 0, this.A0B);
        this.A05 = A07;
        this.A06.A5n(A07);
        this.A01 = A09.A01;
        this.A03 = (A09.A02 * 1000000) / this.A05.A0C;
    }

    private boolean A01(C0470Hz c0470Hz) {
        while (true) {
            if (c0470Hz.A04() <= 0) {
                return false;
            }
            if (!this.A08) {
                this.A08 = c0470Hz.A0E() == 11;
            } else {
                int A0E = c0470Hz.A0E();
                if (A0E == 119) {
                    this.A08 = false;
                    return true;
                }
                this.A08 = A0E == 11;
            }
        }
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
        while (true) {
            int A04 = c0470Hz.A04();
            if (A0C[3].charAt(28) != '2') {
                throw new RuntimeException();
            }
            A0C[6] = "j4ZJ9Sb1FxDogpbJuhr4W7MrwTg";
            if (A04 > 0) {
                switch (this.A02) {
                    case 0:
                        if (!A01(c0470Hz)) {
                            break;
                        } else {
                            this.A02 = 1;
                            this.A0A.A00[0] = Ascii.VT;
                            byte[] bArr = this.A0A.A00;
                            String[] strArr = A0C;
                            if (strArr[0].charAt(28) != strArr[7].charAt(28)) {
                                bArr[1] = 119;
                                this.A00 = 2;
                                break;
                            } else {
                                A0C[4] = "thGmrgzi8Rkjtt3yqKW2WPJBde0Fj";
                                bArr[1] = 119;
                                this.A00 = 2;
                                break;
                            }
                        }
                    case 1:
                        if (!A02(c0470Hz, this.A0A.A00, 128)) {
                            break;
                        } else {
                            A00();
                            this.A0A.A0Y(0);
                            this.A06.AFR(this.A0A, 128);
                            this.A02 = 2;
                            break;
                        }
                    case 2:
                        int min = Math.min(c0470Hz.A04(), this.A01 - this.A00);
                        this.A06.AFR(c0470Hz, min);
                        int bytesToRead = this.A00 + min;
                        this.A00 = bytesToRead;
                        int i = this.A01;
                        if (bytesToRead != i) {
                            break;
                        } else {
                            this.A06.AFS(this.A04, 1, i, 0, null);
                            this.A04 += this.A03;
                            this.A02 = 0;
                            break;
                        }
                }
            } else {
                return;
            }
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0353Cy
    public final void A4p(InterfaceC0329Bu interfaceC0329Bu, DC dc) {
        dc.A05();
        this.A07 = dc.A04();
        this.A06 = interfaceC0329Bu.AGi(dc.A03(), 1);
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
