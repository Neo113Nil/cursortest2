package o;

import java.util.Collections;
import java.util.Map;

/* renamed from: o.pl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1715pl {
    public static volatile C1715pl a;
    public static final C1715pl b;

    static {
        C1715pl c1715pl = new C1715pl();
        Map map = Collections.EMPTY_MAP;
        b = c1715pl;
    }

    public static C1715pl a() {
        C1715pl c1715pl;
        C1715pl c1715pl2 = a;
        if (c1715pl2 != null) {
            return c1715pl2;
        }
        synchronized (C1715pl.class) {
            try {
                c1715pl = a;
                if (c1715pl == null) {
                    Class cls = AbstractC1517ml.a;
                    C1715pl c1715pl3 = null;
                    if (cls != null) {
                        try {
                            c1715pl3 = (C1715pl) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    c1715pl = c1715pl3 != null ? c1715pl3 : b;
                    a = c1715pl;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1715pl;
    }
}
