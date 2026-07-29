package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class QJ {
    public InterfaceC1118gg a;
    public int b;
    public C0244Jh c;
    public int e;
    public final C0261Jy h;
    public final C0827cE i;
    public final AbstractC1004ey j;
    public final /* synthetic */ RJ k;
    public PJ d = null;
    public AbstractC1964tX f = AbstractC1964tX.a;
    public boolean g = true;

    public QJ(RJ rj) {
        this.k = rj;
        this.a = rj.n();
        this.b = rj.g();
        this.c = rj.getVisibility();
        this.e = rj.M();
        this.h = rj.A;
        this.i = rj.getName();
        this.j = rj.c();
    }

    public static /* synthetic */ void a(int i) {
        String str = (i == 1 || i == 2 || i == 3 || i == 5 || i == 7 || i == 9 || i == 11 || i == 19 || i == 13 || i == 14 || i == 16 || i == 17) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 2 || i == 3 || i == 5 || i == 7 || i == 9 || i == 11 || i == 19 || i == 13 || i == 14 || i == 16 || i == 17) ? 2 : 3];
        switch (i) {
            case 1:
            case 2:
            case 3:
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
            case 9:
            case 11:
            case 13:
            case 14:
            case 16:
            case 17:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
                break;
            case 4:
                objArr[0] = "type";
                break;
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                objArr[0] = "modality";
                break;
            case 8:
                objArr[0] = "visibility";
                break;
            case 10:
                objArr[0] = "kind";
                break;
            case 12:
                objArr[0] = "typeParameters";
                break;
            case 15:
                objArr[0] = "substitution";
                break;
            case 18:
                objArr[0] = "name";
                break;
            default:
                objArr[0] = "owner";
                break;
        }
        if (i == 1) {
            objArr[1] = "setOwner";
        } else if (i == 2) {
            objArr[1] = "setOriginal";
        } else if (i == 3) {
            objArr[1] = "setPreserveSourceElement";
        } else if (i == 5) {
            objArr[1] = "setReturnType";
        } else if (i == 7) {
            objArr[1] = "setModality";
        } else if (i == 9) {
            objArr[1] = "setVisibility";
        } else if (i == 11) {
            objArr[1] = "setKind";
        } else if (i == 19) {
            objArr[1] = "setName";
        } else if (i == 13) {
            objArr[1] = "setTypeParameters";
        } else if (i == 14) {
            objArr[1] = "setDispatchReceiverParameter";
        } else if (i == 16) {
            objArr[1] = "setSubstitution";
        } else if (i != 17) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
        } else {
            objArr[1] = "setCopyOverrides";
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
            case 9:
            case 11:
            case 13:
            case 14:
            case 16:
            case 17:
            case 19:
                break;
            case 4:
                objArr[2] = "setReturnType";
                break;
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                objArr[2] = "setModality";
                break;
            case 8:
                objArr[2] = "setVisibility";
                break;
            case 10:
                objArr[2] = "setKind";
                break;
            case 12:
                objArr[2] = "setTypeParameters";
                break;
            case 15:
                objArr[2] = "setSubstitution";
                break;
            case 18:
                objArr[2] = "setName";
                break;
            default:
                objArr[2] = "setOwner";
                break;
        }
        String format = String.format(str, objArr);
        if (i != 1 && i != 2 && i != 3 && i != 5 && i != 7 && i != 9 && i != 11 && i != 19 && i != 13 && i != 14 && i != 16 && i != 17) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v0, types: [java.lang.Throwable] */
    public final RJ b() {
        C0261Jy c0261Jy;
        C0261Jy c0261Jy2;
        SJ sj;
        WJ wj;
        C2096vX c2096vX;
        InterfaceC1455lp interfaceC1455lp;
        C0261Jy c0261Jy3;
        C0261Jy c0261Jy4;
        AbstractC1004ey i;
        InterfaceC1118gg interfaceC1118gg = this.a;
        int i2 = this.b;
        C0244Jh c0244Jh = this.c;
        PJ pj = this.d;
        int i3 = this.e;
        C0827cE c0827cE = this.i;
        RJ rj = this.k;
        RJ J0 = rj.J0(interfaceC1118gg, i2, c0244Jh, pj, i3, c0827cE);
        List typeParameters = rj.getTypeParameters();
        ArrayList arrayList = new ArrayList(((ArrayList) typeParameters).size());
        C2096vX T = AbstractC0868ct.T(typeParameters, this.f, J0, arrayList);
        AbstractC1004ey abstractC1004ey = this.j;
        AbstractC1004ey i4 = T.i(3, abstractC1004ey);
        C0261Jy c0261Jy5 = null;
        if (i4 != null) {
            AbstractC1004ey i5 = T.i(2, abstractC1004ey);
            if (i5 != null) {
                J0.N0(i5);
            }
            C0261Jy c0261Jy6 = this.h;
            if (c0261Jy6 != null) {
                C0261Jy e = c0261Jy6.e(T);
                c0261Jy = e != null ? e : null;
            }
            C0261Jy c0261Jy7 = rj.B;
            if (c0261Jy7 == null || (i = T.i(2, c0261Jy7.c())) == null) {
                c0261Jy2 = null;
            } else {
                c0261Jy7.H0();
                c0261Jy2 = new C0261Jy(J0, new C1451ll(J0, i), c0261Jy7.getAnnotations());
            }
            ArrayList arrayList2 = new ArrayList();
            for (C0261Jy c0261Jy8 : rj.z) {
                AbstractC1004ey i6 = T.i(2, c0261Jy8.c());
                if (i6 == null) {
                    c0261Jy3 = c0261Jy5;
                    c0261Jy4 = c0261Jy3;
                } else {
                    c0261Jy4 = c0261Jy5;
                    C0827cE F0 = ((C1708pe) c0261Jy8.H0()).F0();
                    c0261Jy8.H0();
                    c0261Jy3 = new C0261Jy(J0, new C1708pe(J0, i6, F0), c0261Jy8.getAnnotations());
                }
                if (c0261Jy3 != null) {
                    arrayList2.add(c0261Jy3);
                }
                c0261Jy5 = c0261Jy4;
            }
            ?? r19 = c0261Jy5;
            J0.O0(i4, arrayList, c0261Jy, c0261Jy2, arrayList2);
            SJ sj2 = rj.D;
            C0140Fh c0140Fh = IS.e;
            if (sj2 == null) {
                sj = r19;
            } else {
                InterfaceC1738q4 annotations = sj2.getAnnotations();
                int i7 = this.b;
                C0244Jh visibility = rj.D.getVisibility();
                if (this.e == 2 && AbstractC0270Kh.e(AbstractC0270Kh.f(visibility.a.c()))) {
                    visibility = AbstractC0270Kh.h;
                }
                C0244Jh c0244Jh2 = visibility;
                SJ sj3 = rj.D;
                boolean z = sj3.l;
                boolean z2 = sj3.m;
                boolean z3 = sj3.p;
                int i8 = this.e;
                PJ pj2 = this.d;
                sj = new SJ(J0, annotations, i7, c0244Jh2, z, z2, z3, i8, pj2 == null ? r19 : pj2.getGetter(), c0140Fh);
            }
            if (sj != null) {
                SJ sj4 = rj.D;
                AbstractC1004ey abstractC1004ey2 = sj4.t;
                sj.s = RJ.K0(T, sj4);
                sj.K0(abstractC1004ey2 != null ? T.i(3, abstractC1004ey2) : r19);
            }
            WJ wj2 = rj.E;
            if (wj2 == null) {
                wj = r19;
            } else {
                InterfaceC1738q4 annotations2 = wj2.getAnnotations();
                int i9 = this.b;
                C0244Jh visibility2 = rj.E.getVisibility();
                if (this.e == 2 && AbstractC0270Kh.e(AbstractC0270Kh.f(visibility2.a.c()))) {
                    visibility2 = AbstractC0270Kh.h;
                }
                C0244Jh c0244Jh3 = visibility2;
                WJ wj3 = rj.E;
                boolean z4 = wj3.l;
                boolean z5 = wj3.m;
                boolean z6 = wj3.p;
                int i10 = this.e;
                PJ pj3 = this.d;
                wj = new WJ(J0, annotations2, i9, c0244Jh3, z4, z5, z6, i10, pj3 == null ? r19 : pj3.b(), c0140Fh);
            }
            if (wj != null) {
                c2096vX = T;
                List L0 = AbstractC0433Qp.L0(wj, rj.E.t0(), c2096vX, false, false, null);
                if (L0 == null) {
                    L0 = Collections.singletonList(WJ.J0(wj, AbstractC0192Hh.e(this.a).n(), ((RY) rj.E.t0().get(0)).getAnnotations()));
                }
                if (L0.size() != 1) {
                    throw new IllegalStateException();
                }
                wj.s = RJ.K0(c2096vX, rj.E);
                RY ry = (RY) L0.get(0);
                if (ry == null) {
                    WJ.A0(6);
                    throw r19;
                }
                wj.t = ry;
            } else {
                c2096vX = T;
            }
            C0325Ml c0325Ml = rj.F;
            C0325Ml c0325Ml2 = c0325Ml == null ? r19 : new C0325Ml(c0325Ml.getAnnotations(), J0);
            C0325Ml c0325Ml3 = rj.G;
            J0.L0(sj, wj, c0325Ml2, c0325Ml3 == null ? r19 : new C0325Ml(c0325Ml3.getAnnotations(), J0));
            if (this.g) {
                C1630oS c1630oS = new C1630oS();
                Iterator it = rj.o().iterator();
                while (it.hasNext()) {
                    c1630oS.add(((PJ) it.next()).e(c2096vX));
                }
                J0.r = c1630oS;
            }
            if (rj.isConst() && (interfaceC1455lp = rj.f95o) != null) {
                J0.M0(rj.n, interfaceC1455lp);
            }
            return J0;
        }
        return null;
    }
}
