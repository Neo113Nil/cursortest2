package yads;

import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class wl0 implements zl0 {
    public final List a;
    public final c83[] b;
    public boolean c;
    public int d;
    public int e;
    public long f = -9223372036854775807L;

    public wl0(List list) {
        this.a = list;
        this.b = new c83[list.size()];
    }

    @Override // yads.zl0
    public final void a() {
        this.c = false;
        this.f = -9223372036854775807L;
    }

    @Override // yads.zl0
    public final void b() {
        if (this.c) {
            if (this.f != -9223372036854775807L) {
                for (c83 c83Var : this.b) {
                    c83Var.a(this.f, 1, this.e, 0, null);
                }
            }
            this.c = false;
        }
    }

    @Override // yads.zl0
    public final void a(wp0 wp0Var, z93 z93Var) {
        for (int i = 0; i < this.b.length; i++) {
            x93 x93Var = (x93) this.a.get(i);
            z93Var.a();
            z93Var.b();
            c83 a = wp0Var.a(z93Var.d, 3);
            iw0 iw0Var = new iw0();
            z93Var.b();
            iw0Var.a = z93Var.e;
            iw0Var.k = "application/dvbsubs";
            iw0Var.m = Collections.singletonList(x93Var.b);
            iw0Var.c = x93Var.a;
            a.a(new jw0(iw0Var));
            this.b[i] = a;
        }
    }

    @Override // yads.zl0
    public final void a(int i, long j) {
        if ((i & 4) == 0) {
            return;
        }
        this.c = true;
        if (j != -9223372036854775807L) {
            this.f = j;
        }
        this.e = 0;
        this.d = 2;
    }

    @Override // yads.zl0
    public final void a(xb2 xb2Var) {
        boolean z;
        boolean z2;
        if (this.c) {
            if (this.d == 2) {
                if (xb2Var.c - xb2Var.b == 0) {
                    z2 = false;
                } else {
                    if (xb2Var.k() != 32) {
                        this.c = false;
                    }
                    this.d--;
                    z2 = this.c;
                }
                if (!z2) {
                    return;
                }
            }
            if (this.d == 1) {
                if (xb2Var.c - xb2Var.b == 0) {
                    z = false;
                } else {
                    if (xb2Var.k() != 0) {
                        this.c = false;
                    }
                    this.d--;
                    z = this.c;
                }
                if (!z) {
                    return;
                }
            }
            int i = xb2Var.b;
            int i2 = xb2Var.c - i;
            for (c83 c83Var : this.b) {
                xb2Var.e(i);
                c83Var.a(i2, xb2Var);
            }
            this.e += i2;
        }
    }
}
