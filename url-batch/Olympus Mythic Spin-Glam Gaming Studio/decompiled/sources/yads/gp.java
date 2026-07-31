package yads;

/* loaded from: classes5.dex */
public final class gp implements mx2 {
    public final jp a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;

    public gp(jp jpVar, long j, long j2, long j3, long j4, long j5) {
        this.a = jpVar;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = j5;
    }

    @Override // yads.mx2
    public final boolean b() {
        return true;
    }

    @Override // yads.mx2
    public final long c() {
        return this.b;
    }

    @Override // yads.mx2
    public final kx2 b(long j) {
        ox2 ox2Var = new ox2(j, ip.a(this.a.a(j), 0L, this.c, this.d, this.e, this.f));
        return new kx2(ox2Var, ox2Var);
    }
}
