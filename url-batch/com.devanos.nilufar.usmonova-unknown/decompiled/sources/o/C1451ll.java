package o;

/* renamed from: o.ll, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1451ll extends L {
    public final InterfaceC2072v9 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1451ll(InterfaceC2072v9 interfaceC2072v9, AbstractC1004ey abstractC1004ey) {
        super(abstractC1004ey);
        if (interfaceC2072v9 == null) {
            A0(0);
            throw null;
        }
        if (abstractC1004ey == null) {
            A0(1);
            throw null;
        }
        this.i = interfaceC2072v9;
    }

    public static /* synthetic */ void A0(int i) {
        String str = i != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 2 ? 3 : 2];
        if (i == 1) {
            objArr[0] = "receiverType";
        } else if (i == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
        } else if (i != 3) {
            objArr[0] = "callableDescriptor";
        } else {
            objArr[0] = "newType";
        }
        if (i != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
        } else {
            objArr[1] = "getDeclarationDescriptor";
        }
        if (i != 2) {
            if (i != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "replaceType";
            }
        }
        String format = String.format(str, objArr);
        if (i == 2) {
            throw new IllegalStateException(format);
        }
    }

    public final String toString() {
        return c() + ": Ext {" + this.i + "}";
    }
}
