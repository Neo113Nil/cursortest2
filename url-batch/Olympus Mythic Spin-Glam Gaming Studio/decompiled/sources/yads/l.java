package yads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public final class l implements Iterator {
    public final Iterator b;
    public Collection c;
    public final /* synthetic */ m d;

    public l(m mVar) {
        this.d = mVar;
        this.b = mVar.d.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.b.next();
        this.c = (Collection) entry.getValue();
        return this.d.a(entry);
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!(this.c != null)) {
            throw new IllegalStateException("no calls to next() since the last call to remove()");
        }
        this.b.remove();
        this.d.e.f -= this.c.size();
        this.c.clear();
        this.c = null;
    }
}
