package o;

import java.lang.reflect.Type;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class KM implements InterfaceC1526mu {
    @Override // o.InterfaceC0489St
    public C1558nM a(C2245xo c2245xo) {
        Object obj;
        AbstractC0048Bt.n(c2245xo, "fqName");
        Iterator it = getAnnotations().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (AbstractC1492mM.a(AbstractC1473m3.D(AbstractC1473m3.B(((C1558nM) obj).a))).b().equals(c2245xo)) {
                break;
            }
        }
        return (C1558nM) obj;
    }

    public abstract Type b();

    public final boolean equals(Object obj) {
        return (obj instanceof KM) && AbstractC0048Bt.h(b(), ((KM) obj).b());
    }

    public final int hashCode() {
        return b().hashCode();
    }

    public final String toString() {
        return getClass().getName() + ": " + b();
    }
}
