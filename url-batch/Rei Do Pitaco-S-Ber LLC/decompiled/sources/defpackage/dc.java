package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class dc implements h10 {
    public final AtomicReference a;

    public dc(we weVar) {
        this.a = new AtomicReference(weVar);
    }

    @Override // defpackage.h10
    public final Iterator iterator() {
        h10 h10Var = (h10) this.a.getAndSet(null);
        if (h10Var != null) {
            return h10Var.iterator();
        }
        l8.u("This sequence can be consumed only once.");
        return null;
    }
}
