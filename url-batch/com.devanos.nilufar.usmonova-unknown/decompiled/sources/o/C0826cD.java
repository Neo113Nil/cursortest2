package o;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: o.cD, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0826cD extends AbstractC1184hg implements InterfaceC0761bD {
    public final VA j;
    public final AbstractC0545Ux k;
    public final Map l;
    public final InterfaceC1421lH m;
    public C0695aD n;

    /* renamed from: o, reason: collision with root package name */
    public InterfaceC1159hH f145o;
    public final boolean p;
    public final PA q;
    public final BU r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0826cD(C0827cE c0827cE, VA va, AbstractC0545Ux abstractC0545Ux, int i) {
        super(C0460Rq.t, c0827cE);
        AbstractC0048Bt.n(c0827cE, "moduleName");
        this.j = va;
        this.k = abstractC0545Ux;
        if (!c0827cE.i) {
            throw new IllegalArgumentException("Module name must be special: " + c0827cE);
        }
        this.l = C1384kk.h;
        InterfaceC1421lH.a.getClass();
        InterfaceC1421lH interfaceC1421lH = (InterfaceC1421lH) q(C0460Rq.R);
        this.m = interfaceC1421lH == null ? C1355kH.b : interfaceC1421lH;
        this.p = true;
        this.q = va.b(new C1400l(25, this));
        this.r = EB.D(new C0542Uu(this, 1));
    }

    public final void G0() {
        if (this.p) {
            return;
        }
        if (q(AbstractC0048Bt.c) != null) {
            throw new ClassCastException();
        }
        String str = "Accessing invalid module descriptor " + this;
        AbstractC0048Bt.n(str, "message");
        throw new C0393Pb(str);
    }

    @Override // o.InterfaceC0761bD
    public final InterfaceC1289jH S(C2245xo c2245xo) {
        AbstractC0048Bt.n(c2245xo, "fqName");
        G0();
        return (InterfaceC1289jH) this.q.invoke(c2245xo);
    }

    @Override // o.InterfaceC0761bD
    public final List W() {
        if (this.n != null) {
            return C1318jk.h;
        }
        StringBuilder sb = new StringBuilder("Dependencies of module ");
        String str = getName().h;
        AbstractC0048Bt.m(str, "name.toString()");
        sb.append(str);
        sb.append(" were not set");
        throw new AssertionError(sb.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.InterfaceC0761bD
    public final boolean Z(InterfaceC0761bD interfaceC0761bD) {
        AbstractC0048Bt.n(interfaceC0761bD, "targetModule");
        if (equals(interfaceC0761bD)) {
            return true;
        }
        AbstractC0048Bt.k(this.n);
        if (AbstractC0720ac.j0(C1648ok.h, interfaceC0761bD)) {
            return true;
        }
        W();
        if (interfaceC0761bD instanceof Void) {
        }
        return interfaceC0761bD.W().contains(this);
    }

    @Override // o.InterfaceC0761bD
    public final Collection f(C2245xo c2245xo, InterfaceC2114vp interfaceC2114vp) {
        AbstractC0048Bt.n(c2245xo, "fqName");
        G0();
        G0();
        return ((C1707pd) this.r.getValue()).f(c2245xo, interfaceC2114vp);
    }

    @Override // o.InterfaceC0761bD
    public final AbstractC0545Ux l() {
        return this.k;
    }

    @Override // o.InterfaceC1118gg
    public final InterfaceC1118gg n() {
        return null;
    }

    @Override // o.InterfaceC0761bD
    public final Object q(C0457Rn c0457Rn) {
        AbstractC0048Bt.n(c0457Rn, "capability");
        Object obj = this.l.get(c0457Rn);
        if (obj == null) {
            return null;
        }
        return obj;
    }

    @Override // o.InterfaceC1118gg
    public final Object t(InterfaceC1380kg interfaceC1380kg, Object obj) {
        return interfaceC1380kg.i(obj, this);
    }

    @Override // o.AbstractC1184hg
    public final String toString() {
        String F0 = AbstractC1184hg.F0(this);
        return this.p ? F0 : F0.concat(" !isValid");
    }
}
