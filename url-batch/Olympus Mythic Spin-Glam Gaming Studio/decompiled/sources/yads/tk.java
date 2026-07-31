package yads;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class tk implements tp0 {
    public int c;
    public uk e;
    public long h;
    public fu i;
    public int m;
    public boolean n;
    public final xb2 a = new xb2(12);
    public final sk b = new sk();
    public wp0 d = new gl0();
    public fu[] g = new fu[0];
    public long k = -1;
    public long l = -1;
    public int j = -1;
    public long f = -9223372036854775807L;

    @Override // yads.tp0
    public final void a(wp0 wp0Var) {
        this.c = 0;
        this.d = wp0Var;
        this.h = -1L;
    }

    @Override // yads.tp0
    public final void release() {
    }

    @Override // yads.tp0
    public final boolean a(up0 up0Var) {
        ((pd0) up0Var).b(this.a.a, 0, 12, false);
        this.a.e(0);
        if (this.a.c() != 1179011410) {
            return false;
        }
        xb2 xb2Var = this.a;
        xb2Var.e(xb2Var.b + 4);
        return this.a.c() == 541677121;
    }

    @Override // yads.tp0
    public final void a(long j, long j2) {
        this.h = -1L;
        this.i = null;
        for (fu fuVar : this.g) {
            if (fuVar.j == 0) {
                fuVar.h = 0;
            } else {
                fuVar.h = fuVar.l[sb3.b(fuVar.k, j, true)];
            }
        }
        if (j == 0) {
            if (this.g.length == 0) {
                this.c = 0;
                return;
            } else {
                this.c = 3;
                return;
            }
        }
        this.c = 6;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0031 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010e  */
    @Override // yads.tp0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(up0 up0Var, dg2 dg2Var) {
        boolean z;
        int i;
        fu fuVar;
        long j;
        fu fuVar2;
        long j2 = this.h;
        int i2 = 0;
        if (j2 != -1) {
            pd0 pd0Var = (pd0) up0Var;
            long j3 = pd0Var.d;
            if (j2 >= j3 && j2 <= 262144 + j3) {
                pd0Var.a((int) (j2 - j3));
            } else {
                dg2Var.a = j2;
                z = true;
                this.h = -1L;
                if (!z) {
                    return 1;
                }
                fu fuVar3 = null;
                switch (this.c) {
                    case 0:
                        if (a(up0Var)) {
                            ((pd0) up0Var).a(12);
                            this.c = 1;
                            return 0;
                        }
                        throw new cc2("AVI Header List not found", null, true, 1);
                    case 1:
                        ((pd0) up0Var).a(this.a.a, 0, 12, false);
                        this.a.e(0);
                        sk skVar = this.b;
                        xb2 xb2Var = this.a;
                        skVar.a = xb2Var.c();
                        skVar.b = xb2Var.c();
                        skVar.c = 0;
                        if (skVar.a == 1414744396) {
                            skVar.c = xb2Var.c();
                            sk skVar2 = this.b;
                            if (skVar2.c == 1819436136) {
                                this.j = skVar2.b;
                                this.c = 2;
                                return 0;
                            }
                            throw new cc2("hdrl expected, found: " + this.b.c, null, true, 1);
                        }
                        throw new cc2("LIST expected, found: " + skVar.a, null, true, 1);
                    case 2:
                        int i3 = this.j - 4;
                        xb2 xb2Var2 = new xb2(i3);
                        ((pd0) up0Var).a(xb2Var2.a, 0, i3, false);
                        nf1 a = nf1.a(1819436136, xb2Var2);
                        if (a.b == 1819436136) {
                            uk ukVar = (uk) a.a(uk.class);
                            if (ukVar != null) {
                                this.e = ukVar;
                                this.f = ukVar.c * ukVar.a;
                                ArrayList arrayList = new ArrayList();
                                i41 listIterator = a.a.listIterator(0);
                                int i4 = 0;
                                while (listIterator.hasNext()) {
                                    qk qkVar = (qk) listIterator.next();
                                    if (qkVar.getType() == 1819440243) {
                                        nf1 nf1Var = (nf1) qkVar;
                                        int i5 = i4 + 1;
                                        vk vkVar = (vk) nf1Var.a(vk.class);
                                        e43 e43Var = (e43) nf1Var.a(e43.class);
                                        if (vkVar == null) {
                                            gh1.d("AviExtractor", "Missing Stream Header");
                                        } else if (e43Var == null) {
                                            gh1.d("AviExtractor", "Missing Stream Format");
                                        } else {
                                            long a2 = sb3.a(vkVar.d, vkVar.b * 1000000, vkVar.c);
                                            jw0 jw0Var = e43Var.a;
                                            iw0 iw0Var = new iw0(jw0Var);
                                            iw0Var.a = Integer.toString(i4);
                                            int i6 = vkVar.e;
                                            if (i6 != 0) {
                                                iw0Var.l = i6;
                                            }
                                            h43 h43Var = (h43) nf1Var.a(h43.class);
                                            if (h43Var != null) {
                                                iw0Var.b = h43Var.a;
                                            }
                                            int d = vt1.d(jw0Var.m);
                                            if (d == 1 || d == 2) {
                                                c83 a3 = this.d.a(i4, d);
                                                a3.a(new jw0(iw0Var));
                                                i = i5;
                                                fu fuVar4 = new fu(i4, d, a2, vkVar.d, a3);
                                                this.f = a2;
                                                fuVar = fuVar4;
                                                if (fuVar != null) {
                                                    arrayList.add(fuVar);
                                                }
                                                i4 = i;
                                            }
                                        }
                                        i = i5;
                                        fuVar = null;
                                        if (fuVar != null) {
                                        }
                                        i4 = i;
                                    }
                                }
                                this.g = (fu[]) arrayList.toArray(new fu[0]);
                                this.d.a();
                                this.c = 3;
                                return 0;
                            }
                            throw new cc2("AviHeader not found", null, true, 1);
                        }
                        throw new cc2("Unexpected header list type " + a.b, null, true, 1);
                    case 3:
                        long j4 = this.k;
                        if (j4 != -1 && ((pd0) up0Var).d != j4) {
                            this.h = j4;
                            return 0;
                        }
                        pd0 pd0Var2 = (pd0) up0Var;
                        pd0Var2.b(this.a.a, 0, 12, false);
                        pd0Var2.f = 0;
                        this.a.e(0);
                        sk skVar3 = this.b;
                        xb2 xb2Var3 = this.a;
                        skVar3.a = xb2Var3.c();
                        skVar3.b = xb2Var3.c();
                        skVar3.c = 0;
                        int c = this.a.c();
                        int i7 = this.b.a;
                        if (i7 == 1179011410) {
                            pd0Var2.a(12);
                            return 0;
                        }
                        if (i7 == 1414744396 && c == 1769369453) {
                            long j5 = pd0Var2.d;
                            this.k = j5;
                            this.l = j5 + r5.b + 8;
                            if (!this.n) {
                                uk ukVar2 = this.e;
                                ukVar2.getClass();
                                if ((ukVar2.b & 16) == 16) {
                                    this.c = 4;
                                    this.h = this.l;
                                    return 0;
                                }
                                this.d.a(new lx2(this.f, 0L));
                                this.n = true;
                            }
                            this.h = pd0Var2.d + 12;
                            this.c = 6;
                            return 0;
                        }
                        this.h = pd0Var2.d + r5.b + 8;
                        return 0;
                    case 4:
                        pd0 pd0Var3 = (pd0) up0Var;
                        pd0Var3.a(this.a.a, 0, 8, false);
                        this.a.e(0);
                        int c2 = this.a.c();
                        int c3 = this.a.c();
                        if (c2 == 829973609) {
                            this.c = 5;
                            this.m = c3;
                            return 0;
                        }
                        this.h = pd0Var3.d + c3;
                        return 0;
                    case 5:
                        xb2 xb2Var4 = new xb2(this.m);
                        ((pd0) up0Var).a(xb2Var4.a, 0, this.m, false);
                        int i8 = xb2Var4.c;
                        int i9 = xb2Var4.b;
                        if (i8 - i9 < 16) {
                            j = 0;
                        } else {
                            xb2Var4.e(i9 + 8);
                            long c4 = xb2Var4.c();
                            long j6 = this.k;
                            j = c4 > j6 ? 0L : j6 + 8;
                            xb2Var4.e(i9);
                        }
                        while (xb2Var4.c - xb2Var4.b >= 16) {
                            int c5 = xb2Var4.c();
                            int c6 = xb2Var4.c();
                            long c7 = xb2Var4.c() + j;
                            xb2Var4.c();
                            fu[] fuVarArr = this.g;
                            int length = fuVarArr.length;
                            int i10 = i2;
                            while (true) {
                                if (i10 < length) {
                                    fuVar2 = fuVarArr[i10];
                                    if (fuVar2.b != c5 && fuVar2.c != c5) {
                                        i10++;
                                    }
                                } else {
                                    fuVar2 = null;
                                }
                            }
                            if (fuVar2 != null) {
                                if ((c6 & 16) == 16) {
                                    fuVar2.a(c7);
                                }
                                fuVar2.i++;
                            }
                            i2 = 0;
                        }
                        for (fu fuVar5 : this.g) {
                            fuVar5.a();
                        }
                        this.n = true;
                        this.d.a(new rk(this, this.f));
                        this.c = 6;
                        this.h = this.k;
                        return 0;
                    case 6:
                        pd0 pd0Var4 = (pd0) up0Var;
                        long j7 = pd0Var4.d;
                        if (j7 >= this.l) {
                            return -1;
                        }
                        fu fuVar6 = this.i;
                        if (fuVar6 != null) {
                            int i11 = fuVar6.g;
                            int a4 = i11 - fuVar6.a.a(up0Var, i11, false);
                            fuVar6.g = a4;
                            boolean z2 = a4 == 0;
                            if (z2) {
                                if (fuVar6.f > 0) {
                                    c83 c83Var = fuVar6.a;
                                    int i12 = fuVar6.h;
                                    c83Var.a((fuVar6.d * i12) / fuVar6.e, Arrays.binarySearch(fuVar6.l, i12) >= 0 ? 1 : 0, fuVar6.f, 0, null);
                                }
                                fuVar6.h++;
                            }
                            if (!z2) {
                                return 0;
                            }
                            this.i = null;
                            return 0;
                        }
                        if ((j7 & 1) == 1) {
                            pd0Var4.a(1);
                        }
                        pd0Var4.b(this.a.a, 0, 12, false);
                        this.a.e(0);
                        int c8 = this.a.c();
                        if (c8 == 1414744396) {
                            this.a.e(8);
                            pd0Var4.a(this.a.c() == 1769369453 ? 12 : 8);
                            pd0Var4.f = 0;
                            return 0;
                        }
                        int c9 = this.a.c();
                        if (c8 == 1263424842) {
                            this.h = pd0Var4.d + c9 + 8;
                            return 0;
                        }
                        pd0Var4.a(8);
                        pd0Var4.f = 0;
                        for (fu fuVar7 : this.g) {
                            if (fuVar7.b == c8 || fuVar7.c == c8) {
                                fuVar3 = fuVar7;
                                if (fuVar3 != null) {
                                    this.h = pd0Var4.d + c9;
                                    return 0;
                                }
                                fuVar3.f = c9;
                                fuVar3.g = c9;
                                this.i = fuVar3;
                                return 0;
                            }
                        }
                        if (fuVar3 != null) {
                        }
                        break;
                    default:
                        throw new AssertionError();
                }
            }
        }
        z = false;
        this.h = -1L;
        if (!z) {
        }
    }
}
