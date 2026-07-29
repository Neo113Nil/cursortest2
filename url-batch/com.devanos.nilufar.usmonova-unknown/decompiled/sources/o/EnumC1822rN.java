package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: o.rN, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class EnumC1822rN {
    public static final C1757qN h;
    public static final C1691pN i;
    public static final /* synthetic */ EnumC1822rN[] j;

    static {
        C1757qN c1757qN = new C1757qN();
        h = c1757qN;
        C1691pN c1691pN = new C1691pN();
        i = c1691pN;
        j = new EnumC1822rN[]{c1757qN, c1691pN};
    }

    public static EnumC1822rN valueOf(String str) {
        return (EnumC1822rN) Enum.valueOf(EnumC1822rN.class, str);
    }

    public static EnumC1822rN[] values() {
        return (EnumC1822rN[]) j.clone();
    }

    public abstract String a(String str);
}
