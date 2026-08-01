package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class ti implements iq0 {
    public final AtomicReference a;

    public ti(iq0 iq0Var) {
        this.a = new AtomicReference(iq0Var);
    }

    @Override // defpackage.iq0
    public final Iterator iterator() {
        iq0 iq0Var = (iq0) this.a.getAndSet(null);
        if (iq0Var != null) {
            return iq0Var.iterator();
        }
        g8.s("This sequence can be consumed only once.");
        return null;
    }
}
