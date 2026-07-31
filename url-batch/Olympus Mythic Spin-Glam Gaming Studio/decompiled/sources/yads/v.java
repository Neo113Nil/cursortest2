package yads;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes4.dex */
public class v implements Iterator {
    public final Iterator b;
    public final Collection c;
    public final /* synthetic */ x d;

    public v(x xVar) {
        this.d = xVar;
        Collection collection = xVar.c;
        this.c = collection;
        this.b = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        this.d.b();
        if (this.d.c == this.c) {
            return this.b.hasNext();
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Iterator
    public final Object next() {
        this.d.b();
        if (this.d.c == this.c) {
            return this.b.next();
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.b.remove();
        x xVar = this.d;
        y yVar = xVar.f;
        yVar.f--;
        xVar.c();
    }

    public v(x xVar, ListIterator listIterator) {
        this.d = xVar;
        this.c = xVar.c;
        this.b = listIterator;
    }
}
