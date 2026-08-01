package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class xs0 implements c7 {
    public final c7 a;
    public final long b;

    public xs0(er erVar, long j) {
        this.a = erVar;
        this.b = j;
    }

    @Override // defpackage.c7
    public final jz0 a(j3 j3Var) {
        return new ys0(this.a.a(j3Var), this.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xs0)) {
            return false;
        }
        xs0 xs0Var = (xs0) obj;
        return xs0Var.b == this.b && nz.l(xs0Var.a, this.a);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        long j = this.b;
        return hashCode + ((int) (j ^ (j >>> 32)));
    }
}
