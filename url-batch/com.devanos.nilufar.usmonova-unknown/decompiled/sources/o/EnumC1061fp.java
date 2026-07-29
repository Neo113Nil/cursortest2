package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: o.fp, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1061fp {
    public static final EnumC1061fp h;
    public static final EnumC1061fp i;
    public static final EnumC1061fp j;
    public static final /* synthetic */ EnumC1061fp[] k;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC1061fp EF0;

    static {
        EnumC1061fp enumC1061fp = new EnumC1061fp("PENALTY_LOG", 0);
        EnumC1061fp enumC1061fp2 = new EnumC1061fp("PENALTY_DEATH", 1);
        EnumC1061fp enumC1061fp3 = new EnumC1061fp("DETECT_FRAGMENT_REUSE", 2);
        h = enumC1061fp3;
        EnumC1061fp enumC1061fp4 = new EnumC1061fp("DETECT_FRAGMENT_TAG_USAGE", 3);
        i = enumC1061fp4;
        EnumC1061fp enumC1061fp5 = new EnumC1061fp("DETECT_WRONG_NESTED_HIERARCHY", 4);
        EnumC1061fp enumC1061fp6 = new EnumC1061fp("DETECT_RETAIN_INSTANCE_USAGE", 5);
        EnumC1061fp enumC1061fp7 = new EnumC1061fp("DETECT_SET_USER_VISIBLE_HINT", 6);
        EnumC1061fp enumC1061fp8 = new EnumC1061fp("DETECT_TARGET_FRAGMENT_USAGE", 7);
        EnumC1061fp enumC1061fp9 = new EnumC1061fp("DETECT_WRONG_FRAGMENT_CONTAINER", 8);
        j = enumC1061fp9;
        k = new EnumC1061fp[]{enumC1061fp, enumC1061fp2, enumC1061fp3, enumC1061fp4, enumC1061fp5, enumC1061fp6, enumC1061fp7, enumC1061fp8, enumC1061fp9};
    }

    public static EnumC1061fp valueOf(String str) {
        return (EnumC1061fp) Enum.valueOf(EnumC1061fp.class, str);
    }

    public static EnumC1061fp[] values() {
        return (EnumC1061fp[]) k.clone();
    }
}
