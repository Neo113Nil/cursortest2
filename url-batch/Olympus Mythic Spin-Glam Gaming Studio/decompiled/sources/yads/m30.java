package yads;

/* loaded from: classes4.dex */
public final class m30 implements k30 {
    public final eu a;
    public final long b;

    public m30(eu euVar, long j) {
        this.a = euVar;
        this.b = j;
    }

    @Override // yads.k30
    public final long a(long j) {
        return this.a.e[(int) j] - this.b;
    }

    @Override // yads.k30
    public final boolean a() {
        return true;
    }

    @Override // yads.k30
    public final long b() {
        return 0L;
    }

    @Override // yads.k30
    public final long c(long j, long j2) {
        return 0L;
    }

    @Override // yads.k30
    public final long d(long j, long j2) {
        return -9223372036854775807L;
    }

    @Override // yads.k30
    public final long e(long j, long j2) {
        return this.a.a;
    }

    @Override // yads.k30
    public final long a(long j, long j2) {
        eu euVar = this.a;
        return sb3.b(euVar.e, j + this.b, true);
    }

    @Override // yads.k30
    public final long b(long j, long j2) {
        return this.a.d[(int) j];
    }

    @Override // yads.k30
    public final long c(long j) {
        return this.a.a;
    }

    @Override // yads.k30
    public final tl2 b(long j) {
        return new tl2(null, this.a.c[(int) j], r0.b[r8]);
    }
}
