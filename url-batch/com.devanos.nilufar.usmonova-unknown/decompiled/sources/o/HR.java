package o;

import com.google.firebase.messaging.Constants;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class HR extends AbstractC0433Qp {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HR(InterfaceC1118gg interfaceC1118gg, HR hr, InterfaceC1738q4 interfaceC1738q4, C0827cE c0827cE, int i, IS is) {
        super(i, interfaceC1738q4, interfaceC1118gg, hr, c0827cE, is);
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
        if (is != null) {
        } else {
            A0(4);
            throw null;
        }
    }

    public static /* synthetic */ void A0(int i) {
        String str = (i == 13 || i == 18 || i == 23 || i == 24 || i == 29 || i == 30) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 13 || i == 18 || i == 23 || i == 24 || i == 29 || i == 30) ? 2 : 3];
        switch (i) {
            case 1:
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
            case 27:
                objArr[0] = "annotations";
                break;
            case 2:
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[0] = "name";
                break;
            case 3:
            case 8:
            case 26:
                objArr[0] = "kind";
                break;
            case 4:
            case 9:
            case 28:
                objArr[0] = Constants.ScionAnalytics.PARAM_SOURCE;
                break;
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 15:
            case 20:
                objArr[0] = "typeParameters";
                break;
            case 11:
            case 16:
            case 21:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
            case 17:
            case 22:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case 29:
            case 30:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
                break;
            case 14:
            case 19:
                objArr[0] = "contextReceiverParameters";
                break;
            case 25:
                objArr[0] = "newOwner";
                break;
        }
        if (i == 13 || i == 18 || i == 23) {
            objArr[1] = "initialize";
        } else if (i == 24) {
            objArr[1] = "getOriginal";
        } else if (i == 29) {
            objArr[1] = "copy";
        } else if (i != 30) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
        } else {
            objArr[1] = "newCopyBuilder";
        }
        switch (i) {
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case 9:
                objArr[2] = "create";
                break;
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 16:
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case 29:
            case 30:
                break;
            case 25:
            case 26:
            case 27:
            case 28:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i != 13 && i != 18 && i != 23 && i != 24 && i != 29 && i != 30) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    public static HR S0(AbstractC1598o abstractC1598o, C0827cE c0827cE, int i, IS is) {
        C1672p4 c1672p4 = C0460Rq.t;
        if (abstractC1598o == null) {
            A0(5);
            throw null;
        }
        if (c0827cE == null) {
            A0(7);
            throw null;
        }
        if (i == 0) {
            A0(8);
            throw null;
        }
        if (is != null) {
            return new HR(abstractC1598o, null, c1672p4, c0827cE, i, is);
        }
        A0(9);
        throw null;
    }

    @Override // o.AbstractC0433Qp
    public AbstractC0433Qp J0(int i, InterfaceC1738q4 interfaceC1738q4, InterfaceC1118gg interfaceC1118gg, InterfaceC0381Op interfaceC0381Op, C0827cE c0827cE, IS is) {
        if (interfaceC1118gg == null) {
            A0(25);
            throw null;
        }
        if (i == 0) {
            A0(26);
            throw null;
        }
        if (interfaceC1738q4 == null) {
            A0(27);
            throw null;
        }
        HR hr = (HR) interfaceC0381Op;
        if (c0827cE == null) {
            c0827cE = getName();
        }
        return new HR(interfaceC1118gg, hr, interfaceC1738q4, c0827cE, i, is);
    }

    @Override // o.AbstractC1314jg, o.AbstractC1184hg, o.InterfaceC1118gg
    /* renamed from: T0, reason: merged with bridge method [inline-methods] */
    public final HR a() {
        HR hr = (HR) super.a();
        if (hr != null) {
            return hr;
        }
        A0(24);
        throw null;
    }

    @Override // o.AbstractC0433Qp
    /* renamed from: U0, reason: merged with bridge method [inline-methods] */
    public final HR M0(C0261Jy c0261Jy, C0261Jy c0261Jy2, List list, List list2, List list3, AbstractC1004ey abstractC1004ey, int i, C0244Jh c0244Jh) {
        if (list == null) {
            A0(14);
            throw null;
        }
        if (list2 == null) {
            A0(15);
            throw null;
        }
        if (list3 == null) {
            A0(16);
            throw null;
        }
        if (c0244Jh != null) {
            return V0(c0261Jy, c0261Jy2, list, list2, list3, abstractC1004ey, i, c0244Jh, null);
        }
        A0(17);
        throw null;
    }

    public HR V0(C0261Jy c0261Jy, C0261Jy c0261Jy2, List list, List list2, List list3, AbstractC1004ey abstractC1004ey, int i, C0244Jh c0244Jh, Map map) {
        if (list == null) {
            A0(19);
            throw null;
        }
        if (list2 == null) {
            A0(20);
            throw null;
        }
        if (list3 == null) {
            A0(21);
            throw null;
        }
        if (c0244Jh == null) {
            A0(22);
            throw null;
        }
        super.M0(c0261Jy, c0261Jy2, list, list2, list3, abstractC1004ey, i, c0244Jh);
        if (map != null && !map.isEmpty()) {
            this.J = new LinkedHashMap(map);
        }
        return this;
    }

    @Override // o.AbstractC0433Qp, o.InterfaceC0381Op
    public InterfaceC0355Np m0() {
        return N0(C2096vX.b);
    }
}
