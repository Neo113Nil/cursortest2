package o;

/* renamed from: o.rl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1846rl {
    public static final C1781ql a = new C1781ql();
    public static final C1781ql b;

    static {
        C1781ql c1781ql = null;
        try {
            c1781ql = (C1781ql) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = c1781ql;
    }
}
