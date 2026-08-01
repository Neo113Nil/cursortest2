package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class lz0 implements jz0 {
    public final sa0 d;
    public final int e;
    public final long f;
    public final long g = 0;

    public lz0(sa0 sa0Var, int i) {
        this.d = sa0Var;
        this.e = i;
        this.f = (sa0Var.e + sa0Var.d) * 1000000;
    }

    @Override // defpackage.jz0
    public final boolean a() {
        return true;
    }

    public final long b(long j) {
        long j2 = j + this.g;
        if (j2 <= 0) {
            return 0L;
        }
        long j3 = this.f;
        long j4 = j2 / j3;
        if (this.e != 1 && j4 % 2 != 0) {
            return ((j4 + 1) * j3) - j2;
        }
        Long.signum(j4);
        return j2 - (j4 * j3);
    }

    public final i7 c(long j, i7 i7Var, i7 i7Var2, i7 i7Var3) {
        long j2 = this.g;
        long j3 = j + j2;
        long j4 = this.f;
        if (j3 <= j4) {
            return i7Var2;
        }
        return ((k2) this.d.f).g(j4 - j2, i7Var, i7Var3, i7Var2);
    }

    @Override // defpackage.jz0
    public final i7 g(long j, i7 i7Var, i7 i7Var2, i7 i7Var3) {
        return ((k2) this.d.f).g(b(j), i7Var, i7Var2, c(j, i7Var, i7Var3, i7Var2));
    }

    @Override // defpackage.jz0
    public final i7 j(long j, i7 i7Var, i7 i7Var2, i7 i7Var3) {
        return ((k2) this.d.f).j(b(j), i7Var, i7Var2, c(j, i7Var, i7Var3, i7Var2));
    }

    @Override // defpackage.jz0
    public final i7 k(i7 i7Var, i7 i7Var2, i7 i7Var3) {
        return g(Long.MAX_VALUE, i7Var, i7Var2, i7Var3);
    }

    @Override // defpackage.jz0
    public final long m(i7 i7Var, i7 i7Var2, i7 i7Var3) {
        return Long.MAX_VALUE;
    }
}
