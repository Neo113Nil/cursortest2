package yads;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class qd {
    public final long a;
    public final g73 b;
    public final int c;
    public final pm1 d;
    public final long e;
    public final g73 f;
    public final int g;
    public final pm1 h;
    public final long i;
    public final long j;

    public qd(long j, g73 g73Var, int i, pm1 pm1Var, long j2, g73 g73Var2, int i2, pm1 pm1Var2, long j3, long j4) {
        this.a = j;
        this.b = g73Var;
        this.c = i;
        this.d = pm1Var;
        this.e = j2;
        this.f = g73Var2;
        this.g = i2;
        this.h = pm1Var2;
        this.i = j3;
        this.j = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qd.class != obj.getClass()) {
            return false;
        }
        qd qdVar = (qd) obj;
        return this.a == qdVar.a && this.c == qdVar.c && this.e == qdVar.e && this.g == qdVar.g && this.i == qdVar.i && this.j == qdVar.j && x92.a(this.b, qdVar.b) && x92.a(this.d, qdVar.d) && x92.a(this.f, qdVar.f) && x92.a(this.h, qdVar.h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), this.b, Integer.valueOf(this.c), this.d, Long.valueOf(this.e), this.f, Integer.valueOf(this.g), this.h, Long.valueOf(this.i), Long.valueOf(this.j)});
    }
}
