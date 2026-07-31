package yads;

import java.io.EOFException;

/* loaded from: classes11.dex */
public final class aa2 {
    public int a;
    public long b;
    public int c;
    public int d;
    public int e;
    public final int[] f = new int[255];
    public final xb2 g = new xb2(255);

    public final boolean a(pd0 pd0Var, boolean z) {
        boolean z2;
        boolean z3;
        this.a = 0;
        this.b = 0L;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.g.c(27);
        try {
            z2 = pd0Var.b(this.g.a, 0, 27, z);
        } catch (EOFException e) {
            if (!z) {
                throw e;
            }
            z2 = false;
        }
        if (!z2 || this.g.l() != 1332176723) {
            return false;
        }
        if (this.g.k() != 0) {
            if (z) {
                return false;
            }
            throw cc2.a("unsupported bit stream revision");
        }
        this.a = this.g.k();
        this.b = this.g.d();
        this.g.e();
        this.g.e();
        this.g.e();
        int k = this.g.k();
        this.c = k;
        this.d = k + 27;
        this.g.c(k);
        try {
            z3 = pd0Var.b(this.g.a, 0, this.c, z);
        } catch (EOFException e2) {
            if (!z) {
                throw e2;
            }
            z3 = false;
        }
        if (!z3) {
            return false;
        }
        for (int i = 0; i < this.c; i++) {
            this.f[i] = this.g.k();
            this.e += this.f[i];
        }
        return true;
    }

    public final boolean a(pd0 pd0Var, long j) {
        boolean z;
        int min;
        long j2 = pd0Var.d;
        if (j2 == pd0Var.f + j2) {
            this.g.c(4);
            while (true) {
                if (j != -1 && pd0Var.d + 4 >= j) {
                    break;
                }
                try {
                    z = pd0Var.b(this.g.a, 0, 4, true);
                } catch (EOFException unused) {
                    z = false;
                }
                if (!z) {
                    break;
                }
                this.g.e(0);
                if (this.g.l() == 1332176723) {
                    pd0Var.f = 0;
                    return true;
                }
                pd0Var.a(1);
            }
            do {
                if (j != -1 && pd0Var.d >= j) {
                    break;
                }
                min = Math.min(pd0Var.g, 1);
                pd0Var.c(min);
                if (min == 0) {
                    byte[] bArr = pd0Var.a;
                    min = pd0Var.a(bArr, 0, Math.min(1, bArr.length), 0, true);
                }
                if (min != -1) {
                    pd0Var.d += min;
                }
            } while (min != -1);
            return false;
        }
        throw new IllegalArgumentException();
    }
}
