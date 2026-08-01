package defpackage;

import java.util.List;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class u6 extends fu0 implements qu {
    public final /* synthetic */ int d;
    public int e;
    public Object f;
    public Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u6(jp0 jp0Var, f70 f70Var, yd0 yd0Var, kj kjVar) {
        super(2, kjVar);
        this.d = 7;
        this.f = jp0Var;
        this.h = f70Var;
        this.g = yd0Var;
    }

    @Override // defpackage.h9
    public final kj create(Object obj, kj kjVar) {
        int i = this.d;
        Object obj2 = this.h;
        switch (i) {
            case 0:
                u6 u6Var = new u6((cx0) this.g, (f70) obj2, kjVar, 0);
                u6Var.f = obj;
                return u6Var;
            case 1:
                return new u6((pa) this.f, (ea0) this.g, (bu) obj2, kjVar, 1);
            case 2:
                u6 u6Var2 = new u6((pr) this.g, (vc) obj2, kjVar, 2);
                u6Var2.f = obj;
                return u6Var2;
            case 3:
                return new u6((il0) this.f, (cf) this.g, (qh0) obj2, kjVar, 3);
            case 4:
                u6 u6Var3 = new u6((jl) this.g, (u6) obj2, kjVar, 4);
                u6Var3.f = obj;
                return u6Var3;
            case 5:
                return new u6((r60) this.f, (kz) this.g, (bn) obj2, kjVar, 5);
            case 6:
                return new u6((eb) obj2, kjVar, 6);
            case 7:
                return new u6((jp0) this.f, (f70) obj2, (yd0) this.g, kjVar);
            case 8:
                u6 u6Var4 = new u6((vi0) this.g, (a60) obj2, kjVar, 8);
                u6Var4.f = obj;
                return u6Var4;
            case 9:
                u6 u6Var5 = new u6((r60) this.g, (i5) obj2, kjVar, 9);
                u6Var5.f = obj;
                return u6Var5;
            case 10:
                u6 u6Var6 = new u6((bo) this.g, (zo0) obj2, kjVar, 10);
                u6Var6.f = obj;
                return u6Var6;
            case 11:
                u6 u6Var7 = new u6((zo0) this.g, (qu) obj2, kjVar, 11);
                u6Var7.f = obj;
                return u6Var7;
            case 12:
                u6 u6Var8 = new u6((rj) this.g, (or) obj2, kjVar, 12);
                u6Var8.f = obj;
                return u6Var8;
            case 13:
                return new u6((pd) this.f, (oh0) this.g, (wg0) obj2, kjVar, 13);
            default:
                return new u6((jp0) obj2, kjVar, 14);
        }
    }

    @Override // defpackage.qu
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        ky0 ky0Var = ky0.a;
        switch (i) {
        }
        return ((u6) create((bk) obj, (kj) obj2)).invokeSuspend(ky0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:238:0x0442, code lost:
    
        if (r11 == r5) goto L231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00dd, code lost:
    
        if (r0.a(r1, r11) == r6) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:?, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ed, code lost:
    
        if (defpackage.d31.K(r5, r2, r11) == r6) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0242 A[Catch: all -> 0x0216, TryCatch #3 {all -> 0x0216, blocks: (B:115:0x0212, B:116:0x023a, B:118:0x0242, B:119:0x024f, B:126:0x025f, B:128:0x022c, B:132:0x0262, B:136:0x0267, B:137:0x0268, B:144:0x0226, B:121:0x0250, B:123:0x0256), top: B:111:0x0206, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0269  */
    /* JADX WARN: Type inference failed for: r5v11, types: [tc] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:113:0x0236 -> B:100:0x023a). Please report as a decompilation issue!!! */
    @Override // defpackage.h9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        eb ebVar;
        db dbVar;
        boolean z;
        u70 u70Var;
        int i = 2;
        int i2 = 0;
        boolean z2 = false;
        switch (this.d) {
            case 0:
                cx0 cx0Var = (cx0) this.g;
                ck ckVar = ck.d;
                int i3 = this.e;
                if (i3 == 0) {
                    rg0.u(obj);
                    vh0 vh0Var = (vh0) this.f;
                    pm0 pm0Var = new pm0(new ds0(new s6(cx0Var, 0), null));
                    t6 t6Var = new t6(vh0Var, cx0Var, (f70) this.h, i2);
                    this.e = 1;
                    if (pm0Var.a(t6Var, this) == ckVar) {
                        return ckVar;
                    }
                } else {
                    if (i3 != 1) {
                        g8.s("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rg0.u(obj);
                }
                return ky0.a;
            case 1:
                ky0 ky0Var = ky0.a;
                pa paVar = (pa) this.f;
                ck ckVar2 = ck.d;
                int i4 = this.e;
                if (i4 == 0) {
                    rg0.u(obj);
                    dj djVar = paVar.r;
                    na naVar = new na(paVar, (ea0) this.g, (bu) this.h);
                    this.e = 1;
                    djVar.getClass();
                    zi0 zi0Var = (zi0) naVar.a();
                    if (zi0Var != null && !djVar.l0(zi0Var, djVar.y)) {
                        hc hcVar = new hc(1, d31.B(this));
                        hcVar.q();
                        bj bjVar = new bj(naVar, hcVar);
                        p01 p01Var = djVar.u;
                        l70 l70Var = (l70) p01Var.e;
                        zi0 zi0Var2 = (zi0) naVar.a();
                        if (zi0Var2 == null) {
                            hcVar.resumeWith(ky0Var);
                        } else {
                            hcVar.s(new y3(9, p01Var, bjVar));
                            int i5 = new ez(0, l70Var.f - 1, 1).e;
                            if (i5 >= 0) {
                                while (true) {
                                    zi0 zi0Var3 = (zi0) ((bj) l70Var.d[i5]).a.a();
                                    if (zi0Var3 != null) {
                                        zi0 c = zi0Var2.c(zi0Var3);
                                        if (c.equals(zi0Var2)) {
                                            l70Var.a(i5 + 1, bjVar);
                                        } else if (!c.equals(zi0Var3)) {
                                            CancellationException cancellationException = new CancellationException("bringIntoView call interrupted by a newer, non-overlapping call");
                                            int i6 = l70Var.f - 1;
                                            if (i6 <= i5) {
                                                while (true) {
                                                    ((bj) l70Var.d[i5]).b.j(cancellationException);
                                                    if (i6 != i5) {
                                                        i6++;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    if (i5 != 0) {
                                        i5--;
                                    }
                                }
                            }
                            l70Var.a(0, bjVar);
                            if (!djVar.z) {
                                djVar.m0();
                            }
                        }
                        obj2 = hcVar.p();
                        break;
                    }
                    obj2 = ky0Var;
                    if (obj2 == ckVar2) {
                        return ckVar2;
                    }
                } else {
                    if (i4 != 1) {
                        g8.s("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rg0.u(obj);
                }
                return ky0Var;
            case 2:
                ky0 ky0Var2 = ky0.a;
                ck ckVar3 = ck.d;
                int i7 = this.e;
                if (i7 == 0) {
                    rg0.u(obj);
                    bk bkVar = (bk) this.f;
                    pr prVar = (pr) this.g;
                    tc g = ((vc) this.h).g(bkVar);
                    this.e = 1;
                    Object w = px0.w(prVar, g, true, this);
                    if (w != ckVar3) {
                        w = ky0Var2;
                    }
                    if (w == ckVar3) {
                        return ckVar3;
                    }
                } else {
                    if (i7 != 1) {
                        g8.s("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rg0.u(obj);
                }
                return ky0Var2;
            case 3:
                qh0 qh0Var = (qh0) this.h;
                cf cfVar = (cf) this.g;
                a70 a70Var = cfVar.B;
                ck ckVar4 = ck.d;
                int i8 = this.e;
                try {
                    if (i8 == 0) {
                        rg0.u(obj);
                        il0 il0Var = (il0) this.f;
                        this.e = 1;
                        if (il0Var.a(this) == ckVar4) {
                            return ckVar4;
                        }
                    } else {
                        if (i8 != 1) {
                            g8.s("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        rg0.u(obj);
                    }
                    a70Var.k(qh0Var);
                    mz.H(cfVar);
                    return ky0.a;
                } catch (Throwable th) {
                    a70Var.k(qh0Var);
                    mz.H(cfVar);
                    throw th;
                }
            case 4:
                ce0 ce0Var = ((jl) this.g).d;
                ck ckVar5 = ck.d;
                int i9 = this.e;
                try {
                    if (i9 == 0) {
                        rg0.u(obj);
                        do0 do0Var = (do0) this.f;
                        ce0Var.setValue(Boolean.TRUE);
                        u6 u6Var = (u6) this.h;
                        this.e = 1;
                        if (u6Var.invoke(do0Var, this) == ckVar5) {
                            return ckVar5;
                        }
                    } else {
                        if (i9 != 1) {
                            g8.s("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        rg0.u(obj);
                    }
                    ce0Var.setValue(Boolean.FALSE);
                    return ky0.a;
                } catch (Throwable th2) {
                    ce0Var.setValue(Boolean.FALSE);
                    throw th2;
                }
            case 5:
                ck ckVar6 = ck.d;
                int i10 = this.e;
                if (i10 == 0) {
                    rg0.u(obj);
                    r60 r60Var = (r60) this.f;
                    kz kzVar = (kz) this.g;
                    this.e = 1;
                    if (r60Var.a(kzVar, this) == ckVar6) {
                        return ckVar6;
                    }
                } else {
                    if (i10 != 1) {
                        g8.s("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rg0.u(obj);
                }
                bn bnVar = (bn) this.h;
                if (bnVar != null) {
                    bnVar.a();
                }
                return ky0.a;
            case 6:
                ck ckVar7 = ck.d;
                int i11 = this.e;
                try {
                    if (i11 == 0) {
                        rg0.u(obj);
                        ebVar = (eb) this.h;
                        dbVar = new db(ebVar);
                        this.f = ebVar;
                        this.g = dbVar;
                        this.e = 1;
                        obj = dbVar.b(this);
                        ebVar = ebVar;
                        if (obj == ckVar7) {
                        }
                        if (((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i11 != 1) {
                            g8.s("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        dbVar = (db) this.g;
                        ?? r5 = (tc) this.f;
                        rg0.u(obj);
                        ebVar = r5;
                        if (((Boolean) obj).booleanValue()) {
                            kv.b.set(false);
                            synchronized (ur0.c) {
                                b70 b70Var = ur0.j.h;
                                z = b70Var != null && b70Var.h();
                            }
                            if (z) {
                                ur0.a();
                            }
                            this.f = ebVar;
                            this.g = dbVar;
                            this.e = 1;
                            obj = dbVar.b(this);
                            ebVar = ebVar;
                            if (obj == ckVar7) {
                                return ckVar7;
                            }
                            if (((Boolean) obj).booleanValue()) {
                                ebVar.a(null);
                                return ky0.a;
                            }
                        }
                    }
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        CancellationException cancellationException2 = th3 instanceof CancellationException ? th3 : null;
                        if (cancellationException2 == null) {
                            cancellationException2 = new CancellationException("Channel was consumed, consumer had failed");
                            cancellationException2.initCause(th3);
                        }
                        ebVar.a(cancellationException2);
                        throw th4;
                    }
                }
                break;
            case 7:
                f70 f70Var = (f70) this.h;
                ck ckVar8 = ck.d;
                int i12 = this.e;
                if (i12 == 0) {
                    rg0.u(obj);
                    y70 y70Var = (y70) ((List) f70Var.getValue()).get(((List) f70Var.getValue()).size() - 2);
                    jp0 jp0Var = (jp0) this.f;
                    float g2 = ((yd0) this.g).g();
                    this.e = 1;
                    if (jp0Var.o(g2, y70Var, this) == ckVar8) {
                        return ckVar8;
                    }
                } else {
                    if (i12 != 1) {
                        g8.s("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rg0.u(obj);
                }
                return ky0.a;
            case 8:
                ck ckVar9 = ck.d;
                int i13 = this.e;
                if (i13 != 0) {
                    if (i13 == 1) {
                        rg0.u(obj);
                        return ky0.a;
                    }
                    g8.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                rg0.u(obj);
                bk bkVar2 = (bk) this.f;
                vi0 vi0Var = (vi0) this.g;
                a60 a60Var = (a60) this.h;
                this.e = 1;
                vi0Var.b(bkVar2, a60Var, this);
                return ckVar9;
            case 9:
                ck ckVar10 = ck.d;
                int i14 = this.e;
                if (i14 != 0) {
                    if (i14 == 1) {
                        rg0.u(obj);
                        return ky0.a;
                    }
                    g8.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                rg0.u(obj);
                bk bkVar3 = (bk) this.f;
                zq0 zq0Var = ((r60) this.g).a;
                fn fnVar = new fn((i5) this.h, bkVar3, i);
                this.e = 1;
                zq0Var.getClass();
                zq0.j(zq0Var, fnVar, this);
                return ckVar10;
            case 10:
                ck ckVar11 = ck.d;
                int i15 = this.e;
                if (i15 == 0) {
                    rg0.u(obj);
                    xo0 xo0Var = (xo0) this.f;
                    bo boVar = (bo) this.g;
                    y3 y3Var = new y3(18, xo0Var, (zo0) this.h);
                    this.e = 1;
                    if (boVar.invoke(y3Var, this) == ckVar11) {
                        return ckVar11;
                    }
                } else {
                    if (i15 != 1) {
                        g8.s("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rg0.u(obj);
                }
                return ky0.a;
            case 11:
                ck ckVar12 = ck.d;
                int i16 = this.e;
                if (i16 == 0) {
                    rg0.u(obj);
                    do0 do0Var2 = (do0) this.f;
                    zo0 zo0Var = (zo0) this.g;
                    zo0Var.h = do0Var2;
                    qu quVar = (qu) this.h;
                    xo0 xo0Var2 = zo0Var.i;
                    this.e = 1;
                    if (quVar.invoke(xo0Var2, this) == ckVar12) {
                        return ckVar12;
                    }
                } else {
                    if (i16 != 1) {
                        g8.s("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rg0.u(obj);
                }
                return ky0.a;
            case 12:
                or orVar = (or) this.h;
                rj rjVar = (rj) this.g;
                ck ckVar13 = ck.d;
                int i17 = this.e;
                if (i17 == 0) {
                    rg0.u(obj);
                    vh0 vh0Var2 = (vh0) this.f;
                    if (!nz.l(rjVar, up.d)) {
                        c cVar = new c(orVar, vh0Var2, z2 ? 1 : 0, 12);
                        this.e = 2;
                        break;
                    } else {
                        cs0 cs0Var = new cs0(vh0Var2, 0);
                        this.e = 1;
                        break;
                    }
                } else {
                    if (i17 != 1 && i17 != 2) {
                        g8.s("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rg0.u(obj);
                }
                return ky0.a;
            case 13:
                ky0 ky0Var3 = ky0.a;
                ck ckVar14 = ck.d;
                int i18 = this.e;
                if (i18 == 0) {
                    rg0.u(obj);
                    pd pdVar = (pd) this.f;
                    oh0 oh0Var = (oh0) this.g;
                    long j = ((wg0) this.h).c;
                    this.e = 1;
                    pd pdVar2 = new pd(pdVar.g, this);
                    pdVar2.e = oh0Var;
                    pdVar2.f = j;
                    if (pdVar2.invokeSuspend(ky0Var3) == ckVar14) {
                        return ckVar14;
                    }
                } else {
                    if (i18 != 1) {
                        g8.s("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rg0.u(obj);
                }
                return ky0Var3;
            default:
                jp0 jp0Var2 = (jp0) this.h;
                ck ckVar15 = ck.d;
                int i19 = this.e;
                if (i19 == 0) {
                    rg0.u(obj);
                    ((is0) ex0.a.getValue()).b(jp0Var2, j80.F, jp0Var2.g);
                    u70 u70Var2 = jp0Var2.j;
                    this.f = u70Var2;
                    this.g = jp0Var2;
                    this.e = 1;
                    if (u70Var2.c(this) == ckVar15) {
                        return ckVar15;
                    }
                    u70Var = u70Var2;
                } else {
                    if (i19 != 1) {
                        g8.s("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    jp0Var2 = (jp0) this.g;
                    u70Var = (u70) this.f;
                    rg0.u(obj);
                }
                try {
                    jp0Var2.d = jp0Var2.c();
                    hc hcVar2 = jp0Var2.i;
                    if (hcVar2 != null) {
                        hcVar2.resumeWith(jp0Var2.c());
                    }
                    jp0Var2.i = null;
                    u70Var.d(null);
                    return ky0.a;
                } catch (Throwable th5) {
                    u70Var.d(null);
                    throw th5;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u6(Object obj, kj kjVar, int i) {
        super(2, kjVar);
        this.d = i;
        this.h = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u6(Object obj, Object obj2, kj kjVar, int i) {
        super(2, kjVar);
        this.d = i;
        this.g = obj;
        this.h = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u6(Object obj, Object obj2, Object obj3, kj kjVar, int i) {
        super(2, kjVar);
        this.d = i;
        this.f = obj;
        this.g = obj2;
        this.h = obj3;
    }
}
