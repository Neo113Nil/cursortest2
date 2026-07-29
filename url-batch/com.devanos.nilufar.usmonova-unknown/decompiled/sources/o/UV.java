package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class UV {
    public static final UV h;
    public static final UV i;
    public static final /* synthetic */ UV[] j;

    static {
        UV uv = new UV("On", 0);
        h = uv;
        UV uv2 = new UV("Off", 1);
        i = uv2;
        j = new UV[]{uv, uv2, new UV("Indeterminate", 2)};
    }

    public static UV valueOf(String str) {
        return (UV) Enum.valueOf(UV.class, str);
    }

    public static UV[] values() {
        return (UV[]) j.clone();
    }
}
