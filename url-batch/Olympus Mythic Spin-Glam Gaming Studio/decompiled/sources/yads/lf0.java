package yads;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes3.dex */
public final class lf0 extends nf0 implements Comparable {
    public final int f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final boolean n;

    public lf0(int i, x73 x73Var, int i2, hf0 hf0Var, int i3, String str) {
        super(i, x73Var, i2);
        int i4;
        int i5 = 0;
        this.g = pf0.a(false, i3);
        int i6 = this.e.e & (~hf0Var.v);
        this.h = (i6 & 1) != 0;
        this.i = (i6 & 2) != 0;
        um2 a = hf0Var.t.isEmpty() ? l41.a("") : hf0Var.t;
        int i7 = 0;
        while (true) {
            if (i7 >= a.size()) {
                i7 = Integer.MAX_VALUE;
                i4 = 0;
                break;
            } else {
                i4 = pf0.a(this.e, (String) a.get(i7), hf0Var.w);
                if (i4 > 0) {
                    break;
                } else {
                    i7++;
                }
            }
        }
        this.j = i7;
        this.k = i4;
        int a2 = pf0.a(this.e.f, hf0Var.u);
        this.l = a2;
        this.n = (this.e.f & 1088) != 0;
        int a3 = pf0.a(this.e, str, pf0.a(str) == null);
        this.m = a3;
        boolean z = i4 > 0 || (hf0Var.t.isEmpty() && a2 > 0) || this.h || (this.i && a3 > 0);
        if (pf0.a(hf0Var.M, i3) && z) {
            i5 = 1;
        }
        this.f = i5;
    }

    @Override // yads.nf0
    public final /* bridge */ /* synthetic */ boolean a(nf0 nf0Var) {
        return false;
    }

    public static um2 a(hf0 hf0Var, String str, int i, x73 x73Var, int[] iArr) {
        i41 i41Var = l41.c;
        dx.a(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i2 = 0;
        int i3 = 0;
        while (i2 < x73Var.b) {
            lf0 lf0Var = new lf0(i, x73Var, i2, hf0Var, iArr[i2], str);
            int i4 = i3 + 1;
            if (objArr.length < i4) {
                objArr = Arrays.copyOf(objArr, e41.a(objArr.length, i4));
            }
            objArr[i3] = lf0Var;
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
    public final int compareTo(lf0 lf0Var) {
        zx a = xx.a(bq.a(this.g, lf0Var.g));
        Integer valueOf = Integer.valueOf(this.j);
        Integer valueOf2 = Integer.valueOf(lf0Var.j);
        Comparator comparator = p82.b;
        comparator.getClass();
        lq2 lq2Var = lq2.b;
        zx a2 = a.a(valueOf, valueOf2, lq2Var).a(this.k, lf0Var.k).a(this.l, lf0Var.l).a(this.h, lf0Var.h);
        Boolean valueOf3 = Boolean.valueOf(this.i);
        Boolean valueOf4 = Boolean.valueOf(lf0Var.i);
        if (this.k != 0) {
            comparator = lq2Var;
        }
        zx a3 = a2.a(valueOf3, valueOf4, comparator).a(this.m, lf0Var.m);
        if (this.l == 0) {
            a3 = a3.b(this.n, lf0Var.n);
        }
        return a3.a();
    }

    public static int a(List list, List list2) {
        return ((lf0) list.get(0)).compareTo((lf0) list2.get(0));
    }
}
