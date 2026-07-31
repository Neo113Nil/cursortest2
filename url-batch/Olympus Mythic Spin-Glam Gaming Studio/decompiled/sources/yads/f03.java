package yads;

/* loaded from: classes5.dex */
public final class f03 extends xn {
    public final int o;
    public final jw0 p;
    public long q;
    public boolean r;

    public f03(q30 q30Var, v30 v30Var, jw0 jw0Var, int i, Object obj, long j, long j2, long j3, int i2, jw0 jw0Var2) {
        super(q30Var, v30Var, jw0Var, i, obj, j, j2, -9223372036854775807L, -9223372036854775807L, j3);
        this.o = i2;
        this.p = jw0Var2;
    }

    @Override // yads.cg1
    public final void a() {
        c83 hl0Var;
        zn znVar = this.m;
        if (znVar == null) {
            throw new IllegalStateException();
        }
        for (xs2 xs2Var : znVar.b) {
            if (xs2Var.E != 0) {
                xs2Var.E = 0L;
                xs2Var.z = true;
            }
        }
        int i = this.o;
        int i2 = 0;
        while (true) {
            int[] iArr = znVar.a;
            if (i2 >= iArr.length) {
                gh1.b("BaseMediaChunkOutput", "Unmatched track of type: " + i);
                hl0Var = new hl0();
                break;
            }
            if (i == iArr[i2]) {
                hl0Var = znVar.b[i2];
                break;
            }
            i2++;
        }
        c83 c83Var = hl0Var;
        c83Var.a(this.p);
        try {
            v30 v30Var = this.b;
            long j = this.q;
            long j2 = v30Var.g;
            long a = this.i.a(v30Var.a(j, j2 == -1 ? -1L : j2 - j));
            if (a != -1) {
                a += this.q;
            }
            pd0 pd0Var = new pd0(this.i, this.q, a);
            for (int i3 = 0; i3 != -1; i3 = c83Var.a(pd0Var, Integer.MAX_VALUE, true)) {
                this.q += i3;
            }
            c83Var.a(this.g, 1, (int) this.q, 0, null);
            t30.a(this.i);
            this.r = true;
        } catch (Throwable th) {
            t30.a(this.i);
            throw th;
        }
    }

    @Override // yads.cg1
    public final void b() {
    }

    @Override // yads.xn
    public final boolean d() {
        return this.r;
    }
}
