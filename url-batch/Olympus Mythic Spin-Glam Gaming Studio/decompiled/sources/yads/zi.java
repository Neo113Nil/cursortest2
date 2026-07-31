package yads;

/* loaded from: classes4.dex */
public final class zi {
    public final int a;
    public int b;
    public int c;
    public long d;
    public final boolean e;
    public final xb2 f;
    public final xb2 g;
    public int h;
    public int i;

    public zi(xb2 xb2Var, xb2 xb2Var2, boolean z) {
        this.g = xb2Var;
        this.f = xb2Var2;
        this.e = z;
        xb2Var2.e(12);
        this.a = xb2Var2.n();
        xb2Var.e(12);
        this.i = xb2Var.n();
        xp0.a("first_chunk must be 1", xb2Var.a() == 1);
        this.b = -1;
    }

    public final boolean a() {
        int i = this.b + 1;
        this.b = i;
        if (i == this.a) {
            return false;
        }
        this.d = this.e ? this.f.o() : this.f.l();
        if (this.b == this.h) {
            this.c = this.g.n();
            xb2 xb2Var = this.g;
            xb2Var.e(xb2Var.b + 4);
            int i2 = this.i - 1;
            this.i = i2;
            this.h = i2 > 0 ? this.g.n() - 1 : -1;
        }
        return true;
    }
}
