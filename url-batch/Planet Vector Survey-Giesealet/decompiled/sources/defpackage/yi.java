package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class yi {
    public static final yi d;
    public static final yi e;
    public static final /* synthetic */ yi[] f;

    static {
        yi yiVar = new yi("VIEW_APPEAR", 0);
        d = yiVar;
        yi yiVar2 = new yi("VIEW_DISAPPEAR", 1);
        e = yiVar2;
        f = new yi[]{yiVar, yiVar2};
    }

    public static yi valueOf(String str) {
        return (yi) Enum.valueOf(yi.class, str);
    }

    public static yi[] values() {
        return (yi[]) f.clone();
    }
}
