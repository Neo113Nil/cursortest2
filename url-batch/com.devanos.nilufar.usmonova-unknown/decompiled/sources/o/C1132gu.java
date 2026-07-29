package o;

import com.google.firebase.messaging.Constants;
import java.util.ArrayList;

/* renamed from: o.gu, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1132gu extends RJ implements InterfaceC0541Ut {
    public final boolean H;
    public final C1619oH I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1132gu(InterfaceC1118gg interfaceC1118gg, InterfaceC1738q4 interfaceC1738q4, int i, C0244Jh c0244Jh, boolean z, C0827cE c0827cE, IS is, PJ pj, int i2, boolean z2, C1619oH c1619oH) {
        super(interfaceC1118gg, pj, interfaceC1738q4, i, c0244Jh, z, c0827cE, i2, is, false, false, false, false, false);
        if (interfaceC1118gg == null) {
            A0(0);
            throw null;
        }
        if (interfaceC1738q4 == null) {
            A0(1);
            throw null;
        }
        if (i == 0) {
            A0(2);
            throw null;
        }
        if (c0244Jh == null) {
            A0(3);
            throw null;
        }
        if (c0827cE == null) {
            A0(4);
            throw null;
        }
        if (is == null) {
            A0(5);
            throw null;
        }
        if (i2 == 0) {
            A0(6);
            throw null;
        }
        this.H = z2;
        this.I = c1619oH;
    }

    public static /* synthetic */ void A0(int i) {
        String str = i != 21 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 21 ? 3 : 2];
        switch (i) {
            case 1:
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case 10:
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = "name";
                break;
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
            case 12:
            case 18:
                objArr[0] = Constants.ScionAnalytics.PARAM_SOURCE;
                break;
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
            case 16:
                objArr[0] = "kind";
                break;
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 13:
                objArr[0] = "newOwner";
                break;
            case 14:
                objArr[0] = "newModality";
                break;
            case 15:
                objArr[0] = "newVisibility";
                break;
            case 17:
                objArr[0] = "newName";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
                break;
            case 22:
                objArr[0] = "inType";
                break;
        }
        if (i != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "create";
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            case 21:
                break;
            case 22:
                objArr[2] = "setInType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i == 21) {
            throw new IllegalStateException(format);
        }
    }

    public static C1132gu P0(InterfaceC1118gg interfaceC1118gg, C0338My c0338My, C0244Jh c0244Jh, boolean z, C0827cE c0827cE, C0904dP c0904dP, boolean z2) {
        if (interfaceC1118gg == null) {
            A0(7);
            throw null;
        }
        if (c0827cE != null) {
            return new C1132gu(interfaceC1118gg, c0338My, 1, c0244Jh, z, c0827cE, c0904dP, null, 1, z2, null);
        }
        A0(11);
        throw null;
    }

    @Override // o.RJ, o.InterfaceC2072v9
    public final Object C(C0633Yh c0633Yh) {
        C1619oH c1619oH = this.I;
        if (c1619oH == null || !((C0633Yh) c1619oH.h).equals(c0633Yh)) {
            return null;
        }
        return c1619oH.i;
    }

    @Override // o.RJ
    public final RJ J0(InterfaceC1118gg interfaceC1118gg, int i, C0244Jh c0244Jh, PJ pj, int i2, C0827cE c0827cE) {
        if (interfaceC1118gg == null) {
            A0(13);
            throw null;
        }
        if (i == 0) {
            A0(14);
            throw null;
        }
        if (c0244Jh == null) {
            A0(15);
            throw null;
        }
        if (i2 == 0) {
            A0(16);
            throw null;
        }
        if (c0827cE == null) {
            A0(17);
            throw null;
        }
        return new C1132gu(interfaceC1118gg, getAnnotations(), i, c0244Jh, this.m, c0827cE, IS.e, pj, i2, this.H, this.I);
    }

    @Override // o.TY, o.InterfaceC2072v9
    public final boolean Q() {
        return false;
    }

    @Override // o.RJ, o.SY
    public final boolean isConst() {
        AbstractC1004ey c = c();
        if (!this.H) {
            return false;
        }
        AbstractC0048Bt.n(c, "type");
        if (((!AbstractC0545Ux.F(c) && !AbstractC1965tY.a(c)) || AbstractC2228xX.e(c)) && !AbstractC0545Ux.G(c)) {
            return false;
        }
        C1803r4 c1803r4 = AbstractC0781bX.a;
        C2245xo c2245xo = AbstractC0438Qu.p;
        AbstractC0048Bt.m(c2245xo, "ENHANCED_NULLABILITY_ANNOTATION");
        return !PX.X(c, c2245xo) || AbstractC0545Ux.G(c);
    }

    @Override // o.InterfaceC0541Ut
    public final InterfaceC0541Ut x0(AbstractC1004ey abstractC1004ey, ArrayList arrayList, AbstractC1004ey abstractC1004ey2, C1619oH c1619oH) {
        AbstractC1004ey abstractC1004ey3;
        SJ sj;
        WJ wj;
        PJ a = a() == this ? null : a();
        C1132gu c1132gu = new C1132gu(n(), getAnnotations(), g(), getVisibility(), this.m, getName(), d(), a, M(), this.H, c1619oH);
        SJ sj2 = this.D;
        if (sj2 != null) {
            SJ sj3 = new SJ(c1132gu, sj2.getAnnotations(), sj2.g(), sj2.getVisibility(), sj2.l, sj2.m, sj2.p, M(), a == null ? null : a.getGetter(), sj2.d());
            sj3.s = sj2.s;
            abstractC1004ey3 = abstractC1004ey2;
            sj3.t = abstractC1004ey3;
            sj = sj3;
        } else {
            abstractC1004ey3 = abstractC1004ey2;
            sj = null;
        }
        WJ wj2 = this.E;
        if (wj2 != null) {
            WJ wj3 = wj2;
            wj = new WJ(c1132gu, wj2.getAnnotations(), wj3.g(), wj3.getVisibility(), wj3.l, wj3.m, wj3.p, M(), a == null ? null : a.b(), wj2.d());
            wj.s = wj.s;
            RY ry = (RY) wj2.t0().get(0);
            if (ry == null) {
                WJ.A0(6);
                throw null;
            }
            wj.t = ry;
        } else {
            wj = null;
        }
        c1132gu.L0(sj, wj, this.F, this.G);
        InterfaceC1455lp interfaceC1455lp = this.f95o;
        if (interfaceC1455lp != null) {
            c1132gu.M0(this.n, interfaceC1455lp);
        }
        c1132gu.c0(o());
        c1132gu.O0(abstractC1004ey3, getTypeParameters(), this.A, abstractC1004ey != null ? AbstractC1807r8.A(this, abstractC1004ey, C0460Rq.t) : null, C1318jk.h);
        return c1132gu;
    }

    @Override // o.RJ
    public final void N0(AbstractC1004ey abstractC1004ey) {
    }
}
