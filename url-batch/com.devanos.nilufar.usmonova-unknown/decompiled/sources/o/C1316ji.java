package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: o.ji, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1316ji extends AbstractC1314jg implements InterfaceC0726ai, InterfaceC0004Ab {
    public final C0244Jh l;
    public List m;
    public final C0876d0 n;

    /* renamed from: o, reason: collision with root package name */
    public final OT f186o;
    public final OK p;
    public final InterfaceC0893dE q;
    public final C0695aD r;
    public final C1097gL s;
    public final InterfaceC0607Xh t;
    public JR u;
    public JR v;
    public List w;
    public JR x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1316ji(OT ot, InterfaceC1118gg interfaceC1118gg, InterfaceC1738q4 interfaceC1738q4, C0827cE c0827cE, C0244Jh c0244Jh, OK ok, InterfaceC0893dE interfaceC0893dE, C0695aD c0695aD, C1097gL c1097gL, InterfaceC0607Xh interfaceC0607Xh) {
        super(interfaceC1118gg, interfaceC1738q4, c0827cE, IS.e);
        AbstractC0048Bt.n(ot, "storageManager");
        AbstractC0048Bt.n(interfaceC1118gg, "containingDeclaration");
        AbstractC0048Bt.n(c0244Jh, "visibility");
        AbstractC0048Bt.n(ok, "proto");
        AbstractC0048Bt.n(interfaceC0893dE, "nameResolver");
        AbstractC0048Bt.n(c0695aD, "typeTable");
        AbstractC0048Bt.n(c1097gL, "versionRequirementTable");
        this.l = c0244Jh;
        this.n = new C0876d0(this);
        this.f186o = ot;
        this.p = ok;
        this.q = interfaceC0893dE;
        this.r = c0695aD;
        this.s = c1097gL;
        this.t = interfaceC0607Xh;
    }

    public final InterfaceC1245ib H0() {
        if (AbstractC1473m3.P(I0())) {
            return null;
        }
        InterfaceC2364zb c = I0().B0().c();
        if (c instanceof InterfaceC1245ib) {
            return (InterfaceC1245ib) c;
        }
        return null;
    }

    public final JR I0() {
        JR jr = this.v;
        if (jr != null) {
            return jr;
        }
        AbstractC0048Bt.i0("expandedType");
        throw null;
    }

    public final JR J0() {
        JR jr = this.u;
        if (jr != null) {
            return jr;
        }
        AbstractC0048Bt.i0("underlyingType");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01ab A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008a A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v4, types: [o.jk] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void K0(List list, JR jr, JR jr2) {
        WB wb;
        JR t;
        C0981eb e;
        LW lw;
        List list2;
        AbstractC0048Bt.n(jr, "underlyingType");
        AbstractC0048Bt.n(jr2, "expandedType");
        this.m = list;
        this.u = jr;
        this.v = jr2;
        this.w = TM.n(this);
        InterfaceC1245ib H0 = H0();
        if (H0 == null || (wb = H0.n0()) == null) {
            wb = VB.b;
        }
        WB wb2 = wb;
        UY uy = new UY(9, this);
        C0195Hk c0195Hk = AbstractC2228xX.a;
        if (C0273Kk.f(this)) {
            t = C0273Kk.c(EnumC0247Jk.r, toString());
        } else {
            SW z = z();
            if (z == null) {
                AbstractC2228xX.a(12);
                throw null;
            }
            List d = AbstractC2228xX.d(((C0876d0) z).getParameters());
            OW.i.getClass();
            t = HO.t(OW.j, z, d, false, wb2, uy);
        }
        this.x = t;
        InterfaceC1245ib H02 = H0();
        if (H02 == null) {
            return;
        }
        Collection<C0981eb> E = H02.E();
        AbstractC0048Bt.m(E, "classDescriptor.constructors");
        ArrayList arrayList = new ArrayList();
        for (C0981eb c0981eb : E) {
            GU gu = LW.N;
            AbstractC0048Bt.m(c0981eb, "it");
            gu.getClass();
            C1672p4 c1672p4 = C0460Rq.t;
            OT ot = this.f186o;
            AbstractC0048Bt.n(ot, "storageManager");
            C2096vX d2 = H0() == null ? null : C2096vX.d(I0());
            if (d2 != null && (e = c0981eb.e(d2)) != null) {
                InterfaceC1738q4 annotations = c0981eb.getAnnotations();
                C0981eb c0981eb2 = c0981eb;
                int M = c0981eb2.M();
                AbstractC1888sN.t(M, "constructor.kind");
                IS d3 = d();
                AbstractC0048Bt.m(d3, "typeAliasDescriptor.source");
                lw = new LW(ot, this, e, null, annotations, M, d3);
                List t0 = c0981eb2.t0();
                if (t0 == null) {
                    AbstractC0433Qp.A0(28);
                    throw null;
                }
                ArrayList L0 = AbstractC0433Qp.L0(lw, t0, d2, false, false, null);
                if (L0 != null) {
                    JR F = TM.F(AbstractC0868ct.M(e.n.E0()), i());
                    C0261Jy c0261Jy = c0981eb2.q;
                    int i = 1;
                    C0261Jy A = c0261Jy != null ? AbstractC1807r8.A(lw, d2.g(1, c0261Jy.c()), c1672p4) : null;
                    InterfaceC1245ib H03 = H0();
                    if (H03 != null) {
                        List T = c0981eb2.T();
                        AbstractC0048Bt.m(T, "constructor.contextReceiverParameters");
                        list2 = new ArrayList(AbstractC0786bc.d0(T));
                        int i2 = 0;
                        for (Object obj : T) {
                            int i3 = i2 + 1;
                            if (i2 < 0) {
                                AbstractC0868ct.Y();
                                throw null;
                            }
                            C0261Jy c0261Jy2 = (C0261Jy) obj;
                            AbstractC1004ey g = d2.g(i, c0261Jy2.c());
                            UL H04 = c0261Jy2.H0();
                            AbstractC0048Bt.l(H04, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.receivers.ImplicitContextReceiver");
                            C1708pe c1708pe = new C1708pe(H03, g, ((C1708pe) H04).F0());
                            C0705aN c0705aN = AbstractC0958eE.a;
                            list2.add(new C0261Jy(H03, c1708pe, c1672p4, C0827cE.e("_context_receiver_" + i2)));
                            i2 = i3;
                            i = 1;
                        }
                    } else {
                        list2 = C1318jk.h;
                    }
                    lw.M0(A, null, list2, p(), L0, F, 1, this.l);
                    if (lw == null) {
                        arrayList.add(lw);
                    }
                }
            }
            lw = null;
            if (lw == null) {
            }
        }
    }

    @Override // o.OB
    public final boolean X() {
        return false;
    }

    @Override // o.AbstractC1314jg, o.AbstractC1184hg, o.InterfaceC1118gg
    public final InterfaceC2364zb a() {
        return this;
    }

    @Override // o.InterfaceC1106gU
    public final InterfaceC1249ig e(C2096vX c2096vX) {
        AbstractC0048Bt.n(c2096vX, "substitutor");
        if (c2096vX.a.e()) {
            return this;
        }
        InterfaceC1118gg n = n();
        AbstractC0048Bt.m(n, "containingDeclaration");
        InterfaceC1738q4 annotations = getAnnotations();
        AbstractC0048Bt.m(annotations, "annotations");
        C0827cE name = getName();
        AbstractC0048Bt.m(name, "name");
        C1316ji c1316ji = new C1316ji(this.f186o, n, annotations, name, this.l, this.p, this.q, this.r, this.s, this.t);
        c1316ji.K0(p(), DY.a(c2096vX.g(1, J0())), DY.a(c2096vX.g(1, I0())));
        return c1316ji;
    }

    @Override // o.OB
    public final C0244Jh getVisibility() {
        return this.l;
    }

    @Override // o.InterfaceC2364zb
    public final JR i() {
        JR jr = this.x;
        if (jr != null) {
            return jr;
        }
        AbstractC0048Bt.i0("defaultTypeImpl");
        throw null;
    }

    @Override // o.InterfaceC0004Ab
    public final boolean k() {
        return AbstractC2228xX.c(J0(), new C1400l(3, this), null);
    }

    @Override // o.InterfaceC0726ai
    public final C0695aD k0() {
        throw null;
    }

    @Override // o.InterfaceC0004Ab
    public final List p() {
        List list = this.m;
        if (list != null) {
            return list;
        }
        AbstractC0048Bt.i0("declaredTypeParametersImpl");
        throw null;
    }

    @Override // o.OB
    public final boolean p0() {
        return false;
    }

    @Override // o.InterfaceC0726ai
    public final InterfaceC0607Xh s() {
        return this.t;
    }

    @Override // o.InterfaceC1118gg
    public final Object t(InterfaceC1380kg interfaceC1380kg, Object obj) {
        return interfaceC1380kg.F(this, obj);
    }

    @Override // o.AbstractC1184hg
    public final String toString() {
        return "typealias " + getName().b();
    }

    @Override // o.InterfaceC0726ai
    public final InterfaceC0893dE v0() {
        throw null;
    }

    @Override // o.OB
    public final boolean w() {
        return false;
    }

    @Override // o.InterfaceC2364zb
    public final SW z() {
        return this.n;
    }

    @Override // o.AbstractC1314jg, o.AbstractC1184hg, o.InterfaceC1118gg
    public final InterfaceC1118gg a() {
        return this;
    }

    @Override // o.AbstractC1314jg
    /* renamed from: G0 */
    public final InterfaceC1249ig a() {
        return this;
    }
}
