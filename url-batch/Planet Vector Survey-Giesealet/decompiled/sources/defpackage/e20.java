package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class e20 {
    private static final /* synthetic */ nq $ENTRIES;
    private static final /* synthetic */ e20[] $VALUES;
    public static final c20 Companion;
    public static final e20 ON_ANY;
    public static final e20 ON_CREATE;
    public static final e20 ON_DESTROY;
    public static final e20 ON_PAUSE;
    public static final e20 ON_RESUME;
    public static final e20 ON_START;
    public static final e20 ON_STOP;

    static {
        e20 e20Var = new e20("ON_CREATE", 0);
        ON_CREATE = e20Var;
        e20 e20Var2 = new e20("ON_START", 1);
        ON_START = e20Var2;
        e20 e20Var3 = new e20("ON_RESUME", 2);
        ON_RESUME = e20Var3;
        e20 e20Var4 = new e20("ON_PAUSE", 3);
        ON_PAUSE = e20Var4;
        e20 e20Var5 = new e20("ON_STOP", 4);
        ON_STOP = e20Var5;
        e20 e20Var6 = new e20("ON_DESTROY", 5);
        ON_DESTROY = e20Var6;
        e20 e20Var7 = new e20("ON_ANY", 6);
        ON_ANY = e20Var7;
        e20[] e20VarArr = {e20Var, e20Var2, e20Var3, e20Var4, e20Var5, e20Var6, e20Var7};
        $VALUES = e20VarArr;
        $ENTRIES = new oq(e20VarArr);
        Companion = new c20();
    }

    public static e20 valueOf(String str) {
        return (e20) Enum.valueOf(e20.class, str);
    }

    public static e20[] values() {
        return (e20[]) $VALUES.clone();
    }

    public final f20 a() {
        switch (d20.a[ordinal()]) {
            case 1:
            case 2:
                return f20.f;
            case 3:
            case 4:
                return f20.g;
            case 5:
                return f20.h;
            case 6:
                return f20.d;
            case 7:
                throw new IllegalArgumentException(this + " has no target state");
            default:
                g8.c();
                return null;
        }
    }
}
