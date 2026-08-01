package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class jh {
    public final qh a;
    public rc b;
    public boolean c;
    public int f;
    public int g;
    public int l;
    public final jz d = new jz();
    public boolean e = true;
    public final ArrayList h = new ArrayList();
    public int i = -1;
    public int j = -1;
    public int k = -1;

    public jh(qh qhVar, rc rcVar) {
        this.a = qhVar;
        this.b = rcVar;
    }

    public final void a() {
        c();
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            this.g++;
        } else {
            arrayList.remove(arrayList.size() - 1);
        }
    }

    public final void b() {
        int i = this.g;
        if (i > 0) {
            rc0 rc0Var = this.b.h;
            rc0Var.R(mc0.c);
            rc0Var.j[rc0Var.k - rc0Var.h[rc0Var.i - 1].a] = i;
            this.g = 0;
        }
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            return;
        }
        rc rcVar = this.b;
        int size = arrayList.size();
        Object[] objArr = new Object[size];
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = arrayList.get(i2);
        }
        rcVar.getClass();
        if (size != 0) {
            rc0 rc0Var2 = rcVar.h;
            rc0Var2.R(qb0.c);
            px0.S(rc0Var2, 0, objArr);
        }
        arrayList.clear();
    }

    public final void c() {
        int i = this.l;
        if (i > 0) {
            int i2 = this.i;
            if (i2 >= 0) {
                b();
                rc0 rc0Var = this.b.h;
                rc0Var.R(ec0.c);
                int i3 = rc0Var.k - rc0Var.h[rc0Var.i - 1].a;
                int[] iArr = rc0Var.j;
                iArr[i3] = i2;
                iArr[i3 + 1] = i;
                this.i = -1;
            } else {
                int i4 = this.k;
                int i5 = this.j;
                b();
                rc0 rc0Var2 = this.b.h;
                rc0Var2.R(bc0.c);
                int i6 = rc0Var2.k - rc0Var2.h[rc0Var2.i - 1].a;
                int[] iArr2 = rc0Var2.j;
                iArr2[i6 + 1] = i4;
                iArr2[i6] = i5;
                iArr2[i6 + 2] = i;
                this.j = -1;
                this.k = -1;
            }
            this.l = 0;
        }
    }

    public final void d(boolean z) {
        ir0 ir0Var = this.a.F;
        int i = z ? ir0Var.i : ir0Var.g;
        int i2 = i - this.f;
        if (i2 < 0) {
            th.c("Tried to seek backward");
        }
        if (i2 > 0) {
            rc0 rc0Var = this.b.h;
            rc0Var.R(kb0.c);
            rc0Var.j[rc0Var.k - rc0Var.h[rc0Var.i - 1].a] = i2;
            this.f = i;
        }
    }

    public final void e(int i, int i2) {
        if (i2 > 0) {
            if (!(i >= 0)) {
                th.c("Invalid remove index " + i);
            }
            if (this.i == i) {
                this.l += i2;
                return;
            }
            c();
            this.i = i;
            this.l = i2;
        }
    }
}
