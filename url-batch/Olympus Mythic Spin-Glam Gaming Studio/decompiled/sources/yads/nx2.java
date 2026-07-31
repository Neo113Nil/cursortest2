package yads;

/* loaded from: classes3.dex */
public final class nx2 {
    public static final nx2 c;
    public final long a;
    public final long b;

    static {
        nx2 nx2Var = new nx2(0L, 0L);
        new nx2(Long.MAX_VALUE, Long.MAX_VALUE);
        new nx2(Long.MAX_VALUE, 0L);
        new nx2(0L, Long.MAX_VALUE);
        c = nx2Var;
    }

    public nx2(long j, long j2) {
        if (j < 0) {
            throw new IllegalArgumentException();
        }
        if (j2 < 0) {
            throw new IllegalArgumentException();
        }
        this.a = j;
        this.b = j2;
    }

    public final long a(long j, long j2, long j3) {
        long j4 = this.a;
        if (j4 == 0 && this.b == 0) {
            return j;
        }
        int i = sb3.a;
        long j5 = j - j4;
        if (((j4 ^ j) & (j ^ j5)) < 0) {
            j5 = Long.MIN_VALUE;
        }
        long j6 = this.b;
        long j7 = j + j6;
        if (((j6 ^ j7) & (j ^ j7)) < 0) {
            j7 = Long.MAX_VALUE;
        }
        boolean z = false;
        boolean z2 = j5 <= j2 && j2 <= j7;
        if (j5 <= j3 && j3 <= j7) {
            z = true;
        }
        return (z2 && z) ? Math.abs(j2 - j) <= Math.abs(j3 - j) ? j2 : j3 : z2 ? j2 : z ? j3 : j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || nx2.class != obj.getClass()) {
            return false;
        }
        nx2 nx2Var = (nx2) obj;
        return this.a == nx2Var.a && this.b == nx2Var.b;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }
}
