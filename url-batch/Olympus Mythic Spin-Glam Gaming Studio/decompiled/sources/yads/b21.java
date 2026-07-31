package yads;

/* loaded from: classes11.dex */
public final class b21 implements zl0 {
    public c83 b;
    public boolean c;
    public int e;
    public int f;
    public final xb2 a = new xb2(10);
    public long d = -9223372036854775807L;

    @Override // yads.zl0
    public final void a() {
        this.c = false;
        this.d = -9223372036854775807L;
    }

    @Override // yads.zl0
    public final void b() {
        int i;
        c83 c83Var = this.b;
        if (c83Var == null) {
            throw new IllegalStateException();
        }
        if (this.c && (i = this.e) != 0 && this.f == i) {
            long j = this.d;
            if (j != -9223372036854775807L) {
                c83Var.a(j, 1, i, 0, null);
            }
            this.c = false;
        }
    }

    @Override // yads.zl0
    public final void a(wp0 wp0Var, z93 z93Var) {
        z93Var.a();
        z93Var.b();
        c83 a = wp0Var.a(z93Var.d, 5);
        this.b = a;
        iw0 iw0Var = new iw0();
        z93Var.b();
        iw0Var.a = z93Var.e;
        iw0Var.k = "application/id3";
        a.a(new jw0(iw0Var));
    }

    @Override // yads.zl0
    public final void a(int i, long j) {
        if ((i & 4) == 0) {
            return;
        }
        this.c = true;
        if (j != -9223372036854775807L) {
            this.d = j;
        }
        this.e = 0;
        this.f = 0;
    }

    @Override // yads.zl0
    public final void a(xb2 xb2Var) {
        if (this.b != null) {
            if (this.c) {
                int i = xb2Var.c - xb2Var.b;
                int i2 = this.f;
                if (i2 < 10) {
                    int min = Math.min(i, 10 - i2);
                    System.arraycopy(xb2Var.a, xb2Var.b, this.a.a, this.f, min);
                    if (this.f + min == 10) {
                        this.a.e(0);
                        if (73 == this.a.k() && 68 == this.a.k() && 51 == this.a.k()) {
                            xb2 xb2Var2 = this.a;
                            xb2Var2.e(xb2Var2.b + 3);
                            this.e = this.a.j() + 10;
                        } else {
                            gh1.d("Id3Reader", "Discarding invalid ID3 tag");
                            this.c = false;
                            return;
                        }
                    }
                }
                int min2 = Math.min(i, this.e - this.f);
                this.b.a(min2, xb2Var);
                this.f += min2;
                return;
            }
            return;
        }
        throw new IllegalStateException();
    }
}
