package defpackage;

import java.util.List;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class tn extends tk0 implements qu {
    public Object e;
    public Object f;
    public Object g;
    public fj0 h;
    public qw0 i;
    public wg0 j;
    public boolean k;
    public float l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ wn o;
    public final /* synthetic */ fj0 p;
    public final /* synthetic */ sc0 q;
    public final /* synthetic */ xn r;
    public final /* synthetic */ w3 s;
    public final /* synthetic */ wn t;
    public final /* synthetic */ y3 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tn(wn wnVar, fj0 fj0Var, sc0 sc0Var, xn xnVar, w3 w3Var, wn wnVar2, y3 y3Var, kj kjVar) {
        super(kjVar);
        this.o = wnVar;
        this.p = fj0Var;
        this.q = sc0Var;
        this.r = xnVar;
        this.s = w3Var;
        this.t = wnVar2;
        this.u = y3Var;
    }

    @Override // defpackage.h9
    public final kj create(Object obj, kj kjVar) {
        tn tnVar = new tn(this.o, this.p, this.q, this.r, this.s, this.t, this.u, kjVar);
        tnVar.n = obj;
        return tnVar;
    }

    @Override // defpackage.qu
    public final Object invoke(Object obj, Object obj2) {
        return ((tn) create((ju0) obj, (kj) obj2)).invokeSuspend(ky0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:157:0x02f6, code lost:
    
        if (defpackage.un.a(r4.i.w, r1) != false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x00df, code lost:
    
        if (r5 == r13) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x00bc, code lost:
    
        if (r3 == r13) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x031c, code lost:
    
        if (r5 != r13) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0394, code lost:
    
        if ((r11 != null ? r11 == defpackage.sc0.d ? defpackage.ra0.e(r4) : defpackage.ra0.d(r4) : defpackage.ra0.c(r4)) == 0.0f) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0143, code lost:
    
        if (r15 == r13) goto L127;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:39:0x0353, B:52:0x0378], limit reached: 174 */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0102  */
    /* JADX WARN: Type inference failed for: r10v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8, types: [qu] */
    /* JADX WARN: Type inference failed for: r16v1, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:119:0x02a1 -> B:62:0x02a2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x031c -> B:9:0x031f). Please report as a decompilation issue!!! */
    @Override // defpackage.h9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ju0 ju0Var;
        Object a;
        ju0 ju0Var2;
        wg0 wg0Var;
        boolean booleanValue;
        Object a2;
        wg0 wg0Var2;
        sc0 sc0Var;
        fj0 fj0Var;
        w3 w3Var;
        long j;
        Object obj2;
        fj0 fj0Var2;
        qw0 qw0Var;
        wg0 wg0Var3;
        ju0 ju0Var3;
        fj0 fj0Var3;
        float f;
        wg0 wg0Var4;
        wg0 wg0Var5;
        fj0 fj0Var4;
        float abs;
        ra0 ra0Var;
        long o;
        Object obj3;
        long j2;
        wg0 wg0Var6;
        ?? r12;
        wg0 wg0Var7;
        Object obj4;
        int i = this.m;
        sc0 sc0Var2 = this.q;
        int i2 = 2;
        fj0 fj0Var5 = this.p;
        int i3 = 0;
        ck ckVar = ck.d;
        if (i == 0) {
            rg0.u(obj);
            ju0Var = (ju0) this.n;
            this.n = ju0Var;
            this.m = 1;
            a = yu0.a(ju0Var, false, sg0.d, this);
        } else if (i == 1) {
            ju0Var = (ju0) this.n;
            rg0.u(obj);
            a = obj;
        } else if (i == 2) {
            booleanValue = this.k;
            wg0Var = (wg0) this.e;
            ju0Var2 = (ju0) this.n;
            rg0.u(obj);
            a2 = obj;
            wg0Var2 = (wg0) a2;
            fj0Var5.d = 0L;
            if (!booleanValue) {
                sc0Var = sc0Var2;
                fj0Var = fj0Var5;
                if (wg0Var != null) {
                }
                return ky0.a;
            }
            j2 = wg0Var2.a;
            int i4 = wg0Var2.i;
            if (un.a(ju0Var2.i.w, j2)) {
            }
        } else {
            if (i == 3) {
                f = this.l;
                qw0 qw0Var2 = this.i;
                fj0 fj0Var6 = this.h;
                fj0 fj0Var7 = (fj0) this.g;
                ju0 ju0Var4 = (ju0) this.f;
                wg0 wg0Var8 = (wg0) this.e;
                ju0 ju0Var5 = (ju0) this.n;
                rg0.u(obj);
                qw0Var = qw0Var2;
                fj0Var3 = fj0Var6;
                ju0Var2 = ju0Var4;
                wg0Var3 = wg0Var8;
                fj0Var2 = fj0Var7;
                ju0Var3 = ju0Var5;
                obj2 = obj;
                qg0 qg0Var = (qg0) obj2;
                List list = qg0Var.a;
                int size = list.size();
                while (true) {
                    if (i3 >= size) {
                        fj0Var = fj0Var5;
                        wg0Var4 = null;
                        break;
                    }
                    ?? r16 = list.get(i3);
                    int i5 = i3;
                    List list2 = list;
                    fj0Var = fj0Var5;
                    if (vg0.a(((wg0) r16).a, fj0Var3.d)) {
                        wg0Var4 = r16;
                        break;
                    }
                    i3 = i5 + 1;
                    fj0Var5 = fj0Var;
                    list = list2;
                }
                wg0Var5 = wg0Var4;
                if (wg0Var5 != null && !wg0Var5.b()) {
                    if (rg0.d(wg0Var5)) {
                        List list3 = qg0Var.a;
                        int size2 = list3.size();
                        int i6 = 0;
                        while (true) {
                            if (i6 >= size2) {
                                obj3 = null;
                                break;
                            }
                            obj3 = list3.get(i6);
                            if (((wg0) obj3).d) {
                                break;
                            }
                            i6++;
                        }
                        wg0 wg0Var9 = (wg0) obj3;
                        if (wg0Var9 != null) {
                            fj0Var3.d = wg0Var9.a;
                            sc0Var = sc0Var2;
                            fj0Var4 = fj0Var3;
                        }
                    } else {
                        qw0Var.getClass();
                        sc0 sc0Var3 = qw0Var.a;
                        sc0Var = sc0Var2;
                        fj0Var4 = fj0Var3;
                        long h = ra0.h(qw0Var.b, ra0.g(wg0Var5.c, wg0Var5.g));
                        qw0Var.b = h;
                        sc0 sc0Var4 = sc0.e;
                        if (sc0Var3 != null) {
                            abs = Math.abs(sc0Var3 == sc0Var4 ? ra0.d(h) : ra0.e(h));
                        } else {
                            abs = ra0.c(h);
                        }
                        if (abs >= f) {
                            long j3 = qw0Var.b;
                            if (sc0Var3 != null) {
                                float d = sc0Var3 == sc0Var4 ? ra0.d(j3) : ra0.e(j3);
                                long j4 = qw0Var.b;
                                float signum = d - (Math.signum(sc0Var3 == sc0Var4 ? ra0.d(j4) : ra0.e(j4)) * f);
                                long j5 = qw0Var.b;
                                float e = sc0Var3 == sc0Var4 ? ra0.e(j5) : ra0.d(j5);
                                o = sc0Var3 == sc0Var4 ? mz.o(signum, e) : mz.o(e, signum);
                            } else {
                                float c = ra0.c(j3);
                                o = ra0.g(qw0Var.b, ra0.i((Float.floatToRawIntBits(Float.intBitsToFloat((int) (j3 & 4294967295L)) / c) & 4294967295L) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j3 >> 32)) / c) << 32), f));
                            }
                            ra0Var = new ra0(o);
                        } else {
                            ra0Var = null;
                        }
                        if (ra0Var == null) {
                            this.n = ju0Var3;
                            this.e = wg0Var3;
                            this.f = ju0Var2;
                            this.g = fj0Var2;
                            this.h = fj0Var4;
                            this.i = qw0Var;
                            this.j = wg0Var5;
                            this.l = f;
                            this.m = 4;
                            if (ju0Var2.b(sg0.f, this) != ckVar) {
                                fj0Var3 = fj0Var4;
                                if (!wg0Var5.b()) {
                                }
                            }
                            return ckVar;
                        }
                        long j6 = ra0Var.a;
                        wg0Var5.a();
                        fj0Var2.d = j6;
                        if (wg0Var5.b()) {
                            ju0Var2 = ju0Var3;
                            wg0Var2 = wg0Var3;
                            wg0Var = wg0Var5;
                            if (wg0Var != null) {
                            }
                            if (wg0Var != null) {
                            }
                            return ky0.a;
                        }
                        qw0Var.b = 0L;
                    }
                    sc0Var2 = sc0Var;
                    fj0Var3 = fj0Var4;
                    fj0Var5 = fj0Var;
                    i3 = 0;
                    this.n = ju0Var3;
                    this.e = wg0Var3;
                    this.f = ju0Var2;
                    this.g = fj0Var2;
                    this.h = fj0Var3;
                    this.i = qw0Var;
                    this.j = null;
                    this.l = f;
                    this.m = 3;
                    obj2 = ju0Var2.b(sg0.e, this);
                }
                sc0Var = sc0Var2;
                ju0Var2 = ju0Var3;
                wg0Var2 = wg0Var3;
                wg0Var = null;
                if (wg0Var != null) {
                }
                if (wg0Var != null) {
                }
                return ky0.a;
            }
            if (i != 4) {
                if (i != 5) {
                    g8.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fj0 fj0Var8 = this.h;
                ju0 ju0Var6 = (ju0) this.g;
                sc0 sc0Var5 = (sc0) this.f;
                qu quVar = (qu) this.e;
                ju0 ju0Var7 = (ju0) this.n;
                rg0.u(obj);
                sc0Var = sc0Var5;
                Object b = obj;
                qg0 qg0Var2 = (qg0) b;
                List list4 = qg0Var2.a;
                int size3 = list4.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size3) {
                        r12 = quVar;
                        wg0Var7 = null;
                        break;
                    }
                    ?? r10 = list4.get(i7);
                    qu quVar2 = quVar;
                    if (vg0.a(((wg0) r10).a, fj0Var8.d)) {
                        wg0Var7 = r10;
                        r12 = quVar2;
                        break;
                    }
                    i7++;
                    quVar = quVar2;
                }
                wg0 wg0Var10 = wg0Var7;
                if (wg0Var10 == null) {
                    wg0Var10 = null;
                } else if (rg0.d(wg0Var10)) {
                    List list5 = qg0Var2.a;
                    int size4 = list5.size();
                    int i8 = 0;
                    while (true) {
                        if (i8 >= size4) {
                            obj4 = null;
                            break;
                        }
                        obj4 = list5.get(i8);
                        if (((wg0) obj4).d) {
                            break;
                        }
                        i8++;
                    }
                    wg0 wg0Var11 = (wg0) obj4;
                    if (wg0Var11 != null) {
                        fj0Var8.d = wg0Var11.a;
                        quVar = r12;
                        this.n = ju0Var7;
                        this.e = quVar;
                        this.f = sc0Var;
                        this.g = ju0Var6;
                        this.h = fj0Var8;
                        this.i = null;
                        this.j = null;
                        this.m = 5;
                        b = ju0Var6.b(sg0.e, this);
                    }
                } else {
                    long q = rg0.q(wg0Var10, true);
                }
                if (wg0Var10 != null && !wg0Var10.b()) {
                    if (rg0.d(wg0Var10)) {
                        wg0Var6 = wg0Var10;
                        if (wg0Var6 != null) {
                            this.t.a();
                        } else {
                            this.u.c(wg0Var6);
                        }
                        return ky0.a;
                    }
                    r12.invoke(wg0Var10, new ra0(rg0.q(wg0Var10, false)));
                    wg0Var10.a();
                    j = wg0Var10.a;
                    ju0Var2 = ju0Var7;
                    w3Var = r12;
                    fj0 fj0Var9 = new fj0();
                    fj0Var9.d = j;
                    fj0Var8 = fj0Var9;
                    ju0Var6 = ju0Var2;
                    ju0Var7 = ju0Var6;
                    quVar = w3Var;
                    this.n = ju0Var7;
                    this.e = quVar;
                    this.f = sc0Var;
                    this.g = ju0Var6;
                    this.h = fj0Var8;
                    this.i = null;
                    this.j = null;
                    this.m = 5;
                    b = ju0Var6.b(sg0.e, this);
                }
                wg0Var6 = null;
                if (wg0Var6 != null) {
                }
                return ky0.a;
            }
            f = this.l;
            wg0Var5 = this.j;
            qw0 qw0Var3 = this.i;
            fj0 fj0Var10 = this.h;
            fj0 fj0Var11 = (fj0) this.g;
            ju0 ju0Var8 = (ju0) this.f;
            wg0 wg0Var12 = (wg0) this.e;
            ju0 ju0Var9 = (ju0) this.n;
            rg0.u(obj);
            ju0Var3 = ju0Var9;
            fj0Var3 = fj0Var10;
            fj0Var2 = fj0Var11;
            wg0Var3 = wg0Var12;
            sc0Var = sc0Var2;
            ju0Var2 = ju0Var8;
            fj0Var = fj0Var5;
            qw0Var = qw0Var3;
            if (!wg0Var5.b()) {
                ju0Var2 = ju0Var3;
                wg0Var2 = wg0Var3;
                wg0Var = null;
                if (wg0Var != null && !wg0Var.b()) {
                    sc0Var2 = sc0Var;
                    fj0Var5 = fj0Var;
                    i2 = 2;
                    i3 = 0;
                    j2 = wg0Var2.a;
                    int i42 = wg0Var2.i;
                    if (un.a(ju0Var2.i.w, j2)) {
                        sc0Var = sc0Var2;
                        fj0Var = fj0Var5;
                        wg0Var = null;
                        if (wg0Var != null) {
                            sc0Var2 = sc0Var;
                            fj0Var5 = fj0Var;
                            i2 = 2;
                            i3 = 0;
                            j2 = wg0Var2.a;
                            int i422 = wg0Var2.i;
                            if (un.a(ju0Var2.i.w, j2)) {
                                ku0 ku0Var = ju0Var2.i;
                                ku0Var.getClass();
                                e01 e01Var = nz.a0(ku0Var).A;
                                f = i422 == i2 ? e01Var.b() * un.a : e01Var.b();
                                fj0Var3 = new fj0();
                                fj0Var3.d = j2;
                                qw0Var = new qw0(sc0Var2);
                                fj0Var2 = fj0Var5;
                                wg0Var3 = wg0Var2;
                                ju0Var3 = ju0Var2;
                                this.n = ju0Var3;
                                this.e = wg0Var3;
                                this.f = ju0Var2;
                                this.g = fj0Var2;
                                this.h = fj0Var3;
                                this.i = qw0Var;
                                this.j = null;
                                this.l = f;
                                this.m = 3;
                                obj2 = ju0Var2.b(sg0.e, this);
                            }
                        }
                    }
                }
                if (wg0Var != null) {
                    fj0 fj0Var12 = fj0Var;
                    this.r.b(wg0Var2, wg0Var, new ra0(fj0Var12.d));
                    long j7 = fj0Var12.d;
                    w3Var = this.s;
                    ch0.a((pz0) w3Var.f, wg0Var);
                    eb ebVar = ((qo0) w3Var.g).x;
                    if (ebVar != null) {
                        ebVar.r(new pn(j7));
                    }
                    j = wg0Var.a;
                }
                return ky0.a;
            }
            sc0Var2 = sc0Var;
            fj0Var5 = fj0Var;
            i3 = 0;
            this.n = ju0Var3;
            this.e = wg0Var3;
            this.f = ju0Var2;
            this.g = fj0Var2;
            this.h = fj0Var3;
            this.i = qw0Var;
            this.j = null;
            this.l = f;
            this.m = 3;
            obj2 = ju0Var2.b(sg0.e, this);
        }
        ju0Var2 = ju0Var;
        wg0Var = (wg0) a;
        booleanValue = ((Boolean) this.o.a()).booleanValue();
        if (!booleanValue) {
            wg0Var.a();
        }
        this.n = ju0Var2;
        this.e = wg0Var;
        this.k = booleanValue;
        this.m = 2;
        a2 = yu0.a(ju0Var2, (r3 & 1) != 0, sg0.e, this);
    }
}
