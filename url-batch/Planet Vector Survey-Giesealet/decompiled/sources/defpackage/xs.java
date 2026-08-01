package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class xs extends ol implements cs, pp0, fv, ps {
    public rs t;
    public final ws u;
    public final ys v;
    public final zs w;

    public xs(r60 r60Var) {
        ws wsVar = new ws();
        wsVar.r = r60Var;
        j0(wsVar);
        this.u = wsVar;
        ys ysVar = new ys();
        j0(ysVar);
        this.v = ysVar;
        zs zsVar = new zs();
        j0(zsVar);
        this.w = zsVar;
        j0(new ts(new ss(1, sz.a, sz.class, "onDispatchEventsCompleted", "onDispatchEventsCompleted(Landroidx/compose/ui/focus/FocusTargetNode;)V", 0, 0, 0), 3));
    }

    @Override // defpackage.cs
    public final void C(rs rsVar) {
        at j0;
        if (nz.l(this.t, rsVar)) {
            return;
        }
        boolean a = rsVar.a();
        kj kjVar = null;
        if (a) {
            d31.E(V(), null, new qk(this, kjVar, 1), 3);
        }
        if (this.q) {
            ch0.h(this);
        }
        ws wsVar = this.u;
        r60 r60Var = wsVar.r;
        if (r60Var != null) {
            gs gsVar = wsVar.s;
            if (a) {
                if (gsVar != null) {
                    wsVar.j0(r60Var, new hs(gsVar));
                    wsVar.s = null;
                }
                gs gsVar2 = new gs();
                wsVar.j0(r60Var, gsVar2);
                wsVar.s = gsVar2;
            } else if (gsVar != null) {
                wsVar.j0(r60Var, new hs(gsVar));
                wsVar.s = null;
            }
        }
        zs zsVar = this.w;
        if (a != zsVar.r) {
            if (a) {
                ea0 ea0Var = zsVar.s;
                if (ea0Var != null && ea0Var.v0().q && (j0 = zsVar.j0()) != null) {
                    j0.j0(zsVar.s);
                }
            } else {
                at j02 = zsVar.j0();
                if (j02 != null) {
                    j02.j0(null);
                }
            }
            zsVar.r = a;
        }
        ys ysVar = this.v;
        if (a) {
            ysVar.getClass();
            gj0 gj0Var = new gj0();
            nk.H(ysVar, new a3(5, gj0Var, ysVar));
            if (gj0Var.d != null) {
                g8.q();
                return;
            }
        }
        ysVar.getClass();
        this.t = rsVar;
    }

    @Override // defpackage.pp0
    public final /* synthetic */ boolean M() {
        return false;
    }

    @Override // defpackage.pp0
    public final /* synthetic */ boolean O() {
        return false;
    }

    @Override // defpackage.t50
    public final boolean W() {
        return false;
    }

    @Override // defpackage.pp0
    public final /* synthetic */ boolean e() {
        return true;
    }

    public final void m0(r60 r60Var) {
        gs gsVar;
        ws wsVar = this.u;
        if (nz.l(wsVar.r, r60Var)) {
            return;
        }
        r60 r60Var2 = wsVar.r;
        if (r60Var2 != null && (gsVar = wsVar.s) != null) {
            r60Var2.b(new hs(gsVar));
        }
        wsVar.s = null;
        wsVar.r = r60Var;
    }

    @Override // defpackage.fv
    public final void n(ea0 ea0Var) {
        this.w.n(ea0Var);
    }

    @Override // defpackage.pp0
    public final void v(np0 np0Var) {
        rs rsVar = this.t;
        boolean z = false;
        if (rsVar != null && rsVar.a()) {
            z = true;
        }
        n00[] n00VarArr = xp0.a;
        yp0 yp0Var = vp0.k;
        n00 n00Var = xp0.a[4];
        np0Var.d(yp0Var, Boolean.valueOf(z));
        np0Var.d(mp0.t, new h0(null, new b(4, this)));
    }
}
