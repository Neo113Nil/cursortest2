package com.meta.analytics.dsp.uinode;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class Y1 implements InterfaceC0284Ab {
    public boolean A04;
    public boolean A05;
    public int[] A06;
    public int[] A07;
    public ByteBuffer A02 = InterfaceC0284Ab.A00;
    public ByteBuffer A03 = InterfaceC0284Ab.A00;
    public int A00 = -1;
    public int A01 = -1;

    public final void A00(int[] iArr) {
        this.A07 = iArr;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0284Ab
    public final boolean A4Q(int i, int i2, int i3) throws C0283Aa {
        boolean z = !Arrays.equals(this.A07, this.A06);
        int[] iArr = this.A07;
        this.A06 = iArr;
        if (iArr == null) {
            this.A04 = false;
            return z;
        }
        if (i3 == 2) {
            if (!z && this.A01 == i && this.A00 == i2) {
                return false;
            }
            this.A01 = i;
            this.A00 = i2;
            boolean outputChannelsChanged = i2 != iArr.length;
            this.A04 = outputChannelsChanged;
            int i4 = 0;
            while (true) {
                int[] iArr2 = this.A06;
                if (i4 >= iArr2.length) {
                    return true;
                }
                int i5 = iArr2[i4];
                if (i5 < i2) {
                    boolean z2 = this.A04;
                    boolean outputChannelsChanged2 = i5 != i4;
                    this.A04 = z2 | outputChannelsChanged2;
                    i4++;
                } else {
                    throw new C0283Aa(i, i2, i3);
                }
            }
        } else {
            throw new C0283Aa(i, i2, i3);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0284Ab
    public final ByteBuffer A7W() {
        ByteBuffer byteBuffer = this.A03;
        ByteBuffer outputBuffer = InterfaceC0284Ab.A00;
        this.A03 = outputBuffer;
        return byteBuffer;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0284Ab
    public final int A7X() {
        int[] iArr = this.A06;
        return iArr == null ? this.A00 : iArr.length;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0284Ab
    public final int A7Y() {
        return 2;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0284Ab
    public final int A7Z() {
        return this.A01;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0284Ab
    public final boolean A8w() {
        return this.A04;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0284Ab
    public final boolean A91() {
        return this.A05 && this.A03 == InterfaceC0284Ab.A00;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0284Ab
    public final void AEE() {
        this.A05 = true;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0284Ab
    public final void AEF(ByteBuffer byteBuffer) {
        AbstractC0445Ha.A04(this.A06 != null);
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int position2 = this.A00;
        int i = (limit - position) / (position2 * 2);
        int position3 = this.A06.length;
        int i2 = position3 * i * 2;
        int position4 = this.A02.capacity();
        if (position4 < i2) {
            this.A02 = ByteBuffer.allocateDirect(i2).order(ByteOrder.nativeOrder());
        } else {
            this.A02.clear();
        }
        while (position < limit) {
            for (int position5 : this.A06) {
                this.A02.putShort(byteBuffer.getShort((position5 * 2) + position));
            }
            int position6 = this.A00;
            position += position6 * 2;
        }
        byteBuffer.position(limit);
        this.A02.flip();
        this.A03 = this.A02;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0284Ab
    public final void flush() {
        this.A03 = InterfaceC0284Ab.A00;
        this.A05 = false;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0284Ab
    public final void reset() {
        flush();
        this.A02 = InterfaceC0284Ab.A00;
        this.A00 = -1;
        this.A01 = -1;
        this.A06 = null;
        this.A07 = null;
        this.A04 = false;
    }
}
