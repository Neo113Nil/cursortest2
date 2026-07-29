package o;

/* renamed from: o.zz, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2388zz {
    public static EnumC0054Bz a(EnumC0080Cz enumC0080Cz) {
        AbstractC0048Bt.n(enumC0080Cz, "state");
        int ordinal = enumC0080Cz.ordinal();
        if (ordinal == 2) {
            return EnumC0054Bz.ON_DESTROY;
        }
        if (ordinal == 3) {
            return EnumC0054Bz.ON_STOP;
        }
        if (ordinal != 4) {
            return null;
        }
        return EnumC0054Bz.ON_PAUSE;
    }
}
