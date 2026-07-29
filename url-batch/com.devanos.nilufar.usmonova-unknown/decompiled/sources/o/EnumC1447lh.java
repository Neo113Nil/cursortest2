package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: o.lh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1447lh {
    public static final EnumC1447lh h;
    public static final /* synthetic */ EnumC1447lh[] i;

    static {
        EnumC1447lh enumC1447lh = new EnumC1447lh("WARNING", 0);
        h = enumC1447lh;
        i = new EnumC1447lh[]{enumC1447lh, new EnumC1447lh("ERROR", 1), new EnumC1447lh("HIDDEN", 2)};
    }

    public static EnumC1447lh valueOf(String str) {
        return (EnumC1447lh) Enum.valueOf(EnumC1447lh.class, str);
    }

    public static EnumC1447lh[] values() {
        return (EnumC1447lh[]) i.clone();
    }
}
