package o;

/* loaded from: classes.dex */
public abstract class DB {
    public static final CB a;
    public static final CB b;

    static {
        CB cb = null;
        try {
            cb = (CB) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = cb;
        b = new CB();
    }
}
