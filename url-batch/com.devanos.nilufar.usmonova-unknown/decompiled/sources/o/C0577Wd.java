package o;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: o.Wd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0577Wd implements NQ {
    public final AtomicReference a;

    public C0577Wd(NQ nq) {
        this.a = new AtomicReference(nq);
    }

    @Override // o.NQ
    public final Iterator iterator() {
        NQ nq = (NQ) this.a.getAndSet(null);
        if (nq != null) {
            return nq.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
