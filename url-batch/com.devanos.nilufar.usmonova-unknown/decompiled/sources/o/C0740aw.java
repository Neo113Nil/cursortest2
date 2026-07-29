package o;

import java.util.Collection;
import java.util.List;

/* renamed from: o.aw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0740aw extends AbstractC1330jw implements InterfaceC0517Tv, InterfaceC1858rx {
    public static final /* synthetic */ int k = 0;
    public final Class i;
    public final SM j;

    public C0740aw(Class cls) {
        AbstractC0048Bt.n(cls, "jClass");
        this.i = cls;
        this.j = new SM(new C0569Vv(this, 8));
    }

    @Override // o.InterfaceC0517Tv
    public final String a() {
        RM rm = ((C0621Xv) this.j.invoke()).e;
        InterfaceC0937dx interfaceC0937dx = C0621Xv.n[3];
        return (String) rm.invoke();
    }

    @Override // o.InterfaceC0517Tv
    public final boolean d() {
        return x().g() == 2;
    }

    @Override // o.InterfaceC0916db
    public final Class e() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0740aw) && AbstractC1473m3.E(this).equals(AbstractC1473m3.E((InterfaceC0517Tv) obj));
    }

    @Override // o.InterfaceC0517Tv
    public final boolean f(Object obj) {
        List list = AbstractC1492mM.a;
        Class cls = this.i;
        AbstractC0048Bt.n(cls, "<this>");
        Integer num = (Integer) AbstractC1492mM.d.get(cls);
        if (num != null) {
            return AbstractC1305jX.w(num.intValue(), obj);
        }
        Class cls2 = (Class) AbstractC1492mM.c.get(cls);
        if (cls2 != null) {
            cls = cls2;
        }
        return cls.isInstance(obj);
    }

    @Override // o.InterfaceC0517Tv
    public final String g() {
        RM rm = ((C0621Xv) this.j.invoke()).d;
        InterfaceC0937dx interfaceC0937dx = C0621Xv.n[2];
        return (String) rm.invoke();
    }

    @Override // o.InterfaceC0361Nv
    public final List getAnnotations() {
        throw null;
    }

    @Override // o.InterfaceC0517Tv
    public final Object h() {
        SM sm = ((C0621Xv) this.j.invoke()).g;
        InterfaceC0937dx interfaceC0937dx = C0621Xv.n[6];
        return sm.invoke();
    }

    public final int hashCode() {
        return AbstractC1473m3.E(this).hashCode();
    }

    @Override // o.InterfaceC0517Tv
    public final boolean isAbstract() {
        return x().g() == 4;
    }

    @Override // o.InterfaceC0517Tv
    public final boolean j() {
        return x().j();
    }

    @Override // o.InterfaceC0517Tv
    public final boolean k() {
        return x().k();
    }

    @Override // o.AbstractC1330jw
    public final Collection m() {
        InterfaceC1245ib x = x();
        if (x.B() == 2 || x.B() == 6) {
            return C1318jk.h;
        }
        Collection E = x.E();
        AbstractC0048Bt.m(E, "descriptor.constructors");
        return E;
    }

    @Override // o.AbstractC1330jw
    public final Collection n(C0827cE c0827cE) {
        WB r0 = x().i().r0();
        DE de = DE.i;
        Collection a = r0.a(c0827cE, de);
        WB j0 = x().j0();
        AbstractC0048Bt.m(j0, "descriptor.staticScope");
        return AbstractC0720ac.A0(a, j0.a(c0827cE, de));
    }

    @Override // o.AbstractC1330jw
    public final PJ o(int i) {
        Class<?> declaringClass;
        Class cls = this.i;
        if (cls.getSimpleName().equals("DefaultImpls") && (declaringClass = cls.getDeclaringClass()) != null && declaringClass.isInterface()) {
            return ((C0740aw) AbstractC1473m3.G(declaringClass)).o(i);
        }
        InterfaceC1245ib x = x();
        C0581Wh c0581Wh = x instanceof C0581Wh ? (C0581Wh) x : null;
        if (c0581Wh != null) {
            C1030fK c1030fK = c0581Wh.l;
            C2049uq c2049uq = AbstractC0180Gv.j;
            AbstractC0048Bt.m(c2049uq, "classLocalVariable");
            CK ck = (CK) AbstractC1305jX.t(c1030fK, c2049uq, i);
            if (ck != null) {
                C0321Mh c0321Mh = c0581Wh.s;
                return (PJ) JY.f(this.i, ck, c0321Mh.b, c0321Mh.d, c0581Wh.m, C0673Zv.j);
            }
        }
        return null;
    }

    @Override // o.AbstractC1330jw
    public final Collection r(C0827cE c0827cE) {
        WB r0 = x().i().r0();
        DE de = DE.i;
        Collection c = r0.c(c0827cE, de);
        WB j0 = x().j0();
        AbstractC0048Bt.m(j0, "descriptor.staticScope");
        return AbstractC0720ac.A0(c, j0.c(c0827cE, de));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("class ");
        C1639ob w = w();
        C2245xo g = w.g();
        AbstractC0048Bt.m(g, "classId.packageFqName");
        String concat = g.d() ? "" : g.b().concat(".");
        sb.append(concat + AbstractC0778bU.y(w.h().b(), '.', '$'));
        return sb.toString();
    }

    public final C1639ob w() {
        EnumC1423lJ d;
        C1639ob c1639ob = AbstractC0969eP.a;
        Class cls = this.i;
        AbstractC0048Bt.n(cls, "klass");
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            AbstractC0048Bt.m(componentType, "klass.componentType");
            d = componentType.isPrimitive() ? EnumC1791qv.b(componentType.getSimpleName()).d() : null;
            return d != null ? new C1639ob(AbstractC1499mT.j, d.i) : C1639ob.j(AbstractC1433lT.g.g());
        }
        if (cls.equals(Void.TYPE)) {
            return AbstractC0969eP.a;
        }
        d = cls.isPrimitive() ? EnumC1791qv.b(cls.getSimpleName()).d() : null;
        if (d != null) {
            return new C1639ob(AbstractC1499mT.j, d.h);
        }
        C1639ob a = AbstractC1492mM.a(cls);
        if (!a.c) {
            String str = C1460lu.a;
            C1639ob c1639ob2 = (C1639ob) C1460lu.h.get(a.b().i());
            if (c1639ob2 != null) {
                return c1639ob2;
            }
        }
        return a;
    }

    public final InterfaceC1245ib x() {
        return ((C0621Xv) this.j.invoke()).a();
    }
}
