package o;

/* renamed from: o.xE, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2209xE {
    public static final C2143wE a;
    public static final C2143wE b;

    static {
        C2143wE c2143wE = null;
        try {
            c2143wE = (C2143wE) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = c2143wE;
        b = new C2143wE();
    }
}
