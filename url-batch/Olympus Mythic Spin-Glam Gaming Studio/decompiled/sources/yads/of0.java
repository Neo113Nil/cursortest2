package yads;

import android.graphics.Point;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes14.dex */
public final class of0 extends nf0 {
    public final boolean f;
    public final hf0 g;
    public final boolean h;
    public final boolean i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final boolean n;
    public final boolean o;
    public final int p;
    public final boolean q;
    public final boolean r;
    public final int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0170, code lost:
    
        if ((r7 & r11) != 0) goto L131;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00c9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x016b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public of0(int i, x73 x73Var, int i2, hf0 hf0Var, int i3, int i4, boolean z) {
        super(i, x73Var, i2);
        boolean z2;
        boolean z3;
        int i5;
        jw0 jw0Var;
        String str;
        hf0 hf0Var2;
        boolean z4;
        jw0 jw0Var2;
        int i6;
        int i7;
        float f;
        int i8;
        jw0 jw0Var3;
        int i9;
        int i10;
        int i11;
        int i12 = 3;
        int i13 = 2;
        this.g = hf0Var;
        int i14 = hf0Var.E ? 24 : 16;
        this.o = hf0Var.D && (i4 & i14) != 0;
        if (z && (((i9 = (jw0Var3 = this.e).r) == -1 || i9 <= hf0Var.b) && ((i10 = jw0Var3.s) == -1 || i10 <= hf0Var.c))) {
            float f2 = jw0Var3.t;
            if ((f2 == -1.0f || f2 <= hf0Var.d) && ((i11 = jw0Var3.i) == -1 || i11 <= hf0Var.e)) {
                z2 = true;
                this.f = z2;
                if (z && (((i6 = (jw0Var2 = this.e).r) == -1 || i6 >= hf0Var.f) && ((i7 = jw0Var2.s) == -1 || i7 >= hf0Var.g))) {
                    f = jw0Var2.t;
                    if ((f != -1.0f || f >= hf0Var.h) && ((i8 = jw0Var2.i) == -1 || i8 >= hf0Var.i)) {
                        z3 = true;
                        this.h = z3;
                        this.i = pf0.a(false, i3);
                        jw0 jw0Var4 = this.e;
                        this.j = jw0Var4.i;
                        this.k = jw0Var4.a();
                        this.m = pf0.a(this.e.f, hf0Var.n);
                        int i15 = this.e.f;
                        this.n = (i15 == 0 && (i15 & 1) == 0) ? false : true;
                        i5 = 0;
                        while (true) {
                            if (i5 < hf0Var.m.size()) {
                                i5 = Integer.MAX_VALUE;
                                break;
                            }
                            String str2 = this.e.m;
                            if (str2 != null && str2.equals(hf0Var.m.get(i5))) {
                                break;
                            } else {
                                i5++;
                            }
                        }
                        this.l = i5;
                        this.q = fo.a(i3) != 128;
                        this.r = fo.b(i3) != 64;
                        jw0Var = this.e;
                        str = jw0Var.m;
                        if (str != null) {
                            switch (str.hashCode()) {
                                case -1662735862:
                                    if (str.equals("video/av01")) {
                                        z4 = false;
                                        break;
                                    }
                                    z4 = -1;
                                    break;
                                case -1662541442:
                                    if (str.equals("video/hevc")) {
                                        z4 = true;
                                        break;
                                    }
                                    z4 = -1;
                                    break;
                                case 1331836730:
                                    if (str.equals("video/avc")) {
                                        z4 = 2;
                                        break;
                                    }
                                    z4 = -1;
                                    break;
                                case 1599127257:
                                    if (str.equals("video/x-vnd.on2.vp9")) {
                                        z4 = 3;
                                        break;
                                    }
                                    z4 = -1;
                                    break;
                                default:
                                    z4 = -1;
                                    break;
                            }
                            switch (z4) {
                                case false:
                                    i12 = 4;
                                    break;
                                case true:
                                    i12 = 1;
                                    break;
                                case true:
                                    i12 = 2;
                                    break;
                            }
                            this.s = i12;
                            if ((jw0Var.f & 16384) == 0 && pf0.a(this.g.M, i3) && (this.f || this.g.C)) {
                                if (pf0.a(false, i3) && this.h && this.f && this.e.i != -1) {
                                    hf0Var2 = this.g;
                                    if (!hf0Var2.y) {
                                        if (!hf0Var2.x) {
                                        }
                                    }
                                }
                                i13 = 1;
                            } else {
                                i13 = 0;
                            }
                            this.p = i13;
                        }
                        i12 = 0;
                        this.s = i12;
                        if ((jw0Var.f & 16384) == 0) {
                            if (pf0.a(false, i3)) {
                                hf0Var2 = this.g;
                                if (!hf0Var2.y) {
                                }
                            }
                            i13 = 1;
                            this.p = i13;
                        }
                        i13 = 0;
                        this.p = i13;
                    }
                }
                z3 = false;
                this.h = z3;
                this.i = pf0.a(false, i3);
                jw0 jw0Var42 = this.e;
                this.j = jw0Var42.i;
                this.k = jw0Var42.a();
                this.m = pf0.a(this.e.f, hf0Var.n);
                int i152 = this.e.f;
                this.n = (i152 == 0 && (i152 & 1) == 0) ? false : true;
                i5 = 0;
                while (true) {
                    if (i5 < hf0Var.m.size()) {
                    }
                    i5++;
                }
                this.l = i5;
                this.q = fo.a(i3) != 128;
                this.r = fo.b(i3) != 64;
                jw0Var = this.e;
                str = jw0Var.m;
                if (str != null) {
                }
                i12 = 0;
                this.s = i12;
                if ((jw0Var.f & 16384) == 0) {
                }
                i13 = 0;
                this.p = i13;
            }
        }
        z2 = false;
        this.f = z2;
        if (z) {
            f = jw0Var2.t;
            if (f != -1.0f) {
            }
            z3 = true;
            this.h = z3;
            this.i = pf0.a(false, i3);
            jw0 jw0Var422 = this.e;
            this.j = jw0Var422.i;
            this.k = jw0Var422.a();
            this.m = pf0.a(this.e.f, hf0Var.n);
            int i1522 = this.e.f;
            this.n = (i1522 == 0 && (i1522 & 1) == 0) ? false : true;
            i5 = 0;
            while (true) {
                if (i5 < hf0Var.m.size()) {
                }
                i5++;
            }
            this.l = i5;
            this.q = fo.a(i3) != 128;
            this.r = fo.b(i3) != 64;
            jw0Var = this.e;
            str = jw0Var.m;
            if (str != null) {
            }
            i12 = 0;
            this.s = i12;
            if ((jw0Var.f & 16384) == 0) {
            }
            i13 = 0;
            this.p = i13;
        }
        z3 = false;
        this.h = z3;
        this.i = pf0.a(false, i3);
        jw0 jw0Var4222 = this.e;
        this.j = jw0Var4222.i;
        this.k = jw0Var4222.a();
        this.m = pf0.a(this.e.f, hf0Var.n);
        int i15222 = this.e.f;
        this.n = (i15222 == 0 && (i15222 & 1) == 0) ? false : true;
        i5 = 0;
        while (true) {
            if (i5 < hf0Var.m.size()) {
            }
            i5++;
        }
        this.l = i5;
        this.q = fo.a(i3) != 128;
        this.r = fo.b(i3) != 64;
        jw0Var = this.e;
        str = jw0Var.m;
        if (str != null) {
        }
        i12 = 0;
        this.s = i12;
        if ((jw0Var.f & 16384) == 0) {
        }
        i13 = 0;
        this.p = i13;
    }

