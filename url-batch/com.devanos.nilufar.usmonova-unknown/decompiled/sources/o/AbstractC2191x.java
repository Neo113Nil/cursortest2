package o;

import com.google.firebase.messaging.Constants;

/* renamed from: o.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2191x extends AbstractC1533n0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC2191x(OT ot, InterfaceC1118gg interfaceC1118gg, InterfaceC1738q4 interfaceC1738q4, C0827cE c0827cE, int i, boolean z, int i2, C1097gL c1097gL) {
        super(ot, interfaceC1118gg, interfaceC1738q4, c0827cE, i, z, i2, c1097gL);
        if (ot == null) {
            A0(0);
            throw null;
        }
        if (interfaceC1118gg == null) {
            A0(1);
            throw null;
        }
        if (i == 0) {
            A0(4);
            throw null;
        }
        if (c1097gL != null) {
        } else {
            A0(6);
            throw null;
        }
    }

    public static /* synthetic */ void A0(int i) {
        Object[] objArr = new Object[3];
        switch (i) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                objArr[0] = Constants.ScionAnalytics.PARAM_SOURCE;
                break;
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                objArr[0] = "supertypeLoopChecker";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractLazyTypeParameterDescriptor";
        objArr[2] = "<init>";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // o.AbstractC1184hg
    public final String toString() {
        return (this.m ? "reified " : "") + (Y() != 1 ? AbstractC2188wx.o(Y()).concat(" ") : "") + getName();
    }
}
