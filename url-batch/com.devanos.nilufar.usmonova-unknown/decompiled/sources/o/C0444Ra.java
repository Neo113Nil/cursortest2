package o;

import java.util.Arrays;

/* renamed from: o.Ra, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0444Ra extends AbstractC1657ot {
    @Override // o.AbstractC0551Vd
    public final AbstractC1004ey a(InterfaceC0761bD interfaceC0761bD) {
        AbstractC0048Bt.n(interfaceC0761bD, "module");
        AbstractC0545Ux l = interfaceC0761bD.l();
        l.getClass();
        return l.s(EnumC1423lJ.n);
    }

    @Override // o.AbstractC0551Vd
    public final String toString() {
        String valueOf;
        Object obj = this.a;
        Integer valueOf2 = Integer.valueOf(((Character) obj).charValue());
        char charValue = ((Character) obj).charValue();
        if (charValue == '\b') {
            valueOf = "\\b";
        } else if (charValue == '\t') {
            valueOf = "\\t";
        } else if (charValue == '\n') {
            valueOf = "\\n";
        } else if (charValue == '\f') {
            valueOf = "\\f";
        } else if (charValue == '\r') {
            valueOf = "\\r";
        } else {
            byte type = (byte) Character.getType(charValue);
            valueOf = (type == 0 || type == 13 || type == 14 || type == 15 || type == 16 || type == 18 || type == 19) ? "?" : String.valueOf(charValue);
        }
        return String.format("\\u%04X ('%s')", Arrays.copyOf(new Object[]{valueOf2, valueOf}, 2));
    }
}
