package o;

/* renamed from: o.tx, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1990tx {
    public static final C1990tx c = new C1990tx(null, null);
    public final EnumC2056ux a;
    public final InterfaceC1463lx b;

    public C1990tx(EnumC2056ux enumC2056ux, C1661ox c1661ox) {
        String str;
        this.a = enumC2056ux;
        this.b = c1661ox;
        if ((enumC2056ux == null) == (c1661ox == null)) {
            return;
        }
        if (enumC2056ux == null) {
            str = "Star projection must have no type specified.";
        } else {
            str = "The projection variance " + enumC2056ux + " requires type to be specified.";
        }
        throw new IllegalArgumentException(str.toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1990tx)) {
            return false;
        }
        C1990tx c1990tx = (C1990tx) obj;
        return this.a == c1990tx.a && AbstractC0048Bt.h(this.b, c1990tx.b);
    }

    public final int hashCode() {
        EnumC2056ux enumC2056ux = this.a;
        int hashCode = (enumC2056ux == null ? 0 : enumC2056ux.hashCode()) * 31;
        InterfaceC1463lx interfaceC1463lx = this.b;
        return hashCode + (interfaceC1463lx != null ? interfaceC1463lx.hashCode() : 0);
    }

    public final String toString() {
        EnumC2056ux enumC2056ux = this.a;
        int i = enumC2056ux == null ? -1 : AbstractC1924sx.a[enumC2056ux.ordinal()];
        if (i == -1) {
            return "*";
        }
        InterfaceC1463lx interfaceC1463lx = this.b;
        if (i == 1) {
            return String.valueOf(interfaceC1463lx);
        }
        if (i == 2) {
            return "in " + interfaceC1463lx;
        }
        if (i != 3) {
            throw new C0057Cc();
        }
        return "out " + interfaceC1463lx;
    }
}
