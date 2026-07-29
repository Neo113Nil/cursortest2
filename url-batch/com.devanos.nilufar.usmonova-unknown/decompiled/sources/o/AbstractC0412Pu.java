package o;

/* renamed from: o.Pu, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0412Pu {
    public static final C2245xo a;
    public static final C1639ob b;

    static {
        C2245xo c2245xo = new C2245xo("kotlin.jvm.JvmField");
        a = c2245xo;
        C1639ob.j(c2245xo);
        C1639ob.j(new C2245xo("kotlin.reflect.jvm.internal.ReflectionFactoryImpl"));
        b = C1639ob.e("kotlin/jvm/internal/RepeatableContainer", false);
    }

    public static final String a(String str) {
        AbstractC0048Bt.n(str, "propertyName");
        if (c(str)) {
            return str;
        }
        return "get" + AbstractC0022At.k(str);
    }

    public static final String b(String str) {
        String k;
        StringBuilder sb = new StringBuilder("set");
        if (c(str)) {
            k = str.substring(2);
            AbstractC0048Bt.m(k, "this as java.lang.String).substring(startIndex)");
        } else {
            k = AbstractC0022At.k(str);
        }
        sb.append(k);
        return sb.toString();
    }

    public static final boolean c(String str) {
        AbstractC0048Bt.n(str, "name");
        if (AbstractC0778bU.B(str, "is", false) && str.length() != 2) {
            char charAt = str.charAt(2);
            if (AbstractC0048Bt.t(97, charAt) > 0 || AbstractC0048Bt.t(charAt, 122) > 0) {
                return true;
            }
        }
        return false;
    }
}
