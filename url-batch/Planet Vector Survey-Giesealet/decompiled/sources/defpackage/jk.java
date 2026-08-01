package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class jk {
    public static final jk d;
    public static final jk e;
    public static final jk f;
    public static final /* synthetic */ jk[] g;

    static {
        jk jkVar = new jk("None", 0);
        d = jkVar;
        jk jkVar2 = new jk("Cancelled", 1);
        e = jkVar2;
        jk jkVar3 = new jk("Redirected", 2);
        f = jkVar3;
        g = new jk[]{jkVar, jkVar2, jkVar3, new jk("RedirectCancelled", 3)};
    }

    public static jk valueOf(String str) {
        return (jk) Enum.valueOf(jk.class, str);
    }

    public static jk[] values() {
        return (jk[]) g.clone();
    }
}
