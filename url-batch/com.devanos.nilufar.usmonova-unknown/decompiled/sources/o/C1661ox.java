package o;

import java.lang.reflect.Array;
import java.util.List;

/* renamed from: o.ox, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1661ox implements InterfaceC1529mx {
    public static final /* synthetic */ InterfaceC0937dx[] l;
    public final AbstractC1004ey h;
    public final RM i;
    public final RM j;
    public final RM k;

    static {
        VM vm = UM.a;
        l = new InterfaceC0937dx[]{vm.g(new UJ(vm.b(C1661ox.class), "classifier", "getClassifier()Lkotlin/reflect/KClassifier;")), vm.g(new UJ(vm.b(C1661ox.class), "arguments", "getArguments()Ljava/util/List;"))};
    }

    public C1661ox(AbstractC1004ey abstractC1004ey, InterfaceC1455lp interfaceC1455lp) {
        AbstractC0048Bt.n(abstractC1004ey, "type");
        this.h = abstractC1004ey;
        RM rm = interfaceC1455lp instanceof RM ? (RM) interfaceC1455lp : null;
        this.i = rm == null ? interfaceC1455lp != null ? TM.u(null, interfaceC1455lp) : null : rm;
        this.j = TM.u(null, new C1595nx(this, 1));
        this.k = TM.u(null, new K2(this, 12, interfaceC1455lp));
    }

    public final InterfaceC1068fw e(AbstractC1004ey abstractC1004ey) {
        AbstractC1004ey b;
        InterfaceC2364zb c = abstractC1004ey.B0().c();
        if (c instanceof InterfaceC1245ib) {
            Class j = JY.j((InterfaceC1245ib) c);
            if (j != null) {
                if (!j.isArray()) {
                    if (AbstractC2228xX.e(abstractC1004ey)) {
                        return new C0740aw(j);
                    }
                    Class cls = (Class) AbstractC1492mM.b.get(j);
                    if (cls != null) {
                        j = cls;
                    }
                    return new C0740aw(j);
                }
                AbstractC1701pX abstractC1701pX = (AbstractC1701pX) AbstractC0720ac.F0(abstractC1004ey.w0());
                if (abstractC1701pX == null || (b = abstractC1701pX.b()) == null) {
                    return new C0740aw(j);
                }
                InterfaceC1068fw e = e(b);
                if (e != null) {
                    return new C0740aw(Array.newInstance((Class<?>) AbstractC1473m3.D(EB.u(e)), 0).getClass());
                }
                throw new C0526Ue("Cannot determine classifier for array element type: " + this);
            }
        } else {
            if (c instanceof InterfaceC1437lX) {
                return new C1793qx(null, (InterfaceC1437lX) c);
            }
            if (c instanceof C1316ji) {
                throw new WE("An operation is not implemented: Type alias classifiers are not yet supported");
            }
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1661ox)) {
            return false;
        }
        C1661ox c1661ox = (C1661ox) obj;
        return AbstractC0048Bt.h(this.h, c1661ox.h) && AbstractC0048Bt.h(l(), c1661ox.l()) && i().equals(c1661ox.i());
    }

    @Override // o.InterfaceC0361Nv
    public final List getAnnotations() {
        throw null;
    }

    public final int hashCode() {
        int hashCode = this.h.hashCode() * 31;
        InterfaceC1068fw l2 = l();
        return i().hashCode() + ((hashCode + (l2 != null ? l2.hashCode() : 0)) * 31);
    }

    public final List i() {
        InterfaceC0937dx interfaceC0937dx = l[1];
        Object invoke = this.k.invoke();
        AbstractC0048Bt.m(invoke, "<get-arguments>(...)");
        return (List) invoke;
    }

    public final InterfaceC1068fw l() {
        InterfaceC0937dx interfaceC0937dx = l[0];
        return (InterfaceC1068fw) this.j.invoke();
    }

    public final String toString() {
        C2304yh c2304yh = XM.a;
        return XM.d(this.h);
    }
}
