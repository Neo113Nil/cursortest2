package o;

import com.google.firebase.messaging.Constants;
import java.util.ArrayList;

/* renamed from: o.Vt, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0567Vt extends C0981eb implements InterfaceC0541Ut {
    public Boolean L;
    public Boolean M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0567Vt(InterfaceC1245ib interfaceC1245ib, C0567Vt c0567Vt, InterfaceC1738q4 interfaceC1738q4, boolean z, int i, IS is) {
        super(interfaceC1245ib, c0567Vt, interfaceC1738q4, z, i, is);
        if (interfaceC1245ib == null) {
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
        if (is == null) {
            A0(3);
            throw null;
        }
        this.L = null;
        this.M = null;
    }

    public static /* synthetic */ void A0(int i) {
        String str = (i == 11 || i == 18) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 11 || i == 18) ? 2 : 3];
        switch (i) {
            case 1:
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
            case 9:
            case 15:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 13:
                objArr[0] = "kind";
                break;
            case 3:
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
            case 10:
                objArr[0] = Constants.ScionAnalytics.PARAM_SOURCE;
                break;
            case 4:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
            case 12:
                objArr[0] = "newOwner";
                break;
            case 11:
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
                break;
            case 14:
                objArr[0] = "sourceElement";
                break;
            case 16:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 17:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i == 11) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case 4:
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                objArr[2] = "createJavaConstructor";
                break;
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case 9:
            case 10:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 11:
            case 18:
                break;
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[2] = "createDescriptor";
                break;
            case 16:
            case 17:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i != 11 && i != 18) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    public static C0567Vt Y0(InterfaceC1245ib interfaceC1245ib, InterfaceC1738q4 interfaceC1738q4, boolean z, C0904dP c0904dP) {
        if (interfaceC1245ib != null) {
            return new C0567Vt(interfaceC1245ib, null, interfaceC1738q4, z, 1, c0904dP);
        }
        A0(4);
        throw null;
    }

    @Override // o.C0981eb, o.AbstractC0433Qp
    public final /* bridge */ /* synthetic */ AbstractC0433Qp J0(int i, InterfaceC1738q4 interfaceC1738q4, InterfaceC1118gg interfaceC1118gg, InterfaceC0381Op interfaceC0381Op, C0827cE c0827cE, IS is) {
        return Z0(interfaceC1118gg, interfaceC0381Op, i, interfaceC1738q4, is);
    }

    @Override // o.AbstractC0433Qp
    public final void P0(boolean z) {
        this.L = Boolean.valueOf(z);
    }

    @Override // o.AbstractC0433Qp, o.InterfaceC2072v9
    public final boolean Q() {
        return this.M.booleanValue();
    }

    @Override // o.AbstractC0433Qp
    public final void Q0(boolean z) {
        this.M = Boolean.valueOf(z);
    }

    @Override // o.C0981eb
    /* renamed from: S0 */
    public final /* bridge */ /* synthetic */ C0981eb J0(int i, InterfaceC1738q4 interfaceC1738q4, InterfaceC1118gg interfaceC1118gg, InterfaceC0381Op interfaceC0381Op, C0827cE c0827cE, IS is) {
        return Z0(interfaceC1118gg, interfaceC0381Op, i, interfaceC1738q4, is);
    }

    public final C0567Vt Z0(InterfaceC1118gg interfaceC1118gg, InterfaceC0381Op interfaceC0381Op, int i, InterfaceC1738q4 interfaceC1738q4, IS is) {
        if (interfaceC1118gg == null) {
            A0(7);
            throw null;
        }
        if (i == 0) {
            A0(8);
            throw null;
        }
        if (interfaceC1738q4 == null) {
            A0(9);
            throw null;
        }
        if (is == null) {
            A0(10);
            throw null;
        }
        if (i != 1 && i != 4) {
            throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + interfaceC1118gg + "\nkind: " + AbstractC1888sN.w(i));
        }
        InterfaceC1245ib interfaceC1245ib = (InterfaceC1245ib) interfaceC1118gg;
        C0567Vt c0567Vt = (C0567Vt) interfaceC0381Op;
        if (i == 0) {
            A0(13);
            throw null;
        }
        C0567Vt c0567Vt2 = new C0567Vt(interfaceC1245ib, c0567Vt, interfaceC1738q4, this.K, i, is);
        Boolean bool = this.L;
        bool.getClass();
        c0567Vt2.L = bool;
        Boolean bool2 = this.M;
        bool2.getClass();
        c0567Vt2.M = bool2;
        return c0567Vt2;
    }

    @Override // o.InterfaceC0541Ut
    public final InterfaceC0541Ut x0(AbstractC1004ey abstractC1004ey, ArrayList arrayList, AbstractC1004ey abstractC1004ey2, C1619oH c1619oH) {
        C0567Vt Z0 = Z0(n(), null, M(), getAnnotations(), d());
        Z0.M0(abstractC1004ey == null ? null : AbstractC1807r8.A(Z0, abstractC1004ey, C0460Rq.t), this.q, C1318jk.h, getTypeParameters(), AbstractC1494mO.c(arrayList, t0(), Z0), abstractC1004ey2, g(), getVisibility());
        if (c1619oH != null) {
            Z0.O0((C0633Yh) c1619oH.h, c1619oH.i);
        }
        return Z0;
    }
}