    public static int b(of0 of0Var, of0 of0Var2) {
        gb2 a = (of0Var.f && of0Var.i) ? pf0.i : pf0.i.a();
        return xx.a((of0Var.g.x ? pf0.i.a() : pf0.j).compare(Integer.valueOf(of0Var.j), Integer.valueOf(of0Var2.j))).a(Integer.valueOf(of0Var.k), Integer.valueOf(of0Var2.k), a).a(Integer.valueOf(of0Var.j), Integer.valueOf(of0Var2.j), a).a();
    }

    @Override // yads.nf0
    public final boolean a(nf0 nf0Var) {
        of0 of0Var = (of0) nf0Var;
        return (this.o || sb3.a(this.e.m, of0Var.e.m)) && (this.g.F || (this.q == of0Var.q && this.r == of0Var.r));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static um2 a(int i, x73 x73Var, hf0 hf0Var, int[] iArr, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        Point point;
        int i9;
        int i10;
        int i11 = hf0Var.j;
        int i12 = hf0Var.k;
        boolean z = hf0Var.l;
        gb2 gb2Var = pf0.i;
        if (i11 == Integer.MAX_VALUE || i12 == Integer.MAX_VALUE) {
            i3 = Integer.MAX_VALUE;
        } else {
            int i13 = Integer.MAX_VALUE;
            for (int i14 = 0; i14 < x73Var.b; i14++) {
                jw0 jw0Var = x73Var.e[i14];
                int i15 = jw0Var.r;
                if (i15 > 0 && (i4 = jw0Var.s) > 0) {
                    if (z) {
                        if ((i15 > i4) != (i11 > i12)) {
                            i6 = i11;
                            i5 = i12;
                            i7 = i15 * i6;
                            i8 = i4 * i5;
                            if (i7 < i8) {
                                int i16 = sb3.a;
                                point = new Point(i5, ((i8 + i15) - 1) / i15);
                            } else {
                                int i17 = sb3.a;
                                point = new Point(((i7 + i4) - 1) / i4, i6);
                            }
                            i9 = jw0Var.r;
                            int i18 = jw0Var.s;
                            i10 = i9 * i18;
                            if (i9 >= ((int) (point.x * 0.98f)) && i18 >= ((int) (point.y * 0.98f)) && i10 < i13) {
                                i13 = i10;
                            }
                        }
                    }
                    i5 = i11;
                    i6 = i12;
                    i7 = i15 * i6;
                    i8 = i4 * i5;
                    if (i7 < i8) {
                    }
                    i9 = jw0Var.r;
                    int i182 = jw0Var.s;
                    i10 = i9 * i182;
                    if (i9 >= ((int) (point.x * 0.98f))) {
                        i13 = i10;
                    }
                }
            }
            i3 = i13;
        }
        i41 i41Var = l41.c;
        dx.a(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i19 = 0;
        int i20 = 0;
        while (i19 < x73Var.b) {
            int a = x73Var.e[i19].a();
            of0 of0Var = new of0(i, x73Var, i19, hf0Var, iArr[i19], i2, i3 == Integer.MAX_VALUE || (a != -1 && a <= i3));
            int i21 = i20 + 1;
            if (objArr.length < i21) {
                objArr = Arrays.copyOf(objArr, e41.a(objArr.length, i21));
            }
            objArr[i20] = of0Var;
            i19++;
            i20 = i21;
        }
        return l41.b(i20, objArr);
    }

    @Override // yads.nf0
    public final int a() {
        return this.p;
    }

    public static int a(of0 of0Var, of0 of0Var2) {
        zx a = xx.a(bq.a(of0Var.i, of0Var2.i)).a(of0Var.m, of0Var2.m).a(of0Var.n, of0Var2.n).a(of0Var.f, of0Var2.f).a(of0Var.h, of0Var2.h);
        Integer valueOf = Integer.valueOf(of0Var.l);
        Integer valueOf2 = Integer.valueOf(of0Var2.l);
        p82.b.getClass();
        zx a2 = a.a(valueOf, valueOf2, lq2.b).a(of0Var.q, of0Var2.q).a(of0Var.r, of0Var2.r);
        if (of0Var.q && of0Var.r) {
            a2 = a2.a(of0Var.s, of0Var2.s);
        }
        return a2.a();
    }

    public static int a(List list, List list2) {
        return xx.a(new Comparator() { // from class: yads.of0$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return of0.a((of0) obj, (of0) obj2);
            }
        }.compare((of0) Collections.max(list, new Comparator() { // from class: yads.of0$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return of0.a((of0) obj, (of0) obj2);
            }
        }), (of0) Collections.max(list2, new Comparator() { // from class: yads.of0$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return of0.a((of0) obj, (of0) obj2);
            }
        }))).a(list.size(), list2.size()).a((of0) Collections.max(list, new Comparator() { // from class: yads.of0$$ExternalSyntheticLambda1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return of0.b((of0) obj, (of0) obj2);
            }
        }), (of0) Collections.max(list2, new Comparator() { // from class: yads.of0$$ExternalSyntheticLambda1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return of0.b((of0) obj, (of0) obj2);
            }
        }), new Comparator() { // from class: yads.of0$$ExternalSyntheticLambda1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return of0.b((of0) obj, (of0) obj2);
            }
        }).a();
    }
}
