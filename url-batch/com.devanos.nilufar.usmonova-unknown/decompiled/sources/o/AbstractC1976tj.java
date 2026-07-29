package o;

/* renamed from: o.tj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1976tj implements Comparable {
    public static final long h;
    public static final long i;

    static {
        int i2 = AbstractC2108vj.a;
        h = Long.MAX_VALUE;
        i = -9223372036854775805L;
    }

    public static final long a() {
        int i2 = ((int) 0) & 1;
        long j = i;
        long j2 = h;
        if (i2 == 1 && 0 != j2 && 0 != j) {
            return 0L;
        }
        EnumC2174wj enumC2174wj = EnumC2174wj.MILLISECONDS;
        AbstractC0048Bt.n(enumC2174wj, "unit");
        if (0 == j2) {
            return Long.MAX_VALUE;
        }
        if (0 == j) {
            return Long.MIN_VALUE;
        }
        EnumC2174wj enumC2174wj2 = i2 == 0 ? EnumC2174wj.NANOSECONDS : enumC2174wj;
        AbstractC0048Bt.n(enumC2174wj2, "sourceUnit");
        return enumC2174wj.h.convert(0L, enumC2174wj2.h);
    }
}
