package defpackage;

import android.view.KeyEvent;
import androidx.compose.foundation.gestures.a;
import java.util.List;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class qo0 extends ol implements pa0, ns, s00, pp0, zg0, di {
    public ku0 A;
    public bd0 B;
    public final k2 C;
    public final io0 D;
    public final j3 E;
    public final zo0 F;
    public final p01 G;
    public final dj H;
    public b2 I;
    public j J;
    public no0 K;
    public sc0 t;
    public j80 u;
    public boolean v;
    public r60 w;
    public eb x;
    public eo y;
    public boolean z;

    public qo0(r60 r60Var, sc0 sc0Var, bd0 bd0Var, ro0 ro0Var, boolean z) {
        j80 j80Var = j80.z;
        this.t = sc0Var;
        this.u = j80Var;
        this.v = true;
        this.w = r60Var;
        this.B = bd0Var;
        k2 k2Var = new k2();
        k2Var.f = new b(13, k2Var);
        this.C = k2Var;
        io0 io0Var = new io0();
        j0(io0Var);
        this.D = io0Var;
        j3 j3Var = new j3(new p01(3, new p01(a.c)));
        this.E = j3Var;
        zo0 zo0Var = new zo0(ro0Var, this.B, j3Var, sc0Var, z, k2Var);
        this.F = zo0Var;
        p01 p01Var = new p01(18, zo0Var);
        this.G = p01Var;
        dj djVar = new dj(sc0Var, zo0Var, z);
        j0(djVar);
        this.H = djVar;
        j0(new y90(p01Var, k2Var));
        j0(new ts(new ss(1, sz.a, sz.class, "onDispatchEventsCompleted", "onDispatchEventsCompleted(Landroidx/compose/ui/focus/FocusTargetNode;)V", 0, 0, 0), 3));
        pa paVar = new pa();
        paVar.r = djVar;
        j0(paVar);
        f2 f2Var = new f2(20, this);
        at atVar = new at();
        atVar.r = f2Var;
        j0(atVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m0(qo0 qo0Var, lj ljVar) {
        yn ynVar;
        int i;
        if (ljVar instanceof yn) {
            ynVar = (yn) ljVar;
            int i2 = ynVar.g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ynVar.g = i2 - Integer.MIN_VALUE;
                Object obj = ynVar.e;
                i = ynVar.g;
                if (i != 0) {
                    rg0.u(obj);
                    eo eoVar = qo0Var.y;
                    if (eoVar != null) {
                        r60 r60Var = qo0Var.w;
                        if (r60Var != null) {
                            co coVar = new co(eoVar);
                            ynVar.d = qo0Var;
                            ynVar.g = 1;
                            Object a = r60Var.a(coVar, ynVar);
                            ck ckVar = ck.d;
                            if (a == ckVar) {
                                return ckVar;
                            }
                        }
                    }
                    qo0Var.q0(0L);
                    return ky0.a;
                }
                if (i != 1) {
                    g8.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qo0Var = ynVar.d;
                rg0.u(obj);
                qo0Var.y = null;
                qo0Var.q0(0L);
                return ky0.a;
            }
        }
        ynVar = new yn(qo0Var, ljVar);
        Object obj2 = ynVar.e;
        i = ynVar.g;
        if (i != 0) {
        }
        qo0Var.y = null;
        qo0Var.q0(0L);
        return ky0.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0059, code lost:
    
        if (r1.a(r5, r0) == r4) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object n0(qo0 qo0Var, qn qnVar, lj ljVar) {
        zn znVar;
        int i;
        eo eoVar;
        r60 r60Var;
        qo0 qo0Var2;
        eo eoVar2;
        if (ljVar instanceof zn) {
            znVar = (zn) ljVar;
            int i2 = znVar.i;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                znVar.i = i2 - Integer.MIN_VALUE;
                Object obj = znVar.g;
                i = znVar.i;
                ck ckVar = ck.d;
                if (i != 0) {
                    rg0.u(obj);
                    eo eoVar3 = qo0Var.y;
                    if (eoVar3 != null && (r1 = qo0Var.w) != null) {
                        co coVar = new co(eoVar3);
                        znVar.d = qo0Var;
                        znVar.e = qnVar;
                        znVar.i = 1;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            g8.s("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        eoVar2 = znVar.f;
                        qnVar = znVar.e;
                        qo0Var2 = znVar.d;
                        rg0.u(obj);
                        eoVar = eoVar2;
                        qo0Var = qo0Var2;
                        qo0Var.y = eoVar;
                        long j = qnVar.a;
                        return ky0.a;
                    }
                    qnVar = znVar.e;
                    qo0Var = znVar.d;
                    rg0.u(obj);
                }
                eoVar = new eo();
                r60Var = qo0Var.w;
                if (r60Var != null) {
                    znVar.d = qo0Var;
                    znVar.e = qnVar;
                    znVar.f = eoVar;
                    znVar.i = 2;
                    if (r60Var.a(eoVar, znVar) != ckVar) {
                        qo0Var2 = qo0Var;
                        eoVar2 = eoVar;
                        eoVar = eoVar2;
                        qo0Var = qo0Var2;
                    }
                    return ckVar;
                }
                qo0Var.y = eoVar;
                long j2 = qnVar.a;
                return ky0.a;
            }
        }
        znVar = new zn(qo0Var, ljVar);
        Object obj2 = znVar.g;
        i = znVar.i;
        ck ckVar2 = ck.d;
        if (i != 0) {
        }
        eoVar = new eo();
        r60Var = qo0Var.w;
        if (r60Var != null) {
        }
        qo0Var.y = eoVar;
        long j22 = qnVar.a;
        return ky0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object o0(qo0 qo0Var, rn rnVar, lj ljVar) {
        ao aoVar;
        int i;
        if (ljVar instanceof ao) {
            aoVar = (ao) ljVar;
            int i2 = aoVar.h;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aoVar.h = i2 - Integer.MIN_VALUE;
                Object obj = aoVar.f;
                i = aoVar.h;
                if (i != 0) {
                    rg0.u(obj);
                    eo eoVar = qo0Var.y;
                    if (eoVar != null) {
                        r60 r60Var = qo0Var.w;
                        if (r60Var != null) {
                            fo foVar = new fo(eoVar);
                            aoVar.d = qo0Var;
                            aoVar.e = rnVar;
                            aoVar.h = 1;
                            Object a = r60Var.a(foVar, aoVar);
                            ck ckVar = ck.d;
                            if (a == ckVar) {
                                return ckVar;
                            }
                        }
                    }
                    qo0Var.q0(rnVar.a);
                    return ky0.a;
                }
                if (i != 1) {
                    g8.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                rnVar = aoVar.e;
                qo0Var = aoVar.d;
                rg0.u(obj);
                qo0Var.y = null;
                qo0Var.q0(rnVar.a);
                return ky0.a;
            }
        }
        aoVar = new ao(qo0Var, ljVar);
        Object obj2 = aoVar.f;
        i = aoVar.h;
        if (i != 0) {
        }
        qo0Var.y = null;
        qo0Var.q0(rnVar.a);
        return ky0.a;
    }

    @Override // defpackage.s00
    public final boolean B(KeyEvent keyEvent) {
        long o;
        if (!this.v || ((!p00.a(x40.f(keyEvent.getKeyCode()), p00.n) && !p00.a(x40.f(keyEvent.getKeyCode()), p00.m)) || d31.z(keyEvent) != 2 || keyEvent.isCtrlPressed())) {
            return false;
        }
        boolean z = this.F.d == sc0.d;
        dj djVar = this.H;
        if (z) {
            int i = (int) (djVar.y & 4294967295L);
            o = mz.o(0.0f, p00.a(x40.f(keyEvent.getKeyCode()), p00.m) ? i : -i);
        } else {
            int i2 = (int) (djVar.y >> 32);
            o = mz.o(p00.a(x40.f(keyEvent.getKeyCode()), p00.m) ? i2 : -i2, 0.0f);
        }
        d31.E(V(), null, new no0(this, o, null, 1), 3);
        return true;
    }

    @Override // defpackage.zg0
    public final /* synthetic */ boolean E() {
        return false;
    }

    @Override // defpackage.zg0
    public final void H() {
        L();
    }

    @Override // defpackage.zg0
    public final void L() {
        ku0 ku0Var = this.A;
        if (ku0Var != null) {
            ku0Var.L();
        }
    }

    @Override // defpackage.pp0
    public final /* synthetic */ boolean M() {
        return false;
    }

    @Override // defpackage.pp0
    public final /* synthetic */ boolean O() {
        return false;
    }

    @Override // defpackage.zg0
    public final /* synthetic */ boolean S() {
        return false;
    }

    @Override // defpackage.t50
    public final boolean W() {
        return false;
    }

    @Override // defpackage.t50
    public final void Z() {
        nk.H(this, new wn(this, 2));
        this.I = b2.r;
    }

    @Override // defpackage.t50
    public final void a0() {
        L();
    }

    @Override // defpackage.t50
    public final void b0() {
        this.z = false;
        p0();
    }

    @Override // defpackage.pp0
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // defpackage.s00
    public final boolean g(KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.zg0
    public final long l() {
        return nz.m;
    }

    public final void p0() {
        eo eoVar = this.y;
        if (eoVar != null) {
            r60 r60Var = this.w;
            if (r60Var != null) {
                r60Var.b(new co(eoVar));
            }
            this.y = null;
        }
    }

    public final void q0(long j) {
        bk bkVar = (bk) ((bu) this.C.f).a();
        if (bkVar == null) {
            g8.s("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        } else {
            d31.E(bkVar, null, new no0(this, j, null, 0), 3);
        }
    }

    @Override // defpackage.zg0
    public final void s(qg0 qg0Var, sg0 sg0Var, long j) {
        kj kjVar;
        long j2;
        List list = qg0Var.a;
        int size = list.size();
        int i = 0;
        while (true) {
            kjVar = null;
            if (i >= size) {
                break;
            }
            if (((Boolean) this.u.c((wg0) list.get(i))).booleanValue()) {
                if (this.v && this.A == null) {
                    c cVar = new c(this, kjVar, 10);
                    qg0 qg0Var2 = hu0.a;
                    ku0 ku0Var = new ku0(null, null, iu0.a);
                    ku0Var.t = cVar;
                    j0(ku0Var);
                    this.A = ku0Var;
                }
                ku0 ku0Var2 = this.A;
                if (ku0Var2 != null) {
                    ku0Var2.s(qg0Var, sg0Var, j);
                }
            } else {
                i++;
            }
        }
        if (sg0Var == sg0.e && qg0Var.b == 6) {
            List list2 = qg0Var.a;
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (((wg0) list2.get(i2)).b()) {
                    return;
                }
            }
            this.I.getClass();
            sl slVar = nz.a0(this).y;
            ra0 ra0Var = new ra0(0L);
            int size3 = list2.size();
            int i3 = 0;
            while (true) {
                j2 = ra0Var.a;
                if (i3 >= size3) {
                    break;
                }
                ra0Var = new ra0(ra0.h(j2, ((wg0) list2.get(i3)).j));
                i3++;
            }
            d31.E(V(), null, new no0(this, ra0.i(j2, -slVar.o(64.0f)), kjVar, 2), 3);
            int size4 = list2.size();
            for (int i4 = 0; i4 < size4; i4++) {
                ((wg0) list2.get(i4)).a();
            }
        }
    }

    @Override // defpackage.pa0
    public final void u() {
        nk.H(this, new wn(this, 2));
    }

    @Override // defpackage.pp0
    public final void v(np0 np0Var) {
        if (this.v && (this.J == null || this.K == null)) {
            this.J = new j(9, this);
            this.K = new no0(this, null);
        }
        j jVar = this.J;
        if (jVar != null) {
            n00[] n00VarArr = xp0.a;
            np0Var.d(mp0.d, new h0(null, jVar));
        }
        no0 no0Var = this.K;
        if (no0Var != null) {
            n00[] n00VarArr2 = xp0.a;
            np0Var.d(mp0.e, no0Var);
        }
    }

    @Override // defpackage.ns
    public final void z(ls lsVar) {
        lsVar.b(false);
    }
}
