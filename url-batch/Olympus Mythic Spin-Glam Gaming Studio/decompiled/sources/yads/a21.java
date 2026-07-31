package yads;

import java.io.EOFException;

/* loaded from: classes6.dex */
public final class a21 {
    public final xb2 a = new xb2(10);

    public final ht1 a(pd0 pd0Var, w11 w11Var) {
        ht1 ht1Var = null;
        int i = 0;
        while (true) {
            try {
                pd0Var.b(this.a.a, 0, 10, false);
                this.a.e(0);
                if (this.a.m() != 4801587) {
                    break;
                }
                xb2 xb2Var = this.a;
                xb2Var.e(xb2Var.b + 3);
                int j = this.a.j();
                int i2 = j + 10;
                if (ht1Var == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(this.a.a, 0, bArr, 0, 10);
                    pd0Var.b(bArr, 10, j, false);
                    ht1Var = new y11(w11Var).a(bArr, i2);
                } else {
                    pd0Var.a(false, j);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        pd0Var.f = 0;
        pd0Var.a(false, i);
        return ht1Var;
    }
}
