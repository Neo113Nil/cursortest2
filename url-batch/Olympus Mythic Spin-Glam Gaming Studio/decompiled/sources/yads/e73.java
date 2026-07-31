package yads;

/* loaded from: classes6.dex */
public final class e73 extends g73 {
    public final um2 c;
    public final um2 d;
    public final int[] e;
    public final int[] f;

    public e73(um2 um2Var, um2 um2Var2, int[] iArr) {
        if (um2Var.e != iArr.length) {
            throw new IllegalArgumentException();
        }
        this.c = um2Var;
        this.d = um2Var2;
        this.e = iArr;
        this.f = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            this.f[iArr[i]] = i;
        }
    }

    @Override // yads.g73
    public final f73 a(int i, f73 f73Var, long j) {
        f73 f73Var2 = (f73) this.c.get(i);
        f73Var.a(f73Var2.b, f73Var2.d, f73Var2.e, f73Var2.f, f73Var2.g, f73Var2.h, f73Var2.i, f73Var2.j, f73Var2.l, f73Var2.n, f73Var2.o, f73Var2.p, f73Var2.q, f73Var2.r);
        f73Var.m = f73Var2.m;
        return f73Var;
    }

    @Override // yads.g73
    public final int b() {
        return this.c.e;
    }

    @Override // yads.g73
    public final int b(boolean z) {
        if (c()) {
            return -1;
        }
        if (z) {
            return this.e[this.c.e - 1];
        }
        return this.c.e - 1;
    }

    @Override // yads.g73
    public final int a(int i, int i2, boolean z) {
        if (i2 == 1) {
            return i;
        }
        if (i != b(z)) {
            return z ? this.e[this.f[i] + 1] : i + 1;
        }
        if (i2 == 2) {
            return a(z);
        }
        return -1;
    }

    @Override // yads.g73
    public final int a(int i, int i2) {
        if (i2 == 1) {
            return i;
        }
        if (i != a(false)) {
            return i - 1;
        }
        if (i2 == 2) {
            return b(false);
        }
        return -1;
    }

    @Override // yads.g73
    public final int a(boolean z) {
        if (c()) {
            return -1;
        }
        if (z) {
            return this.e[0];
        }
        return 0;
    }

    @Override // yads.g73
    public final int a() {
        return this.d.e;
    }

    @Override // yads.g73
    public final d73 a(int i, d73 d73Var, boolean z) {
        d73 d73Var2 = (d73) this.d.get(i);
        d73Var.a(d73Var2.b, d73Var2.c, d73Var2.d, d73Var2.e, d73Var2.f, d73Var2.h, d73Var2.g);
        return d73Var;
    }

    @Override // yads.g73
    public final int a(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // yads.g73
    public final Object a(int i) {
        throw new UnsupportedOperationException();
    }
}
