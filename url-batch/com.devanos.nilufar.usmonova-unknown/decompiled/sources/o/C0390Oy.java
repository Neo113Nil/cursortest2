package o;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: o.Oy, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0390Oy extends AbstractC1309jb implements InterfaceC0593Wt {
    public final C1137gz A;
    public final C0338My B;
    public final SA C;
    public final C1216i8 n;

    /* renamed from: o, reason: collision with root package name */
    public final C2217xM f79o;
    public final InterfaceC1245ib p;
    public final C1216i8 q;
    public final BU r;
    public final int s;
    public final int t;
    public final AbstractC2325z00 u;
    public final boolean v;
    public final C0555Vh w;
    public final C0494Sy x;
    public final C1168hQ y;
    public final C0332Ms z;

    static {
        P6.u0(new String[]{"equals", "hashCode", "getClass", "wait", "notify", "notifyAll", "toString"});
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0390Oy(C1216i8 c1216i8, InterfaceC1118gg interfaceC1118gg, C2217xM c2217xM, InterfaceC1245ib interfaceC1245ib) {
        super(r1, interfaceC1118gg, C0827cE.e(r2.getSimpleName()), r0.j.H0(c2217xM));
        AbstractC0048Bt.n(c1216i8, "outerContext");
        AbstractC0048Bt.n(interfaceC1118gg, "containingDeclaration");
        AbstractC0048Bt.n(c2217xM, "jClass");
        C1198hu c1198hu = (C1198hu) c1216i8.i;
        OT ot = c1198hu.a;
        Class cls = c2217xM.a;
        this.n = c1216i8;
        this.f79o = c2217xM;
        this.p = interfaceC1245ib;
        int i = 4;
        C1216i8 p = AbstractC0048Bt.p(c1216i8, this, c2217xM, 4);
        this.q = p;
        C1198hu c1198hu2 = (C1198hu) p.i;
        OT ot2 = c1198hu2.a;
        c1198hu2.g.getClass();
        this.r = EB.D(new C0364Ny(this, 2));
        this.s = cls.isAnnotation() ? 5 : cls.isInterface() ? 2 : cls.isEnum() ? 3 : 1;
        if (!cls.isAnnotation() && !cls.isEnum()) {
            boolean g = c2217xM.g();
            boolean z = c2217xM.g() || Modifier.isAbstract(cls.getModifiers()) || cls.isInterface();
            boolean isFinal = Modifier.isFinal(cls.getModifiers());
            if (g) {
                i = 2;
            } else if (!z) {
                if (!isFinal) {
                    i = 3;
                }
            }
            this.t = i;
            int modifiers = cls.getModifiers();
            this.u = !Modifier.isPublic(modifiers) ? C2127w00.c : Modifier.isPrivate(modifiers) ? C1929t00.c : Modifier.isProtected(modifiers) ? Modifier.isStatic(modifiers) ? C2317yu.c : C2251xu.c : C2185wu.c;
            Class<?> declaringClass = cls.getDeclaringClass();
            this.v = (declaringClass == null ? new C2217xM(declaringClass) : null) == null && !Modifier.isStatic(cls.getModifiers());
            this.w = new C0555Vh(this);
            C0494Sy c0494Sy = new C0494Sy(p, this, c2217xM, interfaceC1245ib != null, null);
            this.x = c0494Sy;
            C0140Fh c0140Fh = C1168hQ.d;
            ((AE) c1198hu2.u).getClass();
            C1400l c1400l = new C1400l(23, this);
            c0140Fh.getClass();
            AbstractC0048Bt.n(ot2, "storageManager");
            this.y = new C1168hQ(this, ot2, c1400l);
            this.z = new C0332Ms(c0494Sy);
            this.A = new C1137gz(p, c2217xM, this);
            this.B = AbstractC0022At.G(p, c2217xM);
            C0364Ny c0364Ny = new C0364Ny(this, 1);
            VA va = (VA) ot2;
            va.getClass();
            this.C = new SA(va, c0364Ny);
        }
        i = 1;
        this.t = i;
        int modifiers2 = cls.getModifiers();
        this.u = !Modifier.isPublic(modifiers2) ? C2127w00.c : Modifier.isPrivate(modifiers2) ? C1929t00.c : Modifier.isProtected(modifiers2) ? Modifier.isStatic(modifiers2) ? C2317yu.c : C2251xu.c : C2185wu.c;
        Class<?> declaringClass2 = cls.getDeclaringClass();
        this.v = (declaringClass2 == null ? new C2217xM(declaringClass2) : null) == null && !Modifier.isStatic(cls.getModifiers());
        this.w = new C0555Vh(this);
        C0494Sy c0494Sy2 = new C0494Sy(p, this, c2217xM, interfaceC1245ib != null, null);
        this.x = c0494Sy2;
        C0140Fh c0140Fh2 = C1168hQ.d;
        ((AE) c1198hu2.u).getClass();
        C1400l c1400l2 = new C1400l(23, this);
        c0140Fh2.getClass();
        AbstractC0048Bt.n(ot2, "storageManager");
        this.y = new C1168hQ(this, ot2, c1400l2);
        this.z = new C0332Ms(c0494Sy2);
        this.A = new C1137gz(p, c2217xM, this);
        this.B = AbstractC0022At.G(p, c2217xM);
        C0364Ny c0364Ny2 = new C0364Ny(this, 1);
        VA va2 = (VA) ot2;
        va2.getClass();
        this.C = new SA(va2, c0364Ny2);
    }

    @Override // o.InterfaceC1245ib
    public final int B() {
        return this.s;
    }

    @Override // o.InterfaceC1245ib
    public final boolean D() {
        return false;
    }

    @Override // o.InterfaceC1245ib
    public final Collection E() {
        return (List) this.x.q.invoke();
    }

    @Override // o.InterfaceC1245ib
    public final boolean K() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Collection, o.jk] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    @Override // o.InterfaceC1245ib
    public final Collection U() {
        Class[] clsArr;
        ?? r0 = C1318jk.h;
        if (this.t != 2) {
            return r0;
        }
        Object obj = null;
        C1658ou J = AbstractC1305jX.J(2, false, null, 7);
        Class cls = this.f79o.a;
        AbstractC0048Bt.n(cls, "clazz");
        C1334k c1334k = AbstractC0022At.f14o;
        if (c1334k == null) {
            try {
                c1334k = new C1334k(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null), 9);
            } catch (NoSuchMethodException unused) {
                c1334k = new C1334k(obj, obj, obj, obj, 9);
            }
            AbstractC0022At.f14o = c1334k;
        }
        Method method = (Method) c1334k.j;
        if (method == null) {
            clsArr = null;
        } else {
            Object invoke = method.invoke(cls, null);
            AbstractC0048Bt.l(invoke, "null cannot be cast to non-null type kotlin.Array<java.lang.Class<*>>");
            clsArr = (Class[]) invoke;
        }
        if (clsArr != null) {
            r0 = new ArrayList(clsArr.length);
            for (Class cls2 : clsArr) {
                r0.add(new C2349zM(cls2));
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = r0.iterator();
        while (it.hasNext()) {
            InterfaceC2364zb c = ((C0950e6) this.q.m).S((C2349zM) it.next(), J).B0().c();
            InterfaceC1245ib interfaceC1245ib = c instanceof InterfaceC1245ib ? (InterfaceC1245ib) c : null;
            if (interfaceC1245ib != null) {
                arrayList.add(interfaceC1245ib);
            }
        }
        return AbstractC0720ac.G0(arrayList, new C0685a3(13));
    }

    @Override // o.OB
    public final boolean X() {
        return false;
    }

    @Override // o.InterfaceC1245ib, o.OB
    public final int g() {
        return this.t;
    }

    @Override // o.AbstractC1598o, o.InterfaceC1245ib
    public final WB g0() {
        return this.z;
    }

    @Override // o.W3
    public final InterfaceC1738q4 getAnnotations() {
        return this.B;
    }

    @Override // o.InterfaceC1245ib, o.InterfaceC1446lg, o.OB
    public final C0244Jh getVisibility() {
        C0244Jh c0244Jh = AbstractC0270Kh.a;
        AbstractC2325z00 abstractC2325z00 = this.u;
        if (AbstractC0048Bt.h(abstractC2325z00, c0244Jh)) {
            Class<?> declaringClass = this.f79o.a.getDeclaringClass();
            if ((declaringClass != null ? new C2217xM(declaringClass) : null) == null) {
                C0244Jh c0244Jh2 = AbstractC0671Zt.a;
                AbstractC0048Bt.m(c0244Jh2, "{\n            JavaDescri…KAGE_VISIBILITY\n        }");
                return c0244Jh2;
            }
        }
        return AbstractC2219xO.t(abstractC2325z00);
    }

    @Override // o.InterfaceC1245ib
    public final LY h0() {
        return null;
    }

    @Override // o.InterfaceC1245ib
    public final C0981eb i0() {
        return null;
    }

    @Override // o.InterfaceC1245ib
    public final boolean j() {
        return false;
    }

    @Override // o.InterfaceC1245ib
    public final WB j0() {
        return this.A;
    }

    @Override // o.InterfaceC0004Ab
    public final boolean k() {
        return this.v;
    }

    @Override // o.InterfaceC1245ib
    public final boolean m() {
        return false;
    }

    @Override // o.AbstractC1598o, o.InterfaceC1245ib
    public final WB n0() {
        return (C0494Sy) super.n0();
    }

    @Override // o.InterfaceC1245ib, o.InterfaceC0004Ab
    public final List p() {
        return (List) this.C.invoke();
    }

    @Override // o.OB
    public final boolean p0() {
        return false;
    }

    public final String toString() {
        return "Lazy Java class " + AbstractC0192Hh.h(this);
    }

    @Override // o.YC
    public final WB u(C1398ky c1398ky) {
        C1168hQ c1168hQ = this.y;
        AbstractC0192Hh.j(c1168hQ.a);
        return (C0494Sy) ((WB) AbstractC0772bO.o(c1168hQ.c, C1168hQ.e[0]));
    }

    public final C0494Sy w0() {
        return (C0494Sy) super.n0();
    }

    @Override // o.InterfaceC1245ib
    public final boolean y0() {
        return false;
    }

    @Override // o.InterfaceC2364zb
    public final SW z() {
        return this.w;
    }
}
