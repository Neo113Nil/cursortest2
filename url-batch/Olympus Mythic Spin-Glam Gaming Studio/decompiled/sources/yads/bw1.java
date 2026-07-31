package yads;

import com.inmobi.media.core.config.models.AdConfig;

/* loaded from: classes4.dex */
public final class bw1 implements zl0 {
    public final xb2 a;
    public final cw1 b;
    public final String c;
    public c83 d;
    public String e;
    public int f = 0;
    public int g;
    public boolean h;
    public boolean i;
    public long j;
    public int k;
    public long l;

    public bw1(String str) {
        xb2 xb2Var = new xb2(4);
        this.a = xb2Var;
        xb2Var.a[0] = -1;
        this.b = new cw1();
        this.l = -9223372036854775807L;
        this.c = str;
    }

    @Override // yads.zl0
    public final void a() {
        this.f = 0;
        this.g = 0;
        this.i = false;
        this.l = -9223372036854775807L;
    }

    @Override // yads.zl0
    public final void b() {
    }

    @Override // yads.zl0
    public final void a(wp0 wp0Var, z93 z93Var) {
        z93Var.a();
        z93Var.b();
        this.e = z93Var.e;
        z93Var.b();
        this.d = wp0Var.a(z93Var.d, 1);
    }

    @Override // yads.zl0
    public final void a(int i, long j) {
        if (j != -9223372036854775807L) {
            this.l = j;
        }
    }

    @Override // yads.zl0
    public final void a(xb2 xb2Var) {
        if (this.d == null) {
            throw new IllegalStateException();
        }
        while (true) {
            int i = xb2Var.c;
            int i2 = xb2Var.b;
            int i3 = i - i2;
            if (i3 <= 0) {
                return;
            }
            int i4 = this.f;
            if (i4 == 0) {
                byte[] bArr = xb2Var.a;
                while (true) {
                    if (i2 < i) {
                        byte b = bArr[i2];
                        boolean z = (b & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) == 255;
                        boolean z2 = this.i && (b & 224) == 224;
                        this.i = z;
                        if (z2) {
                            xb2Var.e(i2 + 1);
                            this.i = false;
                            this.a.a[1] = bArr[i2];
                            this.g = 2;
                            this.f = 1;
                            break;
                        }
                        i2++;
                    } else {
                        xb2Var.e(i);
                        break;
                    }
                }
            } else if (i4 == 1) {
                int min = Math.min(i3, 4 - this.g);
                xb2Var.a(this.a.a, this.g, min);
                int i5 = this.g + min;
                this.g = i5;
                if (i5 >= 4) {
                    this.a.e(0);
                    if (!this.b.a(this.a.a())) {
                        this.g = 0;
                        this.f = 1;
                    } else {
                        cw1 cw1Var = this.b;
                        this.k = cw1Var.c;
                        if (!this.h) {
                            int i6 = cw1Var.d;
                            this.j = (cw1Var.g * 1000000) / i6;
                            iw0 iw0Var = new iw0();
                            iw0Var.a = this.e;
                            iw0Var.k = cw1Var.b;
                            iw0Var.l = 4096;
                            iw0Var.x = cw1Var.e;
                            iw0Var.y = i6;
                            iw0Var.c = this.c;
                            this.d.a(new jw0(iw0Var));
                            this.h = true;
                        }
                        this.a.e(0);
                        this.d.a(4, this.a);
                        this.f = 2;
                    }
                }
            } else if (i4 == 2) {
                int min2 = Math.min(i3, this.k - this.g);
                this.d.a(min2, xb2Var);
                int i7 = this.g + min2;
                this.g = i7;
                int i8 = this.k;
                if (i7 >= i8) {
                    long j = this.l;
                    if (j != -9223372036854775807L) {
                        this.d.a(j, 1, i8, 0, null);
                        this.l += this.j;
                    }
                    this.g = 0;
                    this.f = 0;
                }
            } else {
                throw new IllegalStateException();
            }
        }
    }
}
