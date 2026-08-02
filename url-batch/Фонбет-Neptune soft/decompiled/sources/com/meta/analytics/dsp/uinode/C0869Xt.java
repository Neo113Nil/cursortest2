package com.meta.analytics.dsp.uinode;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* renamed from: com.facebook.ads.redexgen.X.Xt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0869Xt implements InterfaceC0284Ab {
    public static String[] A0D = {"pWxjFsNDaGkCJOJIXf3nBpXapJRDFAns", "UkLwcPvzhTn0p2HYHg4j6N15VQJC2l4J", "YJRY7F74jhCJ9GxMtbKfeDIDzZlQRHvd", "", "", "sMHZoQnzt9jO1PxekMXjLs1IjEAfMk8v", "KagcOA94TBJJAh6RgnCdHwb09FdTTp2T", "s5OQD0o5JvIPNjQnPDHHdNmWUeQWTVLd"};
    public int A04;
    public long A06;
    public long A07;
    public B6 A08;
    public ByteBuffer A09;
    public ByteBuffer A0A;
    public ShortBuffer A0B;
    public boolean A0C;
    public float A01 = 1.0f;
    public float A00 = 1.0f;
    public int A02 = -1;
    public int A05 = -1;
    public int A03 = -1;

    public C0869Xt() {
        ByteBuffer byteBuffer = InterfaceC0284Ab.A00;
        this.A09 = byteBuffer;
        this.A0B = byteBuffer.asShortBuffer();
        this.A0A = InterfaceC0284Ab.A00;
        this.A04 = -1;
    }

    public final float A00(float f) {
        float A00 = IF.A00(f, 0.1f, 8.0f);
        if (this.A00 != A00) {
            this.A00 = A00;
            this.A08 = null;
        }
        flush();
        return A00;
    }

    public final float A01(float f) {
        float A00 = IF.A00(f, 0.1f, 8.0f);
        if (this.A01 != A00) {
            this.A01 = A00;
            this.A08 = null;
        }
        flush();
        return A00;
    }

    public final long A02(long j) {
        long j2 = this.A07;
        if (j2 >= 1024) {
            int i = this.A03;
            int i2 = this.A05;
            if (A0D[5].charAt(5) != 'Q') {
                throw new RuntimeException();
            }
            A0D[1] = "wo8T89BmhgCv6RPfRPDSoWflpmmFSmBw";
            if (i == i2) {
                return IF.A0F(j, this.A06, j2);
            }
            return IF.A0F(j, this.A06 * i, j2 * i2);
        }
        return (long) (this.A01 * j);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0284Ab
    public final boolean A4Q(int i, int i2, int i3) throws C0283Aa {
        if (i3 == 2) {
            int i4 = this.A04;
            if (i4 == -1) {
                i4 = i;
            }
            int outputSampleRateHz = this.A05;
            if (outputSampleRateHz == i) {
                int outputSampleRateHz2 = this.A02;
                if (outputSampleRateHz2 == i2) {
                    int outputSampleRateHz3 = this.A03;
                    if (outputSampleRateHz3 == i4) {
                        return false;
                    }
                }
            }
            this.A05 = i;
            this.A02 = i2;
            this.A03 = i4;
            this.A08 = null;
            return true;
        }
        throw new C0283Aa(i, i2, i3);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0284Ab
    public final ByteBuffer A7W() {
        ByteBuffer byteBuffer = this.A0A;
        ByteBuffer outputBuffer = InterfaceC0284Ab.A00;
        this.A0A = outputBuffer;
        return byteBuffer;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0284Ab
    public final int A7X() {
        return this.A02;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0284Ab
    public final int A7Y() {
        return 2;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0284Ab
    public final int A7Z() {
        return this.A03;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0284Ab
    public final boolean A8w() {
        return this.A05 != -1 && (Math.abs(this.A01 - 1.0f) >= 0.01f || Math.abs(this.A00 - 1.0f) >= 0.01f || this.A03 != this.A05);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0284Ab
    public final boolean A91() {
        B6 b6;
        return this.A0C && ((b6 = this.A08) == null || b6.A0H() == 0);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0284Ab
    public final void AEE() {
        AbstractC0445Ha.A04(this.A08 != null);
        this.A08.A0J();
        this.A0C = true;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0284Ab
    public final void AEF(ByteBuffer byteBuffer) {
        AbstractC0445Ha.A04(this.A08 != null);
        boolean hasRemaining = byteBuffer.hasRemaining();
        if (A0D[1].charAt(8) != 'h') {
            throw new RuntimeException();
        }
        A0D[0] = "CgSP7s2gOF1CWMy2qVo8ASfS0wZJy2y3";
        if (hasRemaining) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.A06 += remaining;
            this.A08.A0L(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
        int A0H = this.A08.A0H() * this.A02 * 2;
        if (A0H > 0) {
            int outputSize = this.A09.capacity();
            if (outputSize < A0H) {
                ByteBuffer order = ByteBuffer.allocateDirect(A0H).order(ByteOrder.nativeOrder());
                this.A09 = order;
                this.A0B = order.asShortBuffer();
            } else {
                this.A09.clear();
                this.A0B.clear();
            }
            this.A08.A0K(this.A0B);
            this.A07 += A0H;
            this.A09.limit(A0H);
            this.A0A = this.A09;
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0284Ab
    public final void flush() {
        if (A8w()) {
            B6 b6 = this.A08;
            if (b6 == null) {
                this.A08 = new B6(this.A05, this.A02, this.A01, this.A00, this.A03);
            } else {
                b6.A0I();
            }
        }
        this.A0A = InterfaceC0284Ab.A00;
        this.A06 = 0L;
        this.A07 = 0L;
        this.A0C = false;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0284Ab
    public final void reset() {
        this.A01 = 1.0f;
        this.A00 = 1.0f;
        this.A02 = -1;
        this.A05 = -1;
        this.A03 = -1;
        ByteBuffer byteBuffer = InterfaceC0284Ab.A00;
        this.A09 = byteBuffer;
        this.A0B = byteBuffer.asShortBuffer();
        this.A0A = InterfaceC0284Ab.A00;
        this.A04 = -1;
        this.A08 = null;
        this.A06 = 0L;
        this.A07 = 0L;
        this.A0C = false;
    }
}
