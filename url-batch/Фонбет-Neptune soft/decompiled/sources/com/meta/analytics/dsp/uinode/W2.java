package com.meta.analytics.dsp.uinode;

import com.google.common.base.Ascii;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class W2 implements InterfaceC0432Gm {
    public static byte[] A08;
    public int A00;
    public int A01;
    public int A02;
    public C0431Gl[] A03;
    public final int A04;
    public final boolean A05;
    public final byte[] A06;
    public final C0431Gl[] A07;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 19);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A08 = new byte[]{100, 104, 40, 19, Ascii.CAN, 5, Ascii.CR, Ascii.CAN, Ascii.RS, 9, Ascii.CAN, Ascii.EM, 93, Ascii.FS, 17, 17, Ascii.DC2, Ascii.RS, Ascii.FS, 9, Ascii.DC4, Ascii.DC2, 19, 71, 93};
    }

    public W2(boolean z, int i) {
        this(z, i, 0);
    }

    public W2(boolean z, int i, int i2) {
        AbstractC0445Ha.A03(i > 0);
        AbstractC0445Ha.A03(i2 >= 0);
        this.A05 = z;
        this.A04 = i;
        this.A01 = i2;
        this.A03 = new C0431Gl[i2 + 100];
        if (i2 > 0) {
            this.A06 = new byte[i2 * i];
            for (int i3 = 0; i3 < i2; i3++) {
                this.A03[i3] = new C0431Gl(this.A06, i3 * i);
            }
        } else {
            this.A06 = null;
        }
        this.A07 = new C0431Gl[1];
    }

    public final synchronized int A02() {
        return this.A00 * this.A04;
    }

    public final synchronized void A03() {
        if (this.A05) {
            A04(0);
        }
    }

    public final synchronized void A04(int i) {
        boolean targetBufferSizeReduced = i < this.A02;
        this.A02 = i;
        if (targetBufferSizeReduced) {
            AGj();
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0432Gm
    public final synchronized C0431Gl A3X() {
        C0431Gl c0431Gl;
        this.A00++;
        int i = this.A01;
        if (i > 0) {
            C0431Gl[] c0431GlArr = this.A03;
            int i2 = i - 1;
            this.A01 = i2;
            c0431Gl = c0431GlArr[i2];
            c0431GlArr[i2] = null;
        } else {
            c0431Gl = new C0431Gl(new byte[this.A04], 0);
        }
        return c0431Gl;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0432Gm
    public final int A7D() {
        return this.A04;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0432Gm
    public final synchronized void AEW(C0431Gl c0431Gl) {
        C0431Gl[] c0431GlArr = this.A07;
        c0431GlArr[0] = c0431Gl;
        AEX(c0431GlArr);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0432Gm
    public final synchronized void AEX(C0431Gl[] c0431GlArr) {
        int i = this.A01;
        int length = c0431GlArr.length + i;
        C0431Gl[] c0431GlArr2 = this.A03;
        if (length >= c0431GlArr2.length) {
            this.A03 = (C0431Gl[]) Arrays.copyOf(c0431GlArr2, Math.max(c0431GlArr2.length * 2, i + c0431GlArr.length));
        }
        for (C0431Gl c0431Gl : c0431GlArr) {
            if (c0431Gl.A01 == this.A06 || c0431Gl.A01.length == this.A04) {
                C0431Gl[] c0431GlArr3 = this.A03;
                int i2 = this.A01;
                this.A01 = i2 + 1;
                c0431GlArr3[i2] = c0431Gl;
            } else {
                throw new IllegalArgumentException(A00(2, 23, 110) + System.identityHashCode(c0431Gl.A01) + A00(0, 2, 91) + System.identityHashCode(this.A06) + A00(0, 2, 91) + c0431Gl.A01.length + A00(0, 2, 91) + this.A04);
            }
        }
        this.A00 -= c0431GlArr.length;
        notifyAll();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0432Gm
    public final synchronized void AGj() {
        int A04 = IF.A04(this.A02, this.A04);
        int targetAllocationCount = this.A00;
        int highIndex = Math.max(0, A04 - targetAllocationCount);
        int targetAvailableCount = this.A01;
        if (highIndex >= targetAvailableCount) {
            return;
        }
        if (this.A06 != null) {
            int lowIndex = 0;
            int i = targetAvailableCount - 1;
            while (lowIndex <= i) {
                C0431Gl highAllocation = this.A03[lowIndex];
                if (highAllocation.A01 == this.A06) {
                    lowIndex++;
                } else {
                    C0431Gl lowAllocation = this.A03[i];
                    if (lowAllocation.A01 != this.A06) {
                        i--;
                    } else {
                        C0431Gl[] c0431GlArr = this.A03;
                        c0431GlArr[lowIndex] = lowAllocation;
                        int targetAllocationCount2 = i - 1;
                        c0431GlArr[i] = highAllocation;
                        i = targetAllocationCount2;
                        lowIndex++;
                    }
                }
            }
            highIndex = Math.max(highIndex, lowIndex);
            int targetAllocationCount3 = this.A01;
            if (highIndex >= targetAllocationCount3) {
                return;
            }
        }
        Arrays.fill(this.A03, highIndex, this.A01, (Object) null);
        this.A01 = highIndex;
    }
}
