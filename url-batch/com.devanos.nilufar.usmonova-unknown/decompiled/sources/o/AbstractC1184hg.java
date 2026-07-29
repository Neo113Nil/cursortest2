package o;

/* renamed from: o.hg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1184hg extends L implements InterfaceC1118gg {
    public final C0827cE i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC1184hg(InterfaceC1738q4 interfaceC1738q4, C0827cE c0827cE) {
        super(interfaceC1738q4);
        if (interfaceC1738q4 == null) {
            A0(0);
            throw null;
        }
        if (c0827cE == null) {
            A0(1);
            throw null;
        }
        this.i = c0827cE;
    }

    public static /* synthetic */ void A0(int i) {
        String str = (i == 2 || i == 3 || i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 2 || i == 3 || i == 5 || i == 6) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
                break;
            case 4:
                objArr[0] = "descriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        if (i == 2) {
            objArr[1] = "getName";
        } else if (i == 3) {
            objArr[1] = "getOriginal";
        } else if (i == 5 || i == 6) {
            objArr[1] = "toString";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
        }
        if (i != 2 && i != 3) {
            if (i == 4) {
                objArr[2] = "toString";
            } else if (i != 5 && i != 6) {
                objArr[2] = "<init>";
            }
        }
        String format = String.format(str, objArr);
        if (i != 2 && i != 3 && i != 5 && i != 6) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    public static String F0(InterfaceC1118gg interfaceC1118gg) {
        try {
            String str = C2304yh.e.w(interfaceC1118gg) + "[" + interfaceC1118gg.getClass().getSimpleName() + "@" + Integer.toHexString(System.identityHashCode(interfaceC1118gg)) + "]";
            if (str != null) {
                return str;
            }
            A0(5);
            throw null;
        } catch (Throwable unused) {
            String str2 = interfaceC1118gg.getClass().getSimpleName() + " " + interfaceC1118gg.getName();
            if (str2 != null) {
                return str2;
            }
            A0(6);
            throw null;
        }
    }

    @Override // o.InterfaceC1118gg
    public final C0827cE getName() {
        C0827cE c0827cE = this.i;
        if (c0827cE != null) {
            return c0827cE;
        }
        A0(2);
        throw null;
    }

    public String toString() {
        return F0(this);
    }

    public InterfaceC1118gg a() {
        return this;
    }
}
