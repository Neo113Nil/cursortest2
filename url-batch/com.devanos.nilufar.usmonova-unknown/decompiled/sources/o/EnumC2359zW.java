package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: o.zW, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC2359zW {
    public static final EnumC2359zW h;
    public static final EnumC2359zW i;
    public static final EnumC2359zW j;
    public static final /* synthetic */ EnumC2359zW[] k;

    static {
        EnumC2359zW enumC2359zW = new EnumC2359zW("ContinueTraversal", 0);
        h = enumC2359zW;
        EnumC2359zW enumC2359zW2 = new EnumC2359zW("SkipSubtreeAndContinueTraversal", 1);
        i = enumC2359zW2;
        EnumC2359zW enumC2359zW3 = new EnumC2359zW("CancelTraversal", 2);
        j = enumC2359zW3;
        k = new EnumC2359zW[]{enumC2359zW, enumC2359zW2, enumC2359zW3};
    }

    public static EnumC2359zW valueOf(String str) {
        return (EnumC2359zW) Enum.valueOf(EnumC2359zW.class, str);
    }

    public static EnumC2359zW[] values() {
        return (EnumC2359zW[]) k.clone();
    }
}
