package yads;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;

/* loaded from: classes12.dex */
public final class vx2 extends tx2 {
    public final hb3 j;
    public final hb3 k;
    public final long l;

    public vx2(tl2 tl2Var, long j, long j2, long j3, long j4, long j5, List list, long j6, hb3 hb3Var, hb3 hb3Var2, long j7, long j8) {
        super(tl2Var, j, j2, j3, j5, list, j6, j7, j8);
        this.j = hb3Var;
        this.k = hb3Var2;
        this.l = j4;
    }

    @Override // yads.yx2
    public final tl2 a(oo2 oo2Var) {
        hb3 hb3Var = this.j;
        if (hb3Var == null) {
            return this.a;
        }
        jw0 jw0Var = oo2Var.a;
        return new tl2(hb3Var.a(jw0Var.b, 0L, jw0Var.i, 0L), 0L, -1L);
    }

    @Override // yads.tx2
    public final tl2 a(mo2 mo2Var, long j) {
        long j2;
        List list = this.f;
        if (list != null) {
            j2 = ((wx2) list.get((int) (j - this.d))).a;
        } else {
            j2 = (j - this.d) * this.e;
        }
        long j3 = j2;
        hb3 hb3Var = this.k;
        jw0 jw0Var = mo2Var.a;
        return new tl2(hb3Var.a(jw0Var.b, j, jw0Var.i, j3), 0L, -1L);
    }

    @Override // yads.tx2
    public final long a(long j) {
        if (this.f != null) {
            return r0.size();
        }
        long j2 = this.l;
        if (j2 != -1) {
            return (j2 - this.d) + 1;
        }
        if (j == -9223372036854775807L) {
            return -1L;
        }
        BigInteger multiply = BigInteger.valueOf(j).multiply(BigInteger.valueOf(this.b));
        BigInteger multiply2 = BigInteger.valueOf(this.e).multiply(BigInteger.valueOf(1000000L));
        RoundingMode roundingMode = RoundingMode.CEILING;
        int i = dp.$r8$clinit;
        return new BigDecimal(multiply).divide(new BigDecimal(multiply2), 0, roundingMode).toBigIntegerExact().longValue();
    }
}
