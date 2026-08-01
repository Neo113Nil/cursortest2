package defpackage;

import java.util.Arrays;
import java.util.HashMap;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class s90 extends e70 {
    public final e70 o;
    public boolean p;

    public s90(long j, sr0 sr0Var, mu muVar, mu muVar2, e70 e70Var) {
        super(j, sr0Var, muVar, muVar2);
        this.o = e70Var;
        e70Var.k();
    }

    @Override // defpackage.e70, defpackage.or0
    public final void c() {
        if (this.c) {
            return;
        }
        super.c();
        if (this.p) {
            return;
        }
        this.p = true;
        this.o.l();
    }

    @Override // defpackage.e70
    public final ld0 w() {
        s90 s90Var;
        e70 e70Var = this.o;
        if (e70Var.m || e70Var.c) {
            return new pr0();
        }
        b70 b70Var = this.h;
        long j = this.b;
        HashMap c = b70Var != null ? ur0.c(e70Var.g(), this, this.o.d()) : null;
        synchronized (ur0.c) {
            try {
                ur0.d(this);
                if (b70Var == null || b70Var.d == 0) {
                    s90Var = this;
                    s90Var.a();
                } else {
                    s90Var = this;
                    ld0 z = s90Var.z(this.o.g(), b70Var, c, this.o.d());
                    if (!z.equals(qr0.a)) {
                        return z;
                    }
                    b70 x = s90Var.o.x();
                    if (x != null) {
                        x.i(b70Var);
                    } else {
                        s90Var.o.C(b70Var);
                        s90Var.h = null;
                    }
                }
                if (nz.t(s90Var.o.g(), j) < 0) {
                    s90Var.o.v();
                }
                e70 e70Var2 = s90Var.o;
                e70Var2.r(e70Var2.d().b(j).a(s90Var.j));
                s90Var.o.A(j);
                e70 e70Var3 = s90Var.o;
                int i = s90Var.d;
                s90Var.d = -1;
                if (i >= 0) {
                    int[] iArr = e70Var3.k;
                    iArr.getClass();
                    int length = iArr.length;
                    int[] copyOf = Arrays.copyOf(iArr, length + 1);
                    copyOf[length] = i;
                    e70Var3.k = copyOf;
                } else {
                    e70Var3.getClass();
                }
                s90Var.o.B(s90Var.j);
                e70 e70Var4 = s90Var.o;
                int[] iArr2 = s90Var.k;
                e70Var4.getClass();
                if (iArr2.length != 0) {
                    int[] iArr3 = e70Var4.k;
                    if (iArr3.length != 0) {
                        int length2 = iArr3.length;
                        int length3 = iArr2.length;
                        int[] copyOf2 = Arrays.copyOf(iArr3, length2 + length3);
                        System.arraycopy(iArr2, 0, copyOf2, length2, length3);
                        iArr2 = copyOf2;
                    }
                    e70Var4.k = iArr2;
                }
                s90Var.m = true;
                if (!s90Var.p) {
                    s90Var.p = true;
                    s90Var.o.l();
                }
                return qr0.a;
            } finally {
            }
        }
    }
}
