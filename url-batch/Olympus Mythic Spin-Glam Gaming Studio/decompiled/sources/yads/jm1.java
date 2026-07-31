package yads;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: classes15.dex */
public final class jm1 {
    public final pm1 a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public jm1(pm1 pm1Var, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4) {
        if (z4 && !z2) {
            throw new IllegalArgumentException();
        }
        if (z3 && !z2) {
            throw new IllegalArgumentException();
        }
        if (z && (z2 || z3 || z4)) {
            throw new IllegalArgumentException();
        }
        this.a = pm1Var;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || jm1.class != obj.getClass()) {
            return false;
        }
        jm1 jm1Var = (jm1) obj;
        return this.b == jm1Var.b && this.c == jm1Var.c && this.d == jm1Var.d && this.e == jm1Var.e && this.f == jm1Var.f && this.g == jm1Var.g && this.h == jm1Var.h && this.i == jm1Var.i && sb3.a(this.a, jm1Var.a);
    }

    public final int hashCode() {
        return ((((((((((((((((this.a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + ((int) this.b)) * 31) + ((int) this.c)) * 31) + ((int) this.d)) * 31) + ((int) this.e)) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0);
    }
}
