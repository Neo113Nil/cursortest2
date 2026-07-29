package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class UA {
    public static final UA h;
    public static final UA i;
    public static final UA j;
    public static final /* synthetic */ UA[] k;

    static {
        UA ua = new UA("NOT_COMPUTED", 0);
        h = ua;
        UA ua2 = new UA("COMPUTING", 1);
        i = ua2;
        UA ua3 = new UA("RECURSION_WAS_DETECTED", 2);
        j = ua3;
        k = new UA[]{ua, ua2, ua3};
    }

    public static UA valueOf(String str) {
        return (UA) Enum.valueOf(UA.class, str);
    }

    public static UA[] values() {
        return (UA[]) k.clone();
    }
}
