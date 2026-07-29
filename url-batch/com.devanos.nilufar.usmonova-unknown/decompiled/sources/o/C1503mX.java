package o;

import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.mX, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1503mX extends AbstractC1533n0 {
    public final ArrayList r;
    public boolean s;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1503mX(InterfaceC1118gg interfaceC1118gg, InterfaceC1738q4 interfaceC1738q4, boolean z, int i, C0827cE c0827cE, int i2, OT ot) {
        super(ot, interfaceC1118gg, interfaceC1738q4, c0827cE, i, z, i2, r8);
        C1097gL c1097gL = C1097gL.m;
        if (interfaceC1118gg == null) {
            A0(19);
            throw null;
        }
        if (interfaceC1738q4 == null) {
            A0(20);
            throw null;
        }
        if (i == 0) {
            A0(21);
            throw null;
        }
        if (c0827cE == null) {
            A0(22);
            throw null;
        }
        if (ot == null) {
            A0(25);
            throw null;
        }
        this.r = new ArrayList(1);
        this.s = false;
    }

    public static /* synthetic */ void A0(int i) {
        String str = (i == 5 || i == 28) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 5 || i == 28) ? 2 : 3];
        switch (i) {
            case 1:
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
            case 13:
            case 20:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 14:
            case 21:
                objArr[0] = "variance";
                break;
            case 3:
            case 9:
            case 15:
            case 22:
                objArr[0] = "name";
                break;
            case 4:
            case 11:
            case 18:
            case 25:
                objArr[0] = "storageManager";
                break;
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
            case 28:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
                break;
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
            case 12:
            case 19:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 16:
            case 23:
                objArr[0] = Constants.ScionAnalytics.PARAM_SOURCE;
                break;
            case 17:
                objArr[0] = "supertypeLoopsResolver";
                break;
            case 24:
                objArr[0] = "supertypeLoopsChecker";
                break;
            case 26:
                objArr[0] = "bound";
                break;
            case 27:
                objArr[0] = "type";
                break;
        }
        if (i == 5) {
            objArr[1] = "createWithDefaultBound";
        } else if (i != 28) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
        } else {
            objArr[1] = "resolveUpperBounds";
        }
        switch (i) {
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
            case 28:
                break;
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createForFurtherModification";
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "<init>";
                break;
            case 26:
                objArr[2] = "addUpperBound";
                break;
            case 27:
                objArr[2] = "reportSupertypeLoopError";
                break;
            default:
                objArr[2] = "createWithDefaultBound";
                break;
        }
        String format = String.format(str, objArr);
        if (i != 5 && i != 28) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    public static C1503mX J0(InterfaceC1118gg interfaceC1118gg, InterfaceC1738q4 interfaceC1738q4, boolean z, int i, C0827cE c0827cE, int i2, OT ot) {
        if (interfaceC1118gg == null) {
            A0(6);
            throw null;
        }
        if (interfaceC1738q4 == null) {
            A0(7);
            throw null;
        }
        if (i == 0) {
            A0(8);
            throw null;
        }
        if (c0827cE == null) {
            A0(9);
            throw null;
        }
        if (ot == null) {
            A0(11);
            throw null;
        }
        if (i != 0) {
            return new C1503mX(interfaceC1118gg, interfaceC1738q4, z, i, c0827cE, i2, ot);
        }
        A0(14);
        throw null;
    }

    public static C1503mX K0(AbstractC1598o abstractC1598o, int i, C0827cE c0827cE, int i2, OT ot) {
        C1672p4 c1672p4 = C0460Rq.t;
        if (i == 0) {
            A0(2);
            throw null;
        }
        if (ot == null) {
            A0(4);
            throw null;
        }
        C1503mX J0 = J0(abstractC1598o, c1672p4, false, i, c0827cE, i2, ot);
        JR m = AbstractC0192Hh.e(abstractC1598o).m();
        if (J0.s) {
            throw new IllegalStateException("Type parameter descriptor is already initialized: " + J0.L0());
        }
        if (!AbstractC1473m3.P(m)) {
            J0.r.add(m);
        }
        if (!J0.s) {
            J0.s = true;
            return J0;
        }
        throw new IllegalStateException("Type parameter descriptor is already initialized: " + J0.L0());
    }

    @Override // o.AbstractC1533n0
    public final List I0() {
        if (!this.s) {
            throw new IllegalStateException("Type parameter descriptor is not initialized: " + L0());
        }
        ArrayList arrayList = this.r;
        if (arrayList != null) {
            return arrayList;
        }
        A0(28);
        throw null;
    }

    public final String L0() {
        return getName() + " declared in " + AbstractC0114Eh.g(n());
    }
}
