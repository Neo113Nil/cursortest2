package yads;

import android.os.Bundle;

/* loaded from: classes5.dex */
public final class ql1 implements nq {
    public static final ql1 g = new ql1(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f);
    public static final mq h = new mq() { // from class: yads.ql1$$ExternalSyntheticLambda0
        @Override // yads.mq
        public final nq a(Bundle bundle) {
            return ql1.a(bundle);
        }
    };
    public final long b;
    public final long c;
    public final long d;
    public final float e;
    public final float f;

    public ql1(long j, long j2, long j3, float f, float f2) {
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = f;
        this.f = f2;
    }

    public static ql1 a(Bundle bundle) {
        return new ql1(bundle.getLong(Integer.toString(0, 36), -9223372036854775807L), bundle.getLong(Integer.toString(1, 36), -9223372036854775807L), bundle.getLong(Integer.toString(2, 36), -9223372036854775807L), bundle.getFloat(Integer.toString(3, 36), -3.4028235E38f), bundle.getFloat(Integer.toString(4, 36), -3.4028235E38f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ql1)) {
            return false;
        }
        ql1 ql1Var = (ql1) obj;
        return this.b == ql1Var.b && this.c == ql1Var.c && this.d == ql1Var.d && this.e == ql1Var.e && this.f == ql1Var.f;
    }

    public final int hashCode() {
        long j = this.b;
        long j2 = this.c;
        int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.d;
        int i2 = (i + ((int) ((j3 >>> 32) ^ j3))) * 31;
        float f = this.e;
        int floatToIntBits = (i2 + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31;
        float f2 = this.f;
        return floatToIntBits + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0);
    }
}
