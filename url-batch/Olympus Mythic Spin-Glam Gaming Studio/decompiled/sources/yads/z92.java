package yads;

import java.io.EOFException;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class z92 {
    public final aa2 a = new aa2();
    public final xb2 b = new xb2(new byte[65025], 0);
    public int c = -1;
    public int d;
    public boolean e;

    public final boolean a(pd0 pd0Var) {
        int i;
        int i2;
        int i3;
        if (pd0Var == null) {
            throw new IllegalStateException();
        }
        if (this.e) {
            this.e = false;
            this.b.c(0);
        }
        while (true) {
            if (this.e) {
                return true;
            }
            if (this.c < 0) {
                if (!this.a.a(pd0Var, -1L) || !this.a.a(pd0Var, true)) {
                    break;
                }
                aa2 aa2Var = this.a;
                int i4 = aa2Var.d;
                if ((aa2Var.a & 1) == 1 && this.b.c == 0) {
                    this.d = 0;
                    int i5 = 0;
                    do {
                        int i6 = this.d;
                        aa2 aa2Var2 = this.a;
                        if (i6 >= aa2Var2.c) {
                            break;
                        }
                        int[] iArr = aa2Var2.f;
                        this.d = i6 + 1;
                        i3 = iArr[i6];
                        i5 += i3;
                    } while (i3 == 255);
                    i4 += i5;
                    i2 = this.d;
                } else {
                    i2 = 0;
                }
                try {
                    pd0Var.a(i4);
                    this.c = i2;
                } catch (EOFException unused) {
                }
            }
            int i7 = this.c;
            this.d = 0;
            int i8 = 0;
            do {
                int i9 = this.d;
                int i10 = i7 + i9;
                aa2 aa2Var3 = this.a;
                if (i10 >= aa2Var3.c) {
                    break;
                }
                int[] iArr2 = aa2Var3.f;
                this.d = i9 + 1;
                i = iArr2[i10];
                i8 += i;
            } while (i == 255);
            int i11 = this.c + this.d;
            if (i8 > 0) {
                xb2 xb2Var = this.b;
                xb2Var.a(xb2Var.c + i8);
                xb2 xb2Var2 = this.b;
                try {
                    pd0Var.a(xb2Var2.a, xb2Var2.c, i8, false);
                    xb2 xb2Var3 = this.b;
                    xb2Var3.d(xb2Var3.c + i8);
                    this.e = this.a.f[i11 + (-1)] != 255;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i11 == this.a.c) {
                i11 = -1;
            }
            this.c = i11;
        }
        return false;
    }

    public final void a() {
        xb2 xb2Var = this.b;
        byte[] bArr = xb2Var.a;
        if (bArr.length == 65025) {
            return;
        }
        byte[] copyOf = Arrays.copyOf(bArr, Math.max(65025, xb2Var.c));
        int i = this.b.c;
        xb2Var.a = copyOf;
        xb2Var.c = i;
        xb2Var.b = 0;
    }
}
