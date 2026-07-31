package yads;

/* loaded from: classes15.dex */
public final class u93 implements ix2 {
    public final wb2 a = new wb2(new byte[4]);
    public final /* synthetic */ w93 b;

    public u93(w93 w93Var) {
        this.b = w93Var;
    }

    @Override // yads.ix2
    public final void a(m73 m73Var, wp0 wp0Var, z93 z93Var) {
    }

    @Override // yads.ix2
    public final void a(xb2 xb2Var) {
        if (xb2Var.k() == 0 && (xb2Var.k() & 128) != 0) {
            xb2Var.e(xb2Var.b + 6);
            int i = (xb2Var.c - xb2Var.b) / 4;
            for (int i2 = 0; i2 < i; i2++) {
                wb2 wb2Var = this.a;
                xb2Var.a(wb2Var.a, 0, 4);
                wb2Var.b(0);
                int a = this.a.a(16);
                this.a.c(3);
                if (a == 0) {
                    this.a.c(13);
                } else {
                    int a2 = this.a.a(13);
                    if (this.b.g.get(a2) == null) {
                        w93 w93Var = this.b;
                        w93Var.g.put(a2, new jx2(new v93(w93Var, a2)));
                        this.b.m++;
                    }
                }
            }
            w93 w93Var2 = this.b;
            if (w93Var2.a != 2) {
                w93Var2.g.remove(0);
            }
        }
    }
}
