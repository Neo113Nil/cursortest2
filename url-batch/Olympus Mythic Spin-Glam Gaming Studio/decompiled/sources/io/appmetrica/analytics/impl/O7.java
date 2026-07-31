package io.appmetrica.analytics.impl;

/* loaded from: classes8.dex */
public final class O7 {
    public final long a;
    public final int b;

    public O7(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O7)) {
            return false;
        }
        O7 o7 = (O7) obj;
        return this.a == o7.a && this.b == o7.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "DecimalProtoModel(mantissa=" + this.a + ", exponent=" + this.b + ')';
    }
}
