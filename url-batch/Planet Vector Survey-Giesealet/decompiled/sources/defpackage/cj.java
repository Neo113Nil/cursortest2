package defpackage;

import java.util.List;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class cj extends fu0 implements qu {
    public final /* synthetic */ int d;
    public int e;
    public /* synthetic */ Object f;
    public Object g;
    public Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cj(Object obj, Object obj2, Object obj3, Object obj4, kj kjVar, int i) {
        super(2, kjVar);
        this.d = i;
        this.g = obj;
        this.h = obj2;
        this.i = obj3;
        this.j = obj4;
    }

    @Override // defpackage.h9
    public final kj create(Object obj, kj kjVar) {
        int i = this.d;
        Object obj2 = this.j;
        Object obj3 = this.i;
        switch (i) {
            case 0:
                cj cjVar = new cj((uy0) this.g, (dj) this.h, (ta) obj3, (zz) obj2, kjVar, 0);
                cjVar.f = obj;
                return cjVar;
            case 1:
                cj cjVar2 = new cj((rg) this.g, (f70) this.h, (yd0) obj3, (f70) obj2, kjVar, 1);
                cjVar2.f = obj;
                return cjVar2;
            case 2:
                cj cjVar3 = new cj((wi0) this.h, (vi0) obj3, (a60) obj2, kjVar);
                cjVar3.f = obj;
                return cjVar3;
            case 3:
                return new cj((jp0) obj3, this.f, (cx0) obj2, kjVar);
            default:
                cj cjVar4 = new cj((ah0) this.g, (pd) this.h, (f2) obj3, (oh0) obj2, kjVar, 4);
                cjVar4.f = obj;
                return cjVar4;
        }
    }

    @Override // defpackage.qu
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        ky0 ky0Var = ky0.a;
        switch (i) {
        }
        return ((cj) create((bk) obj, (kj) obj2)).invokeSuspend(ky0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x01e0, code lost:
    
        if (defpackage.jp0.k(r14, r24) == r15) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01d4, code lost:
    
        if (defpackage.jp0.j(r14, r24) == r15) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x010f, code lost:
    
        if (defpackage.jp0.l(r14, r24) == r15) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00fa, code lost:
    
        if (r4 == r15) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0104, code lost:
    
        r4 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0105, code lost:
    
        if (r4 != r15) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0101, code lost:
    
        if (r4 == r15) goto L46;
     */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x02fe: IF  (r5v1 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) != (r3 I:??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:148:0x0306 (LINE:767), block:B:146:0x02fe */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02a0 A[Catch: all -> 0x0206, LOOP:1: B:128:0x029e->B:129:0x02a0, LOOP_END, TryCatch #2 {all -> 0x0206, blocks: (B:102:0x0201, B:127:0x0291, B:129:0x02a0, B:131:0x02ac), top: B:98:0x01f3 }] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0121  */
    /* JADX WARN: Type inference failed for: r2v9, types: [bb0, int] */
    @Override // defpackage.h9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        y70 y70Var;
        y70 y70Var2;
        zz zzVar;
        zz w;
        bb0 j;
        et0 et0Var;
        rf0 rf0Var;
        rf0 rf0Var2;
        int size;
        int i;
        u6 u6Var;
        u70 u70Var;
        jp0 jp0Var;
        Object m;
        ce0 ce0Var;
        int i2;
        int i3;
        bp0 bp0Var;
        long j2;
        kz0 kz0Var;
        long j3;
        e7 e7Var;
        int i4 = 2;
        int i5 = 1;
        switch (this.d) {
            case 0:
                ta taVar = (ta) this.i;
                dj djVar = (dj) this.h;
                uy0 uy0Var = (uy0) this.g;
                ck ckVar = ck.d;
                int i6 = this.e;
                if (i6 == 0) {
                    rg0.u(obj);
                    xo0 xo0Var = (xo0) this.f;
                    uy0Var.e = dj.j0(djVar, taVar);
                    y5 y5Var = new y5(djVar, (zz) this.j, xo0Var, i4);
                    c9 c9Var = new c9(djVar, uy0Var, taVar, i4);
                    this.e = 1;
                    if (uy0Var.a(y5Var, c9Var, this) == ckVar) {
                        return ckVar;
                    }
                } else {
                    if (i6 != 1) {
                        g8.s("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rg0.u(obj);
                }
                return ky0.a;
            case 1:
                yd0 yd0Var = (yd0) this.i;
                f70 f70Var = (f70) this.j;
                rg rgVar = (rg) this.g;
                f70 f70Var2 = (f70) this.h;
                ck ckVar2 = ck.d;
                int i7 = this.e;
                try {
                    if (i7 == 0) {
                        rg0.u(obj);
                        or orVar = (or) this.f;
                        if (((List) f70Var2.getValue()).size() > 1) {
                            yd0Var.h(0.0f);
                            y70Var = (y70) zd.i0((List) f70Var2.getValue());
                            y70Var.getClass();
                            rgVar.g(y70Var);
                            rgVar.g((y70) ((List) f70Var2.getValue()).get(((List) f70Var2.getValue()).size() - 2));
                        } else {
                            y70Var = null;
                        }
                        t6 t6Var = new t6(f70Var2, f70Var, yd0Var);
                        this.f = y70Var;
                        this.e = 1;
                        if (orVar.a(t6Var, this) == ckVar2) {
                            return ckVar2;
                        }
                        y70Var2 = y70Var;
                    } else {
                        if (i7 != 1) {
                            g8.s("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y70Var2 = (y70) this.f;
                        rg0.u(obj);
                    }
                    if (((List) f70Var2.getValue()).size() > 1) {
                        f70Var.setValue(Boolean.FALSE);
                        y70Var2.getClass();
                        rgVar.e(y70Var2, false);
                    }
                } catch (CancellationException unused) {
                    if (((List) f70Var2.getValue()).size() > 1) {
                        f70Var.setValue(Boolean.FALSE);
                    }
                }
                return ky0.a;
            case 2:
                ck ckVar3 = ck.d;
                ?? r2 = this.e;
                try {
                    if (r2 == 0) {
                        rg0.u(obj);
                        w = nk.w(((bk) this.f).f());
                        wi0.x((wi0) this.h, w);
                        j = yc0.j(new sh(i5, (wi0) this.h));
                        pg0 pg0Var = ((wi0) this.h).w;
                        do {
                            et0Var = wi0.x;
                            rf0Var = (rf0) et0Var.getValue();
                            b2 b2Var = b2.z;
                            hf0 hf0Var = rf0Var.f;
                            if (hf0Var.containsKey(pg0Var)) {
                                rf0Var2 = rf0Var;
                            } else if (rf0Var.isEmpty()) {
                                rf0Var2 = new rf0(pg0Var, pg0Var, hf0Var.a(pg0Var, new h30(b2Var, b2Var)));
                            } else {
                                Object obj2 = rf0Var.e;
                                Object obj3 = hf0Var.get(obj2);
                                obj3.getClass();
                                rf0Var2 = new rf0(rf0Var.d, pg0Var, hf0Var.a(obj2, new h30(((h30) obj3).a, pg0Var)).a(pg0Var, new h30(obj2, b2Var)));
                            }
                            if (rf0Var != rf0Var2) {
                            }
                            List u = wi0.u((wi0) this.h);
                            size = u.size();
                            for (i = 0; i < size; i++) {
                                ((bi) u.get(i)).o();
                            }
                            u6Var = new u6((vi0) this.i, (a60) this.j, (kj) null, 8);
                            this.f = w;
                            this.g = j;
                            this.e = 1;
                            if (x40.v(u6Var, this) == ckVar3) {
                                return ckVar3;
                            }
                        } while (!et0Var.i(rf0Var, rf0Var2));
                        List u2 = wi0.u((wi0) this.h);
                        size = u2.size();
                        while (i < size) {
                        }
                        u6Var = new u6((vi0) this.i, (a60) this.j, (kj) null, 8);
                        this.f = w;
                        this.g = j;
                        this.e = 1;
                        if (x40.v(u6Var, this) == ckVar3) {
                        }
                    } else {
                        if (r2 != 1) {
                            g8.s("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        j = (bb0) this.g;
                        w = (zz) this.f;
                        rg0.u(obj);
                    }
                    j.b();
                    wi0 wi0Var = (wi0) this.h;
                    synchronized (wi0Var.b) {
                        try {
                            if (wi0Var.c == w) {
                                wi0Var.c = null;
                            }
                            wi0Var.A();
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    et0 et0Var2 = wi0.x;
                    pg0.e(((wi0) this.h).w);
                    return ky0.a;
                } catch (Throwable th2) {
                    r2.b();
                    wi0 wi0Var2 = (wi0) this.h;
                    synchronized (wi0Var2.b) {
                        try {
                            if (wi0Var2.c == zzVar) {
                                wi0Var2.c = null;
                            }
                            wi0Var2.A();
                            et0 et0Var3 = wi0.x;
                            pg0.e(((wi0) this.h).w);
                            throw th2;
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            case 3:
                e7 e7Var2 = jp0.s;
                ky0 ky0Var = ky0.a;
                cx0 cx0Var = (cx0) this.j;
                e7 e7Var3 = jp0.r;
                Object obj4 = this.f;
                jp0 jp0Var2 = (jp0) this.i;
                ck ckVar4 = ck.d;
                int i8 = this.e;
                try {
                    if (i8 == 0) {
                        rg0.u(obj);
                        Object value = jp0Var2.b.getValue();
                        if (!obj4.equals(value)) {
                            jp0.h(jp0Var2);
                            jp0Var2.q(0.0f);
                            cx0Var.q(obj4);
                            cx0Var.o(0L);
                            jp0Var2.e(value);
                            jp0Var2.b.setValue(obj4);
                        }
                        u70Var = jp0Var2.j;
                        this.g = u70Var;
                        this.h = jp0Var2;
                        this.e = 1;
                        if (u70Var.c(this) != ckVar4) {
                            jp0Var = jp0Var2;
                        }
                        return ckVar4;
                    }
                    if (i8 == 1) {
                        jp0Var = (jp0) this.h;
                        u70Var = (u70) this.g;
                        rg0.u(obj);
                    } else if (i8 == 2) {
                        rg0.u(obj);
                        this.e = 3;
                        break;
                    } else {
                        if (i8 == 3) {
                            rg0.u(obj);
                            ce0Var = jp0Var2.c;
                            yd0 yd0Var2 = jp0Var2.h;
                            if (!nz.l(ce0Var.getValue(), obj4)) {
                                if (yd0Var2.g() >= 1.0f || ((bp0Var = jp0Var2.n) != null && nz.l(null, bp0Var.b))) {
                                    i2 = 4;
                                    i3 = 5;
                                } else {
                                    if (bp0Var != null) {
                                        kz0Var = bp0Var.b;
                                        j2 = 0;
                                    } else {
                                        j2 = 0;
                                        kz0Var = null;
                                    }
                                    if (kz0Var != null) {
                                        long j4 = j2;
                                        long j5 = bp0Var.a;
                                        e7 e7Var4 = bp0Var.e;
                                        e7 e7Var5 = bp0Var.f;
                                        e7 e7Var6 = e7Var5 == null ? e7Var3 : e7Var5;
                                        j3 = j4;
                                        e7Var = (e7) kz0Var.g(j5, e7Var4, e7Var2, e7Var6);
                                        i3 = 5;
                                        i2 = 4;
                                    } else {
                                        e7 e7Var7 = e7Var3;
                                        j3 = j2;
                                        i2 = 4;
                                        i3 = 5;
                                        if (bp0Var != null && bp0Var.a != j3) {
                                            long j6 = bp0Var.g;
                                            if (j6 == Long.MIN_VALUE) {
                                                j6 = jp0Var2.f;
                                            }
                                            float f = j6 / 1.0E9f;
                                            if (f > 0.0f) {
                                                e7Var7 = new e7(1.0f / f);
                                            }
                                        }
                                        e7Var = e7Var7;
                                    }
                                    if (bp0Var == null) {
                                        bp0Var = new bp0();
                                    }
                                    e7 e7Var8 = bp0Var.e;
                                    bp0Var.b = null;
                                    bp0Var.c = false;
                                    bp0Var.d = yd0Var2.g();
                                    e7Var8.e(yd0Var2.g(), 0);
                                    long j7 = jp0Var2.f;
                                    bp0Var.g = j7;
                                    bp0Var.a = j3;
                                    bp0Var.f = e7Var;
                                    bp0Var.h = a50.J((1.0d - yd0Var2.g()) * j7);
                                    jp0Var2.n = bp0Var;
                                }
                                this.g = null;
                                this.h = null;
                                this.e = i2;
                                break;
                            }
                            return ky0Var;
                        }
                        if (i8 != 4) {
                            if (i8 != 5) {
                                g8.s("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            rg0.u(obj);
                            jp0Var2.q(0.0f);
                            return ky0Var;
                        }
                        rg0.u(obj);
                        i3 = 5;
                        jp0Var2.e(obj4);
                        this.e = i3;
                        break;
                    }
                    Object obj5 = jp0Var.d;
                    u70Var.d(null);
                    if (!obj4.equals(obj5)) {
                        this.g = null;
                        this.h = null;
                        this.e = 2;
                        if (jp0Var2.l == Long.MIN_VALUE) {
                            m = x40.D(getContext()).e(jp0Var2.o, this);
                            break;
                        } else {
                            m = jp0Var2.m(this);
                            break;
                        }
                        jp0Var2.q(0.0f);
                        return ky0Var;
                    }
                    ce0Var = jp0Var2.c;
                    yd0 yd0Var22 = jp0Var2.h;
                    if (!nz.l(ce0Var.getValue(), obj4)) {
                    }
                    return ky0Var;
                } catch (Throwable th4) {
                    u70Var.d(null);
                    throw th4;
                }
            default:
                ck ckVar5 = ck.d;
                int i9 = this.e;
                if (i9 == 0) {
                    rg0.u(obj);
                    bk bkVar = (bk) this.f;
                    ah0 ah0Var = (ah0) this.g;
                    wu0 wu0Var = new wu0(bkVar, (pd) this.h, (f2) this.i, (oh0) this.j, null);
                    this.e = 1;
                    if (d31.k(ah0Var, wu0Var, this) == ckVar5) {
                        return ckVar5;
                    }
                } else {
                    if (i9 != 1) {
                        g8.s("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rg0.u(obj);
                }
                return ky0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cj(jp0 jp0Var, Object obj, cx0 cx0Var, kj kjVar) {
        super(2, kjVar);
        this.d = 3;
        this.i = jp0Var;
        this.f = obj;
        this.j = cx0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cj(wi0 wi0Var, vi0 vi0Var, a60 a60Var, kj kjVar) {
        super(2, kjVar);
        this.d = 2;
        this.h = wi0Var;
        this.i = vi0Var;
        this.j = a60Var;
    }
}
