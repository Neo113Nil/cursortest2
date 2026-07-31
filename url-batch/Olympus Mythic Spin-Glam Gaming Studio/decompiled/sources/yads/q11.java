package yads;

import android.net.Uri;
import java.util.Map;

/* loaded from: classes13.dex */
public final class q11 implements q30 {
    public final q30 a;
    public final int b;
    public final ek2 c;
    public final byte[] d;
    public int e;

    public q11(q30 q30Var, int i, ek2 ek2Var) {
        if (i <= 0) {
            throw new IllegalArgumentException();
        }
        this.a = q30Var;
        this.b = i;
        this.c = ek2Var;
        this.d = new byte[1];
        this.e = i;
    }

    @Override // yads.q30
    public final long a(v30 v30Var) {
        throw new UnsupportedOperationException();
    }

    @Override // yads.q30
    public final Map b() {
        return this.a.b();
    }

    @Override // yads.n30
    public final int c(byte[] bArr, int i, int i2) {
        if (this.e == 0) {
            int i3 = 0;
            if (this.a.c(this.d, 0, 1) != -1) {
                int i4 = (this.d[0] & 255) << 4;
                if (i4 != 0) {
                    byte[] bArr2 = new byte[i4];
                    int i5 = i4;
                    while (i5 > 0) {
                        int c = this.a.c(bArr2, i3, i5);
                        if (c != -1) {
                            i3 += c;
                            i5 -= c;
                        }
                    }
                    while (i4 > 0 && bArr2[i4 - 1] == 0) {
                        i4--;
                    }
                    if (i4 > 0) {
                        ek2 ek2Var = this.c;
                        xb2 xb2Var = new xb2(bArr2, i4);
                        long max = !ek2Var.l ? ek2Var.i : Math.max(ek2Var.m.a(true), ek2Var.i);
                        int i6 = xb2Var.c - xb2Var.b;
                        xs2 xs2Var = ek2Var.k;
                        xs2Var.getClass();
                        xs2Var.a(i6, xb2Var);
                        xs2Var.a(max, 1, i6, 0, null);
                        ek2Var.l = true;
                    }
                }
                this.e = this.b;
            }
            return -1;
        }
        int c2 = this.a.c(bArr, i, Math.min(this.e, i2));
        if (c2 != -1) {
            this.e -= c2;
        }
        return c2;
    }

    @Override // yads.q30
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // yads.q30
    public final Uri d() {
        return this.a.d();
    }

    @Override // yads.q30
    public final void a(h93 h93Var) {
        h93Var.getClass();
        this.a.a(h93Var);
    }
}
