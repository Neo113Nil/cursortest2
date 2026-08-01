package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class od {
    public static final od f;
    public static final /* synthetic */ od[] g;

    static {
        od odVar = new od("COROUTINE_SUSPENDED", 0);
        f = odVar;
        g = new od[]{odVar, new od("UNDECIDED", 1), new od("RESUMED", 2)};
    }

    public static od valueOf(String str) {
        return (od) Enum.valueOf(od.class, str);
    }

    public static od[] values() {
        return (od[]) g.clone();
    }
}
