package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class XL {
    public static final XL h;
    public static final XL i;
    public static final XL j;
    public static final XL k;
    public static final XL l;
    public static final XL m;
    public static final /* synthetic */ XL[] n;

    static {
        XL xl = new XL("ShutDown", 0);
        h = xl;
        XL xl2 = new XL("ShuttingDown", 1);
        i = xl2;
        XL xl3 = new XL("Inactive", 2);
        j = xl3;
        XL xl4 = new XL("InactivePendingWork", 3);
        k = xl4;
        XL xl5 = new XL("Idle", 4);
        l = xl5;
        XL xl6 = new XL("PendingWork", 5);
        m = xl6;
        n = new XL[]{xl, xl2, xl3, xl4, xl5, xl6};
    }

    public static XL valueOf(String str) {
        return (XL) Enum.valueOf(XL.class, str);
    }

    public static XL[] values() {
        return (XL[]) n.clone();
    }
}
