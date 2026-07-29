package o;

import java.util.ArrayList;

/* renamed from: o.ld, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1443ld {
    public final C1575nd a;
    public C2231xa b;
    public boolean c;
    public int f;
    public int g;
    public int l;
    public final C1459lt d = new C1459lt();
    public final boolean e = true;
    public final C1621oJ h = new C1621oJ(2, false);
    public int i = -1;
    public int j = -1;
    public int k = -1;

    public C1443ld(C1575nd c1575nd, C2231xa c2231xa) {
        this.a = c1575nd;
        this.b = c2231xa;
    }

    public final void a() {
        c();
        C1621oJ c1621oJ = this.h;
        if (c1621oJ.a.isEmpty()) {
            this.g++;
        } else {
            c1621oJ.a.remove(r0.size() - 1);
        }
    }

    public final void b() {
        Throwable th;
        int i;
        C1443ld c1443ld = this;
        int i2 = c1443ld.g;
        int i3 = 0;
        if (i2 > 0) {
            KG kg = c1443ld.b.s;
            IG ig = IG.c;
            int i4 = ig.b;
            kg.k0(ig);
            AbstractC1052fg.Q(kg, 0, i2);
            int i5 = kg.y;
            th = null;
            int i6 = ig.a;
            i = 1;
            if (i5 != KG.d0(kg, i6) || kg.z != KG.d0(kg, i4)) {
                StringBuilder sb = new StringBuilder();
                int i7 = 0;
                while (i7 < i6) {
                    int i8 = i6;
                    if (((1 << i7) & kg.y) != 0) {
                        if (i3 > 0) {
                            sb.append(", ");
                        }
                        sb.append(ig.b(i7));
                        i3++;
                    }
                    i7++;
                    i6 = i8;
                }
                String sb2 = sb.toString();
                StringBuilder n = AbstractC1888sN.n(sb2, "StringBuilder().apply(builderAction).toString()");
                int i9 = 0;
                int i10 = 0;
                while (i10 < i4) {
                    int i11 = i4;
                    if (((1 << i10) & kg.z) != 0) {
                        if (i3 > 0) {
                            n.append(", ");
                        }
                        n.append(ig.c(i10));
                        i9++;
                    }
                    i10++;
                    i4 = i11;
                }
                String sb3 = n.toString();
                AbstractC0048Bt.m(sb3, "StringBuilder().apply(builderAction).toString()");
                StringBuilder sb4 = new StringBuilder("Error while pushing ");
                sb4.append(ig);
                sb4.append(". Not all arguments were provided. Missing ");
                AbstractC1888sN.r(sb4, i3, " int arguments (", sb2, ") and ");
                AbstractC1888sN.u(sb4, i9, " object arguments (", sb3, ").");
                throw null;
            }
            c1443ld.g = 0;
        } else {
            th = null;
            i = 1;
            c1443ld = this;
        }
        C1621oJ c1621oJ = c1443ld.h;
        ArrayList arrayList = c1621oJ.a;
        ArrayList arrayList2 = c1621oJ.a;
        if (arrayList.isEmpty()) {
            return;
        }
        C2231xa c2231xa = c1443ld.b;
        int size = arrayList2.size();
        Object[] objArr = new Object[size];
        for (int i12 = 0; i12 < size; i12++) {
            objArr[i12] = arrayList2.get(i12);
        }
        c2231xa.getClass();
        if (size != 0) {
            KG kg2 = c2231xa.s;
            C1684pG c1684pG = C1684pG.c;
            int i13 = c1684pG.b;
            int i14 = c1684pG.a;
            kg2.k0(c1684pG);
            AbstractC1052fg.R(kg2, 0, objArr);
            if (kg2.y != KG.d0(kg2, i14) || kg2.z != KG.d0(kg2, i13)) {
                StringBuilder sb5 = new StringBuilder();
                int i15 = 0;
                for (int i16 = 0; i16 < i14; i16++) {
                    if (((i << i16) & kg2.y) != 0) {
                        if (i15 > 0) {
                            sb5.append(", ");
                        }
                        sb5.append(c1684pG.b(i16));
                        i15++;
                    }
                }
                String sb6 = sb5.toString();
                StringBuilder n2 = AbstractC1888sN.n(sb6, "StringBuilder().apply(builderAction).toString()");
                int i17 = 0;
                int i18 = 0;
                while (i17 < i13) {
                    int i19 = i13;
                    if (((i << i17) & kg2.z) != 0) {
                        if (i15 > 0) {
                            n2.append(", ");
                        }
                        n2.append(c1684pG.c(i17));
                        i18++;
                    }
                    i17++;
                    i13 = i19;
                }
                String sb7 = n2.toString();
                AbstractC0048Bt.m(sb7, "StringBuilder().apply(builderAction).toString()");
                StringBuilder sb8 = new StringBuilder("Error while pushing ");
                sb8.append(c1684pG);
                sb8.append(". Not all arguments were provided. Missing ");
                AbstractC1888sN.r(sb8, i15, " int arguments (", sb6, ") and ");
                AbstractC1888sN.u(sb8, i18, " object arguments (", sb7, ").");
                throw th;
            }
        }
        arrayList2.clear();
    }

    public final void c() {
        int i = this.l;
        if (i > 0) {
            int i2 = this.i;
            if (i2 >= 0) {
                b();
                KG kg = this.b.s;
                CG cg = CG.c;
                int i3 = cg.b;
                kg.k0(cg);
                AbstractC1052fg.Q(kg, 0, i2);
                AbstractC1052fg.Q(kg, 1, i);
                int i4 = kg.y;
                int i5 = cg.a;
                if (i4 != KG.d0(kg, i5) || kg.z != KG.d0(kg, i3)) {
                    StringBuilder sb = new StringBuilder();
                    int i6 = 0;
                    int i7 = 0;
                    while (i7 < i5) {
                        int i8 = i5;
                        if (((1 << i7) & kg.y) != 0) {
                            if (i6 > 0) {
                                sb.append(", ");
                            }
                            sb.append(cg.b(i7));
                            i6++;
                        }
                        i7++;
                        i5 = i8;
                    }
                    String sb2 = sb.toString();
                    StringBuilder n = AbstractC1888sN.n(sb2, "StringBuilder().apply(builderAction).toString()");
                    int i9 = 0;
                    int i10 = 0;
                    while (i10 < i3) {
                        int i11 = i3;
                        if (((1 << i10) & kg.z) != 0) {
                            if (i6 > 0) {
                                n.append(", ");
                            }
                            n.append(cg.c(i10));
                            i9++;
                        }
                        i10++;
                        i3 = i11;
                    }
                    String sb3 = n.toString();
                    AbstractC0048Bt.m(sb3, "StringBuilder().apply(builderAction).toString()");
                    StringBuilder sb4 = new StringBuilder("Error while pushing ");
                    sb4.append(cg);
                    sb4.append(". Not all arguments were provided. Missing ");
                    AbstractC1888sN.r(sb4, i6, " int arguments (", sb2, ") and ");
                    AbstractC1888sN.u(sb4, i9, " object arguments (", sb3, ").");
                    throw null;
                }
                this.i = -1;
            } else {
                int i12 = this.k;
                int i13 = this.j;
                b();
                KG kg2 = this.b.s;
                C2343zG c2343zG = C2343zG.c;
                int i14 = c2343zG.b;
                kg2.k0(c2343zG);
                AbstractC1052fg.Q(kg2, 1, i12);
                AbstractC1052fg.Q(kg2, 0, i13);
                AbstractC1052fg.Q(kg2, 2, i);
                int i15 = kg2.y;
                int i16 = c2343zG.a;
                if (i15 != KG.d0(kg2, i16) || kg2.z != KG.d0(kg2, i14)) {
                    int i17 = 0;
                    StringBuilder sb5 = new StringBuilder();
                    for (int i18 = 0; i18 < i16; i18++) {
                        if (((1 << i18) & kg2.y) != 0) {
                            if (i17 > 0) {
                                sb5.append(", ");
                            }
                            sb5.append(c2343zG.b(i18));
                            i17++;
                        }
                    }
                    String sb6 = sb5.toString();
                    StringBuilder n2 = AbstractC1888sN.n(sb6, "StringBuilder().apply(builderAction).toString()");
                    int i19 = 0;
                    int i20 = 0;
                    while (i19 < i14) {
                        int i21 = i14;
                        if (((1 << i19) & kg2.z) != 0) {
                            if (i17 > 0) {
                                n2.append(", ");
                            }
                            n2.append(c2343zG.c(i19));
                            i20++;
                        }
                        i19++;
                        i14 = i21;
                    }
                    String sb7 = n2.toString();
                    AbstractC0048Bt.m(sb7, "StringBuilder().apply(builderAction).toString()");
                    StringBuilder sb8 = new StringBuilder("Error while pushing ");
                    sb8.append(c2343zG);
                    sb8.append(". Not all arguments were provided. Missing ");
                    AbstractC1888sN.r(sb8, i17, " int arguments (", sb6, ") and ");
                    AbstractC1888sN.u(sb8, i20, " object arguments (", sb7, ").");
                    throw null;
                }
                this.j = -1;
                this.k = -1;
            }
            this.l = 0;
        }
    }

    public final void d(boolean z) {
        C1575nd c1575nd = this.a;
        int i = z ? c1575nd.D.i : c1575nd.D.g;
        int i2 = i - this.f;
        if (i2 < 0) {
            EB.h("Tried to seek backward");
            throw null;
        }
        if (i2 > 0) {
            KG kg = this.b.s;
            C1552nG c1552nG = C1552nG.c;
            int i3 = c1552nG.b;
            kg.k0(c1552nG);
            AbstractC1052fg.Q(kg, 0, i2);
            int i4 = kg.y;
            int i5 = c1552nG.a;
            if (i4 == KG.d0(kg, i5) && kg.z == KG.d0(kg, i3)) {
                this.f = i;
                return;
            }
            StringBuilder sb = new StringBuilder();
            int i6 = 0;
            for (int i7 = 0; i7 < i5; i7++) {
                if (((1 << i7) & kg.y) != 0) {
                    if (i6 > 0) {
                        sb.append(", ");
                    }
                    sb.append(c1552nG.b(i7));
                    i6++;
                }
            }
            String sb2 = sb.toString();
            StringBuilder n = AbstractC1888sN.n(sb2, "StringBuilder().apply(builderAction).toString()");
            int i8 = 0;
            for (int i9 = 0; i9 < i3; i9++) {
                if (((1 << i9) & kg.z) != 0) {
                    if (i6 > 0) {
                        n.append(", ");
                    }
                    n.append(c1552nG.c(i9));
                    i8++;
                }
            }
            String sb3 = n.toString();
            AbstractC0048Bt.m(sb3, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb4 = new StringBuilder("Error while pushing ");
            sb4.append(c1552nG);
            sb4.append(". Not all arguments were provided. Missing ");
            AbstractC1888sN.r(sb4, i6, " int arguments (", sb2, ") and ");
            AbstractC1888sN.u(sb4, i8, " object arguments (", sb3, ").");
            throw null;
        }
    }

    public final void e(int i, int i2) {
        if (i2 > 0) {
            if (!(i >= 0)) {
                EB.h("Invalid remove index " + i);
                throw null;
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
