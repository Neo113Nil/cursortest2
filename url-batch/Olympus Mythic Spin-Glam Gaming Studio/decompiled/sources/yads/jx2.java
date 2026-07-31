package yads;

import com.inmobi.media.core.config.models.AdConfig;

/* loaded from: classes14.dex */
public final class jx2 implements aa3 {
    public final ix2 a;
    public final xb2 b = new xb2(32);
    public int c;
    public int d;
    public boolean e;
    public boolean f;

    public jx2(ix2 ix2Var) {
        this.a = ix2Var;
    }

    @Override // yads.aa3
    public final void a(m73 m73Var, wp0 wp0Var, z93 z93Var) {
        this.a.a(m73Var, wp0Var, z93Var);
        this.f = true;
    }

    @Override // yads.aa3
    public final void a() {
        this.f = true;
    }

    @Override // yads.aa3
    public final void a(int i, xb2 xb2Var) {
        boolean z = (i & 1) != 0;
        int k = z ? xb2Var.b + xb2Var.k() : -1;
        if (this.f) {
            if (!z) {
                return;
            }
            this.f = false;
            xb2Var.e(k);
            this.d = 0;
        }
        while (true) {
            int i2 = xb2Var.c - xb2Var.b;
            if (i2 <= 0) {
                return;
            }
            int i3 = this.d;
            if (i3 < 3) {
                if (i3 == 0) {
                    int k2 = xb2Var.k();
                    xb2Var.e(xb2Var.b - 1);
                    if (k2 == 255) {
                        this.f = true;
                        return;
                    }
                }
                int min = Math.min(xb2Var.c - xb2Var.b, 3 - this.d);
                xb2Var.a(this.b.a, this.d, min);
                int i4 = this.d + min;
                this.d = i4;
                if (i4 == 3) {
                    this.b.e(0);
                    this.b.d(3);
                    xb2 xb2Var2 = this.b;
                    xb2Var2.e(xb2Var2.b + 1);
                    int k3 = this.b.k();
                    int k4 = this.b.k();
                    this.e = (k3 & 128) != 0;
                    int i5 = (((k3 & 15) << 8) | k4) + 3;
                    this.c = i5;
                    byte[] bArr = this.b.a;
                    if (bArr.length < i5) {
                        this.b.a(Math.min(4098, Math.max(i5, bArr.length * 2)));
                    }
                }
            } else {
                int min2 = Math.min(i2, this.c - i3);
                xb2Var.a(this.b.a, this.d, min2);
                int i6 = this.d + min2;
                this.d = i6;
                int i7 = this.c;
                if (i6 != i7) {
                    continue;
                } else {
                    if (this.e) {
                        byte[] bArr2 = this.b.a;
                        int i8 = -1;
                        for (int i9 = 0; i9 < i7; i9++) {
                            i8 = sb3.n[((i8 >>> 24) ^ (bArr2[i9] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) & 255] ^ (i8 << 8);
                        }
                        int i10 = sb3.a;
                        if (i8 != 0) {
                            this.f = true;
                            return;
                        }
                        this.b.d(this.c - 4);
                    } else {
                        this.b.d(i7);
                    }
                    this.b.e(0);
                    this.a.a(this.b);
                    this.d = 0;
                }
            }
        }
    }
}
