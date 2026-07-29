package o;

import com.google.firebase.messaging.Constants;

/* renamed from: o.jg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1314jg extends AbstractC1184hg implements InterfaceC1249ig {
    public final InterfaceC1118gg j;
    public final IS k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC1314jg(InterfaceC1118gg interfaceC1118gg, InterfaceC1738q4 interfaceC1738q4, C0827cE c0827cE, IS is) {
        super(interfaceC1738q4, c0827cE);
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
        this.j = interfaceC1118gg;
        this.k = is;
    }

    public static /* synthetic */ void A0(int i) {
        String str = (i == 4 || i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 4 || i == 5 || i == 6) ? 2 : 3];
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
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i == 4) {
            objArr[1] = "getOriginal";
        } else if (i == 5) {
            objArr[1] = "getContainingDeclaration";
        } else if (i != 6) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i != 4 && i != 5 && i != 6) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i != 4 && i != 5 && i != 6) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    public IS d() {
        IS is = this.k;
        if (is != null) {
            return is;
        }
        A0(6);
        throw null;
    }

    public InterfaceC1118gg n() {
        InterfaceC1118gg interfaceC1118gg = this.j;
        if (interfaceC1118gg != null) {
            return interfaceC1118gg;
        }
        A0(5);
        throw null;
    }

    @Override // o.AbstractC1184hg, o.InterfaceC1118gg
    /* renamed from: G0 */
    public InterfaceC1249ig a() {
        return this;
    }
}
