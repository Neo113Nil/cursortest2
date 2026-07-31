package yads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes4.dex */
public class x extends AbstractCollection implements List {
    public final Object b;
    public Collection c;
    public final x d;
    public final Collection e;
    public final /* synthetic */ y f;
    public final /* synthetic */ y g;

    public x(y yVar, Object obj, List list, x xVar) {
        this.g = yVar;
        this.f = yVar;
        this.b = obj;
        this.c = list;
        this.d = xVar;
        this.e = xVar == null ? null : xVar.c;
    }

    public final void a() {
        x xVar = this.d;
        if (xVar != null) {
            xVar.a();
        } else {
            this.f.e.put(this.b, this.c);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b();
        boolean isEmpty = this.c.isEmpty();
        boolean add = this.c.add(obj);
        if (add) {
            this.f.f++;
            if (isEmpty) {
                a();
            }
        }
        return add;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        b();
        int size = this.c.size();
        boolean addAll = this.c.addAll(collection);
        if (addAll) {
            int size2 = this.c.size();
            y yVar = this.f;
            yVar.f = (size2 - size) + yVar.f;
            if (size == 0) {
                a();
            }
        }
        return addAll;
    }

    public final void b() {
        Collection collection;
        x xVar = this.d;
        if (xVar != null) {
            xVar.b();
            if (this.d.c != this.e) {
                throw new ConcurrentModificationException();
            }
        } else {
            if (!this.c.isEmpty() || (collection = (Collection) this.f.e.get(this.b)) == null) {
                return;
            }
            this.c = collection;
        }
    }

    public final void c() {
        x xVar = this.d;
        if (xVar != null) {
            xVar.c();
        } else if (this.c.isEmpty()) {
            this.f.e.remove(this.b);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        b();
        int size = this.c.size();
        if (size == 0) {
            return;
        }
        this.c.clear();
        this.f.f -= size;
        c();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        b();
        return this.c.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        b();
        return this.c.containsAll(collection);
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        b();
        return this.c.equals(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        b();
        return ((List) this.c).get(i);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        b();
        return this.c.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        b();
        return ((List) this.c).indexOf(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        b();
        return new v(this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        b();
        return ((List) this.c).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        b();
        return new w(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        b();
        boolean remove = this.c.remove(obj);
        if (remove) {
            y yVar = this.f;
            yVar.f--;
            c();
        }
        return remove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        b();
        int size = this.c.size();
        boolean removeAll = this.c.removeAll(collection);
        if (removeAll) {
            int size2 = this.c.size();
            y yVar = this.f;
            yVar.f = (size2 - size) + yVar.f;
            c();
        }
        return removeAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        b();
        int size = this.c.size();
        boolean retainAll = this.c.retainAll(collection);
        if (retainAll) {
            int size2 = this.c.size();
            y yVar = this.f;
            yVar.f = (size2 - size) + yVar.f;
            c();
        }
        return retainAll;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        b();
        return ((List) this.c).set(i, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        b();
        return this.c.size();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        b();
        y yVar = this.g;
        Object obj = this.b;
        List subList = ((List) this.c).subList(i, i2);
        x xVar = this.d;
        if (xVar == null) {
            xVar = this;
        }
        yVar.getClass();
        return subList instanceof RandomAccess ? new s(yVar, obj, subList, xVar) : new x(yVar, obj, subList, xVar);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        b();
        return this.c.toString();
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        b();
        return new w(this, i);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        b();
        Object remove = ((List) this.c).remove(i);
        y yVar = this.g;
        yVar.f--;
        c();
        return remove;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        b();
        boolean isEmpty = this.c.isEmpty();
        ((List) this.c).add(i, obj);
        this.g.f++;
        if (isEmpty) {
            a();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        b();
        int size = this.c.size();
        boolean addAll = ((List) this.c).addAll(i, collection);
        if (addAll) {
            int size2 = this.c.size();
            y yVar = this.g;
            yVar.f = (size2 - size) + yVar.f;
            if (size == 0) {
                a();
            }
        }
        return addAll;
    }
}
