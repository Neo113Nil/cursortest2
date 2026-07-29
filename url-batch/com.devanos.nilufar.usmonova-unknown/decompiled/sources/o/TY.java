package o;

import com.google.firebase.messaging.Constants;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class TY extends AbstractC1314jg implements SY {
    public AbstractC1004ey l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TY(InterfaceC1118gg interfaceC1118gg, InterfaceC1738q4 interfaceC1738q4, C0827cE c0827cE, AbstractC1004ey abstractC1004ey, IS is) {
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
        if (is == null) {
            A0(3);
            throw null;
        }
        this.l = abstractC1004ey;
    }

    public static /* synthetic */ void A0(int i) {
        String str;
        int i2;
        switch (i) {
            case 4:
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case 9:
            case 10:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case 9:
            case 10:
                i2 = 2;
                break;
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
                objArr[0] = Constants.ScionAnalytics.PARAM_SOURCE;
                break;
            case 4:
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case 9:
            case 10:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "getType";
                break;
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                objArr[1] = "getOriginal";
                break;
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                objArr[1] = "getValueParameters";
                break;
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 8:
                objArr[1] = "getTypeParameters";
                break;
            case 9:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 10:
                objArr[1] = "getReturnType";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
        }
        switch (i) {
            case 4:
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case 9:
            case 10:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 4:
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case 9:
            case 10:
                throw new IllegalStateException(format);
            default:
                throw new IllegalArgumentException(format);
        }
    }

    public C0261Jy J() {
        return null;
    }

    @Override // o.InterfaceC2072v9
    public boolean Q() {
        return false;
    }

    @Override // o.L, o.UL
    public final AbstractC1004ey c() {
        AbstractC1004ey abstractC1004ey = this.l;
        if (abstractC1004ey != null) {
            return abstractC1004ey;
        }
        A0(4);
        throw null;
    }

    public AbstractC1004ey getReturnType() {
        AbstractC1004ey c = c();
        if (c != null) {
            return c;
        }
        A0(10);
        throw null;
    }

    public List getTypeParameters() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        A0(8);
        throw null;
    }

    @Override // o.InterfaceC2072v9
    public final List t0() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        A0(6);
        throw null;
    }

    public C0261Jy x() {
        return null;
    }
}
