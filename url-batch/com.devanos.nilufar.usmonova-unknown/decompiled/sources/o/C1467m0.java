package o;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: o.m0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1467m0 extends AbstractC1205i0 {
    public final C1097gL c;
    public final /* synthetic */ AbstractC1533n0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1467m0(AbstractC1533n0 abstractC1533n0, OT ot, C1097gL c1097gL) {
        super(ot);
        if (ot == null) {
            k(0);
            throw null;
        }
        this.d = abstractC1533n0;
        this.c = c1097gL;
    }

    public static /* synthetic */ void k(int i) {
        String str = (i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 8) ? 2 : 3];
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
                break;
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                objArr[0] = "type";
                break;
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[0] = "supertypes";
                break;
            case 9:
                objArr[0] = "classifier";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i == 1) {
            objArr[1] = "computeSupertypes";
        } else if (i == 2) {
            objArr[1] = "getParameters";
        } else if (i == 3) {
            objArr[1] = "getDeclarationDescriptor";
        } else if (i == 4) {
            objArr[1] = "getBuiltIns";
        } else if (i == 5) {
            objArr[1] = "getSupertypeLoopChecker";
        } else if (i != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
        } else {
            objArr[1] = "processSupertypesWithoutCycles";
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
            case 8:
                break;
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                objArr[2] = "reportSupertypeLoopError";
                break;
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[2] = "processSupertypesWithoutCycles";
                break;
            case 9:
                objArr[2] = "isSameClassifier";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i != 1 && i != 2 && i != 3 && i != 4 && i != 5 && i != 8) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // o.SW
    public final boolean a() {
        return true;
    }

    @Override // o.SW
    public final InterfaceC2364zb c() {
        AbstractC1533n0 abstractC1533n0 = this.d;
        if (abstractC1533n0 != null) {
            return abstractC1533n0;
        }
        k(3);
        throw null;
    }

    @Override // o.AbstractC1205i0
    public final Collection e() {
        List I0 = this.d.I0();
        if (I0 != null) {
            return I0;
        }
        k(1);
        throw null;
    }

    @Override // o.AbstractC1205i0
    public final AbstractC1004ey f() {
        return C0273Kk.c(EnumC0247Jk.n, new String[0]);
    }

    @Override // o.AbstractC1205i0
    public final C1097gL g() {
        C1097gL c1097gL = this.c;
        if (c1097gL != null) {
            return c1097gL;
        }
        k(5);
        throw null;
    }

    @Override // o.SW
    public final List getParameters() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        k(2);
        throw null;
    }

    @Override // o.AbstractC1205i0
    public final boolean i(InterfaceC2364zb interfaceC2364zb) {
        if (!(interfaceC2364zb instanceof InterfaceC1437lX)) {
            return false;
        }
        return C0460Rq.z.k(this.d, (InterfaceC1437lX) interfaceC2364zb, true, C1268j.s);
    }

    @Override // o.AbstractC1205i0
    public final List j(List list) {
        List H0 = this.d.H0(list);
        if (H0 != null) {
            return H0;
        }
        k(8);
        throw null;
    }

    @Override // o.SW
    public final AbstractC0545Ux l() {
        AbstractC0545Ux e = AbstractC0192Hh.e(this.d);
        if (e != null) {
            return e;
        }
        k(4);
        throw null;
    }

    public final String toString() {
        return this.d.getName().h;
    }
}
