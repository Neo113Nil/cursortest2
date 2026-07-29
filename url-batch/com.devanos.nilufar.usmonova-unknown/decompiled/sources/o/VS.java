package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public class VS {
    public static final VS i;
    public static final VS j;
    public static final VS k;
    public static final US l;
    public static final /* synthetic */ VS[] m;
    public final Object h;

    static {
        VS vs = new VS(0, null, "NULL");
        i = vs;
        VS vs2 = new VS(1, -1, "INDEX");
        j = vs2;
        VS vs3 = new VS(2, Boolean.FALSE, "FALSE");
        k = vs3;
        US us = new US(3, null, "MAP_GET_OR_DEFAULT");
        l = us;
        m = new VS[]{vs, vs2, vs3, us};
    }

    public VS(int i2, Object obj, String str) {
        this.h = obj;
    }

    public static VS valueOf(String str) {
        return (VS) Enum.valueOf(VS.class, str);
    }

    public static VS[] values() {
        return (VS[]) m.clone();
    }
}
