package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class rc0 extends d31 {
    public int i;
    public int k;
    public int m;
    public oc0[] h = new oc0[16];
    public int[] j = new int[16];
    public Object[] l = new Object[16];

    public final void N() {
        this.i = 0;
        this.k = 0;
        Arrays.fill(this.l, 0, this.m, (Object) null);
        this.m = 0;
    }

    public final void O(u7 u7Var, mr0 mr0Var, ca0 ca0Var, pc0 pc0Var) {
        if (Q()) {
            qc0 qc0Var = new qc0(this);
            while (true) {
                rc0 rc0Var = qc0Var.d;
                oc0 oc0Var = rc0Var.h[qc0Var.a];
                h2 b = oc0Var.b(qc0Var);
                u7 u7Var2 = u7Var;
                mr0 mr0Var2 = mr0Var;
                ca0 ca0Var2 = ca0Var;
                pc0 pc0Var2 = pc0Var;
                try {
                    oc0Var.a(qc0Var, u7Var2, mr0Var2, ca0Var2, pc0Var2);
                    int i = qc0Var.a;
                    int i2 = rc0Var.i;
                    if (i < i2) {
                        oc0 oc0Var2 = rc0Var.h[i];
                        qc0Var.b += oc0Var2.a;
                        qc0Var.c += oc0Var2.b;
                        int i3 = i + 1;
                        qc0Var.a = i3;
                        if (i3 >= i2) {
                            break;
                        }
                        u7Var = u7Var2;
                        mr0Var = mr0Var2;
                        ca0Var = ca0Var2;
                        pc0Var = pc0Var2;
                    } else {
                        break;
                    }
                } finally {
                }
            }
        }
        N();
    }

    public final boolean P() {
        return this.i == 0;
    }

    public final boolean Q() {
        return this.i != 0;
    }

    public final void R(oc0 oc0Var) {
        int i = this.i;
        oc0[] oc0VarArr = this.h;
        if (i == oc0VarArr.length) {
            oc0[] oc0VarArr2 = new oc0[(i > 1024 ? 1024 : i) + i];
            System.arraycopy(oc0VarArr, 0, oc0VarArr2, 0, i);
            this.h = oc0VarArr2;
        }
        int i2 = this.k;
        int i3 = oc0Var.a;
        int i4 = oc0Var.b;
        int i5 = i2 + i3;
        int[] iArr = this.j;
        int length = iArr.length;
        if (i5 > length) {
            int i6 = (length > 1024 ? 1024 : length) + length;
            if (i6 >= i5) {
                i5 = i6;
            }
            int[] iArr2 = new int[i5];
            p8.R(iArr, iArr2, 0, 0, length);
            this.j = iArr2;
        }
        int i7 = this.m + i4;
        Object[] objArr = this.l;
        int length2 = objArr.length;
        if (i7 > length2) {
            int i8 = (length2 <= 1024 ? length2 : 1024) + length2;
            if (i8 >= i7) {
                i7 = i8;
            }
            Object[] objArr2 = new Object[i7];
            System.arraycopy(objArr, 0, objArr2, 0, length2);
            this.l = objArr2;
        }
        oc0[] oc0VarArr3 = this.h;
        int i9 = this.i;
        this.i = i9 + 1;
        oc0VarArr3[i9] = oc0Var;
        this.k += oc0Var.a;
        this.m += i4;
    }
}
