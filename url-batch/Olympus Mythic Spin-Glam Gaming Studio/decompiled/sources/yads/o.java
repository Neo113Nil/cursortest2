package yads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public final class o implements Iterator {
    public Map.Entry b;
    public final /* synthetic */ Iterator c;
    public final /* synthetic */ p d;

    public o(p pVar, Iterator it) {
        this.d = pVar;
        this.c = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.c.next();
        this.b = entry;
        return entry.getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        Map.Entry entry = this.b;
        if (!(entry != null)) {
            throw new IllegalStateException("no calls to next() since the last call to remove()");
        }
        Collection collection = (Collection) entry.getValue();
        this.c.remove();
        this.d.c.f -= collection.size();
        collection.clear();
        this.b = null;
    }
}
