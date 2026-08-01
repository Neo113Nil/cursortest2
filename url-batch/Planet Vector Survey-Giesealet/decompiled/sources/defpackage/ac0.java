package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class ac0 extends oc0 {
    public static final ac0 c = new ac0(1, 0, 2);

    @Override // defpackage.oc0
    public final void a(qc0 qc0Var, u7 u7Var, mr0 mr0Var, ca0 ca0Var, pc0 pc0Var) {
        int[] iArr;
        h2 h2Var;
        int c2;
        int a = qc0Var.a(0);
        if (mr0Var.n != 0) {
            th.c("Cannot move a group while inserting");
        }
        if (a < 0) {
            th.c("Parameter offset is out of bounds");
        }
        if (a == 0) {
            return;
        }
        int i = mr0Var.t;
        int i2 = mr0Var.v;
        int i3 = mr0Var.u;
        int i4 = i;
        while (true) {
            iArr = mr0Var.b;
            if (a <= 0) {
                break;
            }
            i4 += iArr[(mr0Var.q(i4) * 5) + 3];
            if (i4 > i3) {
                th.c("Parameter offset is out of bounds");
            }
            a--;
        }
        int i5 = iArr[(mr0Var.q(i4) * 5) + 3];
        int g = mr0Var.g(mr0Var.b, mr0Var.q(mr0Var.t));
        int g2 = mr0Var.g(mr0Var.b, mr0Var.q(i4));
        int i6 = i4 + i5;
        int g3 = mr0Var.g(mr0Var.b, mr0Var.q(i6));
        int i7 = g3 - g2;
        mr0Var.v(i7, Math.max(mr0Var.t - 1, 0));
        mr0Var.u(i5);
        int[] iArr2 = mr0Var.b;
        int q = mr0Var.q(i6) * 5;
        p8.R(iArr2, iArr2, mr0Var.q(i) * 5, q, (i5 * 5) + q);
        if (i7 > 0) {
            Object[] objArr = mr0Var.c;
            int h = mr0Var.h(g2 + i7);
            System.arraycopy(objArr, h, objArr, g, mr0Var.h(g3 + i7) - h);
        }
        int i8 = g2 + i7;
        int i9 = i8 - g;
        int i10 = mr0Var.k;
        int i11 = mr0Var.l;
        int length = mr0Var.c.length;
        int i12 = mr0Var.m;
        int i13 = i + i5;
        int i14 = i;
        while (i14 < i13) {
            int q2 = mr0Var.q(i14);
            int i15 = i9;
            int[] iArr3 = iArr2;
            iArr3[(q2 * 5) + 4] = mr0.i(mr0.i(mr0Var.g(iArr2, q2) - i15, i12 < q2 ? 0 : i10, i11, length), mr0Var.k, mr0Var.l, mr0Var.c.length);
            i14++;
            i9 = i15;
            iArr2 = iArr3;
            i10 = i10;
        }
        int i16 = i6 + i5;
        int o = mr0Var.o();
        int a2 = lr0.a(mr0Var.d, i6, o);
        ArrayList arrayList = new ArrayList();
        if (a2 >= 0) {
            while (a2 < mr0Var.d.size() && (c2 = mr0Var.c((h2Var = (h2) mr0Var.d.get(a2)))) >= i6 && c2 < i16) {
                arrayList.add(h2Var);
            }
        }
        int i17 = i - i6;
        int size = arrayList.size();
        for (int i18 = 0; i18 < size; i18++) {
            h2 h2Var2 = (h2) arrayList.get(i18);
            int c3 = mr0Var.c(h2Var2) + i17;
            if (c3 >= mr0Var.g) {
                h2Var2.a = -(o - c3);
            } else {
                h2Var2.a = c3;
            }
            mr0Var.d.add(lr0.a(mr0Var.d, c3, o), h2Var2);
        }
        if (mr0Var.G(i6, i5)) {
            th.c("Unexpectedly removed anchors");
        }
        mr0Var.m(i2, mr0Var.u, i);
        if (i7 > 0) {
            mr0Var.H(i8, i7, i6 - 1);
        }
    }
}
