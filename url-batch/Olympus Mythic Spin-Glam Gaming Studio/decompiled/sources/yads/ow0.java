package yads;

import com.inmobi.media.core.config.models.AdConfig;

/* loaded from: classes5.dex */
public final class ow0 {
    public final c83 a;
    public d83 d;
    public ye0 e;
    public int f;
    public int g;
    public int h;
    public int i;
    public boolean l;
    public final w73 b = new w73();
    public final xb2 c = new xb2();
    public final xb2 j = new xb2(1);
    public final xb2 k = new xb2();

    public ow0(c83 c83Var, d83 d83Var, ye0 ye0Var) {
        this.a = c83Var;
        this.d = d83Var;
        this.e = ye0Var;
        this.d = d83Var;
        this.e = ye0Var;
        c83Var.a(d83Var.a.f);
        b();
    }

    public final int a(int i, int i2) {
        xb2 xb2Var;
        v73 a = a();
        if (a == null) {
            return 0;
        }
        int i3 = a.d;
        if (i3 != 0) {
            xb2Var = this.b.n;
        } else {
            byte[] bArr = a.e;
            int i4 = sb3.a;
            xb2 xb2Var2 = this.k;
            int length = bArr.length;
            xb2Var2.a = bArr;
            xb2Var2.c = length;
            xb2Var2.b = 0;
            i3 = bArr.length;
            xb2Var = xb2Var2;
        }
        w73 w73Var = this.b;
        boolean z = w73Var.k && w73Var.l[this.f];
        boolean z2 = z || i2 != 0;
        xb2 xb2Var3 = this.j;
        xb2Var3.a[0] = (byte) ((z2 ? 128 : 0) | i3);
        xb2Var3.e(0);
        this.a.a(1, this.j);
        this.a.a(i3, xb2Var);
        if (!z2) {
            return i3 + 1;
        }
        if (!z) {
            this.c.c(8);
            xb2 xb2Var4 = this.c;
            byte[] bArr2 = xb2Var4.a;
            bArr2[0] = 0;
            bArr2[1] = 1;
            bArr2[2] = (byte) 0;
            bArr2[3] = (byte) (i2 & 255);
            bArr2[4] = (byte) ((i >> 24) & 255);
            bArr2[5] = (byte) ((i >> 16) & 255);
            bArr2[6] = (byte) ((i >> 8) & 255);
            bArr2[7] = (byte) (i & 255);
            this.a.a(8, xb2Var4);
            return i3 + 9;
        }
        xb2 xb2Var5 = this.b.n;
        int p = xb2Var5.p();
        xb2Var5.e(xb2Var5.b - 2);
        int i5 = (p * 6) + 2;
        if (i2 != 0) {
            this.c.c(i5);
            byte[] bArr3 = this.c.a;
            xb2Var5.a(bArr3, 0, i5);
            int i6 = (((bArr3[2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr3[3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) + i2;
            bArr3[2] = (byte) ((i6 >> 8) & 255);
            bArr3[3] = (byte) (i6 & 255);
            xb2Var5 = this.c;
        }
        this.a.a(i5, xb2Var5);
        return i3 + 1 + i5;
    }

    public final void b() {
        w73 w73Var = this.b;
        w73Var.d = 0;
        w73Var.p = 0L;
        w73Var.q = false;
        w73Var.k = false;
        w73Var.o = false;
        w73Var.m = null;
        this.f = 0;
        this.h = 0;
        this.g = 0;
        this.i = 0;
        this.l = false;
    }

    public final v73 a() {
        if (!this.l) {
            return null;
        }
        w73 w73Var = this.b;
        ye0 ye0Var = w73Var.a;
        int i = sb3.a;
        int i2 = ye0Var.a;
        v73 v73Var = w73Var.m;
        if (v73Var == null) {
            v73Var = this.d.a.k[i2];
        }
        if (v73Var == null || !v73Var.a) {
            return null;
        }
        return v73Var;
    }
}
