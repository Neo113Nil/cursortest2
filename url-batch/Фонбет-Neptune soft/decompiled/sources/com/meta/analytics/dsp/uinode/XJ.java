package com.meta.analytics.dsp.uinode;

import com.google.common.base.Ascii;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import kotlin.io.encoding.Base64;

/* loaded from: assets/audience_network.dex */
public final class XJ implements InterfaceC0343Cl {
    public static byte[] A0C;
    public static String[] A0D = {"qlUqm53dx2wRFYI19yFYkvkmPQFopPfK", "kfzPj4jiKhQrTstJ9wOtTomcMDMJFI2R", "tio4jxSpdKgrcMNksdh3F2ai0PxCizyi", "S5qskWqDqPkhPpuUuuvRcKySD9vc4n0H", "X67UodKHNvmZa3DnASt4fZlpL2cJMcNV", "01LnOYH7rGQp5f5o2UGBiyg7bnJQxBa8", "qDTiiMVukWANjWrPbJo4riKeblMOo1tu", "5dAWhKcmsHilqUXjq3PFXu2GkNxyPnDG"};
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public final long A08;
    public final long A09;
    public final C0342Ck A0A = new C0342Ck();
    public final AbstractC0346Co A0B;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 18 out of bounds for length 18
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private final long A01(long j, InterfaceC0328Bt interfaceC0328Bt) throws IOException, InterruptedException {
        if (this.A04 == this.A01) {
            return -(this.A05 + 2);
        }
        long A7i = interfaceC0328Bt.A7i();
        if (!A0D(interfaceC0328Bt, this.A01)) {
            long j2 = this.A04;
            if (j2 != A7i) {
                return j2;
            }
            throw new IOException(A09(0, 25, 22));
        }
        this.A0A.A03(interfaceC0328Bt, false);
        interfaceC0328Bt.AFM();
        long j3 = j - this.A0A.A05;
        int i = this.A0A.A01 + this.A0A.A00;
        if (j3 >= 0 && j3 <= 72000) {
            interfaceC0328Bt.AGP(i);
            return -(this.A0A.A05 + 2);
        }
        if (j3 < 0) {
            this.A01 = A7i;
            this.A02 = this.A0A.A05;
        } else {
            this.A04 = interfaceC0328Bt.A7i() + i;
            this.A05 = this.A0A.A05;
            if ((this.A01 - this.A04) + i < 100000) {
                interfaceC0328Bt.AGP(i);
                return -(this.A05 + 2);
            }
        }
        long j4 = this.A01;
        long j5 = this.A04;
        String[] strArr = A0D;
        if (strArr[4].charAt(12) == strArr[0].charAt(12)) {
            throw new RuntimeException();
        }
        A0D[3] = "zvKF8WQUI0SajHpo4Xv9v8DHT9e2MTPL";
        if (j4 - j5 < 100000) {
            this.A01 = j5;
            return j5;
        }
        long j6 = i;
        long j7 = j3 > 0 ? 1L : 2L;
        long A7i2 = interfaceC0328Bt.A7i();
        long j8 = this.A01;
        long j9 = this.A04;
        return Math.min(Math.max((A7i2 - (j6 * j7)) + (((j8 - j9) * j3) / (this.A02 - this.A05)), j9), this.A01 - 1);
    }

