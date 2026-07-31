package yads;

import java.util.List;

/* loaded from: classes4.dex */
public abstract class tx2 extends yx2 {
    public final long d;
    public final long e;
    public final List f;
    public final long g;
    public final long h;
    public final long i;

    public tx2(tl2 tl2Var, long j, long j2, long j3, long j4, List list, long j5, long j6, long j7) {
        super(tl2Var, j, j2);
        this.d = j3;
        this.e = j4;
        this.f = list;
        this.i = j5;
        this.g = j6;
        this.h = j7;
    }

    public abstract long a(long j);

    public final long a(long j, long j2) {
        if (a(j) == -1) {
            long j3 = this.g;
            if (j3 != -9223372036854775807L) {
                return Math.max(this.d, c((j2 - this.h) - j3, j));
            }
        }
        return this.d;
    }

    public abstract tl2 a(mo2 mo2Var, long j);

    public final long b(long j, long j2) {
        List list = this.f;
        if (list != null) {
            return (((wx2) list.get((int) (j - this.d))).b * 1000000) / this.b;
        }
        long a = a(j2);
        return (a == -1 || j != (this.d + a) - 1) ? (this.e * 1000000) / this.b : j2 - b(j);
    }

    public final long c(long j, long j2) {
        long j3 = this.d;
        long a = a(j2);
        if (a == 0) {
            return j3;
        }
        if (this.f == null) {
            long j4 = (j / ((this.e * 1000000) / this.b)) + this.d;
            return j4 < j3 ? j3 : a == -1 ? j4 : Math.min(j4, (j3 + a) - 1);
        }
        long j5 = (a + j3) - 1;
        long j6 = j3;
        while (j6 <= j5) {
            long j7 = ((j5 - j6) / 2) + j6;
            long b = b(j7);
            if (b < j) {
                j6 = j7 + 1;
            } else {
                if (b <= j) {
                    return j7;
                }
                j5 = j7 - 1;
            }
        }
        return j6 == j3 ? j6 : j5;
    }

    public final long b(long j) {
        long j2;
        List list = this.f;
        if (list != null) {
            j2 = ((wx2) list.get((int) (j - this.d))).a - this.c;
        } else {
            j2 = (j - this.d) * this.e;
        }
        return sb3.a(j2, 1000000L, this.b);
    }

    public boolean a() {
        return this.f != null;
    }
}
