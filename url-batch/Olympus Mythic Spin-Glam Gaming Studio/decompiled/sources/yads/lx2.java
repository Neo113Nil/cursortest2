package yads;

/* loaded from: classes6.dex */
public class lx2 implements mx2 {
    public final long a;
    public final kx2 b;

    public lx2(long j, long j2) {
        this.a = j;
        ox2 ox2Var = j2 == 0 ? ox2.c : new ox2(0L, j2);
        this.b = new kx2(ox2Var, ox2Var);
    }

    @Override // yads.mx2
    public final boolean b() {
        return false;
    }

    @Override // yads.mx2
    public final long c() {
        return this.a;
    }

    @Override // yads.mx2
    public final kx2 b(long j) {
        return this.b;
    }
}
