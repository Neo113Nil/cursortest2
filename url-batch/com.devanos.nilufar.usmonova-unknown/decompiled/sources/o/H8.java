package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class H8 {
    public static final H8 h;
    public static final H8 i;
    public static final H8 j;
    public static final /* synthetic */ H8[] k;

    static {
        H8 h8 = new H8("SUSPEND", 0);
        h = h8;
        H8 h82 = new H8("DROP_OLDEST", 1);
        i = h82;
        H8 h83 = new H8("DROP_LATEST", 2);
        j = h83;
        k = new H8[]{h8, h82, h83};
    }

    public static H8 valueOf(String str) {
        return (H8) Enum.valueOf(H8.class, str);
    }

    public static H8[] values() {
        return (H8[]) k.clone();
    }
}
