package yads;

/* loaded from: classes4.dex */
public final class li1 implements gm1, fm1 {
    public final pm1 b;
    public final long c;
    public final ub0 d;
    public ao e;
    public gm1 f;
    public fm1 g;
    public long i = -9223372036854775807L;

    public li1(pm1 pm1Var, ub0 ub0Var, long j) {
        this.b = pm1Var;
        this.d = ub0Var;
        this.c = j;
    }

    @Override // yads.hy2
    public final void a(iy2 iy2Var) {
        fm1 fm1Var = this.g;
        int i = sb3.a;
        fm1Var.a((iy2) this);
    }

    @Override // yads.iy2
    public final boolean c(long j) {
        gm1 gm1Var = this.f;
        return gm1Var != null && gm1Var.c(j);
    }

    @Override // yads.iy2
    public final long getBufferedPositionUs() {
        gm1 gm1Var = this.f;
        int i = sb3.a;
        return gm1Var.getBufferedPositionUs();
    }

    @Override // yads.iy2
    public final long getNextLoadPositionUs() {
        gm1 gm1Var = this.f;
        int i = sb3.a;
        return gm1Var.getNextLoadPositionUs();
    }

    @Override // yads.gm1
    public final y73 getTrackGroups() {
        gm1 gm1Var = this.f;
        int i = sb3.a;
        return gm1Var.getTrackGroups();
    }

    @Override // yads.iy2
    public final boolean isLoading() {
        gm1 gm1Var = this.f;
        return gm1Var != null && gm1Var.isLoading();
    }

    @Override // yads.gm1
    public final void maybeThrowPrepareError() {
        gm1 gm1Var = this.f;
        if (gm1Var != null) {
            gm1Var.maybeThrowPrepareError();
            return;
        }
        ao aoVar = this.e;
        if (aoVar != null) {
            aoVar.d();
        }
    }

    @Override // yads.gm1
    public final long readDiscontinuity() {
        gm1 gm1Var = this.f;
        int i = sb3.a;
        return gm1Var.readDiscontinuity();
    }

    @Override // yads.iy2
    public final void reevaluateBuffer(long j) {
        gm1 gm1Var = this.f;
        int i = sb3.a;
        gm1Var.reevaluateBuffer(j);
    }

    @Override // yads.gm1
    public final long seekToUs(long j) {
        gm1 gm1Var = this.f;
        int i = sb3.a;
        return gm1Var.seekToUs(j);
    }

    public final void a(pm1 pm1Var) {
        long j = this.c;
        long j2 = this.i;
        if (j2 != -9223372036854775807L) {
            j = j2;
        }
        ao aoVar = this.e;
        aoVar.getClass();
        gm1 a = aoVar.a(pm1Var, this.d, j);
        this.f = a;
        if (this.g != null) {
            a.a(this, j);
        }
    }

    @Override // yads.gm1
    public final void a(fm1 fm1Var, long j) {
        this.g = fm1Var;
        gm1 gm1Var = this.f;
        if (gm1Var != null) {
            long j2 = this.c;
            long j3 = this.i;
            if (j3 != -9223372036854775807L) {
                j2 = j3;
            }
            gm1Var.a(this, j2);
        }
    }

    @Override // yads.gm1
    public final long a(xo0[] xo0VarArr, boolean[] zArr, ys2[] ys2VarArr, boolean[] zArr2, long j) {
        long j2;
        long j3 = this.i;
        if (j3 == -9223372036854775807L || j != this.c) {
            j2 = j;
        } else {
            this.i = -9223372036854775807L;
            j2 = j3;
        }
        gm1 gm1Var = this.f;
        int i = sb3.a;
        return gm1Var.a(xo0VarArr, zArr, ys2VarArr, zArr2, j2);
    }

    @Override // yads.gm1
    public final void a(long j) {
        gm1 gm1Var = this.f;
        int i = sb3.a;
        gm1Var.a(j);
    }

    @Override // yads.gm1
    public final long a(long j, nx2 nx2Var) {
        gm1 gm1Var = this.f;
        int i = sb3.a;
        return gm1Var.a(j, nx2Var);
    }

    @Override // yads.fm1
    public final void a(gm1 gm1Var) {
        fm1 fm1Var = this.g;
        int i = sb3.a;
        fm1Var.a((gm1) this);
    }
}
