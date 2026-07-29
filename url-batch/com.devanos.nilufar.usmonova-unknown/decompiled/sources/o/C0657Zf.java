package o;

import java.util.List;

/* renamed from: o.Zf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0657Zf implements InterfaceC1972tf {
    public final IF h;
    public final C0218Ih i;
    public final InterfaceC0422Qe j;
    public final EL k;
    public final C1818rJ l;
    public final C0081Da m;
    public final Y1 n;

    /* renamed from: o, reason: collision with root package name */
    public final C1334k f136o;
    public final BU p;
    public final BU q;
    public final C1334k r;

    public C0657Zf(IF r9, List list, C0218Ih c0218Ih, InterfaceC0422Qe interfaceC0422Qe) {
        this.h = r9;
        this.i = c0218Ih;
        this.j = interfaceC0422Qe;
        C1818rJ c1818rJ = new C1818rJ(new C0527Uf(this, null));
        C1894sT c1894sT = new C1894sT(AbstractC1976tj.a(), AbstractC1976tj.a());
        n30 m = AbstractC1305jX.m(c1818rJ, 0);
        int i = m.a;
        H8 h8 = (H8) m.c;
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC2188wx.g(i, "extraBufferCapacity cannot be negative, but was ").toString());
        }
        H8 h82 = H8.h;
        if (i <= 0 && h8 != h82) {
            throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + h8).toString());
        }
        C1299jR c1299jR = new C1299jR(0, i < 0 ? Integer.MAX_VALUE : i, h8);
        InterfaceC0189He interfaceC0189He = (InterfaceC0189He) m.d;
        InterfaceC2243xm interfaceC2243xm = (InterfaceC2243xm) m.b;
        C0457Rn c0457Rn = AbstractC0868ct.j;
        EnumC0500Te enumC0500Te = c1894sT.equals(C1497mR.a) ? EnumC0500Te.h : EnumC0500Te.k;
        C0508Tm c0508Tm = new C0508Tm(c1894sT, interfaceC2243xm, c1299jR, c0457Rn, null);
        InterfaceC0189He t = AbstractC0946e20.t(interfaceC0422Qe.m(), interfaceC0189He, true);
        C0191Hg c0191Hg = AbstractC0115Ei.a;
        if (t != c0191Hg && t.k(C0460Rq.w) == null) {
            t = t.D(c0191Hg);
        }
        AbstractC1993u c1597nz = enumC0500Te == EnumC0500Te.i ? new C1597nz(t, c0508Tm) : new C0908dT(t, true);
        c1597nz.c0(enumC0500Te, c1597nz, c0508Tm);
        this.k = new EL(c1299jR);
        this.l = new C1818rJ(new C0242Jf(this, null));
        this.m = new C0081Da(new C0086Df(this, null), C1188hk.h, -2, h82);
        this.n = new Y1(19);
        this.f136o = new C1334k(this, list);
        this.p = EB.D(new C2302yf(this, 1));
        this.q = EB.D(new C2302yf(this, 0));
        this.r = new C1334k(interfaceC0422Qe, new C1400l(13, this), new C0579Wf(this, null));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|(7:55|(1:(1:(1:59)(2:61|62))(3:63|64|65))(1:66)|60|17|(1:19)(1:23)|20|21)(5:8|9|10|(3:12|13|14)(3:30|(1:32)(1:53)|(2:34|(2:36|(1:38))(2:45|46))(2:47|(2:49|50)(2:51|52)))|24)|39|40|41))|68|6|(0)(0)|39|40|41|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0076, code lost:
    
        if (r9 == r6) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0079, code lost:
    
        r8 = r11;
        r11 = r9;
        r9 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ba, code lost:
    
        if (r9 != r6) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00bd, code lost:
    
        r9 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0024 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0052  */
    /* JADX WARN: Type inference failed for: r1v3, types: [o.xU, o.yp] */
    /* JADX WARN: Type inference failed for: r1v9, types: [o.xU, o.yp] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(C0657Zf c0657Zf, BC bc, AbstractC2367ze abstractC2367ze) {
        C0138Ff c0138Ff;
        int i;
        InterfaceC2233xc interfaceC2233xc;
        C2299yc c2299yc;
        C0657Zf c0657Zf2;
        Object b;
        InterfaceC2233xc interfaceC2233xc2;
        Throwable a;
        if (abstractC2367ze instanceof C0138Ff) {
            c0138Ff = (C0138Ff) abstractC2367ze;
            int i2 = c0138Ff.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0138Ff.m = i2 - Integer.MIN_VALUE;
                Object obj = c0138Ff.k;
                i = c0138Ff.m;
                boolean z = true;
                EnumC0448Re enumC0448Re = EnumC0448Re.h;
                if (i == 0) {
                    try {
                        if (i == 1) {
                            interfaceC2233xc = (InterfaceC2233xc) c0138Ff.h;
                        } else if (i == 2) {
                            C2299yc c2299yc2 = c0138Ff.j;
                            C0657Zf c0657Zf3 = c0138Ff.i;
                            BC bc2 = (BC) c0138Ff.h;
                            AbstractC1494mO.l(obj);
                            c2299yc = c2299yc2;
                            c0657Zf2 = c0657Zf3;
                            bc = bc2;
                        } else {
                            if (i != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            interfaceC2233xc = (InterfaceC2233xc) c0138Ff.h;
                        }
                        AbstractC1494mO.l(obj);
                        interfaceC2233xc2 = interfaceC2233xc;
                    } catch (Throwable th) {
                        th = th;
                        obj = AbstractC1494mO.d(th);
                        interfaceC2233xc2 = c0657Zf;
                        a = C1428lO.a(obj);
                        C2299yc c2299yc3 = (C2299yc) interfaceC2233xc2;
                        if (a == null) {
                        }
                        return C0782bY.a;
                    }
                    a = C1428lO.a(obj);
                    C2299yc c2299yc32 = (C2299yc) interfaceC2233xc2;
                    if (a == null) {
                        c2299yc32.N(obj);
                    } else {
                        c2299yc32.getClass();
                        c2299yc32.N(new C0031Bc(a, false));
                    }
                    return C0782bY.a;
                }
                AbstractC1494mO.l(obj);
                c2299yc = bc.b;
                try {
                    AT Y = c0657Zf.n.Y();
                    if (Y instanceof C1643of) {
                        ?? r1 = bc.a;
                        InterfaceC0189He interfaceC0189He = bc.d;
                        c0138Ff.h = c2299yc;
                        c0138Ff.m = 1;
                        try {
                            b = c0657Zf.f().b(new C0501Tf(c0657Zf, interfaceC0189He, r1, null), c0138Ff);
                        } catch (Throwable th2) {
                            th = th2;
                            th = th;
                            c0657Zf = c2299yc;
                            obj = AbstractC1494mO.d(th);
                            interfaceC2233xc2 = c0657Zf;
                            a = C1428lO.a(obj);
                            C2299yc c2299yc322 = (C2299yc) interfaceC2233xc2;
                            if (a == null) {
                            }
                            return C0782bY.a;
                        }
                    } else {
                        if (!(Y instanceof C2348zL)) {
                            z = Y instanceof VX;
                        }
                        if (!z) {
                            if (Y instanceof C0796bm) {
                                throw ((C0796bm) Y).b;
                            }
                            throw new C0057Cc();
                        }
                        if (Y != bc.c) {
                            AbstractC0048Bt.l(Y, "null cannot be cast to non-null type androidx.datastore.core.ReadException<T of androidx.datastore.core.DataStoreImpl.handleUpdate$lambda$0>");
                            throw ((C2348zL) Y).b;
                        }
                        c0138Ff.h = bc;
                        c0138Ff.i = c0657Zf;
                        c0138Ff.j = c2299yc;
                        c0138Ff.m = 2;
                        Object g = c0657Zf.g(c0138Ff);
                        c0657Zf2 = c0657Zf;
                        if (g == enumC0448Re) {
                        }
                    }
                    return enumC0448Re;
                } catch (Throwable th3) {
                    th = th3;
                    c0657Zf = c2299yc;
                    obj = AbstractC1494mO.d(th);
                    interfaceC2233xc2 = c0657Zf;
                    a = C1428lO.a(obj);
                    C2299yc c2299yc3222 = (C2299yc) interfaceC2233xc2;
                    if (a == null) {
                    }
                    return C0782bY.a;
                }
                ?? r12 = bc.a;
                InterfaceC0189He interfaceC0189He2 = bc.d;
                c0138Ff.h = c2299yc;
                c0138Ff.i = null;
                c0138Ff.j = null;
                c0138Ff.m = 3;
                b = c0657Zf2.f().b(new C0501Tf(c0657Zf2, interfaceC0189He2, r12, null), c0138Ff);
            }
        }
        c0138Ff = new C0138Ff(c0657Zf, abstractC2367ze);
        Object obj2 = c0138Ff.k;
        i = c0138Ff.m;
        boolean z2 = true;
        EnumC0448Re enumC0448Re2 = EnumC0448Re.h;
        if (i == 0) {
        }
        ?? r122 = bc.a;
        InterfaceC0189He interfaceC0189He22 = bc.d;
        c0138Ff.h = c2299yc;
        c0138Ff.i = null;
        c0138Ff.j = null;
        c0138Ff.m = 3;
        b = c0657Zf2.f().b(new C0501Tf(c0657Zf2, interfaceC0189He22, r122, null), c0138Ff);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(C0657Zf c0657Zf, boolean z, InterfaceC2235xe interfaceC2235xe) {
        C0294Lf c0294Lf;
        int i;
        EnumC0448Re enumC0448Re;
        C0657Zf c0657Zf2;
        AT at;
        boolean z2;
        C0657Zf c0657Zf3;
        C1619oH c1619oH;
        if (interfaceC2235xe instanceof C0294Lf) {
            c0294Lf = (C0294Lf) interfaceC2235xe;
            int i2 = c0294Lf.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0294Lf.m = i2 - Integer.MIN_VALUE;
                Object obj = c0294Lf.k;
                i = c0294Lf.m;
                enumC0448Re = EnumC0448Re.h;
                if (i != 0) {
                    AbstractC1494mO.l(obj);
                    AT Y = c0657Zf.n.Y();
                    if (Y instanceof VX) {
                        throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                    }
                    SR f = c0657Zf.f();
                    c0294Lf.h = c0657Zf;
                    c0294Lf.i = Y;
                    c0294Lf.j = z;
                    c0294Lf.m = 1;
                    Integer a = f.a();
                    if (a != enumC0448Re) {
                        c0657Zf2 = c0657Zf;
                        at = Y;
                        obj = a;
                    }
                    return enumC0448Re;
                }
                if (i != 1) {
                    if (i == 2) {
                        c0657Zf3 = c0294Lf.h;
                        AbstractC1494mO.l(obj);
                        c1619oH = (C1619oH) obj;
                        AT at2 = (AT) c1619oH.h;
                        if (((Boolean) c1619oH.i).booleanValue()) {
                        }
                        return at2;
                    }
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c0657Zf3 = c0294Lf.h;
                    AbstractC1494mO.l(obj);
                    c1619oH = (C1619oH) obj;
                    AT at22 = (AT) c1619oH.h;
                    if (((Boolean) c1619oH.i).booleanValue()) {
                        c0657Zf3.n.d0(at22);
                    }
                    return at22;
                }
                z = c0294Lf.j;
                at = c0294Lf.i;
                c0657Zf2 = c0294Lf.h;
                AbstractC1494mO.l(obj);
                int intValue = ((Number) obj).intValue();
                z2 = at instanceof C1643of;
                int i3 = !z2 ? at.a : -1;
                if (!z2 && intValue == i3) {
                    return at;
                }
                if (z) {
                    SR f2 = c0657Zf2.f();
                    C0345Nf c0345Nf = new C0345Nf(c0657Zf2, i3, null);
                    c0294Lf.h = c0657Zf2;
                    c0294Lf.i = null;
                    c0294Lf.m = 3;
                    obj = f2.c(c0345Nf, c0294Lf);
                    if (obj != enumC0448Re) {
                        c0657Zf3 = c0657Zf2;
                        c1619oH = (C1619oH) obj;
                        AT at222 = (AT) c1619oH.h;
                        if (((Boolean) c1619oH.i).booleanValue()) {
                        }
                        return at222;
                    }
                } else {
                    SR f3 = c0657Zf2.f();
                    C0319Mf c0319Mf = new C0319Mf(c0657Zf2, null);
                    c0294Lf.h = c0657Zf2;
                    c0294Lf.i = null;
                    c0294Lf.m = 2;
                    obj = f3.b(c0319Mf, c0294Lf);
                    if (obj != enumC0448Re) {
                        c0657Zf3 = c0657Zf2;
                        c1619oH = (C1619oH) obj;
                        AT at2222 = (AT) c1619oH.h;
                        if (((Boolean) c1619oH.i).booleanValue()) {
                        }
                        return at2222;
                    }
                }
                return enumC0448Re;
            }
        }
        c0294Lf = new C0294Lf(c0657Zf, interfaceC2235xe);
        Object obj2 = c0294Lf.k;
        i = c0294Lf.m;
        enumC0448Re = EnumC0448Re.h;
        if (i != 0) {
        }
        int intValue2 = ((Number) obj2).intValue();
        z2 = at instanceof C1643of;
        if (!z2) {
        }
        if (!z2) {
        }
        if (z) {
        }
        return enumC0448Re;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x013e, code lost:
    
        if (r11 != r4) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e6 A[Catch: Ve -> 0x00a7, TryCatch #2 {Ve -> 0x00a7, blocks: (B:36:0x00a2, B:37:0x0141, B:40:0x00b0, B:41:0x0124, B:54:0x00cd, B:56:0x00e6, B:57:0x00ea, B:62:0x00d6, B:65:0x0112), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(C0657Zf c0657Zf, boolean z, AbstractC2367ze abstractC2367ze) {
        C0371Of c0371Of;
        int i;
        Integer a;
        C0657Zf c0657Zf2;
        int i2;
        Object obj;
        C0552Ve c0552Ve;
        Object b;
        C1230iM c1230iM;
        C1360kM c1360kM;
        try {
            if (abstractC2367ze instanceof C0371Of) {
                c0371Of = (C0371Of) abstractC2367ze;
                int i3 = c0371Of.p;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    c0371Of.p = i3 - Integer.MIN_VALUE;
                    Object obj2 = c0371Of.n;
                    i = c0371Of.p;
                    EnumC0448Re enumC0448Re = EnumC0448Re.h;
                    switch (i) {
                        case 0:
                            AbstractC1494mO.l(obj2);
                            if (!z) {
                                SR f = c0657Zf.f();
                                c0371Of.h = c0657Zf;
                                c0371Of.l = z;
                                c0371Of.p = 3;
                                obj2 = f.a();
                                if (obj2 == enumC0448Re) {
                                }
                                int intValue = ((Number) obj2).intValue();
                                SR f2 = c0657Zf.f();
                                C0397Pf c0397Pf = new C0397Pf(c0657Zf, intValue, null);
                                c0371Of.h = c0657Zf;
                                c0371Of.l = z;
                                c0371Of.p = 4;
                                obj2 = f2.c(c0397Pf, c0371Of);
                                break;
                            } else {
                                c0371Of.h = c0657Zf;
                                c0371Of.l = z;
                                c0371Of.p = 1;
                                obj2 = c0657Zf.h(c0371Of);
                                if (obj2 == enumC0448Re) {
                                }
                                int hashCode = obj2 != null ? obj2.hashCode() : 0;
                                SR f3 = c0657Zf.f();
                                c0371Of.h = c0657Zf;
                                c0371Of.i = obj2;
                                c0371Of.l = z;
                                c0371Of.m = hashCode;
                                c0371Of.p = 2;
                                a = f3.a();
                                if (a != enumC0448Re) {
                                    int i4 = hashCode;
                                    c0657Zf2 = c0657Zf;
                                    i2 = i4;
                                    obj = obj2;
                                    obj2 = a;
                                    return new C1643of(i2, ((Number) obj2).intValue(), obj);
                                }
                            }
                            return enumC0448Re;
                        case 1:
                            z = c0371Of.l;
                            c0657Zf = (C0657Zf) c0371Of.h;
                            AbstractC1494mO.l(obj2);
                            if (obj2 != null) {
                            }
                            SR f32 = c0657Zf.f();
                            c0371Of.h = c0657Zf;
                            c0371Of.i = obj2;
                            c0371Of.l = z;
                            c0371Of.m = hashCode;
                            c0371Of.p = 2;
                            a = f32.a();
                            if (a != enumC0448Re) {
                            }
                            return enumC0448Re;
                        case 2:
                            i2 = c0371Of.m;
                            z = c0371Of.l;
                            obj = c0371Of.i;
                            c0657Zf2 = (C0657Zf) c0371Of.h;
                            try {
                                AbstractC1494mO.l(obj2);
                                return new C1643of(i2, ((Number) obj2).intValue(), obj);
                            } catch (C0552Ve e) {
                                e = e;
                                c0657Zf = c0657Zf2;
                                C1360kM c1360kM2 = new C1360kM();
                                C0218Ih c0218Ih = c0657Zf.i;
                                c0371Of.h = c0657Zf;
                                c0371Of.i = e;
                                c0371Of.j = c1360kM2;
                                c0371Of.k = c1360kM2;
                                c0371Of.l = z;
                                c0371Of.p = 5;
                                throw e;
                            }
                        case 3:
                            z = c0371Of.l;
                            c0657Zf = (C0657Zf) c0371Of.h;
                            AbstractC1494mO.l(obj2);
                            int intValue2 = ((Number) obj2).intValue();
                            SR f22 = c0657Zf.f();
                            C0397Pf c0397Pf2 = new C0397Pf(c0657Zf, intValue2, null);
                            c0371Of.h = c0657Zf;
                            c0371Of.l = z;
                            c0371Of.p = 4;
                            obj2 = f22.c(c0397Pf2, c0371Of);
                            break;
                        case 4:
                            boolean z2 = c0371Of.l;
                            AbstractC1494mO.l(obj2);
                            return (C1643of) obj2;
                        case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                            boolean z3 = c0371Of.l;
                            C1360kM c1360kM3 = c0371Of.k;
                            C1360kM c1360kM4 = (C1360kM) c0371Of.j;
                            C0552Ve c0552Ve2 = (C0552Ve) c0371Of.i;
                            C0657Zf c0657Zf3 = (C0657Zf) c0371Of.h;
                            AbstractC1494mO.l(obj2);
                            c1360kM3.h = obj2;
                            C1230iM c1230iM2 = new C1230iM();
                            try {
                                C0423Qf c0423Qf = new C0423Qf(c1360kM4, c0657Zf3, c1230iM2, null);
                                c0371Of.h = c0552Ve2;
                                c0371Of.i = c1360kM4;
                                c0371Of.j = c1230iM2;
                                c0371Of.k = null;
                                c0371Of.p = 6;
                                if (z3) {
                                    c0657Zf3.getClass();
                                    b = c0423Qf.invoke(c0371Of);
                                } else {
                                    b = c0657Zf3.f().b(new C0112Ef(c0423Qf, null), c0371Of);
                                }
                                if (b != enumC0448Re) {
                                    c1230iM = c1230iM2;
                                    c1360kM = c1360kM4;
                                    Object obj3 = c1360kM.h;
                                    return new C1643of(obj3 != null ? obj3.hashCode() : 0, c1230iM.h, obj3);
                                }
                                return enumC0448Re;
                            } catch (Throwable th) {
                                th = th;
                                c0552Ve = c0552Ve2;
                                AbstractC0946e20.e(c0552Ve, th);
                                throw c0552Ve;
                            }
                        case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                            c1230iM = (C1230iM) c0371Of.j;
                            c1360kM = (C1360kM) c0371Of.i;
                            c0552Ve = (C0552Ve) c0371Of.h;
                            try {
                                AbstractC1494mO.l(obj2);
                                Object obj32 = c1360kM.h;
                                return new C1643of(obj32 != null ? obj32.hashCode() : 0, c1230iM.h, obj32);
                            } catch (Throwable th2) {
                                th = th2;
                                AbstractC0946e20.e(c0552Ve, th);
                                throw c0552Ve;
                            }
                        default:
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
            }
            switch (i) {
            }
        } catch (C0552Ve e2) {
            e = e2;
        }
        c0371Of = new C0371Of(c0657Zf, abstractC2367ze);
        Object obj22 = c0371Of.n;
        i = c0371Of.p;
        EnumC0448Re enumC0448Re2 = EnumC0448Re.h;
    }

    @Override // o.InterfaceC1972tf
    public final Object b(InterfaceC2312yp interfaceC2312yp, AbstractC2367ze abstractC2367ze) {
        C2163wY c2163wY = (C2163wY) abstractC2367ze.getContext().k(C1623oL.q);
        if (c2163wY != null) {
            c2163wY.a(this);
        }
        return AbstractC0868ct.b0(new C2163wY(c2163wY, this), new C0553Vf(this, interfaceC2312yp, null), abstractC2367ze);
    }

    @Override // o.InterfaceC1972tf
    public final InterfaceC2243xm c() {
        return this.m;
    }

    public final SR f() {
        return (SR) this.q.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0063, code lost:
    
        if (r3.G(r0) != r4) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(AbstractC2367ze abstractC2367ze) {
        C0268Kf c0268Kf;
        int i;
        C0657Zf c0657Zf;
        int intValue;
        int i2;
        Throwable th;
        C0657Zf c0657Zf2;
        try {
            if (abstractC2367ze instanceof C0268Kf) {
                c0268Kf = (C0268Kf) abstractC2367ze;
                int i3 = c0268Kf.l;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    c0268Kf.l = i3 - Integer.MIN_VALUE;
                    Object obj = c0268Kf.j;
                    i = c0268Kf.l;
                    Object obj2 = EnumC0448Re.h;
                    if (i != 0) {
                        AbstractC1494mO.l(obj);
                        SR f = f();
                        c0268Kf.h = this;
                        c0268Kf.l = 1;
                        obj = f.a();
                        if (obj != obj2) {
                            c0657Zf = this;
                        }
                        return obj2;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i2 = c0268Kf.i;
                        c0657Zf2 = c0268Kf.h;
                        try {
                            AbstractC1494mO.l(obj);
                            return C0782bY.a;
                        } catch (Throwable th2) {
                            th = th2;
                            c0657Zf2.n.d0(new C2348zL(th, i2));
                            throw th;
                        }
                    }
                    c0657Zf = c0268Kf.h;
                    AbstractC1494mO.l(obj);
                    intValue = ((Number) obj).intValue();
                    C1334k c1334k = c0657Zf.f136o;
                    c0268Kf.h = c0657Zf;
                    c0268Kf.i = intValue;
                    c0268Kf.l = 2;
                }
            }
            C1334k c1334k2 = c0657Zf.f136o;
            c0268Kf.h = c0657Zf;
            c0268Kf.i = intValue;
            c0268Kf.l = 2;
        } catch (Throwable th3) {
            C0657Zf c0657Zf3 = c0657Zf;
            i2 = intValue;
            th = th3;
            c0657Zf2 = c0657Zf3;
            c0657Zf2.n.d0(new C2348zL(th, i2));
            throw th;
        }
        c0268Kf = new C0268Kf(this, abstractC2367ze);
        Object obj3 = c0268Kf.j;
        i = c0268Kf.l;
        Object obj22 = EnumC0448Re.h;
        if (i != 0) {
        }
        intValue = ((Number) obj3).intValue();
    }

    public final Object h(AbstractC2367ze abstractC2367ze) {
        return ((LF) this.p.getValue()).a(new NT(3, null), abstractC2367ze);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(Object obj, boolean z, AbstractC2367ze abstractC2367ze) {
        C0605Xf c0605Xf;
        int i;
        C1230iM c1230iM;
        if (abstractC2367ze instanceof C0605Xf) {
            c0605Xf = (C0605Xf) abstractC2367ze;
            int i2 = c0605Xf.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0605Xf.k = i2 - Integer.MIN_VALUE;
                Object obj2 = c0605Xf.i;
                i = c0605Xf.k;
                if (i != 0) {
                    AbstractC1494mO.l(obj2);
                    C1230iM c1230iM2 = new C1230iM();
                    LF lf = (LF) this.p.getValue();
                    C0631Yf c0631Yf = new C0631Yf(c1230iM2, this, obj, z, null);
                    c0605Xf.h = c1230iM2;
                    c0605Xf.k = 1;
                    Object b = lf.b(c0631Yf, c0605Xf);
                    EnumC0448Re enumC0448Re = EnumC0448Re.h;
                    if (b == enumC0448Re) {
                        return enumC0448Re;
                    }
                    c1230iM = c1230iM2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c1230iM = c0605Xf.h;
                    AbstractC1494mO.l(obj2);
                }
                return new Integer(c1230iM.h);
            }
        }
        c0605Xf = new C0605Xf(this, abstractC2367ze);
        Object obj22 = c0605Xf.i;
        i = c0605Xf.k;
        if (i != 0) {
        }
        return new Integer(c1230iM.h);
    }
}