    public static String A09(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0C, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 78);
        }
        return new String(copyOfRange);
    }

    public static void A0A() {
        A0C = new byte[]{Ascii.SYN, 55, 120, 55, 63, 63, 120, 40, 57, 63, Base64.padSymbol, 120, 59, 57, 54, 120, 58, Base64.padSymbol, 120, 62, 55, 45, 54, 60, 118};
    }

    static {
        A0A();
    }

    public XJ(long j, long j2, AbstractC0346Co abstractC0346Co, int i, long j3) {
        AbstractC0445Ha.A03(j >= 0 && j2 > j);
        this.A0B = abstractC0346Co;
        this.A09 = j;
        this.A08 = j2;
        if (i == j2 - j) {
            this.A07 = j3;
            this.A00 = 3;
        } else {
            this.A00 = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long A00(long j, long j2, long j3) {
        long j4 = this.A08;
        long j5 = this.A09;
        long j6 = j + ((((j4 - j5) * j2) / this.A07) - j3);
        if (j6 < j5) {
            j6 = this.A09;
        }
        if (j6 >= j4) {
            return j4 - 1;
        }
        return j6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0051, code lost:
    
        return r5.A0A.A05;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final long A02(InterfaceC0328Bt interfaceC0328Bt) throws IOException, InterruptedException {
        A0C(interfaceC0328Bt);
        this.A0A.A02();
        while (true) {
            int i = this.A0A.A04;
            String[] strArr = A0D;
            if (strArr[4].charAt(12) == strArr[0].charAt(12)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0D;
            strArr2[1] = "8L7HD1AI4we5ropKbStlQEIIPOmJrEUL";
            strArr2[2] = "xLnKc6RM4Edpr9DSdPLSxPAMnW98GKHb";
            if ((i & 4) == 4 || interfaceC0328Bt.A7i() >= this.A08) {
                break;
            }
            this.A0A.A03(interfaceC0328Bt, false);
            interfaceC0328Bt.AGP(this.A0A.A01 + this.A0A.A00);
        }
    }

    private final long A03(InterfaceC0328Bt interfaceC0328Bt, long j, long j2) throws IOException, InterruptedException {
        this.A0A.A03(interfaceC0328Bt, false);
        while (this.A0A.A05 < j) {
            interfaceC0328Bt.AGP(this.A0A.A01 + this.A0A.A00);
            j2 = this.A0A.A05;
            this.A0A.A03(interfaceC0328Bt, false);
        }
        interfaceC0328Bt.AFM();
        return j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meta.analytics.dsp.uinode.InterfaceC0343Cl
    /* renamed from: A07, reason: merged with bridge method [inline-methods] */
    public final XK A4m() {
        C0340Ci c0340Ci = null;
        if (this.A07 != 0) {
            return new XK(this);
        }
        return null;
    }

    private final void A0B() {
        this.A04 = this.A09;
        this.A01 = this.A08;
        this.A05 = 0L;
        this.A02 = this.A07;
    }

    private final void A0C(InterfaceC0328Bt interfaceC0328Bt) throws IOException, InterruptedException {
        if (A0D(interfaceC0328Bt, this.A08)) {
        } else {
            throw new EOFException();
        }
    }

    private final boolean A0D(InterfaceC0328Bt interfaceC0328Bt, long j) throws IOException, InterruptedException {
        long min = Math.min(3 + j, this.A08);
        byte[] bArr = new byte[2048];
        int i = bArr.length;
        while (true) {
            if (interfaceC0328Bt.A7i() + i > min && (i = (int) (min - interfaceC0328Bt.A7i())) < 4) {
                return false;
            }
            interfaceC0328Bt.ADw(bArr, 0, i, false);
            for (int i2 = 0; i2 < i - 3; i2++) {
                int peekLength = bArr[i2];
                if (peekLength == 79 && bArr[i2 + 1] == 103 && bArr[i2 + 2] == 103) {
                    int peekLength2 = bArr[i2 + 3];
                    if (peekLength2 == 83) {
                        interfaceC0328Bt.AGP(i2);
                        return true;
                    }
                }
            }
            interfaceC0328Bt.AGP(i - 3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x007c, code lost:
    
        if (r1 > r3) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007e, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0091, code lost:
    
        if (r1 > r3) goto L25;
     */
    @Override // com.meta.analytics.dsp.uinode.InterfaceC0343Cl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long AEI(InterfaceC0328Bt interfaceC0328Bt) throws IOException, InterruptedException {
        long j;
        long currentGranule;
        switch (this.A00) {
            case 0:
                long A7i = interfaceC0328Bt.A7i();
                this.A03 = A7i;
                this.A00 = 1;
                long j2 = this.A08;
                if (A0D[5].charAt(14) == 'E') {
                    String[] strArr = A0D;
                    strArr[4] = "CYddPgWATLyxqxIaeTkpx7ccDiEA63Cn";
                    strArr[0] = "yHXSkk2QTXaOjUGCO1LifWaF4YjGjaVe";
                    j = j2 - 65307;
                    break;
                } else {
                    String[] strArr2 = A0D;
                    strArr2[1] = "y7O6pPdi4ZltSjD6KADDWtfh1EQ3ypYE";
                    strArr2[2] = "PCOWfrd56ab6qHMTUxzEVaAjhpd6ZxlM";
                    j = j2 - 65307;
                    break;
                }
            case 1:
                break;
            case 2:
                long currentGranule2 = this.A06;
                if (A0D[3].charAt(18) != 'v') {
                    throw new RuntimeException();
                }
                A0D[3] = "5HAo5Th3dlJMt4bYi9vd99sok2AKRnDx";
                if (currentGranule2 == 0) {
                    currentGranule = 0;
                } else {
                    long position = A01(currentGranule2, interfaceC0328Bt);
                    if (position >= 0) {
                        return position;
                    }
                    currentGranule = A03(interfaceC0328Bt, this.A06, -(position + 2));
                }
                this.A00 = 3;
                return -(2 + currentGranule);
            case 3:
                return -1L;
            default:
                throw new IllegalStateException();
        }
        this.A07 = A02(interfaceC0328Bt);
        this.A00 = 3;
        return this.A03;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0343Cl
    public final long AGX(long j) {
        int i = this.A00;
        AbstractC0445Ha.A03(i == 3 || i == 2);
        long j2 = 0;
        if (j != 0) {
            j2 = this.A0B.A04(j);
        }
        this.A06 = j2;
        this.A00 = 2;
        A0B();
        return this.A06;
    }
}
