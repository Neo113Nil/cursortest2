package o;

/* renamed from: o.gh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1119gh {
    float c();

    float f();

    default float i(float f) {
        return f() * f;
    }

    default float o(long j) {
        float c;
        float c2;
        if (!C1896sV.a(C1830rV.b(j), 4294967296L)) {
            throw new IllegalStateException("Only Sp can convert to Px");
        }
        float[] fArr = AbstractC1454lo.a;
        if (c() >= 1.03f) {
            InterfaceC1388ko a = AbstractC1454lo.a(c());
            c = C1830rV.c(j);
            if (a != null) {
                return a.a(c);
            }
            c2 = c();
        } else {
            c = C1830rV.c(j);
            c2 = c();
        }
        return c2 * c;
    }

    default int p(float f) {
        float i = i(f);
        if (Float.isInfinite(i)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(i);
    }

    default long w(long j) {
        if (j != 9205357640488583168L) {
            return AbstractC1035fP.a(i(Float.intBitsToFloat((int) (j >> 32))), i(Float.intBitsToFloat((int) (j & 4294967295L))));
        }
        return 9205357640488583168L;
    }

    default float x(long j) {
        if (C1896sV.a(C1830rV.b(j), 4294967296L)) {
            return i(o(j));
        }
        throw new IllegalStateException("Only Sp can convert to Px");
    }
}
