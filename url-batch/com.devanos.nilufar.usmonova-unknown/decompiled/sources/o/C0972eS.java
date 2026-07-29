package o;

import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: o.eS, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0972eS {
    public final C0841cS a;
    public int[] b;
    public Object[] c;
    public ArrayList d;
    public HashMap e;
    public C2340zD f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;

    /* renamed from: o, reason: collision with root package name */
    public int f162o;
    public final C1459lt p;
    public final C1459lt q;
    public final C1459lt r;
    public C2340zD s;
    public int t;
    public int u;
    public int v;
    public boolean w;
    public C1621oJ x;

    public C0972eS(C0841cS c0841cS) {
        this.a = c0841cS;
        int[] iArr = c0841cS.h;
        this.b = iArr;
        Object[] objArr = c0841cS.j;
        this.c = objArr;
        this.d = c0841cS.f148o;
        this.e = c0841cS.p;
        this.f = c0841cS.q;
        int i = c0841cS.i;
        this.g = i;
        this.h = (iArr.length / 5) - i;
        int i2 = c0841cS.k;
        this.k = i2;
        this.l = objArr.length - i2;
        this.m = i;
        this.p = new C1459lt();
        this.q = new C1459lt();
        this.r = new C1459lt();
        this.u = i;
        this.v = -1;
    }

    public static int h(int i, int i2, int i3, int i4) {
        return i > i2 ? -(((i4 - i3) - i) + 1) : i;
    }

    public final boolean A(int i, int i2) {
        if (i2 > 0) {
            ArrayList arrayList = this.d;
            u(i);
            if (!arrayList.isEmpty()) {
                HashMap hashMap = this.e;
                int i3 = i + i2;
                int g = TM.g(this.d, i3, m() - this.h);
                if (g >= this.d.size()) {
                    g--;
                }
                int i4 = g + 1;
                int i5 = 0;
                while (g >= 0) {
                    C1471m2 c1471m2 = (C1471m2) this.d.get(g);
                    int c = c(c1471m2);
                    if (c < i) {
                        break;
                    }
                    if (c < i3) {
                        c1471m2.a = Integer.MIN_VALUE;
                        if (hashMap != null) {
                        }
                        if (i5 == 0) {
                            i5 = g + 1;
                        }
                        i4 = g;
                    }
                    g--;
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
            if (i8 >= 0 && TM.a(this.b, p(i8))) {
                J(i8);
            }
        }
        return r0;
    }

    public final void B(int i, int i2, int i3) {
        if (i2 > 0) {
            int i4 = this.l;
            int i5 = i + i2;
            v(i5, i3);
            this.k = i;
            this.l = i4 + i2;
            P6.g0(this.c, i, i5);
            int i6 = this.j;
            if (i6 >= i) {
                this.j = i6 - i2;
            }
        }
    }

    public final void C() {
        int i = this.u;
        this.t = i;
        this.i = f(this.b, p(i));
    }

    public final int D(int[] iArr, int i) {
        if (i >= m()) {
            return this.c.length - this.l;
        }
        int j = TM.j(iArr, i);
        return j < 0 ? (this.c.length - this.l) + j + 1 : j;
    }

    public final int E(int i, int i2) {
        int D = D(this.b, p(i));
        int i3 = D + i2;
        if (i3 >= D && i3 < f(this.b, p(i + 1))) {
            return i3;
        }
        EB.h("Write to an invalid slot index " + i2 + " for group " + i);
        throw null;
    }

    public final void F() {
        if (this.n != 0) {
            EB.h("Key must be supplied when inserting");
            throw null;
        }
        C1623oL c1623oL = C1311jd.a;
        G(0, c1623oL, c1623oL, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void G(int i, Object obj, Object obj2, boolean z) {
        int i2;
        HashMap hashMap;
        C1471m2 H;
        int i3 = this.v;
        Object[] objArr = this.n > 0;
        this.r.b(this.f162o);
        C1623oL c1623oL = C1311jd.a;
        if (objArr == true) {
            int i4 = this.t;
            int f = f(this.b, p(i4));
            r(1);
            this.i = f;
            this.j = f;
            int p = p(i4);
            int i5 = obj != c1623oL ? 1 : 0;
            int i6 = (z || obj2 == c1623oL) ? 0 : 1;
            int h = h(f, this.k, this.l, this.c.length);
            if (h >= 0 && this.m < i4) {
                h = -(((this.c.length - this.l) - h) + 1);
            }
            int[] iArr = this.b;
            int i7 = this.v;
            int i8 = z ? 1073741824 : 0;
            int i9 = i5 != 0 ? 536870912 : 0;
            int i10 = i6 != 0 ? 268435456 : 0;
            int i11 = p * 5;
            iArr[i11] = i;
            iArr[i11 + 1] = i8 | i9 | i10;
            iArr[i11 + 2] = i7;
            iArr[i11 + 3] = 0;
            iArr[i11 + 4] = h;
            int i12 = (z ? 1 : 0) + i5 + i6;
            if (i12 > 0) {
                s(i12, i4);
                Object[] objArr2 = this.c;
                int i13 = this.i;
                if (z) {
                    objArr2[i13] = obj2;
                    i13++;
                }
                if (i5 != 0) {
                    objArr2[i13] = obj;
                    i13++;
                }
                if (i6 != 0) {
                    objArr2[i13] = obj2;
                    i13++;
                }
                this.i = i13;
            }
            this.f162o = 0;
            i2 = i4 + 1;
            this.v = i4;
            this.t = i2;
            if (i3 >= 0 && (hashMap = this.e) != null && (H = H(i3)) != null) {
            }
        } else {
            this.p.b(i3);
            this.q.b((m() - this.h) - this.u);
            int i14 = this.t;
            int p2 = p(i14);
            if (!AbstractC0048Bt.h(obj2, c1623oL)) {
                if (z) {
                    K(this.t, obj2);
                } else {
                    I(obj2);
                }
            }
            this.i = D(this.b, p2);
            this.j = f(this.b, p(this.t + 1));
            this.f162o = TM.h(this.b, p2);
            this.v = i14;
            this.t = i14 + 1;
            i2 = i14 + this.b[(p2 * 5) + 3];
        }
        this.u = i2;
    }

    public final C1471m2 H(int i) {
        ArrayList arrayList;
        int A;
        if (i < 0 || i >= n() || (A = TM.A((arrayList = this.d), i, n())) < 0) {
            return null;
        }
        return (C1471m2) arrayList.get(A);
    }

    public final void I(Object obj) {
        int p = p(this.t);
        if (!TM.d(this.b, p)) {
            EB.h("Updating the data of a group that was not created with a data slot");
            throw null;
        }
        Object[] objArr = this.c;
        int[] iArr = this.b;
        int f = f(iArr, p);
        int i = 1;
        switch (iArr[(p * 5) + 1] >> 29) {
            case 0:
                i = 0;
                break;
            case 1:
            case 2:
            case 4:
                break;
            case 3:
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                i = 2;
                break;
            default:
                i = 3;
                break;
        }
        objArr[g(i + f)] = obj;
    }

    public final void J(int i) {
        if (i >= 0) {
            C1621oJ c1621oJ = this.x;
            if (c1621oJ == null) {
                c1621oJ = new C1621oJ(0, false);
                this.x = c1621oJ;
            }
            c1621oJ.a(i);
        }
    }

    public final void K(int i, Object obj) {
        int p = p(i);
        int[] iArr = this.b;
        if (p < iArr.length && TM.f(iArr, p)) {
            this.c[g(f(this.b, p))] = obj;
            return;
        }
        EB.h("Updating the node of a group at " + i + " that was not created with as a node group");
        throw null;
    }

    public final void a(int i) {
        boolean z = false;
        if (!(i >= 0)) {
            EB.h("Cannot seek backwards");
            throw null;
        }
        if (!(this.n <= 0)) {
            AbstractC1052fg.T("Cannot call seek() while inserting");
            throw null;
        }
        if (i == 0) {
            return;
        }
        int i2 = this.t + i;
        if (i2 >= this.v && i2 <= this.u) {
            z = true;
        }
        if (z) {
            this.t = i2;
            int f = f(this.b, p(i2));
            this.i = f;
            this.j = f;
            return;
        }
        EB.h("Cannot seek outside the current group (" + this.v + '-' + this.u + ')');
        throw null;
    }

    public final C1471m2 b(int i) {
        ArrayList arrayList = this.d;
        int A = TM.A(arrayList, i, n());
        if (A >= 0) {
            return (C1471m2) arrayList.get(A);
        }
        if (i > this.g) {
            i = -(n() - i);
        }
        C1471m2 c1471m2 = new C1471m2(i);
        arrayList.add(-(A + 1), c1471m2);
        return c1471m2;
    }

    public final int c(C1471m2 c1471m2) {
        int i = c1471m2.a;
        return i < 0 ? n() + i : i;
    }

    public final void d() {
        int i = this.n;
        this.n = i + 1;
        if (i == 0) {
            this.q.b((m() - this.h) - this.u);
        }
    }

    public final void e(boolean z) {
        this.w = true;
        if (z && this.p.b == 0) {
            u(n());
            v(this.c.length - this.l, this.g);
            int i = this.k;
            P6.g0(this.c, i, this.l + i);
            y();
        }
        int[] iArr = this.b;
        int i2 = this.g;
        Object[] objArr = this.c;
        int i3 = this.k;
        ArrayList arrayList = this.d;
        HashMap hashMap = this.e;
        C2340zD c2340zD = this.f;
        C0841cS c0841cS = this.a;
        if (!c0841cS.m) {
            AbstractC1052fg.S("Unexpected writer close()");
            throw null;
        }
        c0841cS.m = false;
        c0841cS.h = iArr;
        c0841cS.i = i2;
        c0841cS.j = objArr;
        c0841cS.k = i3;
        c0841cS.f148o = arrayList;
        c0841cS.p = hashMap;
        c0841cS.q = c2340zD;
    }

    public final int f(int[] iArr, int i) {
        if (i >= m()) {
            return this.c.length - this.l;
        }
        int b = TM.b(iArr, i);
        return b < 0 ? (this.c.length - this.l) + b + 1 : b;
    }

    public final int g(int i) {
        return i < this.k ? i : i + this.l;
    }

    public final void i() {
        HD hd;
        boolean z = this.n > 0;
        int i = this.t;
        int i2 = this.u;
        int i3 = this.v;
        int p = p(i3);
        int i4 = this.f162o;
        int i5 = i - i3;
        boolean f = TM.f(this.b, p);
        C1459lt c1459lt = this.r;
        if (z) {
            C2340zD c2340zD = this.s;
            if (c2340zD != null && (hd = (HD) c2340zD.e(i3)) != null) {
                Object[] objArr = hd.a;
                int i6 = hd.b;
                for (int i7 = 0; i7 < i6; i7++) {
                    x(objArr[i7]);
                }
            }
            TM.k(p, i5, this.b);
            TM.l(p, i4, this.b);
            int a = c1459lt.a();
            if (f) {
                i4 = 1;
            }
            this.f162o = a + i4;
            int w = w(this.b, i3);
            this.v = w;
            int n = w < 0 ? n() : p(w + 1);
            int f2 = n >= 0 ? f(this.b, n) : 0;
            this.i = f2;
            this.j = f2;
            return;
        }
        if (i != i2) {
            EB.h("Expected to be at the end of a group");
            throw null;
        }
        int[] iArr = this.b;
        int i8 = iArr[(p * 5) + 3];
        int h = TM.h(iArr, p);
        TM.k(p, i5, this.b);
        TM.l(p, i4, this.b);
        int a2 = this.p.a();
        this.u = (m() - this.h) - this.q.a();
        this.v = a2;
        int w2 = w(this.b, i3);
        int a3 = c1459lt.a();
        this.f162o = a3;
        if (w2 == a2) {
            this.f162o = a3 + (f ? 0 : i4 - h);
            return;
        }
        int i9 = i5 - i8;
        int i10 = f ? 0 : i4 - h;
        if (i9 != 0 || i10 != 0) {
            while (w2 != 0 && w2 != a2 && (i10 != 0 || i9 != 0)) {
                int p2 = p(w2);
                if (i9 != 0) {
                    int[] iArr2 = this.b;
                    TM.k(p2, iArr2[(p2 * 5) + 3] + i9, iArr2);
                }
                if (i10 != 0) {
                    int[] iArr3 = this.b;
                    TM.l(p2, TM.h(iArr3, p2) + i10, iArr3);
                }
                if (TM.f(this.b, p2)) {
                    i10 = 0;
                }
                w2 = w(this.b, w2);
            }
        }
        this.f162o += i10;
    }

    public final void j() {
        int i = this.n;
        if (i <= 0) {
            AbstractC1052fg.T("Unbalanced begin/end insert");
            throw null;
        }
        int i2 = i - 1;
        this.n = i2;
        if (i2 == 0) {
            if (this.r.b == this.p.b) {
                this.u = (m() - this.h) - this.q.a();
            } else {
                EB.h("startGroup/endGroup mismatch while inserting");
                throw null;
            }
        }
    }

    public final void k(int i) {
        boolean z = false;
        if (!(this.n <= 0)) {
            EB.h("Cannot call ensureStarted() while inserting");
            throw null;
        }
        int i2 = this.v;
        if (i2 != i) {
            if (i >= i2 && i < this.u) {
                z = true;
            }
            if (!z) {
                EB.h("Started group at " + i + " must be a subgroup of the group at " + i2);
                throw null;
            }
            int i3 = this.t;
            int i4 = this.i;
            int i5 = this.j;
            this.t = i;
            F();
            this.t = i3;
            this.i = i4;
            this.j = i5;
        }
    }

    public final void l(int i, int i2, int i3) {
        if (i >= this.g) {
            i = -((n() - i) + 2);
        }
        while (i3 < i2) {
            this.b[(p(i3) * 5) + 2] = i;
            int i4 = this.b[(p(i3) * 5) + 3] + i3;
            l(i3, i4, i3 + 1);
            i3 = i4;
        }
    }

    public final int m() {
        return this.b.length / 5;
    }

    public final int n() {
        return m() - this.h;
    }

    public final int o() {
        return this.c.length - this.l;
    }

    public final int p(int i) {
        return i < this.g ? i : i + this.h;
    }

    public final int q(int i) {
        return TM.c(this.b, p(i));
    }

    public final void r(int i) {
        if (i > 0) {
            int i2 = this.t;
            u(i2);
            int i3 = this.g;
            int i4 = this.h;
            int[] iArr = this.b;
            int length = iArr.length / 5;
            int i5 = length - i4;
            if (i4 < i) {
                int max = Math.max(Math.max(length * 2, i5 + i), 32);
                int[] iArr2 = new int[max * 5];
                int i6 = max - i5;
                P6.a0(0, 0, i3 * 5, iArr, iArr2);
                P6.a0((i3 + i6) * 5, (i4 + i3) * 5, length * 5, iArr, iArr2);
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
            int h = h(i5 > 0 ? f(this.b, p(i2 + i)) : 0, this.m >= i3 ? this.k : 0, this.l, this.c.length);
            for (int i9 = i3; i9 < i8; i9++) {
                this.b[(i9 * 5) + 4] = h;
            }
            int i10 = this.m;
            if (i10 >= i3) {
                this.m = i10 + i;
            }
        }
    }

    public final void s(int i, int i2) {
        if (i > 0) {
            v(this.i, i2);
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
                P6.b0(objArr, objArr2, 0, 0, i3);
                P6.b0(objArr, objArr2, i3 + i7, i4 + i3, length);
                this.c = objArr2;
                i4 = i7;
            }
            int i8 = this.j;
            if (i8 >= i3) {
                this.j = i8 + i;
            }
            this.k = i3 + i;
            this.l = i4 - i;
        }
    }

    public final void t(C0841cS c0841cS, int i) {
        EB.T(this.n > 0);
        if (i == 0 && this.t == 0 && this.a.i == 0) {
            int[] iArr = c0841cS.h;
            int i2 = iArr[(i * 5) + 3];
            int i3 = c0841cS.i;
            if (i2 == i3) {
                int[] iArr2 = this.b;
                Object[] objArr = this.c;
                ArrayList arrayList = this.d;
                HashMap hashMap = this.e;
                C2340zD c2340zD = this.f;
                Object[] objArr2 = c0841cS.j;
                int i4 = c0841cS.k;
                HashMap hashMap2 = c0841cS.p;
                C2340zD c2340zD2 = c0841cS.q;
                this.b = iArr;
                this.c = objArr2;
                this.d = c0841cS.f148o;
                this.g = i3;
                this.h = (iArr.length / 5) - i3;
                this.k = i4;
                this.l = objArr2.length - i4;
                this.m = i3;
                this.e = hashMap2;
                this.f = c2340zD2;
                c0841cS.h = iArr2;
                c0841cS.i = 0;
                c0841cS.j = objArr;
                c0841cS.k = 0;
                c0841cS.f148o = arrayList;
                c0841cS.p = hashMap;
                c0841cS.q = c2340zD;
                return;
            }
        }
        C0972eS l = c0841cS.l();
        try {
            ZM.j(l, i, this, true, true, false);
            l.e(true);
        } catch (Throwable th) {
            l.e(false);
            throw th;
        }
    }

    public final String toString() {
        return "SlotWriter(current = " + this.t + " end=" + this.u + " size = " + n() + " gap=" + this.g + '-' + (this.g + this.h) + ')';
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        r2 = r8.b;
        r3 = r9 * 5;
        r4 = r0 * 5;
        r5 = r1 * 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0065, code lost:
    
        if (r9 >= r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0067, code lost:
    
        o.P6.a0(r4 + r3, r3, r5, r2, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006c, code lost:
    
        o.P6.a0(r5, r5 + r4, r3 + r4, r2, r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(int i) {
        C1471m2 c1471m2;
        int i2;
        C1471m2 c1471m22;
        int i3;
        int i4;
        int i5 = this.h;
        int i6 = this.g;
        if (i6 != i) {
            if (!this.d.isEmpty()) {
                int m = m() - this.h;
                if (i6 < i) {
                    for (int g = TM.g(this.d, i6, m); g < this.d.size() && (i3 = (c1471m22 = (C1471m2) this.d.get(g)).a) < 0 && (i4 = i3 + m) < i; g++) {
                        c1471m22.a = i4;
                    }
                } else {
                    for (int g2 = TM.g(this.d, i, m); g2 < this.d.size() && (i2 = (c1471m2 = (C1471m2) this.d.get(g2)).a) >= 0; g2++) {
                        c1471m2.a = -(m - i2);
                    }
                }
            }
            if (i < i6) {
                i6 = i + i5;
            }
            int m2 = m();
            EB.T(i6 < m2);
            while (i6 < m2) {
                int i7 = (i6 * 5) + 2;
                int i8 = this.b[i7];
                int n = i8 > -2 ? i8 : (n() + i8) - (-2);
                if (n >= i) {
                    n = -((n() - n) - (-2));
                }
                if (n != i8) {
                    this.b[i7] = n;
                }
                i6++;
                if (i6 == i) {
                    i6 += i5;
                }
            }
        }
        this.g = i;
    }

    public final void v(int i, int i2) {
        int i3 = this.l;
        int i4 = this.k;
        int i5 = this.m;
        if (i4 != i) {
            Object[] objArr = this.c;
            if (i < i4) {
                P6.b0(objArr, objArr, i + i3, i, i4);
            } else {
                P6.b0(objArr, objArr, i4, i4 + i3, i + i3);
            }
        }
        int min = Math.min(i2 + 1, n());
        if (i5 != min) {
            int length = this.c.length - i3;
            if (min < i5) {
                int p = p(min);
                int p2 = p(i5);
                int i6 = this.g;
                while (p < p2) {
                    int[] iArr = this.b;
                    int i7 = (p * 5) + 4;
                    int i8 = iArr[i7];
                    if (i8 < 0) {
                        EB.h("Unexpected anchor value, expected a positive anchor");
                        throw null;
                    }
                    iArr[i7] = -((length - i8) + 1);
                    p++;
                    if (p == i6) {
                        p += this.h;
                    }
                }
            } else {
                int p3 = p(i5);
                int p4 = p(min);
                while (p3 < p4) {
                    int[] iArr2 = this.b;
                    int i9 = (p3 * 5) + 4;
                    int i10 = iArr2[i9];
                    if (i10 >= 0) {
                        EB.h("Unexpected anchor value, expected a negative anchor");
                        throw null;
                    }
                    iArr2[i9] = i10 + length + 1;
                    p3++;
                    if (p3 == this.g) {
                        p3 += this.h;
                    }
                }
            }
            this.m = min;
        }
        this.k = i;
    }

    public final int w(int[] iArr, int i) {
        int i2 = TM.i(iArr, p(i));
        return i2 > -2 ? i2 : (n() + i2) - (-2);
    }

    public final Object x(Object obj) {
        if (this.n > 0) {
            s(1, this.v);
        }
        Object[] objArr = this.c;
        int i = this.i;
        this.i = i + 1;
        Object obj2 = objArr[g(i)];
        int i2 = this.i;
        if (i2 <= this.j) {
            this.c[g(i2 - 1)] = obj;
            return obj2;
        }
        EB.h("Writing to an invalid slot");
        throw null;
    }

    public final void y() {
        boolean z;
        C1621oJ c1621oJ = this.x;
        if (c1621oJ != null) {
            while (!c1621oJ.a.isEmpty()) {
                int d = c1621oJ.d();
                int p = p(d);
                int i = d + 1;
                int q = q(d) + d;
                while (true) {
                    if (i >= q) {
                        z = false;
                        break;
                    } else {
                        if ((this.b[(p(i) * 5) + 1] & 201326592) != 0) {
                            z = true;
                            break;
                        }
                        i += q(i);
                    }
                }
                if (TM.a(this.b, p) != z) {
                    int[] iArr = this.b;
                    int i2 = (p * 5) + 1;
                    if (z) {
                        iArr[i2] = iArr[i2] | 67108864;
                    } else {
                        iArr[i2] = iArr[i2] & (-67108865);
                    }
                    int w = w(iArr, d);
                    if (w >= 0) {
                        c1621oJ.a(w);
                    }
                }
            }
        }
    }

    public final boolean z() {
        C1471m2 H;
        if (this.n != 0) {
            EB.h("Cannot remove group while inserting");
            throw null;
        }
        int i = this.t;
        int i2 = this.i;
        int f = f(this.b, p(i));
        int p = p(this.t);
        int c = TM.c(this.b, p) + this.t;
        this.t = c;
        this.i = f(this.b, p(c));
        int h = TM.f(this.b, p) ? 1 : TM.h(this.b, p);
        int i3 = this.v;
        HashMap hashMap = this.e;
        if (hashMap != null && (H = H(i3)) != null) {
        }
        C1621oJ c1621oJ = this.x;
        if (c1621oJ != null) {
            ArrayList arrayList = c1621oJ.a;
            while (!arrayList.isEmpty() && ((Number) AbstractC0720ac.n0(arrayList)).intValue() >= i) {
                c1621oJ.d();
            }
        }
        boolean A = A(i, this.t - i);
        B(f, this.i - f, i - 1);
        this.t = i;
        this.i = i2;
        this.f162o -= h;
        return A;
    }
}
