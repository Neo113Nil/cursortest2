package yads;

/* loaded from: classes5.dex */
public final class ej implements bj {
    public final xb2 a;
    public final int b;
    public final int c;
    public int d;
    public int e;

    public ej(xi xiVar) {
        xb2 xb2Var = xiVar.b;
        this.a = xb2Var;
        xb2Var.e(12);
        this.c = xb2Var.n() & 255;
        this.b = xb2Var.n();
    }

    @Override // yads.bj
    public final int a() {
        return -1;
    }

    @Override // yads.bj
    public final int b() {
        return this.b;
    }

    @Override // yads.bj
    public final int c() {
        int i = this.c;
        if (i == 8) {
            return this.a.k();
        }
        if (i == 16) {
            return this.a.p();
        }
        int i2 = this.d;
        this.d = i2 + 1;
        if (i2 % 2 != 0) {
            return this.e & 15;
        }
        int k = this.a.k();
        this.e = k;
        return (k & 240) >> 4;
    }
}
