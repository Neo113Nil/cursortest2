package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class mr0 {
    public final jr0 a;
    public int[] b;
    public Object[] c;
    public ArrayList d;
    public HashMap e;
    public p60 f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public final jz p;
    public final jz q;
    public final jz r;
    public p60 s;
    public int t;
    public int u;
    public int v;
    public boolean w;
    public o60 x;

    public mr0(jr0 jr0Var) {
        this.a = jr0Var;
        int[] iArr = jr0Var.d;
        this.b = iArr;
        Object[] objArr = jr0Var.f;
        this.c = objArr;
        this.d = jr0Var.l;
        this.e = jr0Var.m;
        this.f = jr0Var.n;
        int i = jr0Var.e;
        this.g = i;
        this.h = (iArr.length / 5) - i;
        int i2 = jr0Var.g;
        this.k = i2;
        this.l = objArr.length - i2;
        this.m = i;
        this.p = new jz();
        this.q = new jz();
        this.r = new jz();
        this.u = i;
        this.v = -1;
    }

    public static int i(int i, int i2, int i3, int i4) {
        return i > i2 ? -(((i4 - i3) - i) + 1) : i;
    }

    public static void x(mr0 mr0Var) {
        int i = mr0Var.v;
        int q = mr0Var.q(i);
        int[] iArr = mr0Var.b;
        int i2 = (q * 5) + 1;
        int i3 = iArr[i2];
        if ((i3 & 134217728) != 0) {
            return;
        }
        int i4 = (i3 & (-134217729)) | 134217728;
        iArr[i2] = i4;
        if ((67108864 & i4) != 0) {
            return;
        }
        mr0Var.R(mr0Var.C(iArr, i));
    }

    public final void A(int i, int i2) {
        int i3 = this.l;
        int i4 = this.k;
        int i5 = this.m;
        if (i4 != i) {
            Object[] objArr = this.c;
            if (i < i4) {
                System.arraycopy(objArr, i, objArr, i + i3, i4 - i);
            } else {
                int i6 = i4 + i3;
                System.arraycopy(objArr, i6, objArr, i4, (i + i3) - i6);
            }
        }
        int min = Math.min(i2 + 1, o());
        if (i5 != min) {
            int length = this.c.length - i3;
            if (min < i5) {
                int q = q(min);
                int q2 = q(i5);
                int i7 = this.g;
                while (q < q2) {
                    int i8 = (q * 5) + 4;
                    int i9 = this.b[i8];
                    if (i9 < 0) {
                        th.c("Unexpected anchor value, expected a positive anchor");
                    }
                    this.b[i8] = -((length - i9) + 1);
                    q++;
                    if (q == i7) {
                        q += this.h;
                    }
                }
            } else {
                int q3 = q(i5);
                int q4 = q(min);
                while (q3 < q4) {
                    int i10 = (q3 * 5) + 4;
                    int i11 = this.b[i10];
                    if (i11 >= 0) {
                        th.c("Unexpected anchor value, expected a negative anchor");
                    }
                    this.b[i10] = i11 + length + 1;
                    q3++;
                    if (q3 == this.g) {
                        q3 += this.h;
                    }
                }
            }
            this.m = min;
        }
        this.k = i;
    }

    public final Object B(int i) {
        int q = q(i);
        int[] iArr = this.b;
        if ((iArr[(q * 5) + 1] & 1073741824) != 0) {
            return this.c[h(g(iArr, q))];
        }
        return null;
    }

    public final int C(int[] iArr, int i) {
        int i2 = iArr[(q(i) * 5) + 2];
        return i2 > -2 ? i2 : (o() + i2) - (-2);
    }

    public final Object D(Object obj) {
        if (this.n > 0) {
            v(1, this.v);
        }
        Object[] objArr = this.c;
        int i = this.i;
        this.i = i + 1;
        Object obj2 = objArr[h(i)];
        if (this.i > this.j) {
            th.c("Writing to an invalid slot");
        }
        this.c[h(this.i - 1)] = obj;
        return obj2;
    }

    public final void E() {
        int i;
        o60 o60Var = this.x;
        if (o60Var != null) {
            while (o60Var.b != 0) {
                int r = ud0.r(o60Var);
                int q = q(r);
                int i2 = r + 1;
                int s = s(r) + r;
                while (true) {
                    if (i2 >= s) {
                        i = 0;
                        break;
                    } else {
                        if ((this.b[(q(i2) * 5) + 1] & 201326592) != 0) {
                            i = 1;
                            break;
                        }
                        i2 += s(i2);
                    }
                }
                int[] iArr = this.b;
                int i3 = (q * 5) + 1;
                int i4 = iArr[i3];
                if (((67108864 & i4) != 0 ? 1 : 0) != i) {
                    iArr[i3] = (i << 26) | ((-67108865) & i4);
                    int C = C(iArr, r);
                    if (C >= 0) {
                        ud0.e(o60Var, C);
                    }
                }
            }
        }
    }

    public final boolean F() {
        if (this.n != 0) {
            th.c("Cannot remove group while inserting");
        }
        int i = this.t;
        int i2 = this.i;
        int g = g(this.b, q(i));
        int J = J();
        M(this.v);
        o60 o60Var = this.x;
        if (o60Var != null) {
            while (true) {
                int i3 = o60Var.b;
                if (i3 == 0) {
                    break;
                }
                if (i3 == 0) {
                    g8.e("IntList is empty.");
                    return false;
                }
                if (o60Var.a[0] < i) {
                    break;
                }
                ud0.r(o60Var);
            }
        }
        boolean G = G(i, this.t - i);
        H(g, this.i - g, i - 1);
        this.t = i;
        this.i = i2;
        this.o -= J;
        return G;
    }

    public final boolean G(int i, int i2) {
        if (i2 > 0) {
            ArrayList arrayList = this.d;
            z(i);
            if (!arrayList.isEmpty()) {
                HashMap hashMap = this.e;
                int i3 = i + i2;
                int a = lr0.a(this.d, i3, n() - this.h);
                if (a >= this.d.size()) {
                    a--;
                }
                int i4 = a + 1;
                int i5 = 0;
                while (a >= 0) {
                    h2 h2Var = (h2) this.d.get(a);
                    int c = c(h2Var);
                    if (c < i) {
                        break;
                    }
                    if (c < i3) {
                        h2Var.a = Integer.MIN_VALUE;
                        if (hashMap != null) {
                        }
                        if (i5 == 0) {
                            i5 = a + 1;
                        }
                        i4 = a;
                    }
                    a--;
                }
                r0 = i4 < i5;
                if (r0) {
                    this.d.subList(i4, i5).clear();
                }
            }
            this.g = i;
            this.h += i2;
            int i6 = this.m;
            if (i6 > i) {
                this.m = Math.max(i, i6 - i2);
            }
            int i7 = this.u;
            if (i7 >= this.g) {
                this.u = i7 - i2;
            }
            int i8 = this.v;
            if (i8 >= 0 && (this.b[(q(i8) * 5) + 1] & 67108864) != 0) {
                R(i8);
            }
        }
        return r0;
    }

    public final void H(int i, int i2, int i3) {
        if (i2 > 0) {
            int i4 = this.l;
            int i5 = i + i2;
            A(i5, i3);
            this.k = i;
            this.l = i4 + i2;
            Arrays.fill(this.c, i, i5, (Object) null);
            int i6 = this.j;
            if (i6 >= i) {
                this.j = i6 - i2;
            }
        }
    }

    public final Object I(int i, int i2, Object obj) {
        int L = L(this.b, q(i));
        int g = g(this.b, q(i + 1));
        int i3 = L + i2;
        if (i3 < L || i3 >= g) {
            th.c("Write to an invalid slot index " + i2 + " for group " + i);
        }
        int h = h(i3);
        Object[] objArr = this.c;
        Object obj2 = objArr[h];
        objArr[h] = obj;
        return obj2;
    }

    public final int J() {
        int q = q(this.t);
        int i = this.t;
        int[] iArr = this.b;
        int i2 = q * 5;
        int i3 = iArr[i2 + 3] + i;
        this.t = i3;
        this.i = g(iArr, q(i3));
        int i4 = this.b[i2 + 1];
        if ((1073741824 & i4) != 0) {
            return 1;
        }
        return i4 & 67108863;
    }

    public final void K() {
        int i = this.u;
        this.t = i;
        this.i = g(this.b, q(i));
    }

    public final int L(int[] iArr, int i) {
        if (i >= n()) {
            return this.c.length - this.l;
        }
        int b = lr0.b(iArr, i);
        return b < 0 ? (this.c.length - this.l) + b + 1 : b;
    }

    public final zv M(int i) {
        h2 P;
        HashMap hashMap = this.e;
        if (hashMap == null || (P = P(i)) == null) {
            return null;
        }
        return (zv) hashMap.get(P);
    }

    public final void N() {
        if (this.n != 0) {
            th.c("Key must be supplied when inserting");
        }
        y7 y7Var = hh.a;
        O(0, y7Var, false, y7Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void O(int i, Object obj, boolean z, Object obj2) {
        int i2;
        int i3 = this.v;
        Object[] objArr = this.n > 0;
        this.r.c(this.o);
        y7 y7Var = hh.a;
        if (objArr == true) {
            int i4 = this.t;
            int g = g(this.b, q(i4));
            u(1);
            this.i = g;
            this.j = g;
            int q = q(i4);
            int i5 = obj != y7Var ? 1 : 0;
            int i6 = (z || obj2 == y7Var) ? 0 : 1;
            int i7 = i(g, this.k, this.l, this.c.length);
            if (i7 >= 0 && this.m < i4) {
                i7 = -(((this.c.length - this.l) - i7) + 1);
            }
            int[] iArr = this.b;
            int i8 = this.v;
            int i9 = q * 5;
            iArr[i9] = i;
            iArr[i9 + 1] = ((z ? 1 : 0) << 30) | (i5 << 29) | (i6 << 28);
            iArr[i9 + 2] = i8;
            iArr[i9 + 3] = 0;
            iArr[i9 + 4] = i7;
            int i10 = (z ? 1 : 0) + i5 + i6;
            if (i10 > 0) {
                v(i10, i4);
                Object[] objArr2 = this.c;
                int i11 = this.i;
                if (z) {
                    objArr2[i11] = obj2;
                    i11++;
                }
                if (i5 != 0) {
                    objArr2[i11] = obj;
                    i11++;
                }
                if (i6 != 0) {
                    objArr2[i11] = obj2;
                    i11++;
                }
                this.i = i11;
            }
            this.o = 0;
            i2 = i4 + 1;
            this.v = i4;
            this.t = i2;
            if (i3 >= 0) {
                M(i3);
            }
        } else {
            this.p.c(i3);
            this.q.c((n() - this.h) - this.u);
            int i12 = this.t;
            int q2 = q(i12);
            if (!nz.l(obj2, y7Var)) {
                if (z) {
                    S(this.t, obj2);
                } else {
                    Q(obj2);
                }
            }
            this.i = L(this.b, q2);
            this.j = g(this.b, q(this.t + 1));
            int[] iArr2 = this.b;
            int i13 = q2 * 5;
            this.o = iArr2[i13 + 1] & 67108863;
            this.v = i12;
            this.t = i12 + 1;
            i2 = i12 + iArr2[i13 + 3];
        }
        this.u = i2;
    }

    public final h2 P(int i) {
        ArrayList arrayList;
        int d;
        if (i < 0 || i >= o() || (d = lr0.d((arrayList = this.d), i, o())) < 0) {
            return null;
        }
        return (h2) arrayList.get(d);
    }

    public final void Q(Object obj) {
        int q = q(this.t);
        int i = (q * 5) + 1;
        if ((this.b[i] & 268435456) == 0) {
            th.c("Updating the data of a group that was not created with a data slot");
        }
        Object[] objArr = this.c;
        int[] iArr = this.b;
        objArr[h(Integer.bitCount(iArr[i] >> 29) + g(iArr, q))] = obj;
    }

    public final void R(int i) {
        if (i >= 0) {
            o60 o60Var = this.x;
            if (o60Var == null) {
                o60Var = new o60();
                this.x = o60Var;
            }
            ud0.e(o60Var, i);
        }
    }

    public final void S(int i, Object obj) {
        int q = q(i);
        int[] iArr = this.b;
        if (q >= iArr.length || (iArr[(q * 5) + 1] & 1073741824) == 0) {
            th.c("Updating the node of a group at " + i + " that was not created with as a node group");
        }
        this.c[h(g(this.b, q))] = obj;
    }

    public final void a(int i) {
        if (i < 0) {
            th.c("Cannot seek backwards");
        }
        if (this.n > 0) {
            gh0.b("Cannot call seek() while inserting");
        }
        if (i == 0) {
            return;
        }
        int i2 = this.t + i;
        if (i2 < this.v || i2 > this.u) {
            th.c("Cannot seek outside the current group (" + this.v + '-' + this.u + ')');
        }
        this.t = i2;
        int g = g(this.b, q(i2));
        this.i = g;
        this.j = g;
    }

    public final h2 b(int i) {
        ArrayList arrayList = this.d;
        int d = lr0.d(arrayList, i, o());
        if (d >= 0) {
            return (h2) arrayList.get(d);
        }
        if (i > this.g) {
            i = -(o() - i);
        }
        h2 h2Var = new h2(i);
        arrayList.add(-(d + 1), h2Var);
        return h2Var;
    }

    public final int c(h2 h2Var) {
        int i = h2Var.a;
        return i < 0 ? o() + i : i;
    }

    public final void d() {
        int i = this.n;
        this.n = i + 1;
        if (i == 0) {
            this.q.c((n() - this.h) - this.u);
        }
    }

    public final void e(boolean z) {
        this.w = true;
        if (z && this.p.b == 0) {
            z(o());
            A(this.c.length - this.l, this.g);
            int i = this.k;
            Arrays.fill(this.c, i, this.l + i, (Object) null);
            E();
        }
        int[] iArr = this.b;
        int i2 = this.g;
        Object[] objArr = this.c;
        int i3 = this.k;
        ArrayList arrayList = this.d;
        HashMap hashMap = this.e;
        p60 p60Var = this.f;
        jr0 jr0Var = this.a;
        if (!jr0Var.j) {
            gh0.a("Unexpected writer close()");
        }
        jr0Var.j = false;
        jr0Var.d = iArr;
        jr0Var.e = i2;
        jr0Var.f = objArr;
        jr0Var.g = i3;
        jr0Var.l = arrayList;
        jr0Var.m = hashMap;
        jr0Var.n = p60Var;
    }

    public final int f(int i) {
        return g(this.b, q(i));
    }

    public final int g(int[] iArr, int i) {
        if (i >= n()) {
            return this.c.length - this.l;
        }
        int i2 = iArr[(i * 5) + 4];
        return i2 < 0 ? (this.c.length - this.l) + i2 + 1 : i2;
    }

    public final int h(int i) {
        return (this.l * (i < this.k ? 0 : 1)) + i;
    }

    public final void j() {
        x60 x60Var;
        boolean z = this.n > 0;
        int i = this.t;
        int i2 = this.u;
        int i3 = this.v;
        int q = q(i3);
        int i4 = this.o;
        int i5 = i - i3;
        int i6 = q * 5;
        int i7 = i6 + 1;
        boolean z2 = (this.b[i7] & 1073741824) != 0;
        jz jzVar = this.r;
        if (z) {
            p60 p60Var = this.s;
            if (p60Var != null && (x60Var = (x60) p60Var.b(i3)) != null) {
                Object[] objArr = x60Var.a;
                int i8 = x60Var.b;
                for (int i9 = 0; i9 < i8; i9++) {
                    D(objArr[i9]);
                }
            }
            int[] iArr = this.b;
            iArr[i6 + 3] = i5;
            lr0.c(iArr, q, i4);
            int b = jzVar.b();
            if (z2) {
                i4 = 1;
            }
            this.o = b + i4;
            int C = C(this.b, i3);
            this.v = C;
            int o = C < 0 ? o() : q(C + 1);
            int g = o >= 0 ? g(this.b, o) : 0;
            this.i = g;
            this.j = g;
            return;
        }
        if (i != i2) {
            th.c("Expected to be at the end of a group");
        }
        int[] iArr2 = this.b;
        int i10 = i6 + 3;
        int i11 = iArr2[i10];
        int i12 = iArr2[i7] & 67108863;
        iArr2[i10] = i5;
        lr0.c(iArr2, q, i4);
        int b2 = this.p.b();
        this.u = (n() - this.h) - this.q.b();
        this.v = b2;
        int C2 = C(this.b, i3);
        int b3 = jzVar.b();
        this.o = b3;
        if (C2 == b2) {
            this.o = b3 + (z2 ? 0 : i4 - i12);
            return;
        }
        int i13 = i5 - i11;
        int i14 = z2 ? 0 : i4 - i12;
        if (i13 != 0 || i14 != 0) {
            while (C2 != 0 && C2 != b2 && (i14 != 0 || i13 != 0)) {
                int q2 = q(C2);
                if (i13 != 0) {
                    int[] iArr3 = this.b;
                    int i15 = (q2 * 5) + 3;
                    iArr3[i15] = iArr3[i15] + i13;
                }
                if (i14 != 0) {
                    int[] iArr4 = this.b;
                    lr0.c(iArr4, q2, (iArr4[(q2 * 5) + 1] & 67108863) + i14);
                }
                int[] iArr5 = this.b;
                if ((iArr5[(q2 * 5) + 1] & 1073741824) != 0) {
                    i14 = 0;
                }
                C2 = C(iArr5, C2);
            }
        }
        this.o += i14;
    }

    public final void k() {
        if (this.n <= 0) {
            gh0.b("Unbalanced begin/end insert");
        }
        int i = this.n - 1;
        this.n = i;
        if (i == 0) {
            if (this.r.b != this.p.b) {
                th.c("startGroup/endGroup mismatch while inserting");
            }
            this.u = (n() - this.h) - this.q.b();
        }
    }

    public final void l(int i) {
        boolean z = false;
        if (!(this.n <= 0)) {
            th.c("Cannot call ensureStarted() while inserting");
        }
        int i2 = this.v;
        if (i2 != i) {
            if (i >= i2 && i < this.u) {
                z = true;
            }
            if (!z) {
                th.c("Started group at " + i + " must be a subgroup of the group at " + i2);
            }
            int i3 = this.t;
            int i4 = this.i;
            int i5 = this.j;
            this.t = i;
            N();
            this.t = i3;
            this.i = i4;
            this.j = i5;
        }
    }

    public final void m(int i, int i2, int i3) {
        if (i >= this.g) {
            i = -((o() - i) + 2);
        }
        while (i3 < i2) {
            this.b[(q(i3) * 5) + 2] = i;
            int i4 = this.b[(q(i3) * 5) + 3] + i3;
            m(i3, i4, i3 + 1);
            i3 = i4;
        }
    }

    public final int n() {
        return this.b.length / 5;
    }

    public final int o() {
        return n() - this.h;
    }

    public final Object p(int i) {
        int q = q(i);
        int[] iArr = this.b;
        int i2 = (q * 5) + 1;
        if ((iArr[i2] & 268435456) == 0) {
            return hh.a;
        }
        return this.c[Integer.bitCount(iArr[i2] >> 29) + g(iArr, q)];
    }

    public final int q(int i) {
        return (this.h * (i < this.g ? 0 : 1)) + i;
    }

    public final Object r(int i) {
        int q = q(i);
        int[] iArr = this.b;
        int i2 = q * 5;
        int i3 = iArr[i2 + 1];
        if ((536870912 & i3) == 0) {
            return null;
        }
        return this.c[Integer.bitCount(i3 >> 30) + iArr[i2 + 4]];
    }

    public final int s(int i) {
        return this.b[(q(i) * 5) + 3];
    }

    public final boolean t(int i, int i2) {
        int n;
        int s;
        if (i2 == this.v) {
            n = this.u;
        } else {
            jz jzVar = this.p;
            if (i2 > jzVar.a(0)) {
                s = s(i2);
            } else {
                int[] iArr = jzVar.a;
                int min = Math.min(iArr.length, jzVar.b);
                int i3 = 0;
                while (true) {
                    if (i3 >= min) {
                        i3 = -1;
                        break;
                    }
                    if (iArr[i3] == i2) {
                        break;
                    }
                    i3++;
                }
                if (i3 < 0) {
                    s = s(i2);
                } else {
                    n = (n() - this.h) - this.q.a[i3];
                }
            }
            n = s + i2;
        }
        return i > i2 && i < n;
    }

    public final String toString() {
        return "SlotWriter(current = " + this.t + " end=" + this.u + " size = " + o() + " gap=" + this.g + '-' + (this.g + this.h) + ')';
    }

    public final void u(int i) {
        if (i > 0) {
            int i2 = this.t;
            z(i2);
            int i3 = this.g;
            int i4 = this.h;
            int[] iArr = this.b;
            int length = iArr.length / 5;
            int i5 = length - i4;
            if (i4 < i) {
                int max = Math.max(Math.max(length * 2, i5 + i), 32);
                int[] iArr2 = new int[max * 5];
                int i6 = max - i5;
                p8.R(iArr, iArr2, 0, 0, i3 * 5);
                p8.R(iArr, iArr2, (i3 + i6) * 5, (i4 + i3) * 5, length * 5);
                this.b = iArr2;
                i4 = i6;
            }
            int i7 = this.u;
            if (i7 >= i3) {
                this.u = i7 + i;
            }
            int i8 = i3 + i;
            this.g = i8;
            this.h = i4 - i;
            int i9 = i(i5 > 0 ? f(i2 + i) : 0, this.m >= i3 ? this.k : 0, this.l, this.c.length);
            for (int i10 = i3; i10 < i8; i10++) {
                this.b[(i10 * 5) + 4] = i9;
            }
            int i11 = this.m;
            if (i11 >= i3) {
                this.m = i11 + i;
            }
        }
    }

    public final void v(int i, int i2) {
        if (i > 0) {
            A(this.i, i2);
            int i3 = this.k;
            int i4 = this.l;
            if (i4 < i) {
                Object[] objArr = this.c;
                int length = objArr.length;
                int i5 = length - i4;
                int max = Math.max(Math.max(length * 2, i5 + i), 32);
                Object[] objArr2 = new Object[max];
                for (int i6 = 0; i6 < max; i6++) {
                    objArr2[i6] = null;
                }
                int i7 = max - i5;
                int i8 = i4 + i3;
                System.arraycopy(objArr, 0, objArr2, 0, i3);
                System.arraycopy(objArr, i8, objArr2, i3 + i7, length - i8);
                this.c = objArr2;
                i4 = i7;
            }
            int i9 = this.j;
            if (i9 >= i3) {
                this.j = i9 + i;
            }
            this.k = i3 + i;
            this.l = i4 - i;
        }
    }

    public final boolean w(int i) {
        return (this.b[(q(i) * 5) + 1] & 1073741824) != 0;
    }

    public final void y(jr0 jr0Var, int i) {
        if (this.n <= 0) {
            th.c("Check failed");
        }
        if (i == 0 && this.t == 0 && this.a.e == 0) {
            int[] iArr = jr0Var.d;
            int i2 = iArr[(i * 5) + 3];
            int i3 = jr0Var.e;
            if (i2 == i3) {
                int[] iArr2 = this.b;
                Object[] objArr = this.c;
                ArrayList arrayList = this.d;
                HashMap hashMap = this.e;
                p60 p60Var = this.f;
                Object[] objArr2 = jr0Var.f;
                int i4 = jr0Var.g;
                HashMap hashMap2 = jr0Var.m;
                p60 p60Var2 = jr0Var.n;
                this.b = iArr;
                this.c = objArr2;
                this.d = jr0Var.l;
                this.g = i3;
                this.h = (iArr.length / 5) - i3;
                this.k = i4;
                this.l = objArr2.length - i4;
                this.m = i3;
                this.e = hashMap2;
                this.f = p60Var2;
                jr0Var.d = iArr2;
                jr0Var.e = 0;
                jr0Var.f = objArr;
                jr0Var.g = 0;
                jr0Var.l = arrayList;
                jr0Var.m = hashMap;
                jr0Var.n = p60Var;
                return;
            }
        }
        mr0 d = jr0Var.d();
        try {
            ch0.j(d, i, this, true, true, false);
            d.e(true);
        } catch (Throwable th) {
            d.e(false);
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005b, code lost:
    
        r2 = r8.b;
        r3 = r9 * 5;
        r4 = r0 * 5;
        r5 = r1 * 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0063, code lost:
    
        if (r9 >= r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0065, code lost:
    
        defpackage.p8.R(r2, r2, r4 + r3, r3, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006a, code lost:
    
        defpackage.p8.R(r2, r2, r5, r5 + r4, r3 + r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z(int i) {
        h2 h2Var;
        int i2;
        h2 h2Var2;
        int i3;
        int i4;
        int i5 = this.h;
        int i6 = this.g;
        if (i6 != i) {
            if (!this.d.isEmpty()) {
                int n = n() - this.h;
                ArrayList arrayList = this.d;
                if (i6 < i) {
                    for (int a = lr0.a(arrayList, i6, n); a < this.d.size() && (i3 = (h2Var2 = (h2) this.d.get(a)).a) < 0 && (i4 = i3 + n) < i; a++) {
                        h2Var2.a = i4;
                    }
                } else {
                    for (int a2 = lr0.a(arrayList, i, n); a2 < this.d.size() && (i2 = (h2Var = (h2) this.d.get(a2)).a) >= 0; a2++) {
                        h2Var.a = -(n - i2);
                    }
                }
            }
            if (i < i6) {
                i6 = i + i5;
            }
            int n2 = n();
            if (i6 >= n2) {
                th.c("Check failed");
            }
            while (i6 < n2) {
                int i7 = (i6 * 5) + 2;
                int i8 = this.b[i7];
                int o = i8 > -2 ? i8 : (o() + i8) - (-2);
                if (o >= i) {
                    o = -((o() - o) - (-2));
                }
                if (o != i8) {
                    this.b[i7] = o;
                }
                i6++;
                if (i6 == i) {
                    i6 += i5;
                }
            }
        }
        this.g = i;
    }
}
