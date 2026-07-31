package yads;

/* loaded from: classes5.dex */
public final class g0 implements zl0 {
    public final wb2 a;
    public final xb2 b;
    public final String c;
    public String d;
    public c83 e;
    public int f;
    public int g;
    public boolean h;
    public long i;
    public jw0 j;
    public int k;
    public long l;

    public g0(String str) {
        wb2 wb2Var = new wb2(new byte[16]);
        this.a = wb2Var;
        this.b = new xb2(wb2Var.a);
        this.f = 0;
        this.g = 0;
        this.h = false;
        this.l = -9223372036854775807L;
        this.c = str;
    }

    @Override // yads.zl0
    public final void a() {
        this.f = 0;
        this.g = 0;
        this.h = false;
        this.l = -9223372036854775807L;
    }

    @Override // yads.zl0
    public final void b() {
    }

    @Override // yads.zl0
    public final void a(wp0 wp0Var, z93 z93Var) {
        z93Var.a();
        z93Var.b();
        this.d = z93Var.e;
        z93Var.b();
        this.e = wp0Var.a(z93Var.d, 1);
    }

    @Override // yads.zl0
    public final void a(int i, long j) {
        if (j != -9223372036854775807L) {
            this.l = j;
        }
    }

    @Override // yads.zl0
    public final void a(xb2 xb2Var) {
        if (this.e == null) {
            throw new IllegalStateException();
        }
        while (true) {
            int i = xb2Var.c - xb2Var.b;
            if (i <= 0) {
                return;
            }
            int i2 = this.f;
            if (i2 == 0) {
                while (xb2Var.c - xb2Var.b > 0) {
                    if (!this.h) {
                        this.h = xb2Var.k() == 172;
                    } else {
                        int k = xb2Var.k();
                        this.h = k == 172;
                        if (k == 64 || k == 65) {
                            boolean z = k == 65;
                            this.f = 1;
                            byte[] bArr = this.b.a;
                            bArr[0] = -84;
                            bArr[1] = (byte) (z ? 65 : 64);
                            this.g = 2;
                        }
                    }
                }
            } else if (i2 == 1) {
                byte[] bArr2 = this.b.a;
                int min = Math.min(i, 16 - this.g);
                xb2Var.a(bArr2, this.g, min);
                int i3 = this.g + min;
                this.g = i3;
                if (i3 == 16) {
                    this.a.b(0);
                    h0 a = i0.a(this.a);
                    jw0 jw0Var = this.j;
                    if (jw0Var == null || 2 != jw0Var.z || a.a != jw0Var.A || !"audio/ac4".equals(jw0Var.m)) {
                        iw0 iw0Var = new iw0();
                        iw0Var.a = this.d;
                        iw0Var.k = "audio/ac4";
                        iw0Var.x = 2;
                        iw0Var.y = a.a;
                        iw0Var.c = this.c;
                        jw0 jw0Var2 = new jw0(iw0Var);
                        this.j = jw0Var2;
                        this.e.a(jw0Var2);
                    }
                    this.k = a.b;
                    this.i = (a.c * 1000000) / this.j.A;
                    this.b.e(0);
                    this.e.a(16, this.b);
                    this.f = 2;
                }
            } else if (i2 == 2) {
                int min2 = Math.min(i, this.k - this.g);
                this.e.a(min2, xb2Var);
                int i4 = this.g + min2;
                this.g = i4;
                int i5 = this.k;
                if (i4 == i5) {
                    long j = this.l;
                    if (j != -9223372036854775807L) {
                        this.e.a(j, 1, i5, 0, null);
                        this.l += this.i;
                    }
                    this.f = 0;
                }
            }
        }
    }
}
