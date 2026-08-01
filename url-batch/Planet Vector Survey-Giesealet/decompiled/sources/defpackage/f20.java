package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class f20 {
    public static final f20 d;
    public static final f20 e;
    public static final f20 f;
    public static final f20 g;
    public static final f20 h;
    public static final /* synthetic */ f20[] i;

    static {
        f20 f20Var = new f20("DESTROYED", 0);
        d = f20Var;
        f20 f20Var2 = new f20("INITIALIZED", 1);
        e = f20Var2;
        f20 f20Var3 = new f20("CREATED", 2);
        f = f20Var3;
        f20 f20Var4 = new f20("STARTED", 3);
        g = f20Var4;
        f20 f20Var5 = new f20("RESUMED", 4);
        h = f20Var5;
        i = new f20[]{f20Var, f20Var2, f20Var3, f20Var4, f20Var5};
    }

    public static f20 valueOf(String str) {
        return (f20) Enum.valueOf(f20.class, str);
    }

    public static f20[] values() {
        return (f20[]) i.clone();
    }
}
