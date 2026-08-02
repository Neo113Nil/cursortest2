package com.meta.analytics.dsp.uinode;

/* renamed from: com.facebook.ads.redexgen.X.9x, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C02809x {
    public static final C02809x A04 = new C02809x(1.0f);
    public final float A00;
    public final float A01;
    public final boolean A02;
    public final int A03;

    public C02809x(float f) {
        this(f, 1.0f, false);
    }

    public C02809x(float f, float f2, boolean z) {
        AbstractC0445Ha.A03(f > 0.0f);
        AbstractC0445Ha.A03(f2 > 0.0f);
        this.A01 = f;
        this.A00 = f2;
        this.A02 = z;
        this.A03 = Math.round(1000.0f * f);
    }

    public final long A00(long j) {
        return this.A03 * j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C02809x c02809x = (C02809x) obj;
        return this.A01 == c02809x.A01 && this.A00 == c02809x.A00 && this.A02 == c02809x.A02;
    }

    public final int hashCode() {
        return (((((17 * 31) + Float.floatToRawIntBits(this.A01)) * 31) + Float.floatToRawIntBits(this.A00)) * 31) + (this.A02 ? 1 : 0);
    }
}
