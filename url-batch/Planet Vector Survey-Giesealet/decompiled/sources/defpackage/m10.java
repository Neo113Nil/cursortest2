package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class m10 {
    public static final m10 d;
    public static final m10 e;
    public static final m10 f;
    public static final m10 g;
    public static final m10 h;
    public static final /* synthetic */ m10[] i;

    static {
        m10 m10Var = new m10("Measuring", 0);
        d = m10Var;
        m10 m10Var2 = new m10("LookaheadMeasuring", 1);
        e = m10Var2;
        m10 m10Var3 = new m10("LayingOut", 2);
        f = m10Var3;
        m10 m10Var4 = new m10("LookaheadLayingOut", 3);
        g = m10Var4;
        m10 m10Var5 = new m10("Idle", 4);
        h = m10Var5;
        i = new m10[]{m10Var, m10Var2, m10Var3, m10Var4, m10Var5};
    }

    public static m10 valueOf(String str) {
        return (m10) Enum.valueOf(m10.class, str);
    }

    public static m10[] values() {
        return (m10[]) i.clone();
    }
}
