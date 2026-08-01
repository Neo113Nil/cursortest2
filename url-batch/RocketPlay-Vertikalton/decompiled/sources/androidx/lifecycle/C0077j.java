package androidx.lifecycle;

/* renamed from: androidx.lifecycle.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0077j {
    public static EnumC0079l a(EnumC0080m enumC0080m) {
        i1.f.e(enumC0080m, "state");
        int ordinal = enumC0080m.ordinal();
        if (ordinal == 1) {
            return EnumC0079l.ON_CREATE;
        }
        if (ordinal == 2) {
            return EnumC0079l.ON_START;
        }
        if (ordinal != 3) {
            return null;
        }
        return EnumC0079l.ON_RESUME;
    }
}
