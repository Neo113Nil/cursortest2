package yads;

/* loaded from: classes15.dex */
public final class at1 implements gm1, fm1 {
    public final gm1 b;
    public final long c;
    public fm1 d;

    public at1(gm1 gm1Var, long j) {
        this.b = gm1Var;
        this.c = j;
    }

    @Override // yads.hy2
    public final void a(iy2 iy2Var) {
        fm1 fm1Var = this.d;
        fm1Var.getClass();
        fm1Var.a((iy2) this);
    }

    @Override // yads.iy2
    public final boolean c(long j) {
        return this.b.c(j - this.c);
    }

    @Override // yads.iy2
    public final long getBufferedPositionUs() {
        long bufferedPositionUs = this.b.getBufferedPositionUs();
        if (bufferedPositionUs == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return this.c + bufferedPositionUs;
    }

    @Override // yads.iy2
    public final long getNextLoadPositionUs() {
        long nextLoadPositionUs = this.b.getNextLoadPositionUs();
        if (nextLoadPositionUs == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return this.c + nextLoadPositionUs;
    }

    @Override // yads.gm1
    public final y73 getTrackGroups() {
        return this.b.getTrackGroups();
    }

    @Override // yads.iy2
    public final boolean isLoading() {
        return this.b.isLoading();
    }

    @Override // yads.gm1
    public final void maybeThrowPrepareError() {
        this.b.maybeThrowPrepareError();
    }

    @Override // yads.gm1
    public final long readDiscontinuity() {
        long readDiscontinuity = this.b.readDiscontinuity();
        if (readDiscontinuity == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.c + readDiscontinuity;
    }

    @Override // yads.iy2
    public final void reevaluateBuffer(long j) {
        this.b.reevaluateBuffer(j - this.c);
    }

    @Override // yads.gm1
    public final long seekToUs(long j) {
        return this.b.seekToUs(j - this.c) + this.c;
    }

    @Override // yads.gm1
    public final void a(fm1 fm1Var, long j) {
        this.d = fm1Var;
        this.b.a(this, j - this.c);
    }

    @Override // yads.gm1
    public final long a(xo0[] xo0VarArr, boolean[] zArr, ys2[] ys2VarArr, boolean[] zArr2, long j) {
        ys2[] ys2VarArr2 = new ys2[ys2VarArr.length];
        int i = 0;
        while (true) {
            ys2 ys2Var = null;
            if (i >= ys2VarArr.length) {
                break;
            }
            bt1 bt1Var = (bt1) ys2VarArr[i];
            if (bt1Var != null) {
                ys2Var = bt1Var.b;
            }
            ys2VarArr2[i] = ys2Var;
            i++;
        }
        long a = this.b.a(xo0VarArr, zArr, ys2VarArr2, zArr2, j - this.c);
        for (int i2 = 0; i2 < ys2VarArr.length; i2++) {
            ys2 ys2Var2 = ys2VarArr2[i2];
            if (ys2Var2 == null) {
                ys2VarArr[i2] = null;
            } else {
                ys2 ys2Var3 = ys2VarArr[i2];
                if (ys2Var3 == null || ((bt1) ys2Var3).b != ys2Var2) {
                    ys2VarArr[i2] = new bt1(ys2Var2, this.c);
                }
            }
        }
        return a + this.c;
    }

    @Override // yads.gm1
    public final void a(long j) {
        this.b.a(j - this.c);
    }

    @Override // yads.gm1
    public final long a(long j, nx2 nx2Var) {
        return this.b.a(j - this.c, nx2Var) + this.c;
    }

    @Override // yads.fm1
    public final void a(gm1 gm1Var) {
        fm1 fm1Var = this.d;
        fm1Var.getClass();
        fm1Var.a((gm1) this);
    }
}
