package s1;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final List f3693a;

    static {
        try {
            Iterator it = Arrays.asList(new p1.b()).iterator();
            g1.f.e(it, "<this>");
            f3693a = m1.f.s(new m1.a(new m1.c(1, it)));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
