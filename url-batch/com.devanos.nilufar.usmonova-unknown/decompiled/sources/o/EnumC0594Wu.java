package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: o.Wu, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0594Wu {
    public static final EnumC0594Wu h;
    public static final EnumC0594Wu i;
    public static final EnumC0594Wu j;
    public static final EnumC0594Wu k;
    public static final /* synthetic */ EnumC0594Wu[] l;

    static {
        EnumC0594Wu enumC0594Wu = new EnumC0594Wu("HIDDEN", 0);
        h = enumC0594Wu;
        EnumC0594Wu enumC0594Wu2 = new EnumC0594Wu("VISIBLE", 1);
        i = enumC0594Wu2;
        EnumC0594Wu enumC0594Wu3 = new EnumC0594Wu("NOT_CONSIDERED", 2);
        j = enumC0594Wu3;
        EnumC0594Wu enumC0594Wu4 = new EnumC0594Wu("DROP", 3);
        k = enumC0594Wu4;
        l = new EnumC0594Wu[]{enumC0594Wu, enumC0594Wu2, enumC0594Wu3, enumC0594Wu4};
    }

    public static EnumC0594Wu valueOf(String str) {
        return (EnumC0594Wu) Enum.valueOf(EnumC0594Wu.class, str);
    }

    public static EnumC0594Wu[] values() {
        return (EnumC0594Wu[]) l.clone();
    }
}
