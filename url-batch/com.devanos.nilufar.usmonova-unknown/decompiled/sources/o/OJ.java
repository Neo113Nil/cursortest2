package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class OJ {
    public static final OJ h;
    public static final OJ i;
    public static final /* synthetic */ OJ[] j;

    /* JADX INFO: Fake field, exist only in values array */
    OJ EF0;

    static {
        OJ oj = new OJ("PRETTY", 0);
        OJ oj2 = new OJ("DEBUG", 1);
        h = oj2;
        OJ oj3 = new OJ("NONE", 2);
        i = oj3;
        j = new OJ[]{oj, oj2, oj3};
    }

    public static OJ valueOf(String str) {
        return (OJ) Enum.valueOf(OJ.class, str);
    }

    public static OJ[] values() {
        return (OJ[]) j.clone();
    }
}
