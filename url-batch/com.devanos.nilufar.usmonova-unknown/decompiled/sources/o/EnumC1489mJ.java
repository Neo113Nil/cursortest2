package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: o.mJ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1489mJ {
    public static final EnumC1489mJ h;
    public static final EnumC1489mJ i;
    public static final EnumC1489mJ j;
    public static final /* synthetic */ EnumC1489mJ[] k;

    static {
        EnumC1489mJ enumC1489mJ = new EnumC1489mJ("DEFAULT", 0);
        h = enumC1489mJ;
        EnumC1489mJ enumC1489mJ2 = new EnumC1489mJ("VERY_LOW", 1);
        i = enumC1489mJ2;
        EnumC1489mJ enumC1489mJ3 = new EnumC1489mJ("HIGHEST", 2);
        j = enumC1489mJ3;
        k = new EnumC1489mJ[]{enumC1489mJ, enumC1489mJ2, enumC1489mJ3};
    }

    public static EnumC1489mJ valueOf(String str) {
        return (EnumC1489mJ) Enum.valueOf(EnumC1489mJ.class, str);
    }

    public static EnumC1489mJ[] values() {
        return (EnumC1489mJ[]) k.clone();
    }
}
