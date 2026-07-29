package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: o.sz, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1926sz extends YC {
    public final YC h;
    public final C2096vX i;
    public C2096vX j;
    public ArrayList k;
    public ArrayList l;
    public C1968tb m;

    public C1926sz(YC yc, C2096vX c2096vX) {
        this.h = yc;
        this.i = c2096vX;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void F(int i) {
        String format;
        String str = (i == 2 || i == 3 || i == 5 || i == 6 || i == 8 || i == 10 || i == 13 || i == 23) ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i == 2 || i == 3 || i == 5 || i == 6 || i == 8 || i == 10 || i == 13 || i == 23) ? 3 : 2];
        if (i != 2) {
            if (i != 3) {
                if (i != 5) {
                    if (i != 6) {
                        if (i != 8) {
                            if (i != 10) {
                                if (i != 13) {
                                    if (i != 23) {
                                        objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor";
                                    } else {
                                        objArr[0] = "substitutor";
                                    }
                                    switch (i) {
                                        case 2:
                                        case 3:
                                        case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                                        case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                                        case 8:
                                        case 10:
                                        case 13:
                                        case 23:
                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor";
                                            break;
                                        case 4:
                                        case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                                        case 9:
                                        case 11:
                                            objArr[1] = "getMemberScope";
                                            break;
                                        case 12:
                                        case 14:
                                            objArr[1] = "getUnsubstitutedMemberScope";
                                            break;
                                        case 15:
                                            objArr[1] = "getStaticScope";
                                            break;
                                        case 16:
                                            objArr[1] = "getDefaultType";
                                            break;
                                        case 17:
                                            objArr[1] = "getContextReceivers";
                                            break;
                                        case 18:
                                            objArr[1] = "getConstructors";
                                            break;
                                        case 19:
                                            objArr[1] = "getAnnotations";
                                            break;
                                        case 20:
                                            objArr[1] = "getName";
                                            break;
                                        case 21:
                                            objArr[1] = "getOriginal";
                                            break;
                                        case 22:
                                            objArr[1] = "getContainingDeclaration";
                                            break;
                                        case 24:
                                            objArr[1] = "substitute";
                                            break;
                                        case 25:
                                            objArr[1] = "getKind";
                                            break;
                                        case 26:
                                            objArr[1] = "getModality";
                                            break;
                                        case 27:
                                            objArr[1] = "getVisibility";
                                            break;
                                        case 28:
                                            objArr[1] = "getUnsubstitutedInnerClassesScope";
                                            break;
                                        case 29:
                                            objArr[1] = "getSource";
                                            break;
                                        case 30:
                                            objArr[1] = "getDeclaredTypeParameters";
                                            break;
                                        case 31:
                                            objArr[1] = "getSealedSubclasses";
                                            break;
                                        default:
                                            objArr[1] = "getTypeConstructor";
                                            break;
                                    }
                                    if (i != 2 || i == 3 || i == 5 || i == 6 || i == 8 || i == 10) {
                                        objArr[2] = "getMemberScope";
                                    } else if (i == 13) {
                                        objArr[2] = "getUnsubstitutedMemberScope";
                                    } else if (i == 23) {
                                        objArr[2] = "substitute";
                                    }
                                    format = String.format(str, objArr);
                                    if (i == 2 && i != 3 && i != 5 && i != 6 && i != 8 && i != 10 && i != 13 && i != 23) {
                                        throw new IllegalStateException(format);
                                    }
                                    throw new IllegalArgumentException(format);
                                }
                            }
                        }
                    }
                }
                objArr[0] = "typeSubstitution";
                switch (i) {
                }
                if (i != 2) {
                }
                objArr[2] = "getMemberScope";
                format = String.format(str, objArr);
                if (i == 2) {
                }
                throw new IllegalArgumentException(format);
            }
            objArr[0] = "kotlinTypeRefiner";
            switch (i) {
            }
            if (i != 2) {
            }
            objArr[2] = "getMemberScope";
            format = String.format(str, objArr);
            if (i == 2) {
            }
            throw new IllegalArgumentException(format);
        }
        objArr[0] = "typeArguments";
        switch (i) {
        }
        if (i != 2) {
        }
        objArr[2] = "getMemberScope";
        format = String.format(str, objArr);
        if (i == 2) {
        }
        throw new IllegalArgumentException(format);
    }

    @Override // o.InterfaceC1245ib
    public final int B() {
        int B = this.h.B();
        if (B != 0) {
            return B;
        }
        F(25);
        throw null;
    }

    @Override // o.InterfaceC1245ib
    public final boolean D() {
        return this.h.D();
    }

    @Override // o.InterfaceC1245ib
    public final Collection E() {
        Collection<C0981eb> E = this.h.E();
        ArrayList arrayList = new ArrayList(E.size());
        for (C0981eb c0981eb : E) {
            C0981eb c0981eb2 = c0981eb;
            c0981eb2.getClass();
            C0407Pp N0 = c0981eb2.N0(C2096vX.b);
            N0.l = c0981eb.G0();
            N0.K(c0981eb2.g());
            N0.x(c0981eb2.getVisibility());
            N0.w(c0981eb2.M());
            N0.t = false;
            arrayList.add(((C0981eb) N0.E.K0(N0)).e(q0()));
        }
        return arrayList;
    }

    @Override // o.InterfaceC1245ib
    public final boolean K() {
        return this.h.K();
    }

    @Override // o.InterfaceC1245ib
    public final Collection U() {
        Collection U = this.h.U();
        if (U != null) {
            return U;
        }
        F(31);
        throw null;
    }

    @Override // o.OB
    public final boolean X() {
        return this.h.X();
    }

    @Override // o.YC, o.InterfaceC1118gg
    public final InterfaceC1245ib a() {
        InterfaceC1245ib a = this.h.a();
        if (a != null) {
            return a;
        }
        F(21);
        throw null;
    }

    @Override // o.InterfaceC1249ig
    public final IS d() {
        return IS.e;
    }

    @Override // o.InterfaceC1245ib
    public final WB d0(AbstractC1964tX abstractC1964tX) {
        AbstractC0192Hh.i(AbstractC0114Eh.d(this));
        return h(abstractC1964tX, C1398ky.a);
    }

    @Override // o.InterfaceC1106gU
    public final InterfaceC1249ig e(C2096vX c2096vX) {
        if (c2096vX != null) {
            return c2096vX.a.e() ? this : new C1926sz(this, C2096vX.e(c2096vX.f(), q0().f()));
        }
        F(23);
        throw null;
    }

    @Override // o.InterfaceC1245ib, o.OB
    public final int g() {
        int g = this.h.g();
        if (g != 0) {
            return g;
        }
        F(26);
        throw null;
    }

    @Override // o.InterfaceC1245ib
    public final WB g0() {
        WB g0 = this.h.g0();
        if (g0 != null) {
            return g0;
        }
        F(28);
        throw null;
    }

    @Override // o.W3
    public final InterfaceC1738q4 getAnnotations() {
        InterfaceC1738q4 annotations = this.h.getAnnotations();
        if (annotations != null) {
            return annotations;
        }
        F(19);
        throw null;
    }

    @Override // o.InterfaceC1118gg
    public final C0827cE getName() {
        C0827cE name = this.h.getName();
        if (name != null) {
            return name;
        }
        F(20);
        throw null;
    }

    @Override // o.InterfaceC1245ib, o.InterfaceC1446lg, o.OB
    public final C0244Jh getVisibility() {
        C0244Jh visibility = this.h.getVisibility();
        if (visibility != null) {
            return visibility;
        }
        F(27);
        throw null;
    }

    @Override // o.YC
    public final WB h(AbstractC1964tX abstractC1964tX, C1398ky c1398ky) {
        WB h = this.h.h(abstractC1964tX, c1398ky);
        if (!this.i.a.e()) {
            return new C1172hU(h, q0());
        }
        if (h != null) {
            return h;
        }
        F(7);
        throw null;
    }

    @Override // o.InterfaceC1245ib
    public final LY h0() {
        LY h0 = this.h.h0();
        if (h0 == null) {
            return null;
        }
        boolean z = h0 instanceof C0281Ks;
        C2096vX c2096vX = this.i;
        if (z) {
            C0281Ks c0281Ks = (C0281Ks) h0;
            C0827cE c0827cE = c0281Ks.a;
            JR jr = (JR) c0281Ks.b;
            if (jr != null && !c2096vX.a.e()) {
                jr = (JR) q0().i(1, jr);
            }
            return new C0281Ks(c0827cE, jr);
        }
        if (!(h0 instanceof C1615oD)) {
            throw new C0057Cc();
        }
        ArrayList arrayList = ((C1615oD) h0).a;
        ArrayList arrayList2 = new ArrayList(AbstractC0786bc.d0(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C1619oH c1619oH = (C1619oH) it.next();
            C0827cE c0827cE2 = (C0827cE) c1619oH.h;
            JR jr2 = (JR) ((MR) c1619oH.i);
            if (jr2 != null && !c2096vX.a.e()) {
                jr2 = (JR) q0().i(1, jr2);
            }
            arrayList2.add(new C1619oH(c0827cE2, jr2));
        }
        return new C1615oD(arrayList2);
    }

    @Override // o.InterfaceC1245ib, o.InterfaceC2364zb
    public final JR i() {
        OW I0;
        List d = AbstractC2228xX.d(z().getParameters());
        InterfaceC1738q4 annotations = getAnnotations();
        if (annotations.isEmpty()) {
            OW.i.getClass();
            I0 = OW.j;
        } else {
            C0208Hx c0208Hx = OW.i;
            List J = AbstractC0868ct.J(new C1869s4(annotations));
            c0208Hx.getClass();
            I0 = C0208Hx.I0(J);
        }
        return HO.s(d, n0(), I0, z(), false);
    }

    @Override // o.InterfaceC1245ib
    public final C0981eb i0() {
        return this.h.i0();
    }

    @Override // o.InterfaceC1245ib
    public final boolean j() {
        return this.h.j();
    }

    @Override // o.InterfaceC1245ib
    public final WB j0() {
        WB j0 = this.h.j0();
        if (j0 != null) {
            return j0;
        }
        F(15);
        throw null;
    }

    @Override // o.InterfaceC0004Ab
    public final boolean k() {
        return this.h.k();
    }

    @Override // o.InterfaceC1245ib
    public final boolean m() {
        return this.h.m();
    }

    @Override // o.InterfaceC1118gg
    public final InterfaceC1118gg n() {
        InterfaceC1118gg n = this.h.n();
        if (n != null) {
            return n;
        }
        F(22);
        throw null;
    }

    @Override // o.InterfaceC1245ib
    public final WB n0() {
        AbstractC0192Hh.i(AbstractC0114Eh.d(this.h));
        return u(C1398ky.a);
    }

    @Override // o.InterfaceC1245ib, o.InterfaceC0004Ab
    public final List p() {
        q0();
        ArrayList arrayList = this.l;
        if (arrayList != null) {
            return arrayList;
        }
        F(30);
        throw null;
    }

    @Override // o.OB
    public final boolean p0() {
        return this.h.p0();
    }

    public final C2096vX q0() {
        if (this.j == null) {
            C2096vX c2096vX = this.i;
            if (c2096vX.a.e()) {
                this.j = c2096vX;
            } else {
                List parameters = this.h.z().getParameters();
                this.k = new ArrayList(parameters.size());
                this.j = AbstractC0868ct.T(parameters, c2096vX.f(), this, this.k);
                ArrayList arrayList = this.k;
                AbstractC0048Bt.n(arrayList, "<this>");
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (!((InterfaceC1437lX) obj).O()) {
                        arrayList2.add(obj);
                    }
                }
                this.l = arrayList2;
            }
        }
        return this.j;
    }

    @Override // o.InterfaceC1245ib
    public final List s0() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        F(17);
        throw null;
    }

    @Override // o.InterfaceC1118gg
    public final Object t(InterfaceC1380kg interfaceC1380kg, Object obj) {
        return interfaceC1380kg.h(this, obj);
    }

    @Override // o.YC
    public final WB u(C1398ky c1398ky) {
        WB u = this.h.u(c1398ky);
        if (!this.i.a.e()) {
            return new C1172hU(u, q0());
        }
        if (u != null) {
            return u;
        }
        F(14);
        throw null;
    }

    @Override // o.OB
    public final boolean w() {
        return this.h.w();
    }

    @Override // o.InterfaceC1245ib
    public final boolean y0() {
        return this.h.y0();
    }

    @Override // o.InterfaceC2364zb
    public final SW z() {
        SW z = this.h.z();
        if (this.i.a.e()) {
            if (z != null) {
                return z;
            }
            F(0);
            throw null;
        }
        if (this.m == null) {
            C2096vX q0 = q0();
            Collection d = z.d();
            ArrayList arrayList = new ArrayList(d.size());
            Iterator it = d.iterator();
            while (it.hasNext()) {
                arrayList.add(q0.i(1, (AbstractC1004ey) it.next()));
            }
            this.m = new C1968tb(this, this.k, arrayList, VA.e);
        }
        C1968tb c1968tb = this.m;
        if (c1968tb != null) {
            return c1968tb;
        }
        F(1);
        throw null;
    }

    @Override // o.InterfaceC1245ib
    public final C0261Jy z0() {
        throw new UnsupportedOperationException();
    }
}
