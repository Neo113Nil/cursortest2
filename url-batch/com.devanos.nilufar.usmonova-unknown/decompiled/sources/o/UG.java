package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class UG {
    public static final UG h;
    public static final UG i;
    public static final /* synthetic */ UG[] j;

    static {
        UG ug = new UG("RENDER_OVERRIDE", 0);
        h = ug;
        UG ug2 = new UG("RENDER_OPEN", 1);
        i = ug2;
        j = new UG[]{ug, ug2, new UG("RENDER_OPEN_OVERRIDE", 2)};
    }

    public static UG valueOf(String str) {
        return (UG) Enum.valueOf(UG.class, str);
    }

    public static UG[] values() {
        return (UG[]) j.clone();
    }
}
