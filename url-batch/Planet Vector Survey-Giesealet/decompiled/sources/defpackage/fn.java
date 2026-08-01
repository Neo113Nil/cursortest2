package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class fn implements pr {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public fn(gn gnVar, gj0 gj0Var, pr prVar) {
        this.d = 0;
        this.e = gj0Var;
        this.f = prVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0142  */
    @Override // defpackage.pr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(Object obj, kj kjVar) {
        en enVar;
        int i;
        yr yrVar;
        Object obj2;
        int i2;
        fn fnVar = this;
        Object obj3 = obj;
        int i3 = fnVar.d;
        ck ckVar = ck.d;
        Object obj4 = fnVar.e;
        ky0 ky0Var = ky0.a;
        Object obj5 = fnVar.f;
        switch (i3) {
            case 0:
                gj0 gj0Var = (gj0) obj4;
                if (kjVar instanceof en) {
                    enVar = (en) kjVar;
                    int i4 = enVar.f;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        enVar.f = i4 - Integer.MIN_VALUE;
                        Object obj6 = enVar.d;
                        i = enVar.f;
                        if (i != 0) {
                            rg0.u(obj6);
                            Object obj7 = gj0Var.d;
                            if (obj7 == d31.e || !nz.l(obj7, obj3)) {
                                gj0Var.d = obj3;
                                enVar.f = 1;
                                if (((pr) obj5).e(obj3, enVar) == ckVar) {
                                    return ckVar;
                                }
                            }
                        } else {
                            if (i != 1) {
                                g8.s("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            rg0.u(obj6);
                        }
                        return ky0Var;
                    }
                }
                enVar = new en(fnVar, kjVar);
                Object obj62 = enVar.d;
                i = enVar.f;
                if (i != 0) {
                }
                return ky0Var;
            case 1:
                if (kjVar instanceof yr) {
                    yrVar = (yr) kjVar;
                    int i5 = yrVar.f;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        yrVar.f = i5 - Integer.MIN_VALUE;
                        obj2 = yrVar.e;
                        i2 = yrVar.f;
                        if (i2 != 0) {
                            rg0.u(obj2);
                            yrVar.d = fnVar;
                            yrVar.h = obj3;
                            yrVar.f = 1;
                            obj2 = ((qu) obj5).invoke(obj3, yrVar);
                            if (obj2 == ckVar) {
                                return ckVar;
                            }
                        } else {
                            if (i2 != 1) {
                                g8.s("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            Object obj8 = yrVar.h;
                            fn fnVar2 = yrVar.d;
                            rg0.u(obj2);
                            obj3 = obj8;
                            fnVar = fnVar2;
                        }
                        if (((Boolean) obj2).booleanValue()) {
                            return ky0Var;
                        }
                        ((gj0) fnVar.e).d = obj3;
                        throw new a(fnVar);
                    }
                }
                yrVar = new yr(fnVar, kjVar);
                obj2 = yrVar.e;
                i2 = yrVar.f;
                if (i2 != 0) {
                }
                if (((Boolean) obj2).booleanValue()) {
                }
            case 2:
                kz kzVar = (kz) obj3;
                i5 i5Var = (i5) obj4;
                if (kzVar instanceof qh0) {
                    qh0 qh0Var = (qh0) kzVar;
                    kl0 kl0Var = i5Var.k;
                    if (kl0Var == null) {
                        kl0Var = sl0.a(i5Var.j);
                        i5Var.k = kl0Var;
                    }
                    ml0 a = kl0Var.a(i5Var);
                    a.b(qh0Var, i5Var.f, i5Var.n, i5Var.o, ((ge) i5Var.h.getValue()).a, ((el0) i5Var.i.getValue()).d, i5Var.p);
                    i5Var.l.setValue(a);
                } else if (kzVar instanceof rh0) {
                    ml0 ml0Var = (ml0) i5Var.l.getValue();
                    if (ml0Var != null) {
                        ml0Var.d();
                    }
                } else if (kzVar instanceof ph0) {
                    ml0 ml0Var2 = (ml0) i5Var.l.getValue();
                    if (ml0Var2 != null) {
                        ml0Var2.d();
                    }
                } else {
                    i5Var.e.d(kzVar, (bk) obj5);
                }
                return ky0Var;
            default:
                kz kzVar2 = (kz) obj3;
                pl0 pl0Var = (pl0) obj4;
                if (!(kzVar2 instanceof sh0)) {
                    bk bkVar = (bk) obj5;
                    w4 w4Var = pl0Var.w;
                    if (w4Var == null) {
                        w4Var = new w4(pl0Var.s, pl0Var.v);
                        mz.H(pl0Var);
                        pl0Var.w = w4Var;
                    }
                    w4Var.d(kzVar2, bkVar);
                } else if (pl0Var.z) {
                    pl0Var.l0((sh0) kzVar2);
                } else {
                    pl0Var.A.a(kzVar2);
                }
                return ky0Var;
        }
    }

    public /* synthetic */ fn(Object obj, bk bkVar, int i) {
        this.d = i;
        this.e = obj;
        this.f = bkVar;
    }

    public fn(qu quVar, gj0 gj0Var) {
        this.d = 1;
        this.f = quVar;
        this.e = gj0Var;
    }
}
