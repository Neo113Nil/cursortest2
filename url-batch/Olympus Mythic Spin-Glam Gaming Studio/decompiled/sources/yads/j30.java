package yads;

import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes5.dex */
public final class j30 implements gm1, hy2 {
    public final int b;
    public final ad0 c;
    public final h93 d;
    public final cl0 e;
    public final ee0 f;
    public final mo g;
    public final long h;
    public final hg1 i;
    public final ub0 j;
    public final y73 k;
    public final i30[] l;
    public final xc0 m;
    public final cf2 n;
    public final sm1 p;
    public final yk0 q;
    public final ff2 r;
    public fm1 s;
    public ny v;
    public e30 w;
    public int x;
    public List y;
    public static final Pattern z = Pattern.compile("CC([1-4])=(.+)");
    public static final Pattern A = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");
    public hu[] t = new hu[0];
    public bn0[] u = new bn0[0];
    public final IdentityHashMap o = new IdentityHashMap();

    public j30(int i, e30 e30Var, mo moVar, int i2, ad0 ad0Var, h93 h93Var, cl0 cl0Var, yk0 yk0Var, ee0 ee0Var, sm1 sm1Var, long j, hg1 hg1Var, ub0 ub0Var, xc0 xc0Var, com.monetization.ads.exo.source.dash.c cVar, ff2 ff2Var) {
        int i3;
        List list;
        int i4;
        int i5;
        jw0[] jw0VarArr;
        jw0[] a;
        eg0 a2;
        cl0 cl0Var2 = cl0Var;
        this.b = i;
        this.w = e30Var;
        this.g = moVar;
        this.x = i2;
        this.c = ad0Var;
        this.d = h93Var;
        this.e = cl0Var2;
        this.q = yk0Var;
        this.f = ee0Var;
        this.p = sm1Var;
        this.h = j;
        this.i = hg1Var;
        this.j = ub0Var;
        this.m = xc0Var;
        this.r = ff2Var;
        this.n = new cf2(e30Var, cVar, ub0Var);
        int i6 = 0;
        hu[] huVarArr = this.t;
        xc0Var.getClass();
        this.v = new ny(huVarArr);
        sc2 sc2Var = (sc2) e30Var.m.get(i2);
        List list2 = sc2Var.d;
        this.y = list2;
        List list3 = sc2Var.c;
        int size = list3.size();
        SparseIntArray sparseIntArray = new SparseIntArray(size);
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i7 = 0; i7 < size; i7++) {
            sparseIntArray.put(((ta) list3.get(i7)).a, i7);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i7));
            arrayList.add(arrayList2);
            sparseArray.put(i7, arrayList2);
        }
        int i8 = 0;
        while (i8 < size) {
            ta taVar = (ta) list3.get(i8);
            eg0 a3 = a("http://dashif.org/guidelines/trickmode", taVar.e);
            a3 = a3 == null ? a("http://dashif.org/guidelines/trickmode", taVar.f) : a3;
            int i9 = (a3 == null || (i9 = sparseIntArray.get(Integer.parseInt(a3.b), -1)) == -1) ? i8 : i9;
            if (i9 == i8 && (a2 = a("urn:mpeg:dash:adaptation-set-switching:2016", taVar.f)) != null) {
                String str = a2.b;
                int i10 = sb3.a;
                String[] split = str.split(StringUtils.COMMA, -1);
                int length = split.length;
                for (int i11 = i6; i11 < length; i11++) {
                    int i12 = sparseIntArray.get(Integer.parseInt(split[i11]), -1);
                    if (i12 != -1) {
                        i9 = Math.min(i9, i12);
                    }
                }
            }
            if (i9 != i8) {
                List list4 = (List) sparseArray.get(i8);
                List list5 = (List) sparseArray.get(i9);
                list5.addAll(list4);
                sparseArray.put(i8, list5);
                arrayList.remove(list4);
            }
            i8++;
            i6 = 0;
        }
        int size2 = arrayList.size();
        int[][] iArr = new int[size2][];
        for (int i13 = 0; i13 < size2; i13++) {
            int[] a4 = nc1.a((Collection) arrayList.get(i13));
            iArr[i13] = a4;
            Arrays.sort(a4);
        }
        boolean[] zArr = new boolean[size2];
        jw0[][] jw0VarArr2 = new jw0[size2][];
        int i14 = 0;
        int i15 = 0;
        while (i14 < size2) {
            int[] iArr2 = iArr[i14];
            int length2 = iArr2.length;
            int i16 = 0;
            while (true) {
                if (i16 >= length2) {
                    break;
                }
                List list6 = ((ta) list3.get(iArr2[i16])).c;
                for (int i17 = 0; i17 < list6.size(); i17++) {
                    if (!((oo2) list6.get(i17)).d.isEmpty()) {
                        zArr[i14] = true;
                        i15++;
                        break;
                    }
                }
                i16++;
            }
            int[] iArr3 = iArr[i14];
            int length3 = iArr3.length;
            int i18 = 0;
            while (i18 < length3) {
                int i19 = iArr3[i18];
                ta taVar2 = (ta) list3.get(i19);
                List list7 = ((ta) list3.get(i19)).d;
                int[] iArr4 = iArr3;
                int i20 = 0;
                while (i20 < list7.size()) {
                    eg0 eg0Var = (eg0) list7.get(i20);
                    int i21 = length3;
                    List list8 = list7;
                    if ("urn:scte:dash:cc:cea-608:2015".equals(eg0Var.a)) {
                        iw0 iw0Var = new iw0();
                        iw0Var.k = "application/cea-608";
                        iw0Var.a = taVar2.a + ":cea608";
                        a = a(eg0Var, z, new jw0(iw0Var));
                    } else if ("urn:scte:dash:cc:cea-708:2015".equals(eg0Var.a)) {
                        iw0 iw0Var2 = new iw0();
                        iw0Var2.k = "application/cea-708";
                        iw0Var2.a = taVar2.a + ":cea708";
                        a = a(eg0Var, A, new jw0(iw0Var2));
                    } else {
                        i20++;
                        length3 = i21;
                        list7 = list8;
                    }
                    jw0VarArr = a;
                    i5 = 1;
                }
                i18++;
                iArr3 = iArr4;
            }
            i5 = 1;
            jw0VarArr = new jw0[0];
            jw0VarArr2[i14] = jw0VarArr;
            if (jw0VarArr.length != 0) {
                i15 += i5;
            }
            i14 += i5;
        }
        int size3 = list2.size() + i15 + size2;
        x73[] x73VarArr = new x73[size3];
        i30[] i30VarArr = new i30[size3];
        int i22 = 0;
        int i23 = 0;
        while (i23 < size2) {
            int[] iArr5 = iArr[i23];
            ArrayList arrayList3 = new ArrayList();
            int length4 = iArr5.length;
            int i24 = size2;
            int i25 = 0;
            while (i25 < length4) {
                arrayList3.addAll(((ta) list3.get(iArr5[i25])).c);
                i25++;
                iArr = iArr;
            }
            int[][] iArr6 = iArr;
            int size4 = arrayList3.size();
            jw0[] jw0VarArr3 = new jw0[size4];
            int i26 = 0;
            while (i26 < size4) {
                int i27 = size4;
                jw0 jw0Var = ((oo2) arrayList3.get(i26)).a;
                ArrayList arrayList4 = arrayList3;
                int a5 = cl0Var2.a(jw0Var);
                iw0 iw0Var3 = new iw0(jw0Var);
                iw0Var3.D = a5;
                jw0VarArr3[i26] = new jw0(iw0Var3);
                i26++;
                size4 = i27;
                arrayList3 = arrayList4;
                cl0Var2 = cl0Var;
            }
            ta taVar3 = (ta) list3.get(iArr5[0]);
            int i28 = taVar3.a;
            String num = i28 != -1 ? Integer.toString(i28) : gg2.a(i23, "unset:");
            int i29 = i22 + 1;
            if (zArr[i23]) {
                i3 = i29;
                i29 = i22 + 2;
            } else {
                i3 = -1;
            }
            if (jw0VarArr2[i23].length != 0) {
                i4 = i29;
                i29++;
                list = list3;
            } else {
                list = list3;
                i4 = -1;
            }
            x73VarArr[i22] = new x73(num, jw0VarArr3);
            i30VarArr[i22] = new i30(taVar3.b, 0, iArr5, i22, i3, i4, -1);
            int i30 = i3;
            int i31 = -1;
            if (i30 != -1) {
                String str2 = num + ":emsg";
                iw0 iw0Var4 = new iw0();
                iw0Var4.a = str2;
                iw0Var4.k = "application/x-emsg";
                x73VarArr[i30] = new x73(str2, new jw0(iw0Var4));
                i30VarArr[i30] = new i30(5, 1, iArr5, i22, -1, -1, -1);
                i31 = -1;
            }
            if (i4 != i31) {
                x73VarArr[i4] = new x73(num + ":cc", jw0VarArr2[i23]);
                i30VarArr[i4] = new i30(3, 1, iArr5, i22, -1, -1, -1);
            }
            i23++;
            size2 = i24;
            iArr = iArr6;
            cl0Var2 = cl0Var;
            i22 = i29;
            list3 = list;
        }
        int i32 = 0;
        while (i32 < list2.size()) {
            cn0 cn0Var = (cn0) list2.get(i32);
            iw0 iw0Var5 = new iw0();
            iw0Var5.a = cn0Var.c + "/" + cn0Var.d;
            iw0Var5.k = "application/x-emsg";
            jw0 jw0Var2 = new jw0(iw0Var5);
            StringBuilder sb = new StringBuilder();
            sb.append(cn0Var.c + "/" + cn0Var.d);
            sb.append(":");
            sb.append(i32);
            x73VarArr[i22] = new x73(sb.toString(), jw0Var2);
            i30VarArr[i22] = new i30(5, 2, new int[0], -1, -1, -1, i32);
            i32++;
            i22++;
        }
        Pair create = Pair.create(new y73(x73VarArr), i30VarArr);
        this.k = (y73) create.first;
        this.l = (i30[]) create.second;
    }

    @Override // yads.gm1
    public final void a(fm1 fm1Var, long j) {
        this.s = fm1Var;
        fm1Var.a((gm1) this);
    }

    @Override // yads.iy2
    public final boolean c(long j) {
        return this.v.c(j);
    }

    @Override // yads.iy2
    public final long getBufferedPositionUs() {
        return this.v.getBufferedPositionUs();
    }

    @Override // yads.iy2
    public final long getNextLoadPositionUs() {
        return this.v.getNextLoadPositionUs();
    }

    @Override // yads.gm1
    public final y73 getTrackGroups() {
        return this.k;
    }

    @Override // yads.iy2
    public final boolean isLoading() {
        return this.v.isLoading();
    }

    @Override // yads.gm1
    public final void maybeThrowPrepareError() {
        this.i.a();
    }

    @Override // yads.gm1
    public final long readDiscontinuity() {
        return -9223372036854775807L;
    }

    @Override // yads.iy2
    public final void reevaluateBuffer(long j) {
        this.v.reevaluateBuffer(j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x004c, code lost:
    
        r12 = null;
     */
    @Override // yads.gm1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long seekToUs(long j) {
        int i;
        xn xnVar;
        boolean c;
        hu[] huVarArr = this.t;
        int length = huVarArr.length;
        int i2 = 0;
        while (i2 < length) {
            hu huVar = huVarArr[i2];
            huVar.u = j;
            if (huVar.d()) {
                huVar.t = j;
                i = i2;
            } else {
                int i3 = 0;
                while (true) {
                    if (i3 >= huVar.l.size()) {
                        i = i2;
                        break;
                    }
                    xnVar = (xn) huVar.l.get(i3);
                    long j2 = xnVar.g;
                    i = i2;
                    if (j2 == j && xnVar.k == -9223372036854775807L) {
                        break;
                    }
                    if (j2 > j) {
                        break;
                    }
                    i3++;
                    i2 = i;
                }
                if (xnVar != null) {
                    xs2 xs2Var = huVar.n;
                    int a = xnVar.a(0);
                    synchronized (xs2Var) {
                        xs2Var.e();
                        int i4 = xs2Var.q;
                        if (a >= i4 && a <= xs2Var.p + i4) {
                            xs2Var.t = Long.MIN_VALUE;
                            xs2Var.s = a - i4;
                            c = true;
                        }
                        c = false;
                    }
                } else {
                    c = huVar.n.c(j, j < huVar.getNextLoadPositionUs());
                }
                if (c) {
                    xs2 xs2Var2 = huVar.n;
                    huVar.v = huVar.a(xs2Var2.q + xs2Var2.s, 0);
                    for (xs2 xs2Var3 : huVar.o) {
                        xs2Var3.c(j, true);
                    }
                } else {
                    huVar.t = j;
                    huVar.x = false;
                    huVar.l.clear();
                    huVar.v = 0;
                    if (huVar.j.b()) {
                        huVar.n.a();
                        for (xs2 xs2Var4 : huVar.o) {
                            xs2Var4.a();
                        }
                        bg1 bg1Var = huVar.j.b;
                        if (bg1Var == null) {
                            throw new IllegalStateException();
                        }
                        bg1Var.a(false);
                    } else {
                        huVar.j.c = null;
                        huVar.n.b(false);
                        for (xs2 xs2Var5 : huVar.o) {
                            xs2Var5.b(false);
                        }
                    }
                    i2 = i + 1;
                }
            }
            i2 = i + 1;
        }
        for (bn0 bn0Var : this.u) {
            int a2 = sb3.a(bn0Var.d, j, true);
            bn0Var.h = a2;
            bn0Var.i = (bn0Var.e && a2 == bn0Var.d.length) ? j : -9223372036854775807L;
        }
        return j;
    }

    @Override // yads.gm1
    public final void a(long j) {
        long j2;
        for (hu huVar : this.t) {
            if (!huVar.d()) {
                xs2 xs2Var = huVar.n;
                int i = xs2Var.q;
                xs2Var.a(j, true);
                xs2 xs2Var2 = huVar.n;
                int i2 = xs2Var2.q;
                if (i2 > i) {
                    synchronized (xs2Var2) {
                        j2 = xs2Var2.p == 0 ? Long.MIN_VALUE : xs2Var2.n[xs2Var2.r];
                    }
                    int i3 = 0;
                    while (true) {
                        xs2[] xs2VarArr = huVar.o;
                        if (i3 >= xs2VarArr.length) {
                            break;
                        }
                        xs2VarArr[i3].a(j2, huVar.e[i3]);
                        i3++;
                    }
                }
                int min = Math.min(huVar.a(i2, 0), huVar.v);
                if (min > 0) {
                    ArrayList arrayList = huVar.l;
                    int i4 = sb3.a;
                    if (min > arrayList.size() || min < 0) {
                        throw new IllegalArgumentException();
                    }
                    if (min != 0) {
                        arrayList.subList(0, min).clear();
                    }
                    huVar.v -= min;
                } else {
                    continue;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
    
        if (r3 < (r14 - 1)) goto L18;
     */
    @Override // yads.gm1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(long j, nx2 nx2Var) {
        long j2;
        long j3;
        for (hu huVar : this.t) {
            if (huVar.b == 2) {
                for (bd0 bd0Var : huVar.f.i) {
                    k30 k30Var = bd0Var.d;
                    if (k30Var != null) {
                        long a = k30Var.a(j, bd0Var.e);
                        long j4 = bd0Var.f;
                        long j5 = a + j4;
                        long a2 = bd0Var.d.a(j5 - j4);
                        long c = bd0Var.d.c(bd0Var.e);
                        if (a2 < j) {
                            if (c != -1) {
                                long b = bd0Var.d.b() + bd0Var.f + c;
                                j3 = 1;
                            } else {
                                j3 = 1;
                            }
                            j2 = bd0Var.d.a((j5 + j3) - bd0Var.f);
                            return nx2Var.a(j, a2, j2);
                        }
                        j2 = a2;
                        return nx2Var.a(j, a2, j2);
                    }
                }
                return j;
            }
        }
        return j;
    }

    @Override // yads.hy2
    public final void a(iy2 iy2Var) {
        this.s.a((iy2) this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v23, types: [int] */
    /* JADX WARN: Type inference failed for: r3v50 */
    /* JADX WARN: Type inference failed for: r3v51 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [int] */
    @Override // yads.gm1
    public final long a(xo0[] xo0VarArr, boolean[] zArr, ys2[] ys2VarArr, boolean[] zArr2, long j) {
        int i;
        int i2;
        int i3;
        int i4;
        int[] iArr;
        int i5;
        ys2[] ys2VarArr2;
        ?? r4;
        x73 x73Var;
        x73 x73Var2;
        int i6;
        boolean z2;
        bf2 bf2Var;
        int i7;
        xo0[] xo0VarArr2 = xo0VarArr;
        ys2[] ys2VarArr3 = ys2VarArr;
        int length = xo0VarArr2.length;
        int[] iArr2 = new int[length];
        int i8 = 0;
        while (true) {
            if (i8 >= xo0VarArr2.length) {
                break;
            }
            xo0 xo0Var = xo0VarArr2[i8];
            if (xo0Var != null) {
                int indexOf = this.k.c.indexOf(xo0Var.c());
                iArr2[i8] = indexOf >= 0 ? indexOf : -1;
            } else {
                iArr2[i8] = -1;
            }
            i8++;
        }
        for (int i9 = 0; i9 < xo0VarArr2.length; i9++) {
            if (xo0VarArr2[i9] == null || !zArr[i9]) {
                ys2 ys2Var = ys2VarArr3[i9];
                if (ys2Var instanceof hu) {
                    hu huVar = (hu) ys2Var;
                    huVar.s = this;
                    xs2 xs2Var = huVar.n;
                    xs2Var.a();
                    xs2Var.d();
                    for (xs2 xs2Var2 : huVar.o) {
                        xs2Var2.a();
                        xs2Var2.d();
                    }
                    huVar.j.a(huVar);
                } else if (ys2Var instanceof gu) {
                    gu guVar = (gu) ys2Var;
                    boolean[] zArr3 = guVar.f.e;
                    int i10 = guVar.d;
                    if (zArr3[i10]) {
                        zArr3[i10] = false;
                    } else {
                        throw new IllegalStateException();
                    }
                }
                ys2VarArr3[i9] = null;
            }
        }
        int i11 = 0;
        while (true) {
            boolean z3 = true;
            if (i11 < xo0VarArr2.length) {
                ys2 ys2Var2 = ys2VarArr3[i11];
                if ((ys2Var2 instanceof bm0) || (ys2Var2 instanceof gu)) {
                    int i12 = iArr2[i11];
                    if (i12 != -1) {
                        int i13 = this.l[i12].e;
                        i7 = 0;
                        while (i7 < length) {
                            int i14 = iArr2[i7];
                            if (i14 == i13 && this.l[i14].c == 0) {
                                break;
                            }
                            i7++;
                        }
                    }
                    i7 = -1;
                    if (i7 == -1) {
                        z3 = ys2VarArr3[i11] instanceof bm0;
                    } else {
                        ys2 ys2Var3 = ys2VarArr3[i11];
                        if (!(ys2Var3 instanceof gu) || ((gu) ys2Var3).b != ys2VarArr3[i7]) {
                            z3 = false;
                        }
                    }
                    if (z3) {
                        continue;
                    } else {
                        ys2 ys2Var4 = ys2VarArr3[i11];
                        if (ys2Var4 instanceof gu) {
                            gu guVar2 = (gu) ys2Var4;
                            boolean[] zArr4 = guVar2.f.e;
                            int i15 = guVar2.d;
                            if (zArr4[i15]) {
                                zArr4[i15] = false;
                            } else {
                                throw new IllegalStateException();
                            }
                        }
                        ys2VarArr3[i11] = null;
                    }
                }
                i11++;
            } else {
                int i16 = 0;
                while (i16 < xo0VarArr2.length) {
                    xo0 xo0Var2 = xo0VarArr2[i16];
                    if (xo0Var2 == null) {
                        i4 = i16;
                        iArr = iArr2;
                        i5 = length;
                        ys2VarArr2 = ys2VarArr3;
                    } else {
                        ys2 ys2Var5 = ys2VarArr3[i16];
                        if (ys2Var5 == null) {
                            zArr2[i16] = z3;
                            i30 i30Var = this.l[iArr2[i16]];
                            int i17 = i30Var.c;
                            if (i17 == 0) {
                                int i18 = i30Var.f;
                                boolean z4 = i18 != i ? z3 : false;
                                if (z4) {
                                    x73Var = this.k.a(i18);
                                    r4 = z3;
                                } else {
                                    r4 = 0;
                                    x73Var = null;
                                }
                                int i19 = i30Var.g;
                                boolean z5 = i19 != i ? z3 : false;
                                if (z5) {
                                    x73Var2 = this.k.a(i19);
                                    i6 = r4 + x73Var2.b;
                                } else {
                                    x73Var2 = null;
                                    i6 = r4;
                                }
                                jw0[] jw0VarArr = new jw0[i6];
                                int[] iArr3 = new int[i6];
                                if (z4) {
                                    jw0VarArr[0] = x73Var.e[0];
                                    iArr3[0] = 5;
                                    z2 = z3;
                                } else {
                                    z2 = false;
                                }
                                ArrayList arrayList = new ArrayList();
                                i4 = i16;
                                if (z5) {
                                    int i20 = 0;
                                    ?? r3 = z2;
                                    while (i20 < x73Var2.b) {
                                        jw0 jw0Var = x73Var2.e[i20];
                                        jw0VarArr[r3] = jw0Var;
                                        iArr3[r3] = 3;
                                        arrayList.add(jw0Var);
                                        i20++;
                                        r3++;
                                    }
                                }
                                if (this.w.d && z4) {
                                    cf2 cf2Var = this.n;
                                    bf2Var = new bf2(cf2Var, cf2Var.b);
                                } else {
                                    bf2Var = null;
                                }
                                ad0 ad0Var = this.c;
                                hg1 hg1Var = this.i;
                                e30 e30Var = this.w;
                                int[] iArr4 = iArr2;
                                mo moVar = this.g;
                                int i21 = length;
                                int i22 = this.x;
                                int[] iArr5 = i30Var.a;
                                int i23 = i30Var.b;
                                bf2 bf2Var2 = bf2Var;
                                long j2 = this.h;
                                h93 h93Var = this.d;
                                ff2 ff2Var = this.r;
                                q30 a = ad0Var.a.a();
                                if (h93Var != null) {
                                    a.a(h93Var);
                                }
                                iArr = iArr4;
                                i5 = i21;
                                hu huVar2 = new hu(i30Var.b, iArr3, jw0VarArr, new dd0(ad0Var.c, hg1Var, e30Var, moVar, i22, iArr5, xo0Var2, i23, a, j2, ad0Var.b, z4, arrayList, bf2Var2, ff2Var), this, this.j, j, this.e, this.q, this.f, this.p);
                                synchronized (this) {
                                    this.o.put(huVar2, bf2Var2);
                                }
                                ys2VarArr2 = ys2VarArr;
                                ys2VarArr2[i4] = huVar2;
                            } else {
                                i4 = i16;
                                iArr = iArr2;
                                i5 = length;
                                ys2VarArr2 = ys2VarArr3;
                                if (i17 == 2) {
                                    ys2VarArr2[i4] = new bn0((cn0) this.y.get(i30Var.d), xo0Var2.c().e[0], this.w.d);
                                }
                            }
                        } else {
                            i4 = i16;
                            iArr = iArr2;
                            i5 = length;
                            ys2VarArr2 = ys2VarArr3;
                            if (ys2Var5 instanceof hu) {
                                ((hu) ys2Var5).f.j = xo0Var2;
                            }
                        }
                    }
                    i16 = i4 + 1;
                    xo0VarArr2 = xo0VarArr;
                    ys2VarArr3 = ys2VarArr2;
                    iArr2 = iArr;
                    length = i5;
                    i = -1;
                    z3 = true;
                }
                int[] iArr6 = iArr2;
                int i24 = length;
                ys2[] ys2VarArr4 = ys2VarArr3;
                int i25 = 0;
                while (i25 < xo0VarArr.length) {
                    if (ys2VarArr4[i25] != null || xo0VarArr[i25] == null) {
                        i2 = i24;
                    } else {
                        int i26 = iArr6[i25];
                        i30 i30Var2 = this.l[i26];
                        if (i30Var2.c == 1) {
                            if (i26 != -1) {
                                int i27 = i30Var2.e;
                                i3 = 0;
                                i2 = i24;
                                while (i3 < i2) {
                                    int i28 = iArr6[i3];
                                    if (i28 == i27 && this.l[i28].c == 0) {
                                        break;
                                    }
                                    i3++;
                                }
                            } else {
                                i2 = i24;
                            }
                            i3 = -1;
                            if (i3 == -1) {
                                ys2VarArr4[i25] = new bm0();
                            } else {
                                hu huVar3 = (hu) ys2VarArr4[i3];
                                int i29 = i30Var2.b;
                                int i30 = 0;
                                while (true) {
                                    xs2[] xs2VarArr = huVar3.o;
                                    if (i30 < xs2VarArr.length) {
                                        if (huVar3.c[i30] == i29) {
                                            boolean[] zArr5 = huVar3.e;
                                            if (!zArr5[i30]) {
                                                zArr5[i30] = true;
                                                xs2VarArr[i30].c(j, true);
                                                ys2VarArr4[i25] = new gu(huVar3, huVar3, huVar3.o[i30], i30);
                                            } else {
                                                throw new IllegalStateException();
                                            }
                                        } else {
                                            i30++;
                                        }
                                    } else {
                                        throw new IllegalStateException();
                                    }
                                }
                            }
                        } else {
                            i2 = i24;
                        }
                    }
                    i25++;
                    i24 = i2;
                }
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                for (ys2 ys2Var6 : ys2VarArr4) {
                    if (ys2Var6 instanceof hu) {
                        arrayList2.add((hu) ys2Var6);
                    } else if (ys2Var6 instanceof bn0) {
                        arrayList3.add((bn0) ys2Var6);
                    }
                }
                hu[] huVarArr = new hu[arrayList2.size()];
                this.t = huVarArr;
                arrayList2.toArray(huVarArr);
                bn0[] bn0VarArr = new bn0[arrayList3.size()];
                this.u = bn0VarArr;
                arrayList3.toArray(bn0VarArr);
                xc0 xc0Var = this.m;
                hu[] huVarArr2 = this.t;
                xc0Var.getClass();
                this.v = new ny(huVarArr2);
                return j;
            }
        }
    }

    public static eg0 a(String str, List list) {
        for (int i = 0; i < list.size(); i++) {
            eg0 eg0Var = (eg0) list.get(i);
            if (str.equals(eg0Var.a)) {
                return eg0Var;
            }
        }
        return null;
    }

    public static jw0[] a(eg0 eg0Var, Pattern pattern, jw0 jw0Var) {
        String str = eg0Var.b;
        if (str == null) {
            return new jw0[]{jw0Var};
        }
        int i = sb3.a;
        String[] split = str.split(";", -1);
        jw0[] jw0VarArr = new jw0[split.length];
        for (int i2 = 0; i2 < split.length; i2++) {
            Matcher matcher = pattern.matcher(split[i2]);
            if (!matcher.matches()) {
                return new jw0[]{jw0Var};
            }
            int parseInt = Integer.parseInt(matcher.group(1));
            iw0 iw0Var = new iw0(jw0Var);
            iw0Var.a = jw0Var.b + ":" + parseInt;
            iw0Var.C = parseInt;
            iw0Var.c = matcher.group(2);
            jw0VarArr[i2] = new jw0(iw0Var);
        }
        return jw0VarArr;
    }
}
