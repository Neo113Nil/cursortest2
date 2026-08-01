package d1;

import Q0.k;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f1904a;

    public a(k kVar) {
        this.f1904a = new AtomicReference(kVar);
    }

    @Override // d1.d
    public final Iterator iterator() {
        d dVar = (d) this.f1904a.getAndSet(null);
        if (dVar != null) {
            return dVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
