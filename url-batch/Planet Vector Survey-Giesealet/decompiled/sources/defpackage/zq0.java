package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public class zq0 extends f0 implements wq0, pr, or, bv {
    public final int h;
    public final int i;
    public Object[] j;
    public long k;
    public long l;
    public int m;
    public int n;

    public zq0(int i, int i2) {
        this.h = i;
        this.i = i2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(7:(2:3|(10:5|6|7|(2:9|(1:(1:(7:13|14|15|16|17|(3:18|19|(10:28|(2:33|34)|36|(1:38)|15|16|17|18|19|(0)(1:21))(0))|25)(2:39|40))(5:41|42|17|(3:18|19|(0)(0))|25))(4:43|44|45|46))(1:57)|47|48|16|17|(3:18|19|(0)(0))|25))|47|48|16|17|(3:18|19|(0)(0))|25)|59|6|7|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0036, code lost:
    
        r8 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007f A[Catch: all -> 0x0036, TRY_ENTER, TryCatch #0 {all -> 0x0036, blocks: (B:14:0x002f, B:18:0x0075, B:21:0x007f, B:30:0x0092, B:33:0x0099, B:34:0x009d, B:36:0x009e, B:42:0x0047), top: B:7:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0090 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /* JADX WARN: Type inference failed for: r4v1, types: [f0] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4, types: [zq0] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r9v0, types: [pr] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v2, types: [g0] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [ar0] */
    /* JADX WARN: Type inference failed for: r9v8, types: [ar0] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00ac -> B:15:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void j(zq0 zq0Var, pr prVar, kj kjVar) {
        yq0 yq0Var;
        int i;
        ?? r4;
        pr prVar2;
        zz zzVar;
        zz zzVar2;
        pr prVar3;
        Object s;
        op opVar;
        ck ckVar;
        ar0 ar0Var;
        try {
            if (kjVar instanceof yq0) {
                yq0Var = (yq0) kjVar;
                int i2 = yq0Var.j;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    yq0Var.j = i2 - Integer.MIN_VALUE;
                    Object obj = yq0Var.h;
                    i = yq0Var.j;
                    if (i != 0) {
                        rg0.u(obj);
                        prVar2 = prVar;
                        prVar = (ar0) zq0Var.c();
                    } else {
                        if (i != 1) {
                            if (i == 2) {
                                zzVar2 = yq0Var.g;
                                ar0 ar0Var2 = yq0Var.f;
                                prVar3 = yq0Var.e;
                                zq0 zq0Var2 = yq0Var.d;
                                rg0.u(obj);
                                r4 = zq0Var2;
                                prVar = ar0Var2;
                                do {
                                    s = r4.s(prVar);
                                    opVar = a50.q;
                                    ckVar = ck.d;
                                    if (s == opVar) {
                                    }
                                } while (r4.i(prVar, yq0Var) != ckVar);
                                return;
                            }
                            if (i != 3) {
                                g8.s("call to 'resume' before 'invoke' with coroutine");
                                return;
                            }
                            zzVar2 = yq0Var.g;
                            ar0 ar0Var3 = yq0Var.f;
                            prVar3 = yq0Var.e;
                            zq0 zq0Var3 = yq0Var.d;
                            rg0.u(obj);
                            zq0 zq0Var4 = zq0Var3;
                            ar0 ar0Var4 = ar0Var3;
                            prVar2 = prVar3;
                            zzVar = zzVar2;
                            zq0Var = zq0Var4;
                            ar0Var = ar0Var4;
                            r4 = zq0Var;
                            zzVar2 = zzVar;
                            prVar3 = prVar2;
                            prVar = ar0Var;
                            do {
                                s = r4.s(prVar);
                                opVar = a50.q;
                                ckVar = ck.d;
                                if (s == opVar) {
                                    if (zzVar2 != null && !zzVar2.b()) {
                                        throw zzVar2.n();
                                    }
                                    yq0Var.d = r4;
                                    yq0Var.e = prVar3;
                                    yq0Var.f = prVar;
                                    yq0Var.g = zzVar2;
                                    yq0Var.j = 3;
                                    zq0Var4 = r4;
                                    ar0Var4 = prVar;
                                    if (prVar3.e(s, yq0Var) == ckVar) {
                                        return;
                                    }
                                    prVar2 = prVar3;
                                    zzVar = zzVar2;
                                    zq0Var = zq0Var4;
                                    ar0Var = ar0Var4;
                                    r4 = zq0Var;
                                    zzVar2 = zzVar;
                                    prVar3 = prVar2;
                                    prVar = ar0Var;
                                    s = r4.s(prVar);
                                    opVar = a50.q;
                                    ckVar = ck.d;
                                    if (s == opVar) {
                                        yq0Var.d = r4;
                                        yq0Var.e = prVar3;
                                        yq0Var.f = prVar;
                                        yq0Var.g = zzVar2;
                                        yq0Var.j = 2;
                                    }
                                }
                            } while (r4.i(prVar, yq0Var) != ckVar);
                            return;
                        }
                        prVar = yq0Var.f;
                        pr prVar4 = yq0Var.e;
                        zq0 zq0Var5 = yq0Var.d;
                        try {
                            rg0.u(obj);
                            prVar2 = prVar4;
                            zq0Var = zq0Var5;
                            prVar = prVar;
                        } catch (Throwable th) {
                            th = th;
                            r4 = zq0Var5;
                            r4.g(prVar);
                            throw th;
                        }
                    }
                    zzVar = (zz) yq0Var.getContext().k(b2.C);
                    ar0Var = prVar;
                    r4 = zq0Var;
                    zzVar2 = zzVar;
                    prVar3 = prVar2;
                    prVar = ar0Var;
                    do {
                        s = r4.s(prVar);
                        opVar = a50.q;
                        ckVar = ck.d;
                        if (s == opVar) {
                        }
                    } while (r4.i(prVar, yq0Var) != ckVar);
                    return;
                }
            }
            zzVar = (zz) yq0Var.getContext().k(b2.C);
            ar0Var = prVar;
            r4 = zq0Var;
            zzVar2 = zzVar;
            prVar3 = prVar2;
            prVar = ar0Var;
            do {
                s = r4.s(prVar);
                opVar = a50.q;
                ckVar = ck.d;
                if (s == opVar) {
                }
            } while (r4.i(prVar, yq0Var) != ckVar);
            return;
        } catch (Throwable th2) {
            r4 = zq0Var;
            th = th2;
            r4.g(prVar);
            throw th;
        }
        yq0Var = new yq0(zq0Var, kjVar);
        Object obj2 = yq0Var.h;
        i = yq0Var.j;
        if (i != 0) {
        }
    }

    @Override // defpackage.or
    public final Object a(pr prVar, kj kjVar) {
        j(this, prVar, kjVar);
        return ck.d;
    }

    @Override // defpackage.bv
    public final or b(rj rjVar, int i, cb cbVar) {
        return a50.t(this, rjVar, i, cbVar);
    }

    @Override // defpackage.f0
    public final g0 d() {
        ar0 ar0Var = new ar0();
        ar0Var.a = -1L;
        return ar0Var;
    }

    @Override // defpackage.pr
    public final Object e(Object obj, kj kjVar) {
        p(obj);
        return ky0.a;
    }

    @Override // defpackage.f0
    public final g0[] f() {
        return new ar0[2];
    }

    public final Object i(ar0 ar0Var, yq0 yq0Var) {
        hc hcVar = new hc(1, d31.B(yq0Var));
        hcVar.q();
        synchronized (this) {
            try {
                if (r(ar0Var) < 0) {
                    ar0Var.b = hcVar;
                } else {
                    hcVar.resumeWith(ky0.a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Object p = hcVar.p();
        return p == ck.d ? p : ky0.a;
    }

    public final void k() {
        g0[] g0VarArr;
        Object[] objArr = this.j;
        objArr.getClass();
        a50.h(objArr, n(), null);
        this.m--;
        long n = n() + 1;
        if (this.k < n) {
            this.k = n;
        }
        if (this.l < n) {
            if (this.e != 0 && (g0VarArr = this.d) != null) {
                for (g0 g0Var : g0VarArr) {
                    if (g0Var != null) {
                        ar0 ar0Var = (ar0) g0Var;
                        long j = ar0Var.a;
                        if (j >= 0 && j < n) {
                            ar0Var.a = n;
                        }
                    }
                }
            }
            this.l = n;
        }
    }

    public final void l(Object obj) {
        int i = this.m + this.n;
        Object[] objArr = this.j;
        if (objArr == null) {
            objArr = o(null, 0, 2);
        } else if (i >= objArr.length) {
            objArr = o(objArr, i, objArr.length * 2);
        }
        a50.h(objArr, n() + i, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final kj[] m(kj[] kjVarArr) {
        g0[] g0VarArr;
        ar0 ar0Var;
        hc hcVar;
        int length = kjVarArr.length;
        if (this.e != 0 && (g0VarArr = this.d) != null) {
            int length2 = g0VarArr.length;
            int i = 0;
            kjVarArr = kjVarArr;
            while (i < length2) {
                g0 g0Var = g0VarArr[i];
                if (g0Var != null && (hcVar = (ar0Var = (ar0) g0Var).b) != null && r(ar0Var) >= 0) {
                    int length3 = kjVarArr.length;
                    kjVarArr = kjVarArr;
                    if (length >= length3) {
                        kjVarArr = Arrays.copyOf(kjVarArr, Math.max(2, kjVarArr.length * 2));
                    }
                    kjVarArr[length] = hcVar;
                    ar0Var.b = null;
                    length++;
                }
                i++;
                kjVarArr = kjVarArr;
            }
        }
        return kjVarArr;
    }

    public final long n() {
        return Math.min(this.l, this.k);
    }

    public final Object[] o(Object[] objArr, int i, int i2) {
        if (i2 <= 0) {
            g8.s("Buffer size overflow");
            return null;
        }
        Object[] objArr2 = new Object[i2];
        this.j = objArr2;
        if (objArr != null) {
            long n = n();
            for (int i3 = 0; i3 < i; i3++) {
                long j = i3 + n;
                a50.h(objArr2, j, objArr[((int) j) & (objArr.length - 1)]);
            }
        }
        return objArr2;
    }

    public final boolean p(Object obj) {
        kj[] m;
        kj[] kjVarArr = x40.a;
        synchronized (this) {
            q(obj);
            m = m(kjVarArr);
        }
        for (kj kjVar : m) {
            if (kjVar != null) {
                kjVar.resumeWith(ky0.a);
            }
        }
        return true;
    }

    public final boolean q(Object obj) {
        int i = this.e;
        int i2 = this.h;
        if (i != 0) {
            l(obj);
            int i3 = this.m + 1;
            this.m = i3;
            if (i3 > this.i) {
                k();
            }
            long n = n() + this.m;
            long j = this.k;
            if (((int) (n - j)) > i2) {
                t(1 + j, this.l, n() + this.m, n() + this.m + this.n);
            }
        } else if (i2 != 0) {
            l(obj);
            int i4 = this.m + 1;
            this.m = i4;
            if (i4 > i2) {
                k();
            }
            this.l = n() + this.m;
            return true;
        }
        return true;
    }

    public final long r(ar0 ar0Var) {
        long j = ar0Var.a;
        if (j >= n() + this.m && (this.i > 0 || j > n() || this.n == 0)) {
            return -1L;
        }
        return j;
    }

    public final Object s(ar0 ar0Var) {
        Object obj;
        kj[] kjVarArr = x40.a;
        synchronized (this) {
            try {
                long r = r(ar0Var);
                if (r < 0) {
                    obj = a50.q;
                } else {
                    long j = ar0Var.a;
                    Object[] objArr = this.j;
                    objArr.getClass();
                    Object obj2 = objArr[((int) r) & (objArr.length - 1)];
                    if (obj2 instanceof xq0) {
                        obj2 = null;
                    }
                    ar0Var.a = r + 1;
                    Object obj3 = obj2;
                    kjVarArr = u(j);
                    obj = obj3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (kj kjVar : kjVarArr) {
            if (kjVar != null) {
                kjVar.resumeWith(ky0.a);
            }
        }
        return obj;
    }

    public final void t(long j, long j2, long j3, long j4) {
        long min = Math.min(j2, j);
        for (long n = n(); n < min; n++) {
            Object[] objArr = this.j;
            objArr.getClass();
            a50.h(objArr, n, null);
        }
        this.k = j;
        this.l = j2;
        this.m = (int) (j3 - min);
        this.n = (int) (j4 - j3);
    }

    public final kj[] u(long j) {
        int i;
        long j2;
        int i2;
        kj[] kjVarArr;
        kj[] kjVarArr2;
        g0[] g0VarArr;
        op opVar = a50.q;
        kj[] kjVarArr3 = x40.a;
        if (j <= this.l) {
            long n = n();
            long j3 = this.m + n;
            int i3 = this.i;
            if (i3 == 0 && this.n > 0) {
                j3++;
            }
            if (this.e != 0 && (g0VarArr = this.d) != null) {
                for (g0 g0Var : g0VarArr) {
                    if (g0Var != null) {
                        long j4 = ((ar0) g0Var).a;
                        if (j4 >= 0 && j4 < j3) {
                            j3 = j4;
                        }
                    }
                }
            }
            if (j3 > this.l) {
                long n2 = n() + this.m;
                int i4 = this.e;
                int i5 = this.n;
                if (i4 > 0) {
                    i = i3;
                    i5 = Math.min(i5, i - ((int) (n2 - j3)));
                } else {
                    i = i3;
                }
                long j5 = this.n + n2;
                if (i5 > 0) {
                    Object[] objArr = this.j;
                    objArr.getClass();
                    j2 = n;
                    long j6 = n2;
                    i2 = 1;
                    kj[] kjVarArr4 = new kj[i5];
                    long j7 = j6;
                    int i6 = 0;
                    while (true) {
                        if (j6 >= j5) {
                            kjVarArr2 = kjVarArr4;
                            n2 = j7;
                            break;
                        }
                        kjVarArr2 = kjVarArr4;
                        Object obj = objArr[(objArr.length - 1) & ((int) j6)];
                        if (obj != opVar) {
                            obj.getClass();
                            int i7 = i6 + 1;
                            kjVarArr2[i6] = null;
                            a50.h(objArr, j6, opVar);
                            a50.h(objArr, j7, null);
                            n2 = j7 + 1;
                            if (i7 >= i5) {
                                break;
                            }
                            j7 = n2;
                            i6 = i7;
                        }
                        j6++;
                        kjVarArr4 = kjVarArr2;
                    }
                    kjVarArr = kjVarArr2;
                } else {
                    j2 = n;
                    i2 = 1;
                    kjVarArr = kjVarArr3;
                }
                int i8 = (int) (n2 - j2);
                long j8 = this.e == 0 ? n2 : j3;
                long max = Math.max(this.k, n2 - Math.min(this.h, i8));
                if (i == 0 && max < j5) {
                    Object[] objArr2 = this.j;
                    objArr2.getClass();
                    if (nz.l(objArr2[((int) max) & (objArr2.length - 1)], opVar)) {
                        n2++;
                        max++;
                    }
                }
                t(max, j8, n2, j5);
                if (i != 0 || this.n > i2) {
                    Object[] objArr3 = this.j;
                    objArr3.getClass();
                    while (this.n > 0) {
                        long n3 = n();
                        int i9 = this.m;
                        int i10 = this.n;
                        if (objArr3[((int) ((n3 + (i9 + i10)) - 1)) & (objArr3.length - 1)] != a50.q) {
                            break;
                        }
                        this.n = i10 - 1;
                        a50.h(objArr3, n() + this.m + this.n, null);
                    }
                }
                return kjVarArr.length == 0 ? kjVarArr : m(kjVarArr);
            }
        }
        return kjVarArr3;
    }
}
