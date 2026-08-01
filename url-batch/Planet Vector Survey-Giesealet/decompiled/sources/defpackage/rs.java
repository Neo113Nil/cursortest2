package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class rs {
    public static final rs d;
    public static final rs e;
    public static final rs f;
    public static final rs g;
    public static final /* synthetic */ rs[] h;

    static {
        rs rsVar = new rs("Active", 0);
        d = rsVar;
        rs rsVar2 = new rs("ActiveParent", 1);
        e = rsVar2;
        rs rsVar3 = new rs("Captured", 2);
        f = rsVar3;
        rs rsVar4 = new rs("Inactive", 3);
        g = rsVar4;
        h = new rs[]{rsVar, rsVar2, rsVar3, rsVar4};
    }

    public static rs valueOf(String str) {
        return (rs) Enum.valueOf(rs.class, str);
    }

    public static rs[] values() {
        return (rs[]) h.clone();
    }

    public final boolean a() {
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return false;
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return false;
                }
                g8.c();
                return false;
            }
        }
        return true;
    }
}
