package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class ib {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public ib(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final ib a(long j, long j2, long j3, long j4) {
        return new ib(j != 16 ? j : this.a, j2 != 16 ? j2 : this.b, j3 != 16 ? j3 : this.c, j4 != 16 ? j4 : this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ib)) {
            return false;
        }
        ib ibVar = (ib) obj;
        return ge.c(this.a, ibVar.a) && ge.c(this.b, ibVar.b) && ge.c(this.c, ibVar.c) && ge.c(this.d, ibVar.d);
    }

    public final int hashCode() {
        return ge.i(this.d) + ((ge.i(this.c) + ((ge.i(this.b) + (ge.i(this.a) * 31)) * 31)) * 31);
    }
}
