package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class ys0 implements jz0 {
    public final jz0 d;
    public final long e;

    public ys0(jz0 jz0Var, long j) {
        this.d = jz0Var;
        this.e = j;
    }

    @Override // defpackage.jz0
    public final boolean a() {
        return this.d.a();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ys0)) {
            return false;
        }
        ys0 ys0Var = (ys0) obj;
        return ys0Var.e == this.e && nz.l(ys0Var.d, this.d);
    }

    @Override // defpackage.jz0
    public final i7 g(long j, i7 i7Var, i7 i7Var2, i7 i7Var3) {
        long j2 = this.e;
        return j < j2 ? i7Var3 : this.d.g(j - j2, i7Var, i7Var2, i7Var3);
    }

    public final int hashCode() {
        int hashCode = this.d.hashCode() * 31;
        long j = this.e;
        return hashCode + ((int) (j ^ (j >>> 32)));
    }

    @Override // defpackage.jz0
    public final i7 j(long j, i7 i7Var, i7 i7Var2, i7 i7Var3) {
        long j2 = this.e;
        return j < j2 ? i7Var : this.d.j(j - j2, i7Var, i7Var2, i7Var3);
    }

    @Override // defpackage.jz0
    public final i7 k(i7 i7Var, i7 i7Var2, i7 i7Var3) {
        return g(m(i7Var, i7Var2, i7Var3), i7Var, i7Var2, i7Var3);
    }

    @Override // defpackage.jz0
    public final long m(i7 i7Var, i7 i7Var2, i7 i7Var3) {
        return this.d.m(i7Var, i7Var2, i7Var3) + this.e;
    }
}
