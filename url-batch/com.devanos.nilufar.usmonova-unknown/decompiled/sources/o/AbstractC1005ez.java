package o;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: o.ez, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1005ez extends XB {
    public static final /* synthetic */ InterfaceC0937dx[] m;
    public final C1216i8 b;
    public final AbstractC1005ez c;
    public final NA d;
    public final SA e;
    public final PA f;
    public final TA g;
    public final PA h;
    public final SA i;
    public final SA j;
    public final SA k;
    public final PA l;

    static {
        VM vm = UM.a;
        m = new InterfaceC0937dx[]{vm.g(new UJ(vm.b(AbstractC1005ez.class), "functionNamesLazy", "getFunctionNamesLazy()Ljava/util/Set;")), vm.g(new UJ(vm.b(AbstractC1005ez.class), "propertyNamesLazy", "getPropertyNamesLazy()Ljava/util/Set;")), vm.g(new UJ(vm.b(AbstractC1005ez.class), "classNamesLazy", "getClassNamesLazy()Ljava/util/Set;"))};
    }

    public AbstractC1005ez(C1216i8 c1216i8, C0494Sy c0494Sy) {
        AbstractC0048Bt.n(c1216i8, "c");
        this.b = c1216i8;
        this.c = c0494Sy;
        OT ot = ((C1198hu) c1216i8.i).a;
        C0874cz c0874cz = new C0874cz(this, 0);
        VA va = (VA) ot;
        va.getClass();
        this.d = new NA(va, c0874cz);
        C0874cz c0874cz2 = new C0874cz(this, 2);
        VA va2 = (VA) ot;
        va2.getClass();
        this.e = new SA(va2, c0874cz2);
        this.f = ((VA) ot).b(new C0939dz(this, 1));
        this.g = ((VA) ot).c(new C0939dz(this, 0));
        this.h = ((VA) ot).b(new C0939dz(this, 2));
        C0874cz c0874cz3 = new C0874cz(this, 3);
        VA va3 = (VA) ot;
        va3.getClass();
        this.i = new SA(va3, c0874cz3);
        C0874cz c0874cz4 = new C0874cz(this, 4);
        VA va4 = (VA) ot;
        va4.getClass();
        this.j = new SA(va4, c0874cz4);
        C0874cz c0874cz5 = new C0874cz(this, 1);
        VA va5 = (VA) ot;
        va5.getClass();
        this.k = new SA(va5, c0874cz5);
        this.l = ((VA) ot).b(new C0939dz(this, 3));
    }

    public static AbstractC1004ey l(GM gm, C1216i8 c1216i8) {
        AbstractC0048Bt.n(gm, "method");
        Class<?> declaringClass = ((Method) gm.b()).getDeclaringClass();
        AbstractC0048Bt.m(declaringClass, "member.declaringClass");
        return ((C0950e6) c1216i8.m).S(gm.f(), AbstractC1305jX.J(2, declaringClass.isAnnotation(), null, 6));
    }

    public static C0260Jx u(C1216i8 c1216i8, AbstractC0433Qp abstractC0433Qp, List list) {
        C1619oH c1619oH;
        AbstractC1004ey abstractC1004ey;
        C0827cE c0827cE;
        C0827cE e;
        C0950e6 c0950e6 = (C0950e6) c1216i8.m;
        C1198hu c1198hu = (C1198hu) c1216i8.i;
        InterfaceC0761bD interfaceC0761bD = c1198hu.f177o;
        S6 N0 = AbstractC0720ac.N0(list);
        ArrayList arrayList = new ArrayList(AbstractC0786bc.d0(N0));
        Iterator it = N0.iterator();
        boolean z = false;
        while (true) {
            C1779qj c1779qj = (C1779qj) it;
            if (!c1779qj.i.hasNext()) {
                return new C0260Jx(AbstractC0720ac.J0(arrayList), z, 1);
            }
            C0021As c0021As = (C0021As) c1779qj.next();
            int i = c0021As.a;
            MM mm = (MM) c0021As.b;
            C0338My G = AbstractC0022At.G(c1216i8, mm);
            C1658ou J = AbstractC1305jX.J(2, false, null, 7);
            boolean z2 = mm.d;
            KM km = mm.a;
            if (z2) {
                C1821rM c1821rM = km instanceof C1821rM ? (C1821rM) km : null;
                if (c1821rM == null) {
                    throw new AssertionError("Vararg parameter should be an array: " + mm);
                }
                AbstractC2097vY R = c0950e6.R(c1821rM, J, true);
                c1619oH = new C1619oH(R, interfaceC0761bD.l().f(R));
            } else {
                c1619oH = new C1619oH(c0950e6.S(km, J), null);
            }
            AbstractC1004ey abstractC1004ey2 = (AbstractC1004ey) c1619oH.h;
            AbstractC1004ey abstractC1004ey3 = (AbstractC1004ey) c1619oH.i;
            if (AbstractC0048Bt.h(abstractC0433Qp.getName().b(), "equals") && list.size() == 1 && interfaceC0761bD.l().o().equals(abstractC1004ey2)) {
                e = C0827cE.e("other");
            } else {
                String str = mm.c;
                C0827cE d = str != null ? C0827cE.d(str) : null;
                if (d == null) {
                    z = true;
                }
                if (d == null) {
                    e = C0827cE.e("p" + i);
                } else {
                    abstractC1004ey = abstractC1004ey2;
                    c0827cE = d;
                    arrayList.add(new RY(abstractC0433Qp, null, i, G, c0827cE, abstractC1004ey, false, false, false, abstractC1004ey3, c1198hu.j.H0(mm)));
                }
            }
            abstractC1004ey = abstractC1004ey2;
            c0827cE = e;
            arrayList.add(new RY(abstractC0433Qp, null, i, G, c0827cE, abstractC1004ey, false, false, false, abstractC1004ey3, c1198hu.j.H0(mm)));
        }
    }

    @Override // o.XB, o.WB
    public Collection a(C0827cE c0827cE, DE de) {
        AbstractC0048Bt.n(c0827cE, "name");
        AbstractC0048Bt.n(de, "location");
        return !d().contains(c0827cE) ? C1318jk.h : (Collection) this.h.invoke(c0827cE);
    }

    @Override // o.XB, o.PN
    public Collection b(C2106vh c2106vh, InterfaceC2114vp interfaceC2114vp) {
        AbstractC0048Bt.n(c2106vh, "kindFilter");
        return (Collection) this.d.invoke();
    }

    @Override // o.XB, o.WB
    public Collection c(C0827cE c0827cE, DE de) {
        AbstractC0048Bt.n(c0827cE, "name");
        return !e().contains(c0827cE) ? C1318jk.h : (Collection) this.l.invoke(c0827cE);
    }

    @Override // o.XB, o.WB
    public final Set d() {
        return (Set) AbstractC0772bO.o(this.i, m[0]);
    }

    @Override // o.XB, o.WB
    public final Set e() {
        return (Set) AbstractC0772bO.o(this.j, m[1]);
    }

    @Override // o.XB, o.WB
    public final Set f() {
        return (Set) AbstractC0772bO.o(this.k, m[2]);
    }

    public abstract Set h(C2106vh c2106vh, InterfaceC2114vp interfaceC2114vp);

    public abstract Set i(C2106vh c2106vh, C2316yt c2316yt);

    public void j(ArrayList arrayList, C0827cE c0827cE) {
        AbstractC0048Bt.n(c0827cE, "name");
    }

    public abstract InterfaceC1578ng k();

    public abstract void m(LinkedHashSet linkedHashSet, C0827cE c0827cE);

    public abstract void n(ArrayList arrayList, C0827cE c0827cE);

    public abstract Set o(C2106vh c2106vh);

    public abstract C0261Jy p();

    public abstract InterfaceC1118gg q();

    public boolean r(C0934du c0934du) {
        return true;
    }

    public abstract C0808bz s(GM gm, ArrayList arrayList, AbstractC1004ey abstractC1004ey, List list);

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, o.Iy] */
    public final C0934du t(GM gm) {
        AbstractC0048Bt.n(gm, "method");
        C1216i8 c1216i8 = this.b;
        int i = 1;
        C0934du W0 = C0934du.W0(q(), AbstractC0022At.G(c1216i8, gm), gm.c(), ((C1198hu) c1216i8.i).j.H0(gm), ((InterfaceC1578ng) this.e.invoke()).f(gm.c()) != null && ((ArrayList) gm.g()).isEmpty());
        AbstractC0048Bt.n(c1216i8, "<this>");
        C1216i8 c1216i82 = new C1216i8((C1198hu) c1216i8.i, new C1333jz(c1216i8, W0, gm, 0), c1216i8.k);
        ArrayList typeParameters = gm.getTypeParameters();
        ArrayList arrayList = new ArrayList(AbstractC0786bc.d0(typeParameters));
        Iterator it = typeParameters.iterator();
        while (it.hasNext()) {
            InterfaceC1437lX h = ((InterfaceC1569nX) c1216i82.j).h((LM) it.next());
            AbstractC0048Bt.k(h);
            arrayList.add(h);
        }
        C0260Jx u = u(c1216i82, W0, gm.g());
        C0808bz s = s(gm, arrayList, l(gm, c1216i82), (List) u.j);
        List list = s.d;
        C0261Jy p = p();
        ArrayList arrayList2 = s.c;
        List list2 = s.b;
        AbstractC1004ey abstractC1004ey = s.a;
        boolean isAbstract = Modifier.isAbstract(((Method) gm.b()).getModifiers());
        boolean isFinal = Modifier.isFinal(((Method) gm.b()).getModifiers());
        if (isAbstract) {
            i = 4;
        } else if (!isFinal) {
            i = 3;
        }
        W0.V0(null, p, C1318jk.h, arrayList2, list2, abstractC1004ey, i, AbstractC2219xO.t(gm.e()), C1384kk.h);
        W0.X0(false, u.i);
        if (list.isEmpty()) {
            return W0;
        }
        ((C1198hu) c1216i82.i).e.getClass();
        throw new UnsupportedOperationException("Should not be called");
    }

    public String toString() {
        return "Lazy scope for " + q();
    }
}
