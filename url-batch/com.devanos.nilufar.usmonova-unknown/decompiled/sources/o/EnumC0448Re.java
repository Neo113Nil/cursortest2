package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: o.Re, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0448Re {
    public static final EnumC0448Re h;
    public static final /* synthetic */ EnumC0448Re[] i;

    static {
        EnumC0448Re enumC0448Re = new EnumC0448Re("COROUTINE_SUSPENDED", 0);
        h = enumC0448Re;
        i = new EnumC0448Re[]{enumC0448Re, new EnumC0448Re("UNDECIDED", 1), new EnumC0448Re("RESUMED", 2)};
    }

    public static EnumC0448Re valueOf(String str) {
        return (EnumC0448Re) Enum.valueOf(EnumC0448Re.class, str);
    }

    public static EnumC0448Re[] values() {
        return (EnumC0448Re[]) i.clone();
    }
}
