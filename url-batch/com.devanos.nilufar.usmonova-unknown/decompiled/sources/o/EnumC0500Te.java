package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: o.Te, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0500Te {
    public static final EnumC0500Te h;
    public static final EnumC0500Te i;
    public static final EnumC0500Te j;
    public static final EnumC0500Te k;
    public static final /* synthetic */ EnumC0500Te[] l;

    static {
        EnumC0500Te enumC0500Te = new EnumC0500Te("DEFAULT", 0);
        h = enumC0500Te;
        EnumC0500Te enumC0500Te2 = new EnumC0500Te("LAZY", 1);
        i = enumC0500Te2;
        EnumC0500Te enumC0500Te3 = new EnumC0500Te("ATOMIC", 2);
        j = enumC0500Te3;
        EnumC0500Te enumC0500Te4 = new EnumC0500Te("UNDISPATCHED", 3);
        k = enumC0500Te4;
        l = new EnumC0500Te[]{enumC0500Te, enumC0500Te2, enumC0500Te3, enumC0500Te4};
    }

    public static EnumC0500Te valueOf(String str) {
        return (EnumC0500Te) Enum.valueOf(EnumC0500Te.class, str);
    }

    public static EnumC0500Te[] values() {
        return (EnumC0500Te[]) l.clone();
    }
}
