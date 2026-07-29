package o;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;

/* renamed from: o.Me, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0318Me {
    public static final List a;

    static {
        try {
            Iterator it = Arrays.asList(new C2264y3()).iterator();
            AbstractC0048Bt.n(it, "<this>");
            a = PQ.B(new C0577Wd(new T6(2, it)));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
