package yads;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public final class dd0 {
    public final hg1 a;
    public final mo b;
    public final int[] c;
    public final int d;
    public final q30 e;
    public final long f;
    public final int g;
    public final bf2 h;
    public final bd0[] i;
    public xo0 j;
    public e30 k;
    public int l;
    public ro m;
    public boolean n;

    public dd0(bu buVar, hg1 hg1Var, e30 e30Var, mo moVar, int i, int[] iArr, xo0 xo0Var, int i2, q30 q30Var, long j, int i3, boolean z, ArrayList arrayList, bf2 bf2Var, ff2 ff2Var) {
        this.a = hg1Var;
        this.k = e30Var;
        this.b = moVar;
        this.c = iArr;
        this.j = xo0Var;
        this.d = i2;
        this.e = q30Var;
        this.l = i;
        this.f = j;
        this.g = i3;
        this.h = bf2Var;
        long a = sb3.a(e30Var.a(i));
        List list = ((sc2) this.k.m.get(this.l)).c;
        ArrayList arrayList2 = new ArrayList();
        int i4 = 0;
        for (int i5 : iArr) {
            arrayList2.addAll(((ta) list.get(i5)).c);
        }
        this.i = new bd0[xo0Var.g()];
        int i6 = 0;
        while (i6 < this.i.length) {
            oo2 oo2Var = (oo2) arrayList2.get(xo0Var.b(i6));
            lo b = moVar.b(oo2Var.b);
            this.i[i6] = new bd0(a, oo2Var, b == null ? (lo) oo2Var.b.get(i4) : b, buVar.a(i2, oo2Var.a, z, arrayList, bf2Var, ff2Var), 0L, oo2Var.d());
            i6++;
            i4 = i4;
        }
    }
}
