package o;

/* loaded from: classes.dex */
public final class UX extends AbstractC1657ot {
    public final /* synthetic */ int b = 0;

    public UX(byte b) {
        super(Byte.valueOf(b));
    }

    @Override // o.AbstractC0551Vd
    public final AbstractC1004ey a(InterfaceC0761bD interfaceC0761bD) {
        switch (this.b) {
            case 0:
                AbstractC0048Bt.n(interfaceC0761bD, "module");
                InterfaceC1245ib o2 = AbstractC1052fg.o(interfaceC0761bD, AbstractC1433lT.R);
                JR i = o2 != null ? o2.i() : null;
                if (i == null) {
                    return C0273Kk.c(EnumC0247Jk.G, "UByte");
                }
                return i;
            case 1:
                AbstractC0048Bt.n(interfaceC0761bD, "module");
                InterfaceC1245ib o3 = AbstractC1052fg.o(interfaceC0761bD, AbstractC1433lT.T);
                JR i2 = o3 != null ? o3.i() : null;
                if (i2 == null) {
                    return C0273Kk.c(EnumC0247Jk.G, "UInt");
                }
                return i2;
            case 2:
                AbstractC0048Bt.n(interfaceC0761bD, "module");
                InterfaceC1245ib o4 = AbstractC1052fg.o(interfaceC0761bD, AbstractC1433lT.U);
                JR i3 = o4 != null ? o4.i() : null;
                if (i3 == null) {
                    return C0273Kk.c(EnumC0247Jk.G, "ULong");
                }
                return i3;
            default:
                AbstractC0048Bt.n(interfaceC0761bD, "module");
                InterfaceC1245ib o5 = AbstractC1052fg.o(interfaceC0761bD, AbstractC1433lT.S);
                JR i4 = o5 != null ? o5.i() : null;
                if (i4 == null) {
                    return C0273Kk.c(EnumC0247Jk.G, "UShort");
                }
                return i4;
        }
    }

    @Override // o.AbstractC0551Vd
    public final String toString() {
        switch (this.b) {
            case 0:
                return ((Number) this.a).intValue() + ".toUByte()";
            case 1:
                return ((Number) this.a).intValue() + ".toUInt()";
            case 2:
                return ((Number) this.a).longValue() + ".toULong()";
            default:
                return ((Number) this.a).intValue() + ".toUShort()";
        }
    }

    public UX(short s) {
        super(Short.valueOf(s));
    }

    public UX(int i) {
        super(Integer.valueOf(i));
    }

    public UX(long j) {
        super(Long.valueOf(j));
    }
}
