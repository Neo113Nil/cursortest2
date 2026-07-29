package o;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: o.Ly, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0312Ly implements InterfaceC0948e4, NI {
    public static final /* synthetic */ InterfaceC0937dx[] h;
    public final C1216i8 a;
    public final C1558nM b;
    public final RA c;
    public final SA d;
    public final C0904dP e;
    public final SA f;
    public final boolean g;

    static {
        VM vm = UM.a;
        h = new InterfaceC0937dx[]{vm.g(new UJ(vm.b(C0312Ly.class), "fqName", "getFqName()Lorg/jetbrains/kotlin/name/FqName;")), vm.g(new UJ(vm.b(C0312Ly.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;")), vm.g(new UJ(vm.b(C0312Ly.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};
    }

    public C0312Ly(C1216i8 c1216i8, C1558nM c1558nM, boolean z) {
        AbstractC0048Bt.n(c1216i8, "c");
        AbstractC0048Bt.n(c1558nM, "javaAnnotation");
        this.a = c1216i8;
        this.b = c1558nM;
        C1198hu c1198hu = (C1198hu) c1216i8.i;
        OT ot = c1198hu.a;
        C0287Ky c0287Ky = new C0287Ky(this, 1);
        VA va = (VA) ot;
        va.getClass();
        this.c = new RA(va, c0287Ky);
        C0287Ky c0287Ky2 = new C0287Ky(this, 2);
        VA va2 = (VA) ot;
        va2.getClass();
        this.d = new SA(va2, c0287Ky2);
        this.e = c1198hu.j.H0(c1558nM);
        C0287Ky c0287Ky3 = new C0287Ky(this, 0);
        VA va3 = (VA) ot;
        va3.getClass();
        this.f = new SA(va3, c0287Ky3);
        this.g = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final AbstractC0551Vd a(InterfaceC0411Pt interfaceC0411Pt) {
        AbstractC1004ey h2;
        if (interfaceC0411Pt instanceof EM) {
            return HO.l(((EM) interfaceC0411Pt).b, null);
        }
        if (interfaceC0411Pt instanceof CM) {
            CM cm = (CM) interfaceC0411Pt;
            Class<?> cls = cm.b.getClass();
            if (!cls.isEnum()) {
                cls = cls.getEnclosingClass();
            }
            AbstractC0048Bt.m(cls, "enumClass");
            return new C2175wk(AbstractC1492mM.a(cls), C0827cE.e(cm.b.name()));
        }
        boolean z = interfaceC0411Pt instanceof C1756qM;
        C1216i8 c1216i8 = this.a;
        if (z) {
            C1756qM c1756qM = (C1756qM) interfaceC0411Pt;
            C0827cE c0827cE = c1756qM.a;
            if (c0827cE == null) {
                c0827cE = AbstractC0438Qu.b;
            }
            AbstractC0048Bt.m(c0827cE, "argument.name ?: DEFAULT_ANNOTATION_MEMBER_NAME");
            ArrayList a = c1756qM.a();
            JR jr = (JR) AbstractC0772bO.o(this.d, h[1]);
            AbstractC0048Bt.m(jr, "type");
            if (!AbstractC1473m3.P(jr)) {
                InterfaceC1245ib d = AbstractC0192Hh.d(this);
                AbstractC0048Bt.k(d);
                RY w = AbstractC1052fg.w(c0827cE, d);
                if (w == null || (h2 = w.c()) == null) {
                    h2 = ((C1198hu) c1216i8.i).f177o.l().h(C0273Kk.c(EnumC0247Jk.K, new String[0]));
                }
                ArrayList arrayList = new ArrayList(AbstractC0786bc.d0(a));
                Iterator it = a.iterator();
                while (it.hasNext()) {
                    AbstractC0551Vd a2 = a((InterfaceC0411Pt) it.next());
                    if (a2 == null) {
                        a2 = new C1880sF(null);
                    }
                    arrayList.add(a2);
                }
                return new AX(arrayList, h2);
            }
        } else {
            if (interfaceC0411Pt instanceof C1690pM) {
                return new C1606o4((Object) new C0312Ly(c1216i8, new C1558nM(((C1690pM) interfaceC0411Pt).b), false));
            }
            if (interfaceC0411Pt instanceof C2283yM) {
                Class cls2 = ((C2283yM) interfaceC0411Pt).b;
                AbstractC1004ey S = ((C0950e6) c1216i8.m).S(cls2.isPrimitive() ? new IM(cls2) : ((cls2 instanceof GenericArrayType) || cls2.isArray()) ? new C1821rM(cls2) : cls2 instanceof WildcardType ? new NM((WildcardType) cls2) : new C2349zM(cls2), AbstractC1305jX.J(2, false, null, 7));
                if (!AbstractC1473m3.P(S)) {
                    AbstractC1004ey abstractC1004ey = S;
                    int i = 0;
                    while (AbstractC0545Ux.y(abstractC1004ey)) {
                        abstractC1004ey = ((AbstractC1701pX) AbstractC0720ac.D0(abstractC1004ey.w0())).b();
                        AbstractC0048Bt.m(abstractC1004ey, "type.arguments.single().type");
                        i++;
                    }
                    InterfaceC2364zb c = abstractC1004ey.B0().c();
                    if (c instanceof InterfaceC1245ib) {
                        C1639ob f = AbstractC0192Hh.f(c);
                        return f == null ? new C1002ew(new C0806bw(S)) : new C1002ew(f, i);
                    }
                    if (c instanceof InterfaceC1437lX) {
                        return new C1002ew(C1639ob.j(AbstractC1433lT.a.g()), 0);
                    }
                }
            }
        }
        return null;
    }

    @Override // o.InterfaceC0948e4
    public final AbstractC1004ey c() {
        return (JR) AbstractC0772bO.o(this.d, h[1]);
    }

    @Override // o.InterfaceC0948e4
    public final IS d() {
        return this.e;
    }

    @Override // o.InterfaceC0948e4
    public final C2245xo e() {
        InterfaceC0937dx interfaceC0937dx = h[0];
        RA ra = this.c;
        AbstractC0048Bt.n(ra, "<this>");
        AbstractC0048Bt.n(interfaceC0937dx, "p");
        return (C2245xo) ra.invoke();
    }

    @Override // o.InterfaceC0948e4
    public final Map f() {
        return (Map) AbstractC0772bO.o(this.f, h[2]);
    }

    public final String toString() {
        return C2304yh.c.x(this, null);
    }
}
