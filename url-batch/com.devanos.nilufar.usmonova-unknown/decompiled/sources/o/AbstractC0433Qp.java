package o;

import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: o.Qp, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0433Qp extends AbstractC1314jg implements InterfaceC0381Op {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public Collection E;
    public volatile C1401l0 F;
    public final InterfaceC0381Op G;
    public final int H;
    public InterfaceC0381Op I;
    public Map J;
    public List l;
    public List m;
    public AbstractC1004ey n;

    /* renamed from: o, reason: collision with root package name */
    public List f92o;
    public C0261Jy p;
    public C0261Jy q;
    public int r;
    public C0244Jh s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC0433Qp(int i, InterfaceC1738q4 interfaceC1738q4, InterfaceC1118gg interfaceC1118gg, InterfaceC0381Op interfaceC0381Op, C0827cE c0827cE, IS is) {
        super(interfaceC1118gg, interfaceC1738q4, c0827cE, is);
        if (interfaceC1118gg == null) {
            A0(0);
            throw null;
        }
        if (interfaceC1738q4 == null) {
            A0(1);
            throw null;
        }
        if (c0827cE == null) {
            A0(2);
            throw null;
        }
        if (i == 0) {
            A0(3);
            throw null;
        }
        if (is == null) {
            A0(4);
            throw null;
        }
        this.s = AbstractC0270Kh.i;
        this.t = false;
        this.u = false;
        this.v = false;
        this.w = false;
        this.x = false;
        this.y = false;
        this.z = false;
        this.A = false;
        this.B = false;
        this.C = true;
        this.D = false;
        this.E = null;
        this.F = null;
        this.I = null;
        this.J = null;
        this.G = interfaceC0381Op == null ? this : interfaceC0381Op;
        this.H = i;
    }

    public static /* synthetic */ void A0(int i) {
        String str;
        int i2;
        switch (i) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                i2 = 2;
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = Constants.ScionAnalytics.PARAM_SOURCE;
                break;
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                objArr[0] = "contextReceiverParameters";
                break;
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                objArr[0] = "typeParameters";
                break;
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
            case 28:
            case 30:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 8:
            case 10:
                objArr[0] = "visibility";
                break;
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 11:
                objArr[0] = "unsubstitutedReturnType";
                break;
            case 12:
                objArr[0] = "extensionReceiverParameter";
                break;
            case 17:
                objArr[0] = "overriddenDescriptors";
                break;
            case 22:
                objArr[0] = "originalSubstitutor";
                break;
            case 24:
            case 29:
            case 31:
                objArr[0] = "substitutor";
                break;
            case 25:
                objArr[0] = "configuration";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 9:
                objArr[1] = "initialize";
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 13:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 14:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 15:
                objArr[1] = "getModality";
                break;
            case 16:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getTypeParameters";
                break;
            case 19:
                objArr[1] = "getValueParameters";
                break;
            case 20:
                objArr[1] = "getOriginal";
                break;
            case 21:
                objArr[1] = "getKind";
                break;
            case 23:
                objArr[1] = "newCopyBuilder";
                break;
            case 26:
                objArr[1] = "copy";
                break;
            case 27:
                objArr[1] = "getSourceToUseForCopy";
                break;
        }
        switch (i) {
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                break;
            case 10:
                objArr[2] = "setVisibility";
                break;
            case 11:
                objArr[2] = "setReturnType";
                break;
            case 12:
                objArr[2] = "setExtensionReceiverParameter";
                break;
            case 17:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case 22:
                objArr[2] = "substitute";
                break;
            case 24:
                objArr[2] = "newCopyBuilder";
                break;
            case 25:
                objArr[2] = "doSubstitute";
                break;
            case 28:
            case 29:
            case 30:
            case 31:
                objArr[2] = "getSubstitutedValueParameters";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                throw new IllegalStateException(format);
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    public static ArrayList L0(InterfaceC0381Op interfaceC0381Op, List list, C2096vX c2096vX, boolean z, boolean z2, boolean[] zArr) {
        if (list == null) {
            A0(30);
            throw null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            RY ry = (RY) it.next();
            RY ry2 = ry;
            AbstractC1004ey i = c2096vX.i(2, ry2.c());
            AbstractC1004ey abstractC1004ey = ry.q;
            AbstractC1004ey i2 = abstractC1004ey == null ? null : c2096vX.i(2, abstractC1004ey);
            if (i == null) {
                return null;
            }
            if ((i != ry2.c() || abstractC1004ey != i2) && zArr != null) {
                zArr[0] = true;
            }
            C1335k0 c1335k0 = ry instanceof QY ? new C1335k0(2, (List) ((QY) ry).s.getValue()) : null;
            RY ry3 = z ? null : ry;
            int i3 = ry.m;
            InterfaceC1738q4 annotations = ry.getAnnotations();
            C0827cE name = ry.getName();
            boolean I0 = ry.I0();
            boolean z3 = ry.f98o;
            boolean z4 = ry.p;
            IS d = z2 ? ry.d() : IS.e;
            AbstractC0048Bt.n(interfaceC0381Op, "containingDeclaration");
            AbstractC0048Bt.n(annotations, "annotations");
            AbstractC0048Bt.n(name, "name");
            AbstractC0048Bt.n(d, Constants.ScionAnalytics.PARAM_SOURCE);
            arrayList.add(c1335k0 == null ? new RY(interfaceC0381Op, ry3, i3, annotations, name, i, I0, z3, z4, i2, d) : new QY(interfaceC0381Op, ry3, i3, annotations, name, i, I0, z3, z4, i2, d, c1335k0));
        }
        return arrayList;
    }

    public Object C(C0633Yh c0633Yh) {
        Map map = this.J;
        if (map == null) {
            return null;
        }
        return map.get(c0633Yh);
    }

    public final InterfaceC0381Op H0(InterfaceC1118gg interfaceC1118gg, int i, C0244Jh c0244Jh) {
        InterfaceC0381Op build = m0().E(interfaceC1118gg).K(i).x(c0244Jh).w(2).e().build();
        if (build != null) {
            return build;
        }
        A0(26);
        throw null;
    }

    @Override // o.InterfaceC2204x9
    /* renamed from: I0, reason: merged with bridge method [inline-methods] */
    public HR y(InterfaceC1118gg interfaceC1118gg, int i, C0244Jh c0244Jh) {
        return (HR) H0(interfaceC1118gg, i, c0244Jh);
    }

    @Override // o.InterfaceC2072v9
    public final C0261Jy J() {
        return this.p;
    }

    public abstract AbstractC0433Qp J0(int i, InterfaceC1738q4 interfaceC1738q4, InterfaceC1118gg interfaceC1118gg, InterfaceC0381Op interfaceC0381Op, C0827cE c0827cE, IS is);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2 */
    public AbstractC0433Qp K0(C0407Pp c0407Pp) {
        ?? r10;
        C0261Jy c0261Jy;
        C0261Jy c0261Jy2;
        AbstractC1004ey i;
        boolean[] zArr = new boolean[1];
        InterfaceC1738q4 l = c0407Pp.z != null ? AbstractC0868ct.l(getAnnotations(), c0407Pp.z) : getAnnotations();
        InterfaceC1118gg interfaceC1118gg = c0407Pp.i;
        InterfaceC0381Op interfaceC0381Op = c0407Pp.l;
        int i2 = c0407Pp.m;
        C0827cE c0827cE = c0407Pp.s;
        IS d = c0407Pp.v ? ((AbstractC1314jg) (interfaceC0381Op != null ? interfaceC0381Op : a())).d() : IS.e;
        if (d == null) {
            A0(27);
            throw null;
        }
        AbstractC0433Qp J0 = J0(i2, l, interfaceC1118gg, interfaceC0381Op, c0827cE, d);
        List list = c0407Pp.y;
        if (list == null) {
            list = getTypeParameters();
        }
        zArr[0] = zArr[0] | (!list.isEmpty());
        ArrayList arrayList = new ArrayList(list.size());
        C2096vX U = AbstractC0868ct.U(list, c0407Pp.h, J0, arrayList, zArr);
        if (U != null) {
            ArrayList arrayList2 = new ArrayList();
            if (!c0407Pp.f86o.isEmpty()) {
                int i3 = 0;
                for (C0261Jy c0261Jy3 : c0407Pp.f86o) {
                    AbstractC1004ey i4 = U.i(2, c0261Jy3.c());
                    if (i4 != null) {
                        int i5 = i3 + 1;
                        arrayList2.add(AbstractC1807r8.u(J0, i4, ((C1708pe) c0261Jy3.H0()).F0(), c0261Jy3.getAnnotations(), i3));
                        zArr[0] = zArr[0] | (i4 != c0261Jy3.c());
                        i3 = i5;
                    }
                }
            }
            C0261Jy c0261Jy4 = c0407Pp.p;
            if (c0261Jy4 != null) {
                AbstractC1004ey i6 = U.i(2, c0261Jy4.c());
                if (i6 == null) {
                    return null;
                }
                c0407Pp.p.H0();
                C0261Jy c0261Jy5 = new C0261Jy(J0, new C1451ll(J0, i6), c0407Pp.p.getAnnotations());
                zArr[0] = (i6 != c0407Pp.p.c()) | zArr[0];
                r10 = 0;
                c0261Jy = c0261Jy5;
            } else {
                r10 = 0;
                c0261Jy = null;
            }
            C0261Jy c0261Jy6 = c0407Pp.q;
            if (c0261Jy6 != null) {
                C0261Jy e = c0261Jy6.e(U);
                if (e == null) {
                    return null;
                }
                zArr[r10] = zArr[r10] | (e != c0407Pp.q ? true : r10);
                c0261Jy2 = e;
            } else {
                c0261Jy2 = null;
            }
            ArrayList L0 = L0(J0, c0407Pp.n, U, c0407Pp.w, c0407Pp.v, zArr);
            if (L0 == null || (i = U.i(3, c0407Pp.r)) == null) {
                return null;
            }
            boolean z = zArr[r10] | (i != c0407Pp.r ? true : r10);
            zArr[r10] = z;
            if (!z && c0407Pp.D) {
                return this;
            }
            J0.M0(c0261Jy, c0261Jy2, arrayList2, arrayList, L0, i, c0407Pp.j, c0407Pp.k);
            J0.t = this.t;
            J0.u = this.u;
            J0.v = this.v;
            J0.w = this.w;
            J0.x = this.x;
            J0.B = this.B;
            J0.y = this.y;
            J0.P0(this.C);
            J0.z = c0407Pp.x;
            J0.A = c0407Pp.A;
            Boolean bool = c0407Pp.C;
            J0.Q0(bool != null ? bool.booleanValue() : this.D);
            if (!c0407Pp.B.isEmpty() || this.J != null) {
                LinkedHashMap linkedHashMap = c0407Pp.B;
                Map map = this.J;
                if (map != null) {
                    for (Map.Entry entry : map.entrySet()) {
                        if (!linkedHashMap.containsKey(entry.getKey())) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                }
                if (linkedHashMap.size() == 1) {
                    J0.J = Collections.singletonMap(linkedHashMap.keySet().iterator().next(), linkedHashMap.values().iterator().next());
                } else {
                    J0.J = linkedHashMap;
                }
            }
            if (c0407Pp.u || this.I != null) {
                InterfaceC0381Op interfaceC0381Op2 = this.I;
                if (interfaceC0381Op2 == null) {
                    interfaceC0381Op2 = this;
                }
                J0.I = interfaceC0381Op2.e(U);
            }
            if (c0407Pp.t && !a().o().isEmpty()) {
                if (c0407Pp.h.e()) {
                    C1401l0 c1401l0 = this.F;
                    if (c1401l0 != null) {
                        J0.F = c1401l0;
                        return J0;
                    }
                    J0.c0(o());
                    return J0;
                }
                J0.F = new C1401l0(this, 1, U);
            }
            return J0;
        }
        return null;
    }

    @Override // o.InterfaceC2204x9
    public final int M() {
        int i = this.H;
        if (i != 0) {
            return i;
        }
        A0(21);
        throw null;
    }

    public void M0(C0261Jy c0261Jy, C0261Jy c0261Jy2, List list, List list2, List list3, AbstractC1004ey abstractC1004ey, int i, C0244Jh c0244Jh) {
        if (list == null) {
            A0(5);
            throw null;
        }
        if (list2 == null) {
            A0(6);
            throw null;
        }
        if (list3 == null) {
            A0(7);
            throw null;
        }
        if (c0244Jh == null) {
            A0(8);
            throw null;
        }
        this.l = AbstractC0720ac.J0(list2);
        this.m = AbstractC0720ac.J0(list3);
        this.n = abstractC1004ey;
        this.r = i;
        this.s = c0244Jh;
        this.p = c0261Jy;
        this.q = c0261Jy2;
        this.f92o = list;
        for (int i2 = 0; i2 < list2.size(); i2++) {
            InterfaceC1437lX interfaceC1437lX = (InterfaceC1437lX) list2.get(i2);
            if (interfaceC1437lX.getIndex() != i2) {
                throw new IllegalStateException(interfaceC1437lX + " index is " + interfaceC1437lX.getIndex() + " but position is " + i2);
            }
        }
        for (int i3 = 0; i3 < list3.size(); i3++) {
            RY ry = (RY) list3.get(i3);
            if (ry.m != i3) {
                throw new IllegalStateException(ry + "index is " + ry.m + " but position is " + i3);
            }
        }
    }

    public final C0407Pp N0(C2096vX c2096vX) {
        if (c2096vX != null) {
            return new C0407Pp(this, c2096vX.f(), n(), g(), getVisibility(), M(), t0(), T(), this.p, getReturnType());
        }
        A0(24);
        throw null;
    }

    public final void O0(C0633Yh c0633Yh, Object obj) {
        if (this.J == null) {
            this.J = new LinkedHashMap();
        }
        this.J.put(c0633Yh, obj);
    }

    public void P0(boolean z) {
        this.C = z;
    }

    @Override // o.InterfaceC2072v9
    public boolean Q() {
        return this.D;
    }

    public void Q0(boolean z) {
        this.D = z;
    }

    public final void R0(JR jr) {
        if (jr != null) {
            this.n = jr;
        } else {
            A0(11);
            throw null;
        }
    }

    @Override // o.InterfaceC2072v9
    public final List T() {
        List list = this.f92o;
        if (list != null) {
            return list;
        }
        A0(13);
        throw null;
    }

    @Override // o.OB
    public final boolean X() {
        return this.y;
    }

    @Override // o.AbstractC1314jg, o.AbstractC1184hg, o.InterfaceC1118gg
    public InterfaceC0381Op a() {
        InterfaceC0381Op interfaceC0381Op = this.G;
        InterfaceC0381Op a = interfaceC0381Op == this ? this : interfaceC0381Op.a();
        if (a != null) {
            return a;
        }
        A0(20);
        throw null;
    }

    @Override // o.InterfaceC0381Op
    public final boolean b0() {
        return this.z;
    }

    public void c0(Collection collection) {
        if (collection == null) {
            A0(17);
            throw null;
        }
        this.E = collection;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (((InterfaceC0381Op) it.next()).l0()) {
                this.A = true;
                return;
            }
        }
    }

    public boolean e0() {
        return this.x;
    }

    @Override // o.InterfaceC0381Op
    public final boolean f0() {
        if (this.t) {
            return true;
        }
        Iterator it = a().o().iterator();
        while (it.hasNext()) {
            if (((InterfaceC0381Op) it.next()).f0()) {
                return true;
            }
        }
        return false;
    }

    @Override // o.OB
    public final int g() {
        int i = this.r;
        if (i != 0) {
            return i;
        }
        A0(15);
        throw null;
    }

    public AbstractC1004ey getReturnType() {
        return this.n;
    }

    @Override // o.InterfaceC2072v9
    public final List getTypeParameters() {
        List list = this.l;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("typeParameters == null for " + this);
    }

    @Override // o.InterfaceC1446lg, o.OB
    public final C0244Jh getVisibility() {
        C0244Jh c0244Jh = this.s;
        if (c0244Jh != null) {
            return c0244Jh;
        }
        A0(16);
        throw null;
    }

    public boolean isSuspend() {
        return this.B;
    }

    @Override // o.InterfaceC0381Op
    public final boolean l0() {
        return this.A;
    }

    public boolean m() {
        return this.w;
    }

    public InterfaceC0355Np m0() {
        return N0(C2096vX.b);
    }

    @Override // o.InterfaceC2204x9, o.InterfaceC2072v9
    public Collection o() {
        C1401l0 c1401l0 = this.F;
        if (c1401l0 != null) {
            this.E = (Collection) c1401l0.invoke();
            this.F = null;
        }
        Collection collection = this.E;
        if (collection == null) {
            collection = Collections.EMPTY_LIST;
        }
        if (collection != null) {
            return collection;
        }
        A0(14);
        throw null;
    }

    @Override // o.OB
    public final boolean p0() {
        return false;
    }

    @Override // o.InterfaceC1118gg
    public Object t(InterfaceC1380kg interfaceC1380kg, Object obj) {
        return interfaceC1380kg.S(this, obj);
    }

    @Override // o.InterfaceC2072v9
    public final List t0() {
        List list = this.m;
        if (list != null) {
            return list;
        }
        A0(19);
        throw null;
    }

    @Override // o.InterfaceC0381Op
    public final boolean u0() {
        if (this.u) {
            return true;
        }
        Iterator it = a().o().iterator();
        while (it.hasNext()) {
            if (((InterfaceC0381Op) it.next()).u0()) {
                return true;
            }
        }
        return false;
    }

    @Override // o.InterfaceC0381Op
    public final InterfaceC0381Op v() {
        return this.I;
    }

    public boolean w() {
        return this.v;
    }

    @Override // o.InterfaceC2072v9
    public final C0261Jy x() {
        return this.q;
    }

    @Override // o.InterfaceC1106gU
    public InterfaceC0381Op e(C2096vX c2096vX) {
        if (c2096vX == null) {
            A0(22);
            throw null;
        }
        if (c2096vX.a.e()) {
            return this;
        }
        C0407Pp N0 = N0(c2096vX);
        N0.l = a();
        N0.v = true;
        N0.D = true;
        return N0.E.K0(N0);
    }
}
