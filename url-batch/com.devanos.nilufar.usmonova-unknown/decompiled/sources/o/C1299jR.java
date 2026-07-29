package o;

import java.util.Arrays;

/* renamed from: o.jR, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1299jR extends Z implements RD, InterfaceC2243xm, InterfaceC0589Wp {
    public final int l;
    public final int m;
    public final H8 n;

    /* renamed from: o, reason: collision with root package name */
    public Object[] f183o;
    public long p;
    public long q;
    public int r;
    public int s;

    public C1299jR(int i, int i2, H8 h8) {
        this.l = i;
        this.m = i2;
        this.n = h8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0081 A[Catch: all -> 0x0036, TRY_ENTER, TryCatch #1 {all -> 0x0036, blocks: (B:14:0x002f, B:18:0x0077, B:21:0x0081, B:30:0x0094, B:33:0x009b, B:34:0x009f, B:36:0x00a0, B:42:0x0049), top: B:7:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /* JADX WARN: Type inference failed for: r4v1, types: [o.Z] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4, types: [o.jR] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r9v0, types: [o.ym] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v2, types: [o.a0] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [o.kR] */
    /* JADX WARN: Type inference failed for: r9v8, types: [o.kR] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00ae -> B:15:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void h(C1299jR c1299jR, InterfaceC2309ym interfaceC2309ym, InterfaceC2235xe interfaceC2235xe) {
        C1235iR c1235iR;
        int i;
        ?? r4;
        InterfaceC2309ym interfaceC2309ym2;
        InterfaceC0075Cu interfaceC0075Cu;
        InterfaceC0075Cu interfaceC0075Cu2;
        InterfaceC2309ym interfaceC2309ym3;
        Object s;
        C0457Rn c0457Rn;
        EnumC0448Re enumC0448Re;
        C1365kR c1365kR;
        try {
            try {
                if (interfaceC2235xe instanceof C1235iR) {
                    c1235iR = (C1235iR) interfaceC2235xe;
                    int i2 = c1235iR.n;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c1235iR.n = i2 - Integer.MIN_VALUE;
                        Object obj = c1235iR.l;
                        i = c1235iR.n;
                        if (i != 0) {
                            AbstractC1494mO.l(obj);
                            interfaceC2309ym2 = interfaceC2309ym;
                            interfaceC2309ym = (C1365kR) c1299jR.a();
                        } else {
                            if (i != 1) {
                                if (i == 2) {
                                    interfaceC0075Cu2 = c1235iR.k;
                                    C1365kR c1365kR2 = c1235iR.j;
                                    interfaceC2309ym3 = c1235iR.i;
                                    C1299jR c1299jR2 = c1235iR.h;
                                    AbstractC1494mO.l(obj);
                                    r4 = c1299jR2;
                                    interfaceC2309ym = c1365kR2;
                                    do {
                                        s = r4.s(interfaceC2309ym);
                                        c0457Rn = AbstractC0868ct.j;
                                        enumC0448Re = EnumC0448Re.h;
                                        if (s == c0457Rn) {
                                        }
                                    } while (r4.f(interfaceC2309ym, c1235iR) != enumC0448Re);
                                    return;
                                }
                                if (i != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                interfaceC0075Cu2 = c1235iR.k;
                                C1365kR c1365kR3 = c1235iR.j;
                                interfaceC2309ym3 = c1235iR.i;
                                C1299jR c1299jR3 = c1235iR.h;
                                AbstractC1494mO.l(obj);
                                C1299jR c1299jR4 = c1299jR3;
                                C1365kR c1365kR4 = c1365kR3;
                                interfaceC2309ym2 = interfaceC2309ym3;
                                interfaceC0075Cu = interfaceC0075Cu2;
                                c1299jR = c1299jR4;
                                c1365kR = c1365kR4;
                                r4 = c1299jR;
                                interfaceC0075Cu2 = interfaceC0075Cu;
                                interfaceC2309ym3 = interfaceC2309ym2;
                                interfaceC2309ym = c1365kR;
                                do {
                                    s = r4.s(interfaceC2309ym);
                                    c0457Rn = AbstractC0868ct.j;
                                    enumC0448Re = EnumC0448Re.h;
                                    if (s == c0457Rn) {
                                        if (interfaceC0075Cu2 != null && !interfaceC0075Cu2.b()) {
                                            throw interfaceC0075Cu2.t();
                                        }
                                        c1235iR.h = r4;
                                        c1235iR.i = interfaceC2309ym3;
                                        c1235iR.j = interfaceC2309ym;
                                        c1235iR.k = interfaceC0075Cu2;
                                        c1235iR.n = 3;
                                        c1299jR4 = r4;
                                        c1365kR4 = interfaceC2309ym;
                                        if (interfaceC2309ym3.emit(s, c1235iR) == enumC0448Re) {
                                            return;
                                        }
                                        interfaceC2309ym2 = interfaceC2309ym3;
                                        interfaceC0075Cu = interfaceC0075Cu2;
                                        c1299jR = c1299jR4;
                                        c1365kR = c1365kR4;
                                        r4 = c1299jR;
                                        interfaceC0075Cu2 = interfaceC0075Cu;
                                        interfaceC2309ym3 = interfaceC2309ym2;
                                        interfaceC2309ym = c1365kR;
                                        s = r4.s(interfaceC2309ym);
                                        c0457Rn = AbstractC0868ct.j;
                                        enumC0448Re = EnumC0448Re.h;
                                        if (s == c0457Rn) {
                                            c1235iR.h = r4;
                                            c1235iR.i = interfaceC2309ym3;
                                            c1235iR.j = interfaceC2309ym;
                                            c1235iR.k = interfaceC0075Cu2;
                                            c1235iR.n = 2;
                                        }
                                    }
                                } while (r4.f(interfaceC2309ym, c1235iR) != enumC0448Re);
                                return;
                            }
                            interfaceC2309ym = c1235iR.j;
                            InterfaceC2309ym interfaceC2309ym4 = c1235iR.i;
                            C1299jR c1299jR5 = c1235iR.h;
                            try {
                                AbstractC1494mO.l(obj);
                                interfaceC2309ym2 = interfaceC2309ym4;
                                c1299jR = c1299jR5;
                                interfaceC2309ym = interfaceC2309ym;
                            } catch (Throwable th) {
                                th = th;
                                r4 = c1299jR5;
                                r4.d(interfaceC2309ym);
                                throw th;
                            }
                        }
                        interfaceC0075Cu = (InterfaceC0075Cu) c1235iR.getContext().k(C0460Rq.K);
                        c1365kR = interfaceC2309ym;
                        r4 = c1299jR;
                        interfaceC0075Cu2 = interfaceC0075Cu;
                        interfaceC2309ym3 = interfaceC2309ym2;
                        interfaceC2309ym = c1365kR;
                        do {
                            s = r4.s(interfaceC2309ym);
                            c0457Rn = AbstractC0868ct.j;
                            enumC0448Re = EnumC0448Re.h;
                            if (s == c0457Rn) {
                            }
                        } while (r4.f(interfaceC2309ym, c1235iR) != enumC0448Re);
                        return;
                    }
                }
                interfaceC0075Cu = (InterfaceC0075Cu) c1235iR.getContext().k(C0460Rq.K);
                c1365kR = interfaceC2309ym;
                r4 = c1299jR;
                interfaceC0075Cu2 = interfaceC0075Cu;
                interfaceC2309ym3 = interfaceC2309ym2;
                interfaceC2309ym = c1365kR;
                do {
                    s = r4.s(interfaceC2309ym);
                    c0457Rn = AbstractC0868ct.j;
                    enumC0448Re = EnumC0448Re.h;
                    if (s == c0457Rn) {
                    }
                } while (r4.f(interfaceC2309ym, c1235iR) != enumC0448Re);
                return;
            } catch (Throwable th2) {
                r4 = c1299jR;
                th = th2;
                r4.d(interfaceC2309ym);
                throw th;
            }
            if (i != 0) {
            }
        } catch (Throwable th3) {
            th = th3;
        }
        c1235iR = new C1235iR(c1299jR, interfaceC2235xe);
        Object obj2 = c1235iR.l;
        i = c1235iR.n;
    }

    @Override // o.Z
    public final AbstractC0679a0 b() {
        C1365kR c1365kR = new C1365kR();
        c1365kR.a = -1L;
        return c1365kR;
    }

    @Override // o.Z
    public final AbstractC0679a0[] c() {
        return new C1365kR[2];
    }

    @Override // o.InterfaceC2243xm
    public final Object collect(InterfaceC2309ym interfaceC2309ym, InterfaceC2235xe interfaceC2235xe) {
        h(this, interfaceC2309ym, interfaceC2235xe);
        return EnumC0448Re.h;
    }

    @Override // o.InterfaceC2309ym
    public final Object emit(Object obj, InterfaceC2235xe interfaceC2235xe) {
        Throwable th;
        InterfaceC2235xe[] k;
        C1169hR c1169hR;
        if (n(obj)) {
            return C0782bY.a;
        }
        C0849ca c0849ca = new C0849ca(1, AbstractC1473m3.L(interfaceC2235xe));
        c0849ca.r();
        InterfaceC2235xe[] interfaceC2235xeArr = AbstractC1807r8.a;
        synchronized (this) {
            try {
                if (q(obj)) {
                    try {
                        c0849ca.resumeWith(C0782bY.a);
                        k = k(interfaceC2235xeArr);
                        c1169hR = null;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } else {
                    try {
                        C1169hR c1169hR2 = new C1169hR(this, l() + this.r + this.s, obj, c0849ca);
                        j(c1169hR2);
                        this.s++;
                        if (this.m == 0) {
                            interfaceC2235xeArr = k(interfaceC2235xeArr);
                        }
                        k = interfaceC2235xeArr;
                        c1169hR = c1169hR2;
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        throw th;
                    }
                }
                if (c1169hR != null) {
                    c0849ca.u(new Y9(2, c1169hR));
                }
                for (InterfaceC2235xe interfaceC2235xe2 : k) {
                    if (interfaceC2235xe2 != null) {
                        interfaceC2235xe2.resumeWith(C0782bY.a);
                    }
                }
                Object q = c0849ca.q();
                EnumC0448Re enumC0448Re = EnumC0448Re.h;
                if (q != enumC0448Re) {
                    q = C0782bY.a;
                }
                return q == enumC0448Re ? q : C0782bY.a;
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    public final Object f(C1365kR c1365kR, C1235iR c1235iR) {
        C0849ca c0849ca = new C0849ca(1, AbstractC1473m3.L(c1235iR));
        c0849ca.r();
        synchronized (this) {
            try {
                if (r(c1365kR) < 0) {
                    c1365kR.b = c0849ca;
                } else {
                    c0849ca.resumeWith(C0782bY.a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Object q = c0849ca.q();
        return q == EnumC0448Re.h ? q : C0782bY.a;
    }

    public final void g() {
        if (this.m != 0 || this.s > 1) {
            Object[] objArr = this.f183o;
            AbstractC0048Bt.k(objArr);
            while (this.s > 0) {
                long l = l();
                int i = this.r;
                int i2 = this.s;
                if (objArr[((int) ((l + (i + i2)) - 1)) & (objArr.length - 1)] != AbstractC0868ct.j) {
                    return;
                }
                this.s = i2 - 1;
                AbstractC0868ct.d(objArr, l() + this.r + this.s, null);
            }
        }
    }

    public final void i() {
        AbstractC0679a0[] abstractC0679a0Arr;
        Object[] objArr = this.f183o;
        AbstractC0048Bt.k(objArr);
        AbstractC0868ct.d(objArr, l(), null);
        this.r--;
        long l = l() + 1;
        if (this.p < l) {
            this.p = l;
        }
        if (this.q < l) {
            if (this.i != 0 && (abstractC0679a0Arr = this.h) != null) {
                for (AbstractC0679a0 abstractC0679a0 : abstractC0679a0Arr) {
                    if (abstractC0679a0 != null) {
                        C1365kR c1365kR = (C1365kR) abstractC0679a0;
                        long j = c1365kR.a;
                        if (j >= 0 && j < l) {
                            c1365kR.a = l;
                        }
                    }
                }
            }
            this.q = l;
        }
    }

    public final void j(Object obj) {
        int i = this.r + this.s;
        Object[] objArr = this.f183o;
        if (objArr == null) {
            objArr = o(null, 0, 2);
        } else if (i >= objArr.length) {
            objArr = o(objArr, i, objArr.length * 2);
        }
        AbstractC0868ct.d(objArr, l() + i, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object, java.lang.Object[]] */
    public final InterfaceC2235xe[] k(InterfaceC2235xe[] interfaceC2235xeArr) {
        AbstractC0679a0[] abstractC0679a0Arr;
        C1365kR c1365kR;
        C0849ca c0849ca;
        int length = interfaceC2235xeArr.length;
        if (this.i != 0 && (abstractC0679a0Arr = this.h) != null) {
            int length2 = abstractC0679a0Arr.length;
            int i = 0;
            interfaceC2235xeArr = interfaceC2235xeArr;
            while (i < length2) {
                AbstractC0679a0 abstractC0679a0 = abstractC0679a0Arr[i];
                if (abstractC0679a0 != null && (c0849ca = (c1365kR = (C1365kR) abstractC0679a0).b) != null && r(c1365kR) >= 0) {
                    int length3 = interfaceC2235xeArr.length;
                    interfaceC2235xeArr = interfaceC2235xeArr;
                    if (length >= length3) {
                        ?? copyOf = Arrays.copyOf(interfaceC2235xeArr, Math.max(2, interfaceC2235xeArr.length * 2));
                        AbstractC0048Bt.m(copyOf, "copyOf(...)");
                        interfaceC2235xeArr = copyOf;
                    }
                    interfaceC2235xeArr[length] = c0849ca;
                    c1365kR.b = null;
                    length++;
                }
                i++;
                interfaceC2235xeArr = interfaceC2235xeArr;
            }
        }
        return interfaceC2235xeArr;
    }

    public final long l() {
        return Math.min(this.q, this.p);
    }

    @Override // o.RD
    public final void m() {
        synchronized (this) {
            try {
                try {
                    t(l() + this.r, this.q, l() + this.r, l() + this.r + this.s);
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    @Override // o.RD
    public final boolean n(Object obj) {
        int i;
        boolean z;
        InterfaceC2235xe[] interfaceC2235xeArr = AbstractC1807r8.a;
        synchronized (this) {
            if (q(obj)) {
                interfaceC2235xeArr = k(interfaceC2235xeArr);
                z = true;
            } else {
                z = false;
            }
        }
        for (InterfaceC2235xe interfaceC2235xe : interfaceC2235xeArr) {
            if (interfaceC2235xe != null) {
                interfaceC2235xe.resumeWith(C0782bY.a);
            }
        }
        return z;
    }

    public final Object[] o(Object[] objArr, int i, int i2) {
        if (i2 <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] objArr2 = new Object[i2];
        this.f183o = objArr2;
        if (objArr != null) {
            long l = l();
            for (int i3 = 0; i3 < i; i3++) {
                long j = i3 + l;
                AbstractC0868ct.d(objArr2, j, objArr[((int) j) & (objArr.length - 1)]);
            }
        }
        return objArr2;
    }

    @Override // o.InterfaceC0589Wp
    public final InterfaceC2243xm p(InterfaceC0189He interfaceC0189He, int i, H8 h8) {
        return AbstractC0868ct.u(this, interfaceC0189He, i, h8);
    }

    public final boolean q(Object obj) {
        int i = this.i;
        int i2 = this.l;
        if (i != 0) {
            int i3 = this.r;
            int i4 = this.m;
            if (i3 >= i4 && this.q <= this.p) {
                int ordinal = this.n.ordinal();
                if (ordinal == 0) {
                    return false;
                }
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        throw new C0057Cc();
                    }
                }
            }
            j(obj);
            int i5 = this.r + 1;
            this.r = i5;
            if (i5 > i4) {
                i();
            }
            long l = l() + this.r;
            long j = this.p;
            if (((int) (l - j)) > i2) {
                t(1 + j, this.q, l() + this.r, l() + this.r + this.s);
            }
        } else if (i2 != 0) {
            j(obj);
            int i6 = this.r + 1;
            this.r = i6;
            if (i6 > i2) {
                i();
            }
            this.q = l() + this.r;
            return true;
        }
        return true;
    }

    public final long r(C1365kR c1365kR) {
        long j = c1365kR.a;
        if (j < l() + this.r) {
            return j;
        }
        if (this.m <= 0 && j <= l() && this.s != 0) {
            return j;
        }
        return -1L;
    }

    public final Object s(C1365kR c1365kR) {
        Object obj;
        InterfaceC2235xe[] interfaceC2235xeArr = AbstractC1807r8.a;
        synchronized (this) {
            try {
                long r = r(c1365kR);
                if (r < 0) {
                    obj = AbstractC0868ct.j;
                } else {
                    long j = c1365kR.a;
                    Object[] objArr = this.f183o;
                    AbstractC0048Bt.k(objArr);
                    Object obj2 = objArr[((int) r) & (objArr.length - 1)];
                    if (obj2 instanceof C1169hR) {
                        obj2 = ((C1169hR) obj2).j;
                    }
                    c1365kR.a = r + 1;
                    Object obj3 = obj2;
                    interfaceC2235xeArr = u(j);
                    obj = obj3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (InterfaceC2235xe interfaceC2235xe : interfaceC2235xeArr) {
            if (interfaceC2235xe != null) {
                interfaceC2235xe.resumeWith(C0782bY.a);
            }
        }
        return obj;
    }

    public final void t(long j, long j2, long j3, long j4) {
        long min = Math.min(j2, j);
        for (long l = l(); l < min; l++) {
            Object[] objArr = this.f183o;
            AbstractC0048Bt.k(objArr);
            AbstractC0868ct.d(objArr, l, null);
        }
        this.p = j;
        this.q = j2;
        this.r = (int) (j3 - min);
        this.s = (int) (j4 - j3);
    }

    public final InterfaceC2235xe[] u(long j) {
        long j2;
        long j3;
        long j4;
        InterfaceC2235xe[] interfaceC2235xeArr;
        InterfaceC2235xe[] interfaceC2235xeArr2;
        AbstractC0679a0[] abstractC0679a0Arr;
        C0457Rn c0457Rn = AbstractC0868ct.j;
        InterfaceC2235xe[] interfaceC2235xeArr3 = AbstractC1807r8.a;
        if (j <= this.q) {
            long l = l();
            long j5 = this.r + l;
            int i = this.m;
            if (i == 0 && this.s > 0) {
                j5++;
            }
            int i2 = 0;
            if (this.i != 0 && (abstractC0679a0Arr = this.h) != null) {
                for (AbstractC0679a0 abstractC0679a0 : abstractC0679a0Arr) {
                    if (abstractC0679a0 != null) {
                        long j6 = ((C1365kR) abstractC0679a0).a;
                        if (j6 >= 0 && j6 < j5) {
                            j5 = j6;
                        }
                    }
                }
            }
            if (j5 > this.q) {
                long l2 = l() + this.r;
                int min = this.i > 0 ? Math.min(this.s, i - ((int) (l2 - j5))) : this.s;
                long j7 = this.s + l2;
                if (min > 0) {
                    j4 = 1;
                    Object[] objArr = this.f183o;
                    AbstractC0048Bt.k(objArr);
                    j2 = l;
                    InterfaceC2235xe[] interfaceC2235xeArr4 = new InterfaceC2235xe[min];
                    long j8 = l2;
                    while (true) {
                        if (l2 >= j7) {
                            interfaceC2235xeArr2 = interfaceC2235xeArr4;
                            j3 = j5;
                            break;
                        }
                        interfaceC2235xeArr2 = interfaceC2235xeArr4;
                        Object obj = objArr[(objArr.length - 1) & ((int) l2)];
                        if (obj != c0457Rn) {
                            AbstractC0048Bt.l(obj, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                            C1169hR c1169hR = (C1169hR) obj;
                            int i3 = i2 + 1;
                            j3 = j5;
                            interfaceC2235xeArr2[i2] = c1169hR.k;
                            AbstractC0868ct.d(objArr, l2, c0457Rn);
                            AbstractC0868ct.d(objArr, j8, c1169hR.j);
                            j8++;
                            if (i3 >= min) {
                                break;
                            }
                            i2 = i3;
                        } else {
                            j3 = j5;
                        }
                        l2++;
                        interfaceC2235xeArr4 = interfaceC2235xeArr2;
                        j5 = j3;
                    }
                    l2 = j8;
                    interfaceC2235xeArr = interfaceC2235xeArr2;
                } else {
                    j2 = l;
                    j3 = j5;
                    j4 = 1;
                    interfaceC2235xeArr = interfaceC2235xeArr3;
                }
                int i4 = (int) (l2 - j2);
                long j9 = this.i == 0 ? l2 : j3;
                long max = Math.max(this.p, l2 - Math.min(this.l, i4));
                if (i == 0 && max < j7) {
                    Object[] objArr2 = this.f183o;
                    AbstractC0048Bt.k(objArr2);
                    if (AbstractC0048Bt.h(objArr2[((int) max) & (objArr2.length - 1)], c0457Rn)) {
                        l2 += j4;
                        max += j4;
                    }
                }
                t(max, j9, l2, j7);
                g();
                return interfaceC2235xeArr.length == 0 ? interfaceC2235xeArr : k(interfaceC2235xeArr);
            }
        }
        return interfaceC2235xeArr3;
    }
}
