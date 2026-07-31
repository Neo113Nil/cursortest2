package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.nC, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C3588nC implements F0 {
    public int A00;
    public int A01;
    public int A02;
    public C2269Ey[] A03;
    public final int A04;
    public final boolean A05;
    public final byte[] A06;

    public C3588nC(boolean z, int i) {
        this(z, i, 0);
    }

    public C3588nC(boolean z, int i, int i2) {
        AbstractC20023y.A07(i > 0);
        AbstractC20023y.A07(i2 >= 0);
        this.A05 = z;
        this.A04 = i;
        this.A01 = i2;
        this.A03 = new C2269Ey[i2 + 100];
        if (i2 > 0) {
            this.A06 = new byte[i2 * i];
            for (int i3 = 0; i3 < i2; i3++) {
                this.A03[i3] = new C2269Ey(this.A06, i3 * i);
            }
            return;
        }
        this.A06 = null;
    }

    public final synchronized int A00() {
        return this.A00 * this.A04;
    }

    public final synchronized void A01() {
        if (this.A05) {
            A02(0);
        }
    }

    public final synchronized void A02(int i) {
        boolean targetBufferSizeReduced = i < this.A02;
        this.A02 = i;
        if (targetBufferSizeReduced) {
            AKT();
        }
    }

    @Override // com.facebook.ads.redexgen.core.F0
    public final synchronized C2269Ey A49() {
        C2269Ey c2269Ey;
        this.A00++;
        if (this.A01 > 0) {
            C2269Ey[] c2269EyArr = this.A03;
            int i = this.A01 - 1;
            this.A01 = i;
            c2269Ey = (C2269Ey) AbstractC20023y.A01(c2269EyArr[i]);
            this.A03[this.A01] = null;
        } else {
            c2269Ey = new C2269Ey(new byte[this.A04], 0);
            if (this.A00 > this.A03.length) {
                this.A03 = (C2269Ey[]) Arrays.copyOf(this.A03, this.A03.length * 2);
            }
        }
        return c2269Ey;
    }

    @Override // com.facebook.ads.redexgen.core.F0
    public final int A8I() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.core.F0
    public final synchronized void AHd(C2269Ey c2269Ey) {
        C2269Ey[] c2269EyArr = this.A03;
        int i = this.A01;
        this.A01 = i + 1;
        c2269EyArr[i] = c2269Ey;
        this.A00--;
        notifyAll();
    }

    @Override // com.facebook.ads.redexgen.core.F0
    public final synchronized void AHe(InterfaceC2270Ez interfaceC2270Ez) {
        while (interfaceC2270Ez != null) {
            C2269Ey[] c2269EyArr = this.A03;
            int i = this.A01;
            this.A01 = i + 1;
            c2269EyArr[i] = interfaceC2270Ez.A6u();
            this.A00--;
            interfaceC2270Ez = interfaceC2270Ez.ACc();
        }
        notifyAll();
    }

    @Override // com.facebook.ads.redexgen.core.F0
    public final synchronized void AKT() {
        int A05 = C5C.A05(this.A02, this.A04);
        int targetAllocationCount = this.A00;
        int max = Math.max(0, A05 - targetAllocationCount);
        int targetAllocationCount2 = this.A01;
        if (max >= targetAllocationCount2) {
            return;
        }
        if (this.A06 != null) {
            int lowIndex = 0;
            int targetAllocationCount3 = this.A01;
            int highIndex = targetAllocationCount3 - 1;
            while (lowIndex <= highIndex) {
                C2269Ey highAllocation = (C2269Ey) AbstractC20023y.A01(this.A03[lowIndex]);
                if (highAllocation.A01 == this.A06) {
                    lowIndex++;
                } else {
                    C2269Ey lowAllocation = (C2269Ey) AbstractC20023y.A01(this.A03[highIndex]);
                    if (lowAllocation.A01 != this.A06) {
                        highIndex--;
                    } else {
                        this.A03[lowIndex] = lowAllocation;
                        int targetAllocationCount4 = highIndex - 1;
                        this.A03[highIndex] = highAllocation;
                        highIndex = targetAllocationCount4;
                        lowIndex++;
                    }
                }
            }
            max = Math.max(max, lowIndex);
            int targetAllocationCount5 = this.A01;
            if (max >= targetAllocationCount5) {
                return;
            }
        }
        C2269Ey[] c2269EyArr = this.A03;
        int targetAvailableCount = this.A01;
        Arrays.fill(c2269EyArr, max, targetAvailableCount, (Object) null);
        this.A01 = max;
    }
}
