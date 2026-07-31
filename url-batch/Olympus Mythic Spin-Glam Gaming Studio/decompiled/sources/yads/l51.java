package yads;

/* loaded from: classes15.dex */
public final class l51 extends au {
    public final cu j;
    public zn k;
    public long l;
    public volatile boolean m;

    public l51(q30 q30Var, v30 v30Var, jw0 jw0Var, int i, Object obj, cu cuVar) {
        super(q30Var, v30Var, 2, jw0Var, i, obj, -9223372036854775807L, -9223372036854775807L);
        this.j = cuVar;
    }

    @Override // yads.cg1
    public final void a() {
        int a;
        if (this.l == 0) {
            ((qq) this.j).a(this.k, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            v30 v30Var = this.b;
            long j = this.l;
            long j2 = v30Var.g;
            long j3 = -1;
            if (j2 != -1) {
                j3 = j2 - j;
            }
            v30 a2 = v30Var.a(j, j3);
            c43 c43Var = this.i;
            pd0 pd0Var = new pd0(c43Var, a2.f, c43Var.a(a2));
            do {
                try {
                    if (this.m) {
                        break;
                    }
                    a = ((qq) this.j).b.a(pd0Var, qq.l);
                    if (a == 1) {
                        throw new IllegalStateException();
                    }
                } finally {
                    this.l = pd0Var.d - this.b.f;
                }
            } while (a == 0);
        } finally {
            t30.a(this.i);
        }
    }

    @Override // yads.cg1
    public final void b() {
        this.m = true;
    }
}
