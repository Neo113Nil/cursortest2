package yads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes3.dex */
public abstract class n implements Iterator {
    public final Iterator b;
    public Object c = null;
    public Collection d = null;
    public Iterator e = sc1.b;
    public final /* synthetic */ gy1 f;

    public n(gy1 gy1Var) {
        this.f = gy1Var;
        this.b = gy1Var.e.entrySet().iterator();
    }

    public abstract Object a(Object obj, Object obj2);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b.hasNext() || this.e.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.e.hasNext()) {
            Map.Entry entry = (Map.Entry) this.b.next();
            this.c = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.d = collection;
            this.e = collection.iterator();
        }
        return a(this.c, this.e.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.e.remove();
        Collection collection = this.d;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.b.remove();
        }
        gy1 gy1Var = this.f;
        gy1Var.f--;
    }
}
