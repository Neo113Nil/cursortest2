package u1;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final List f4180a;

    static {
        try {
            Iterator it = Arrays.asList(new r1.b()).iterator();
            i1.f.e(it, "<this>");
            f4180a = o1.f.w(new o1.a(new W0.q(2, it)));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
