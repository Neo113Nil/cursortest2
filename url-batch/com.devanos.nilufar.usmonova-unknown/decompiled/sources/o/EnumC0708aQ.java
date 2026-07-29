package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: o.aQ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0708aQ {
    public static final EnumC0708aQ h;
    public static final EnumC0708aQ i;
    public static final EnumC0708aQ j;
    public static final /* synthetic */ EnumC0708aQ[] k;

    static {
        EnumC0708aQ enumC0708aQ = new EnumC0708aQ("NETWORK_UNMETERED", 0);
        h = enumC0708aQ;
        EnumC0708aQ enumC0708aQ2 = new EnumC0708aQ("DEVICE_IDLE", 1);
        i = enumC0708aQ2;
        EnumC0708aQ enumC0708aQ3 = new EnumC0708aQ("DEVICE_CHARGING", 2);
        j = enumC0708aQ3;
        k = new EnumC0708aQ[]{enumC0708aQ, enumC0708aQ2, enumC0708aQ3};
    }

    public static EnumC0708aQ valueOf(String str) {
        return (EnumC0708aQ) Enum.valueOf(EnumC0708aQ.class, str);
    }

    public static EnumC0708aQ[] values() {
        return (EnumC0708aQ[]) k.clone();
    }
}
