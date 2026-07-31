package yads;

/* loaded from: classes3.dex */
public final class y33 implements mx2 {
    public final /* synthetic */ mx2 a;
    public final /* synthetic */ z33 b;

    public y33(z33 z33Var, mx2 mx2Var) {
        this.b = z33Var;
        this.a = mx2Var;
    }

    @Override // yads.mx2
    public final boolean b() {
        return this.a.b();
    }

    @Override // yads.mx2
    public final long c() {
        return this.a.c();
    }

    @Override // yads.mx2
    public final kx2 b(long j) {
        kx2 b = this.a.b(j);
        ox2 ox2Var = b.a;
        long j2 = ox2Var.a;
        long j3 = ox2Var.b;
        long j4 = this.b.b;
        ox2 ox2Var2 = new ox2(j2, j3 + j4);
        ox2 ox2Var3 = b.b;
        return new kx2(ox2Var2, new ox2(ox2Var3.a, ox2Var3.b + j4));
    }
}
