package com.meta.analytics.dsp.uinode;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import org.objectweb.asm.Opcodes;

/* loaded from: assets/audience_network.dex */
public final class XU implements InterfaceC0327Bs {
    public static byte[] A0E;
    public static String[] A0F = {"FKupPKXcsIkycQ3l5ptAH5wluEqc6YoI", "RW", "ogqWAOna8QODFLIqijT7vOYnhApvYyU7", "UAOUtvFDqNmRNLgZ1GU6DrNnbPesxUgh", "z4WGtVpeHmr0jWMfeyoB2cmDzFByDj9w", "gdGWUcFUabEj8aTRXEAi5amp", "tmhvTid", "WDNv6R6VbALBmvSk6DCmHF7NFi0i9puO"};
    public static final InterfaceC0330Bv A0G;
    public static final int A0H;
    public static final int A0I;
    public static final int A0J;
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public InterfaceC0329Bu A04;
    public C4 A05;
    public XV A06;
    public Metadata A07;
    public final int A08;
    public final long A09;
    public final C0331Bw A0A;
    public final Bx A0B;
    public final By A0C;
    public final C0470Hz A0D;

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0E, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 31);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A0E = new byte[]{-94, -57, -65, -56, -110, -92, -96, -79, -94, -89, -92, -93, 95, -77, -82, -82, 95, -84, -96, -83, -72, 95, -95, -72, -77, -92, -78, 109, -115, 121, -119, Byte.MIN_VALUE, -100, -83, -78, -85};
    }

    static {
        A05();
        A0G = new XW();
        A0J = IF.A08(A04(32, 4, 37));
        A0H = IF.A08(A04(0, 4, 58));
        A0I = IF.A08(A04(28, 4, 24));
    }

    public XU() {
        this(0);
    }

    public XU(int i) {
        this(i, -9223372036854775807L);
    }

    public XU(int i, long j) {
        this.A08 = i;
        this.A09 = j;
        this.A0D = new C0470Hz(10);
        this.A0C = new By();
        this.A0A = new C0331Bw();
        this.A02 = -9223372036854775807L;
        this.A0B = new Bx();
    }

    private int A00(InterfaceC0328Bt interfaceC0328Bt) throws IOException, InterruptedException {
        if (this.A00 == 0) {
            interfaceC0328Bt.AFM();
            if (!interfaceC0328Bt.ADw(this.A0D.A00, 0, 4, true)) {
                return -1;
            }
            this.A0D.A0Y(0);
            int A08 = this.A0D.A08();
            int sampleHeaderData = this.A01;
            if (A06(A08, sampleHeaderData)) {
                int sampleHeaderData2 = By.A00(A08);
                if (sampleHeaderData2 != -1) {
                    By.A04(A08, this.A0C);
                    if (this.A02 == -9223372036854775807L) {
                        XV xv = this.A06;
                        long A7i = interfaceC0328Bt.A7i();
                        if (A0F[0].charAt(7) == '2') {
                            throw new RuntimeException();
                        }
                        A0F[5] = "uwsYCHPiCgNXlhDD9rc7dT19";
                        this.A02 = xv.A88(A7i);
                        if (this.A09 != -9223372036854775807L) {
                            this.A02 += this.A09 - this.A06.A88(0L);
                        }
                    }
                    int sampleHeaderData3 = this.A0C.A02;
                    this.A00 = sampleHeaderData3;
                }
            }
            interfaceC0328Bt.AGP(1);
            this.A01 = 0;
            return 0;
        }
        int AFQ = this.A05.AFQ(interfaceC0328Bt, this.A00, true);
        if (AFQ == -1) {
            return -1;
        }
        int bytesAppended = this.A00 - AFQ;
        this.A00 = bytesAppended;
        if (bytesAppended > 0) {
            return 0;
        }
        this.A05.AFS(this.A02 + ((this.A03 * 1000000) / this.A0C.A03), 1, this.A0C.A02, 0, null);
        this.A03 += this.A0C.A04;
        this.A00 = 0;
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0035, code lost:
    
        if (r3 == r0) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int A01(C0470Hz c0470Hz, int i) {
        if (c0470Hz.A07() >= i + 4) {
            c0470Hz.A0Y(i);
            int A08 = c0470Hz.A08();
            String[] strArr = A0F;
            if (strArr[4].charAt(21) == strArr[3].charAt(21)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0F;
            strArr2[4] = "RZ9mFeyNnV0sPgPCsPCuasZg37Uzdp17";
            strArr2[3] = "fK9CAyTZYj28knSP6u8xHPIK1qnXYcxa";
            int headerData = A0J;
            if (A08 != headerData) {
                int headerData2 = A0H;
            }
            return A08;
        }
        if (c0470Hz.A07() >= 40) {
            c0470Hz.A0Y(36);
            int A082 = c0470Hz.A08();
            int i2 = A0I;
            if (A082 == i2) {
                return i2;
            }
            return 0;
        }
        return 0;
    }

    private EE A02(InterfaceC0328Bt interfaceC0328Bt) throws IOException, InterruptedException {
        interfaceC0328Bt.ADv(this.A0D.A00, 0, 4);
        this.A0D.A0Y(0);
        By.A04(this.A0D.A08(), this.A0C);
        return new EE(interfaceC0328Bt.A7I(), interfaceC0328Bt.A7i(), this.A0C);
    }

    private XV A03(InterfaceC0328Bt interfaceC0328Bt) throws IOException, InterruptedException {
        C0470Hz c0470Hz = new C0470Hz(this.A0C.A02);
        interfaceC0328Bt.ADv(c0470Hz.A00, 0, this.A0C.A02);
        int i = 21;
        if ((this.A0C.A05 & 1) != 0) {
            int i2 = this.A0C.A01;
            if (A0F[5].length() != 24) {
                throw new RuntimeException();
            }
            String[] strArr = A0F;
            strArr[6] = "1a7oiXE";
            strArr[1] = "rh";
            if (i2 != 1) {
                i = 36;
            }
        } else if (this.A0C.A01 == 1) {
            i = 13;
        }
        int xingBase = A01(c0470Hz, i);
        if (xingBase == A0J || xingBase == A0H) {
            E4 A01 = E4.A01(interfaceC0328Bt.A7I(), interfaceC0328Bt.A7i(), this.A0C, c0470Hz);
            if (A01 != null && !this.A0A.A03()) {
                interfaceC0328Bt.AFM();
                interfaceC0328Bt.A3W(i + Opcodes.F2D);
                C0470Hz frame = this.A0D;
                interfaceC0328Bt.ADv(frame.A00, 0, 3);
                C0470Hz frame2 = this.A0D;
                frame2.A0Y(0);
                C0331Bw c0331Bw = this.A0A;
                C0470Hz frame3 = this.A0D;
                c0331Bw.A04(frame3.A0G());
            }
            interfaceC0328Bt.AGP(this.A0C.A02);
            if (A01 != null && !A01.A9I() && xingBase == A0H) {
                return A02(interfaceC0328Bt);
            }
            return A01;
        }
        if (xingBase == A0I) {
            EC A00 = EC.A00(interfaceC0328Bt.A7I(), interfaceC0328Bt.A7i(), this.A0C, c0470Hz);
            interfaceC0328Bt.AGP(this.A0C.A02);
            return A00;
        }
        interfaceC0328Bt.AFM();
        return null;
    }

    public static boolean A06(int i, long j) {
        return ((long) ((-128000) & i)) == ((-128000) & j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x009d, code lost:
    
        if (r15 == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x009f, code lost:
    
        r14.AGP(r6 + r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00a3, code lost:
    
        r13.A01 = r7;
        r2 = com.meta.analytics.dsp.uinode.XU.A0F;
        r1 = r2[2];
        r2 = r2[7];
        r1 = r1.charAt(28);
        r0 = r2.charAt(28);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00b7, code lost:
    
        if (r1 == r0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00b9, code lost:
    
        com.meta.analytics.dsp.uinode.XU.A0F[0] = "JRrUIGwZBJczcB1fqhgNVGoVSbza2n0c";
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00c0, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00c1, code lost:
    
        r14.AFM();
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean A07(InterfaceC0328Bt interfaceC0328Bt, boolean z) throws IOException, InterruptedException {
        int candidateSynchronizedHeaderData;
        int frameSize = 0;
        int i = 0;
        int searchedBytes = 0;
        int headerData = 0;
        int searchLimitBytes = z ? 16384 : 131072;
        interfaceC0328Bt.AFM();
        if (interfaceC0328Bt.A7i() == 0) {
            int i2 = this.A08;
            String[] strArr = A0F;
            String str = strArr[4];
            String str2 = strArr[3];
            int candidateSynchronizedHeaderData2 = str.charAt(21);
            int validFrameCount = str2.charAt(21);
            if (candidateSynchronizedHeaderData2 != validFrameCount) {
                String[] strArr2 = A0F;
                strArr2[6] = "aodgJ9F";
                strArr2[1] = "Mh";
                int validFrameCount2 = i2 & 2;
                int validFrameCount3 = validFrameCount2 != 0 ? 1 : 0;
                Metadata A00 = this.A0B.A00(interfaceC0328Bt, validFrameCount3 != 0 ? C0331Bw.A04 : null);
                this.A07 = A00;
                if (A00 != null) {
                    C0331Bw c0331Bw = this.A0A;
                    int candidateSynchronizedHeaderData3 = A0F[5].length();
                    if (candidateSynchronizedHeaderData3 != 24) {
                        String[] strArr3 = A0F;
                        strArr3[2] = "kwUpXSrSJ0NLH72x1DIQc8Fq054MCj03";
                        strArr3[7] = "uritoxjB27zl8eiC6KQaQvgdEg1vP6Ps";
                        c0331Bw.A05(A00);
                    } else {
                        A0F[0] = "W2SW3glva3ohlkheP4GgDHO6E3mNlxjo";
                        c0331Bw.A05(A00);
                    }
                }
                searchedBytes = (int) interfaceC0328Bt.A7d();
                if (!z) {
                    interfaceC0328Bt.AGP(searchedBytes);
                }
            }
            throw new RuntimeException();
        }
        while (true) {
            byte[] bArr = this.A0D.A00;
            boolean z2 = frameSize > 0;
            String[] strArr4 = A0F;
            String str3 = strArr4[4];
            String str4 = strArr4[3];
            int candidateSynchronizedHeaderData4 = str3.charAt(21);
            int validFrameCount4 = str4.charAt(21);
            if (candidateSynchronizedHeaderData4 != validFrameCount4) {
                A0F[0] = "F41ajW8QxYjYysO7QQhMOwz5jLXMzQYc";
                if (!interfaceC0328Bt.ADw(bArr, 0, 4, z2)) {
                    break;
                }
                this.A0D.A0Y(0);
                int A08 = this.A0D.A08();
                if ((i == 0 && !A06(A08, i)) || (candidateSynchronizedHeaderData = By.A00(A08)) == -1) {
                    int candidateSynchronizedHeaderData5 = headerData + 1;
                    if (headerData == searchLimitBytes) {
                        if (z) {
                            return false;
                        }
                        throw new C02789v(A04(4, 24, 32));
                    }
                    frameSize = 0;
                    i = 0;
                    if (z) {
                        interfaceC0328Bt.AFM();
                        int validFrameCount5 = searchedBytes + candidateSynchronizedHeaderData5;
                        interfaceC0328Bt.A3W(validFrameCount5);
                    } else {
                        interfaceC0328Bt.AGP(1);
                    }
                    headerData = candidateSynchronizedHeaderData5;
                } else {
                    frameSize++;
                    if (frameSize != 1) {
                        By.A04(A08, this.A0C);
                        i = A08;
                    } else if (frameSize == 4) {
                        break;
                    }
                    int validFrameCount6 = candidateSynchronizedHeaderData - 4;
                    interfaceC0328Bt.A3W(validFrameCount6);
                }
            } else {
                if (!interfaceC0328Bt.ADw(bArr, 0, 4, z2)) {
                    break;
                }
                this.A0D.A0Y(0);
                int A082 = this.A0D.A08();
                if (i == 0) {
                }
                frameSize++;
                if (frameSize != 1) {
                }
                int validFrameCount62 = candidateSynchronizedHeaderData - 4;
                interfaceC0328Bt.A3W(validFrameCount62);
            }
            throw new RuntimeException();
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0327Bs
    public final void A8o(InterfaceC0329Bu interfaceC0329Bu) {
        this.A04 = interfaceC0329Bu;
        this.A05 = interfaceC0329Bu.AGi(0, 1);
        this.A04.A5Y();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0327Bs
    public final int AEH(InterfaceC0328Bt interfaceC0328Bt, C0332Bz c0332Bz) throws IOException, InterruptedException {
        if (this.A01 == 0) {
            try {
                A07(interfaceC0328Bt, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.A06 == null) {
            XV A03 = A03(interfaceC0328Bt);
            this.A06 = A03;
            if (A03 == null || (!A03.A9I() && (this.A08 & 1) != 0)) {
                this.A06 = A02(interfaceC0328Bt);
            }
            this.A04.AFi(this.A06);
            this.A05.A5n(Format.A05(null, this.A0C.A06, null, -1, 4096, this.A0C.A01, this.A0C.A03, -1, this.A0A.A00, this.A0A.A01, null, null, 0, null, (this.A08 & 2) != 0 ? null : this.A07));
        }
        return A00(interfaceC0328Bt);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0327Bs
    public final void AFh(long j, long j2) {
        this.A01 = 0;
        this.A02 = -9223372036854775807L;
        this.A03 = 0L;
        this.A00 = 0;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0327Bs
    public final boolean AGR(InterfaceC0328Bt interfaceC0328Bt) throws IOException, InterruptedException {
        return A07(interfaceC0328Bt, true);
    }
}
