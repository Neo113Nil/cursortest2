package o;

/* renamed from: o.Ul, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0533Ul {
    public static final C0232Iv a;

    static {
        C0232Iv c0232Iv;
        try {
            Class.forName("java.nio.file.Files");
            c0232Iv = new CE();
        } catch (ClassNotFoundException unused) {
            c0232Iv = new C0232Iv();
        }
        a = c0232Iv;
        String str = CH.i;
        String property = System.getProperty("java.io.tmpdir");
        AbstractC0048Bt.m(property, "getProperty(...)");
        C0218Ih.r(property, false);
        ClassLoader classLoader = SN.class.getClassLoader();
        AbstractC0048Bt.m(classLoader, "getClassLoader(...)");
        new SN(classLoader);
    }

    public abstract void a(CH ch, CH ch2);

    public abstract void b(CH ch);

    public abstract void c(CH ch);

    public final boolean d(CH ch) {
        AbstractC0048Bt.n(ch, "path");
        return e(ch) != null;
    }

    public abstract C0507Tl e(CH ch);

    public abstract C0935dv f(CH ch);

    public abstract C0935dv g(CH ch);

    public abstract HS h(CH ch);
}
