package o;

import java.util.ArrayList;

/* renamed from: o.bS, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0776bS {
    public final C0841cS a;
    public final int[] b;
    public final int c;
    public final Object[] d;
    public final int e;
    public boolean f;
    public int g;
    public int h;
    public int i;
    public final C1459lt j;
    public int k;
    public int l;
    public int m;
    public boolean n;

    public C0776bS(C0841cS c0841cS) {
        this.a = c0841cS;
        this.b = c0841cS.h;
        int i = c0841cS.i;
        this.c = i;
        this.d = c0841cS.j;
        this.e = c0841cS.k;
        this.h = i;
        this.i = -1;
        this.j = new C1459lt();
    }

    public final C1471m2 a(int i) {
        ArrayList arrayList = this.a.f148o;
        int A = TM.A(arrayList, i, this.c);
        if (A >= 0) {
            return (C1471m2) arrayList.get(A);
        }
        C1471m2 c1471m2 = new C1471m2(i);
        arrayList.add(-(A + 1), c1471m2);
        return c1471m2;
    }

    public final Object b(int[] iArr, int i) {
        int i2;
        if (!TM.d(iArr, i)) {
            return C1311jd.a;
        }
        int i3 = i * 5;
        if (i3 >= iArr.length) {
            i2 = iArr.length;
        } else {
            int i4 = iArr[i3 + 4];
            int i5 = 1;
            switch (iArr[i3 + 1] >> 29) {
                case 0:
                    i5 = 0;
                    break;
                case 1:
                case 2:
                case 4:
                    break;
                case 3:
                case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                    i5 = 2;
                    break;
                default:
                    i5 = 3;
                    break;
            }
            i2 = i5 + i4;
        }
        return this.d[i2];
    }

    public final void c() {
        int i;
        this.f = true;
        C0841cS c0841cS = this.a;
        c0841cS.getClass();
        if (this.a != c0841cS || (i = c0841cS.l) <= 0) {
            EB.h("Unexpected reader close()");
            throw null;
        }
        c0841cS.l = i - 1;
    }

    public final void d() {
        if (this.k == 0) {
            if (!(this.g == this.h)) {
                EB.h("endGroup() not called at the end of a group");
                throw null;
            }
            int i = this.i;
            int[] iArr = this.b;
            int i2 = TM.i(iArr, i);
            this.i = i2;
            int i3 = this.c;
            this.h = i2 < 0 ? i3 : TM.c(iArr, i2) + i2;
            int a = this.j.a();
            if (a < 0) {
                this.l = 0;
                this.m = 0;
            } else {
                this.l = a;
                this.m = i2 >= i3 - 1 ? this.e : TM.b(iArr, i2 + 1);
            }
        }
    }

    public final Object e() {
        int i = this.g;
        if (i < this.h) {
            return b(this.b, i);
        }
        return 0;
    }

    public final int f() {
        int i = this.g;
        if (i >= this.h) {
            return 0;
        }
        return this.b[i * 5];
    }

    public final Object g(int i, int i2) {
        int[] iArr = this.b;
        int j = TM.j(iArr, i);
        int i3 = i + 1;
        int i4 = j + i2;
        return i4 < (i3 < this.c ? iArr[(i3 * 5) + 4] : this.e) ? this.d[i4] : C1311jd.a;
    }

    public final Object h() {
        int i;
        if (this.k > 0 || (i = this.l) >= this.m) {
            this.n = false;
            return C1311jd.a;
        }
        this.n = true;
        this.l = i + 1;
        return this.d[i];
    }

    public final Object i(int i) {
        int[] iArr = this.b;
        if (!TM.f(iArr, i)) {
            return null;
        }
        if (!TM.f(iArr, i)) {
            return C1311jd.a;
        }
        return this.d[iArr[(i * 5) + 4]];
    }

    public final Object j(int[] iArr, int i) {
        if (!TM.e(iArr, i)) {
            return null;
        }
        int i2 = i * 5;
        int i3 = iArr[i2 + 4];
        int i4 = 1;
        switch (iArr[i2 + 1] >> 30) {
            case 0:
                i4 = 0;
                break;
            case 1:
            case 2:
            case 4:
                break;
            case 3:
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                i4 = 2;
                break;
            default:
                i4 = 3;
                break;
        }
        return this.d[i4 + i3];
    }

    public final void k(int i) {
        if (!(this.k == 0)) {
            EB.h("Cannot reposition while in an empty region");
            throw null;
        }
        this.g = i;
        int[] iArr = this.b;
        int i2 = this.c;
        int i3 = i < i2 ? TM.i(iArr, i) : -1;
        this.i = i3;
        if (i3 < 0) {
            this.h = i2;
        } else {
            this.h = TM.c(iArr, i3) + i3;
        }
        this.l = 0;
        this.m = 0;
    }

    public final int l() {
        if (!(this.k == 0)) {
            EB.h("Cannot skip while in an empty region");
            throw null;
        }
        int i = this.g;
        int[] iArr = this.b;
        int h = TM.f(iArr, i) ? 1 : TM.h(iArr, this.g);
        int i2 = this.g;
        this.g = TM.c(iArr, i2) + i2;
        return h;
    }

    public final void m() {
        if (!(this.k == 0)) {
            EB.h("Cannot skip the enclosing group while in an empty region");
            throw null;
        }
        this.g = this.h;
        this.l = 0;
        this.m = 0;
    }

    public final void n() {
        if (this.k <= 0) {
            int i = this.i;
            int i2 = this.g;
            int[] iArr = this.b;
            if (!(TM.i(iArr, i2) == i)) {
                AbstractC1052fg.S("Invalid slot table detected");
                throw null;
            }
            int i3 = this.l;
            int i4 = this.m;
            C1459lt c1459lt = this.j;
            if (i3 == 0 && i4 == 0) {
                c1459lt.b(-1);
            } else {
                c1459lt.b(i3);
            }
            this.i = i2;
            this.h = TM.c(iArr, i2) + i2;
            int i5 = i2 + 1;
            this.g = i5;
            this.l = TM.j(iArr, i2);
            this.m = i2 >= this.c - 1 ? this.e : TM.b(iArr, i5);
        }
    }

    public final String toString() {
        return "SlotReader(current=" + this.g + ", key=" + f() + ", parent=" + this.i + ", end=" + this.h + ')';
    }
}
