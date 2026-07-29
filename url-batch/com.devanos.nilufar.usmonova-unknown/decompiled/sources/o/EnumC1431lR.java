package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: o.lR, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1431lR {
    public static final EnumC1431lR h;
    public static final EnumC1431lR i;
    public static final EnumC1431lR j;
    public static final /* synthetic */ EnumC1431lR[] k;

    static {
        EnumC1431lR enumC1431lR = new EnumC1431lR("START", 0);
        h = enumC1431lR;
        EnumC1431lR enumC1431lR2 = new EnumC1431lR("STOP", 1);
        i = enumC1431lR2;
        EnumC1431lR enumC1431lR3 = new EnumC1431lR("STOP_AND_RESET_REPLAY_CACHE", 2);
        j = enumC1431lR3;
        k = new EnumC1431lR[]{enumC1431lR, enumC1431lR2, enumC1431lR3};
    }

    public static EnumC1431lR valueOf(String str) {
        return (EnumC1431lR) Enum.valueOf(EnumC1431lR.class, str);
    }

    public static EnumC1431lR[] values() {
        return (EnumC1431lR[]) k.clone();
    }
}
