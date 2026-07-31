package yads;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes10.dex */
public final class ef0 extends nf0 implements Comparable {
    public final int f;
    public final boolean g;
    public final String h;
    public final hf0 i;
    public final boolean j;
    public final int k;
    public final int l;
    public final int m;
    public final boolean n;
    public final int o;
    public final int p;
    public final boolean q;
    public final int r;
    public final int s;
    public final int t;
    public final int u;
    public final boolean v;
    public final boolean w;

    public ef0(int i, x73 x73Var, int i2, hf0 hf0Var, int i3, boolean z, ig2 ig2Var) {
        super(i, x73Var, i2);
        int i4;
        int i5;
        int i6;
        this.i = hf0Var;
        this.h = pf0.a(this.e.d);
        int i7 = 0;
        this.j = pf0.a(false, i3);
        int i8 = 0;
        while (true) {
            i4 = Integer.MAX_VALUE;
            if (i8 >= hf0Var.o.size()) {
                i5 = 0;
                i8 = Integer.MAX_VALUE;
                break;
            } else {
                i5 = pf0.a(this.e, (String) hf0Var.o.get(i8), false);
                if (i5 > 0) {
                    break;
                } else {
                    i8++;
                }
            }
        }
        this.l = i8;
        this.k = i5;
        this.m = pf0.a(this.e.f, hf0Var.p);
        jw0 jw0Var = this.e;
        int i9 = jw0Var.f;
        this.n = i9 == 0 || (i9 & 1) != 0;
        this.q = (jw0Var.e & 1) != 0;
        int i10 = jw0Var.z;
        this.r = i10;
        this.s = jw0Var.A;
        int i11 = jw0Var.i;
        this.t = i11;
        this.g = (i11 == -1 || i11 <= hf0Var.r) && (i10 == -1 || i10 <= hf0Var.q) && ig2Var.apply(jw0Var);
        String[] a = sb3.a();
        int i12 = 0;
        while (true) {
            if (i12 >= a.length) {
                i6 = 0;
                i12 = Integer.MAX_VALUE;
                break;
            } else {
                i6 = pf0.a(this.e, a[i12], false);
                if (i6 > 0) {
                    break;
                } else {
                    i12++;
                }
            }
        }
        this.o = i12;
        this.p = i6;
        int i13 = 0;
        while (true) {
            if (i13 < hf0Var.s.size()) {
                String str = this.e.m;
                if (str != null && str.equals(hf0Var.s.get(i13))) {
                    i4 = i13;
                    break;
                }
                i13++;
            } else {
                break;
            }
        }
        this.u = i4;
        this.v = fo.a(i3) == 128;
        this.w = fo.b(i3) == 64;
        if (pf0.a(this.i.M, i3) && (this.g || this.i.G)) {
            if (pf0.a(false, i3) && this.g && this.e.i != -1) {
                hf0 hf0Var2 = this.i;
                if (!hf0Var2.y && !hf0Var2.x && (hf0Var2.O || !z)) {
                    i7 = 2;
                }
            }
            i7 = 1;
        }
        this.f = i7;
    }

    @Override // yads.nf0
    public final boolean a(nf0 nf0Var) {
        int i;
        String str;
        int i2;
        ef0 ef0Var = (ef0) nf0Var;
        hf0 hf0Var = this.i;
        if ((hf0Var.J || ((i2 = this.e.z) != -1 && i2 == ef0Var.e.z)) && (hf0Var.H || ((str = this.e.m) != null && TextUtils.equals(str, ef0Var.e.m)))) {
            hf0 hf0Var2 = this.i;
            if ((hf0Var2.I || ((i = this.e.A) != -1 && i == ef0Var.e.A)) && (hf0Var2.K || (this.v == ef0Var.v && this.w == ef0Var.w))) {
                return true;
            }
        }
        return false;
    }

    public static um2 a(int i, x73 x73Var, hf0 hf0Var, int[] iArr, boolean z, ig2 ig2Var) {
        i41 i41Var = l41.c;
        dx.a(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i2 = 0;
        int i3 = 0;
        while (i2 < x73Var.b) {
            ef0 ef0Var = new ef0(i, x73Var, i2, hf0Var, iArr[i2], z, ig2Var);
            int i4 = i3 + 1;
            if (objArr.length < i4) {
                objArr = Arrays.copyOf(objArr, e41.a(objArr.length, i4));
            }
            objArr[i3] = ef0Var;
            i2++;
            i3 = i4;
        }
        return l41.b(i3, objArr);
    }

    @Override // yads.nf0
    public final int a() {
        return this.f;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(ef0 ef0Var) {
        gb2 a;
        if (this.g && this.j) {
            a = pf0.i;
        } else {
            a = pf0.i.a();
        }
        zx a2 = xx.a(bq.a(this.j, ef0Var.j));
        Integer valueOf = Integer.valueOf(this.l);
        Integer valueOf2 = Integer.valueOf(ef0Var.l);
        p82.b.getClass();
        lq2 lq2Var = lq2.b;
        zx a3 = a2.a(valueOf, valueOf2, lq2Var).a(this.k, ef0Var.k).a(this.m, ef0Var.m).a(this.q, ef0Var.q).a(this.n, ef0Var.n).a(Integer.valueOf(this.o), Integer.valueOf(ef0Var.o), lq2Var).a(this.p, ef0Var.p).a(this.g, ef0Var.g).a(Integer.valueOf(this.u), Integer.valueOf(ef0Var.u), lq2Var).a(Integer.valueOf(this.t), Integer.valueOf(ef0Var.t), this.i.x ? pf0.i.a() : pf0.j).a(this.v, ef0Var.v).a(this.w, ef0Var.w).a(Integer.valueOf(this.r), Integer.valueOf(ef0Var.r), a).a(Integer.valueOf(this.s), Integer.valueOf(ef0Var.s), a);
        Integer valueOf3 = Integer.valueOf(this.t);
        Integer valueOf4 = Integer.valueOf(ef0Var.t);
        if (!sb3.a(this.h, ef0Var.h)) {
            a = pf0.j;
        }
        return a3.a(valueOf3, valueOf4, a).a();
    }

    public static int a(List list, List list2) {
        return ((ef0) Collections.max(list)).compareTo((ef0) Collections.max(list2));
    }
}
