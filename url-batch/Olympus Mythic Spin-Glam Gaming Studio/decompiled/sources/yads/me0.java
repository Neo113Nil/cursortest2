package yads;

/* loaded from: classes5.dex */
public final class me0 implements mx2 {
    public final /* synthetic */ ne0 a;

    public me0(ne0 ne0Var) {
        this.a = ne0Var;
    }

    @Override // yads.mx2
    public final boolean b() {
        return true;
    }

    @Override // yads.mx2
    public final long c() {
        return (this.a.f * 1000000) / r0.d.i;
    }

    @Override // yads.mx2
    public final kx2 b(long j) {
        ne0 ne0Var = this.a;
        long j2 = (ne0Var.d.i * j) / 1000000;
        long j3 = ne0Var.b;
        long j4 = ne0Var.c;
        int i = sb3.a;
        ox2 ox2Var = new ox2(j, Math.max(j3, Math.min(((((j4 - j3) * j2) / ne0Var.f) + j3) - 30000, j4 - 1)));
        return new kx2(ox2Var, ox2Var);
    }
}
