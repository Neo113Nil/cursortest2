package defpackage;

import java.util.Arrays;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class jp0 extends bh {
    public static final e7 r = new e7(0.0f);
    public static final e7 s = new e7(1.0f);
    public final ce0 b;
    public final ce0 c;
    public Object d;
    public cx0 e;
    public long f;
    public final b g;
    public final yd0 h;
    public hc i;
    public final u70 j;
    public final s70 k;
    public long l;
    public final x60 m;
    public bp0 n;
    public final cp0 o;
    public float p;
    public final cp0 q;

    public jp0(y70 y70Var) {
        super(1);
        this.b = ud0.o(y70Var);
        this.c = ud0.o(y70Var);
        this.d = y70Var;
        this.g = new b(18, this);
        this.h = new yd0(0.0f);
        this.j = new u70();
        this.k = new s70();
        this.l = Long.MIN_VALUE;
        this.m = new x60();
        this.o = new cp0(this, 1);
        this.q = new cp0(this, 0);
    }

    public static final void h(jp0 jp0Var) {
        yd0 yd0Var = jp0Var.h;
        cx0 cx0Var = jp0Var.e;
        if (cx0Var == null) {
            return;
        }
        bp0 bp0Var = jp0Var.n;
        if (bp0Var == null) {
            if (jp0Var.f <= 0 || yd0Var.g() == 1.0f || nz.l(jp0Var.c.getValue(), jp0Var.b.getValue())) {
                bp0Var = null;
            } else {
                bp0Var = new bp0();
                bp0Var.d = yd0Var.g();
                long j = jp0Var.f;
                bp0Var.g = j;
                bp0Var.h = a50.J((1.0d - yd0Var.g()) * j);
                bp0Var.e.e(yd0Var.g(), 0);
            }
        }
        if (bp0Var != null) {
            bp0Var.g = jp0Var.f;
            jp0Var.m.a(bp0Var);
            cx0Var.n(bp0Var);
        }
        jp0Var.n = null;
    }

    public static final void i(jp0 jp0Var, bp0 bp0Var, long j) {
        long j2 = bp0Var.a + j;
        bp0Var.a = j2;
        long j3 = bp0Var.h;
        if (j2 >= j3) {
            bp0Var.d = 1.0f;
            return;
        }
        kz0 kz0Var = bp0Var.b;
        e7 e7Var = bp0Var.e;
        if (kz0Var != null) {
            e7 e7Var2 = bp0Var.f;
            if (e7Var2 == null) {
                e7Var2 = r;
            }
            bp0Var.d = rg0.f(((e7) kz0Var.j(j2, e7Var, s, e7Var2)).a(0), 0.0f, 1.0f);
            return;
        }
        float a = e7Var.a(0);
        float f = j2 / j3;
        j3 j3Var = dz0.a;
        bp0Var.d = (1.0f * f) + ((1.0f - f) * a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0076, code lost:
    
        if (defpackage.x40.D(r0.getContext()).e(r11, r0) == r7) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object j(jp0 jp0Var, lj ljVar) {
        ep0 ep0Var;
        int i;
        ck ckVar;
        jp0Var.getClass();
        if (ljVar instanceof ep0) {
            ep0Var = (ep0) ljVar;
            int i2 = ep0Var.g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ep0Var.g = i2 - Integer.MIN_VALUE;
                Object obj = ep0Var.e;
                i = ep0Var.g;
                ky0 ky0Var = ky0.a;
                ckVar = ck.d;
                if (i != 0) {
                    rg0.u(obj);
                    if (jp0Var.m.g() && jp0Var.n == null) {
                        return ky0Var;
                    }
                    if (ze0.k(ep0Var.getContext()) == 0.0f) {
                        jp0Var.n();
                        jp0Var.l = Long.MIN_VALUE;
                        return ky0Var;
                    }
                    if (jp0Var.l == Long.MIN_VALUE) {
                        cp0 cp0Var = jp0Var.o;
                        ep0Var.d = jp0Var;
                        ep0Var.g = 1;
                    }
                } else {
                    if (i != 1 && i != 2) {
                        g8.s("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    jp0Var = ep0Var.d;
                    rg0.u(obj);
                }
                do {
                    if (jp0Var.m.h() && jp0Var.n == null) {
                        jp0Var.l = Long.MIN_VALUE;
                        return ky0Var;
                    }
                    ep0Var.d = jp0Var;
                    ep0Var.g = 2;
                } while (jp0Var.m(ep0Var) != ckVar);
                return ckVar;
            }
        }
        ep0Var = new ep0(jp0Var, ljVar);
        Object obj2 = ep0Var.e;
        i = ep0Var.g;
        ky0 ky0Var2 = ky0.a;
        ckVar = ck.d;
        if (i != 0) {
        }
        do {
            if (jp0Var.m.h()) {
            }
            ep0Var.d = jp0Var;
            ep0Var.g = 2;
        } while (jp0Var.m(ep0Var) != ckVar);
        return ckVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0057, code lost:
    
        if (r1.c(r0) == r5) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object k(jp0 jp0Var, lj ljVar) {
        hp0 hp0Var;
        int i;
        ck ckVar;
        Object value;
        Object p;
        jp0 jp0Var2;
        Object obj;
        jp0Var.getClass();
        if (ljVar instanceof hp0) {
            hp0Var = (hp0) ljVar;
            int i2 = hp0Var.h;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hp0Var.h = i2 - Integer.MIN_VALUE;
                Object obj2 = hp0Var.f;
                i = hp0Var.h;
                ckVar = ck.d;
                if (i != 0) {
                    rg0.u(obj2);
                    value = jp0Var.b.getValue();
                    u70 u70Var = jp0Var.j;
                    hp0Var.d = jp0Var;
                    hp0Var.e = value;
                    hp0Var.h = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            g8.s("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        obj = hp0Var.e;
                        jp0Var2 = hp0Var.d;
                        rg0.u(obj2);
                        if (!nz.l(obj2, obj)) {
                            return ky0.a;
                        }
                        jp0Var2.l = Long.MIN_VALUE;
                        throw new CancellationException("targetState while waiting for composition");
                    }
                    Object obj3 = hp0Var.e;
                    jp0 jp0Var3 = hp0Var.d;
                    rg0.u(obj2);
                    value = obj3;
                    jp0Var = jp0Var3;
                }
                hp0Var.d = jp0Var;
                hp0Var.e = value;
                hp0Var.h = 2;
                hc hcVar = new hc(1, d31.B(hp0Var));
                hcVar.q();
                jp0Var.i = hcVar;
                jp0Var.j.d(null);
                p = hcVar.p();
                if (p != ckVar) {
                    jp0Var2 = jp0Var;
                    obj = value;
                    obj2 = p;
                    if (!nz.l(obj2, obj)) {
                    }
                }
                return ckVar;
            }
        }
        hp0Var = new hp0(jp0Var, ljVar);
        Object obj22 = hp0Var.f;
        i = hp0Var.h;
        ckVar = ck.d;
        if (i != 0) {
        }
        hp0Var.d = jp0Var;
        hp0Var.e = value;
        hp0Var.h = 2;
        hc hcVar2 = new hc(1, d31.B(hp0Var));
        hcVar2.q();
        jp0Var.i = hcVar2;
        jp0Var.j.d(null);
        p = hcVar2.p();
        if (p != ckVar) {
        }
        return ckVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object l(jp0 jp0Var, lj ljVar) {
        ip0 ip0Var;
        int i;
        jp0 jp0Var2;
        Object obj;
        Object obj2;
        jp0 jp0Var3;
        jp0Var.getClass();
        if (ljVar instanceof ip0) {
            ip0Var = (ip0) ljVar;
            int i2 = ip0Var.h;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ip0Var.h = i2 - Integer.MIN_VALUE;
                Object obj3 = ip0Var.f;
                i = ip0Var.h;
                ck ckVar = ck.d;
                if (i != 0) {
                    rg0.u(obj3);
                    Object value = jp0Var.b.getValue();
                    u70 u70Var = jp0Var.j;
                    ip0Var.d = jp0Var;
                    ip0Var.e = value;
                    ip0Var.h = 1;
                    if (u70Var.c(ip0Var) != ckVar) {
                        jp0Var2 = jp0Var;
                        obj = value;
                    }
                    return ckVar;
                }
                if (i != 1) {
                    if (i != 2) {
                        g8.s("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj = ip0Var.e;
                    jp0Var3 = ip0Var.d;
                    rg0.u(obj3);
                    if (!nz.l(obj3, obj)) {
                        jp0Var3.l = Long.MIN_VALUE;
                        throw new CancellationException("snapTo() was canceled because state was changed to " + obj3 + " instead of " + obj);
                    }
                    return ky0.a;
                }
                obj = ip0Var.e;
                jp0Var2 = ip0Var.d;
                rg0.u(obj3);
                obj2 = jp0Var2.d;
                u70 u70Var2 = jp0Var2.j;
                if (!nz.l(obj, obj2)) {
                    u70Var2.d(null);
                    return ky0.a;
                }
                ip0Var.d = jp0Var2;
                ip0Var.e = obj;
                ip0Var.h = 2;
                hc hcVar = new hc(1, d31.B(ip0Var));
                hcVar.q();
                jp0Var2.i = hcVar;
                u70Var2.d(null);
                obj3 = hcVar.p();
                if (obj3 != ckVar) {
                    jp0Var3 = jp0Var2;
                    if (!nz.l(obj3, obj)) {
                    }
                    return ky0.a;
                }
                return ckVar;
            }
        }
        ip0Var = new ip0(jp0Var, ljVar);
        Object obj32 = ip0Var.f;
        i = ip0Var.h;
        ck ckVar2 = ck.d;
        if (i != 0) {
        }
        obj2 = jp0Var2.d;
        u70 u70Var22 = jp0Var2.j;
        if (!nz.l(obj, obj2)) {
        }
    }

    @Override // defpackage.bh
    public final Object b() {
        return this.c.getValue();
    }

    @Override // defpackage.bh
    public final Object c() {
        return this.b.getValue();
    }

    @Override // defpackage.bh
    public final void e(Object obj) {
        this.c.setValue(obj);
    }

    @Override // defpackage.bh
    public final void f(cx0 cx0Var) {
        cx0 cx0Var2 = this.e;
        if (cx0Var2 != null && cx0Var != cx0Var2) {
            hh0.b("An instance of SeekableTransitionState has been used in different Transitions. Previous instance: " + this.e + ", new instance: " + cx0Var);
        }
        this.e = cx0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008c A[Catch: all -> 0x009a, TryCatch #0 {all -> 0x009a, blocks: (B:4:0x0010, B:8:0x001a, B:11:0x0084, B:13:0x008c, B:15:0x009c, B:17:0x0091, B:20:0x002b, B:23:0x0037, B:25:0x004c, B:27:0x0058, B:29:0x0062, B:31:0x0072, B:39:0x007e, B:42:0x00a1), top: B:3:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008f  */
    @Override // defpackage.bh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g() {
        int i;
        int i2;
        this.e = null;
        is0 is0Var = (is0) ex0.a.getValue();
        synchronized (is0Var.g) {
            try {
                l70 l70Var = is0Var.f;
                int i3 = l70Var.f;
                int i4 = 0;
                int i5 = 0;
                while (true) {
                    Object[] objArr = l70Var.d;
                    if (i4 < i3) {
                        hs0 hs0Var = (hs0) objArr[i4];
                        w60 w60Var = (w60) hs0Var.f.k(this);
                        if (w60Var != null) {
                            Object[] objArr2 = w60Var.b;
                            int[] iArr = w60Var.c;
                            long[] jArr = w60Var.a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i6 = 0;
                                while (true) {
                                    long j = jArr[i6];
                                    i = i4;
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i7 = 8;
                                        int i8 = 8 - ((~(i6 - length)) >>> 31);
                                        int i9 = 0;
                                        while (i9 < i8) {
                                            if ((j & 255) < 128) {
                                                int i10 = (i6 << 3) + i9;
                                                i2 = i7;
                                                Object obj = objArr2[i10];
                                                int i11 = iArr[i10];
                                                hs0Var.d(this, obj);
                                            } else {
                                                i2 = i7;
                                            }
                                            j >>= i2;
                                            i9++;
                                            i7 = i2;
                                        }
                                        if (i8 != i7) {
                                            break;
                                        }
                                    }
                                    if (i6 == length) {
                                        break;
                                    }
                                    i6++;
                                    i4 = i;
                                }
                                if (hs0Var.f.j()) {
                                    i5++;
                                } else if (i5 > 0) {
                                    Object[] objArr3 = l70Var.d;
                                    objArr3[i - i5] = objArr3[i];
                                }
                                i4 = i + 1;
                            }
                        }
                        i = i4;
                        if (hs0Var.f.j()) {
                        }
                        i4 = i + 1;
                    } else {
                        int i12 = i3 - i5;
                        Arrays.fill(objArr, i12, i3, (Object) null);
                        l70Var.f = i12;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Object m(lj ljVar) {
        float k = ze0.k(ljVar.getContext());
        ky0 ky0Var = ky0.a;
        if (k <= 0.0f) {
            n();
            return ky0Var;
        }
        this.p = k;
        Object e = x40.D(ljVar.getContext()).e(this.q, ljVar);
        return e == ck.d ? e : ky0Var;
    }

    public final void n() {
        cx0 cx0Var = this.e;
        if (cx0Var != null) {
            cx0Var.c();
        }
        this.m.c();
        if (this.n != null) {
            this.n = null;
            q(1.0f);
            p();
        }
    }

    public final Object o(float f, Object obj, fu0 fu0Var) {
        if (0.0f > f || f > 1.0f) {
            hh0.a("Expecting fraction between 0 and 1. Got " + f);
        }
        cx0 cx0Var = this.e;
        if (cx0Var != null) {
            Object a = s70.a(this.k, new gp0(obj, this.b.getValue(), this, cx0Var, f, null), fu0Var);
            if (a == ck.d) {
                return a;
            }
        }
        return ky0.a;
    }

    public final void p() {
        cx0 cx0Var = this.e;
        if (cx0Var == null) {
            return;
        }
        cx0Var.m(a50.J(this.h.g() * ((Number) cx0Var.l.getValue()).longValue()));
    }

    public final void q(float f) {
        this.h.h(f);
    }
}
