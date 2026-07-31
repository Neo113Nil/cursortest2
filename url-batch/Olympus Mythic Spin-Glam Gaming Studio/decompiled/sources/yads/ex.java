package yads;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;

/* loaded from: classes5.dex */
public abstract class ex extends AbstractCollection {
    public final Set b;
    public final ig2 c;

    public ex(Set set, ig2 ig2Var) {
        this.b = set;
        this.c = ig2Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        if (this.c.apply(obj)) {
            return this.b.add(obj);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.c.apply(it.next())) {
                throw new IllegalArgumentException();
            }
        }
        return this.b.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        Set set = this.b;
        ig2 ig2Var = this.c;
        if (!(set instanceof RandomAccess) || !(set instanceof List)) {
            Iterator it = set.iterator();
            ig2Var.getClass();
            while (it.hasNext()) {
                if (ig2Var.apply(it.next())) {
                    it.remove();
                }
            }
            return;
        }
        List list = (List) set;
        ig2Var.getClass();
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            Object obj = list.get(i2);
            if (!ig2Var.apply(obj)) {
                if (i2 > i) {
                    try {
                        list.set(i, obj);
                    } catch (IllegalArgumentException unused) {
                        for (int size = list.size() - 1; size > i2; size--) {
                            if (ig2Var.apply(list.get(size))) {
                                list.remove(size);
                            }
                        }
                        for (int i3 = i2 - 1; i3 >= i; i3--) {
                            list.remove(i3);
                        }
                        return;
                    } catch (UnsupportedOperationException unused2) {
                        for (int size2 = list.size() - 1; size2 > i2; size2--) {
                            if (ig2Var.apply(list.get(size2))) {
                                list.remove(size2);
                            }
                        }
                        for (int i4 = i2 - 1; i4 >= i; i4--) {
                            list.remove(i4);
                        }
                        return;
                    }
                }
                i++;
            }
        }
        list.subList(i, list.size()).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        boolean z;
        Set set = this.b;
        set.getClass();
        try {
            z = set.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            z = false;
        }
        if (z) {
            return this.c.apply(obj);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        Set set = this.b;
        ig2 ig2Var = this.c;
        Iterator it = set.iterator();
        if (ig2Var == null) {
            throw new NullPointerException("predicate");
        }
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (ig2Var.apply(it.next())) {
                break;
            }
            i++;
        }
        return true ^ (i != -1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        Iterator it = this.b.iterator();
        ig2 ig2Var = this.c;
        it.getClass();
        ig2Var.getClass();
        return new qc1(it, ig2Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        return contains(obj) && this.b.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = this.b.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.c.apply(next) && collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        Iterator it = this.b.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.c.apply(next) && !collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        Iterator it = this.b.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (this.c.apply(it.next())) {
                i++;
            }
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        qc1 qc1Var = (qc1) iterator();
        ArrayList arrayList = new ArrayList();
        while (qc1Var.hasNext()) {
            arrayList.add(qc1Var.next());
        }
        return arrayList.toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        qc1 qc1Var = (qc1) iterator();
        ArrayList arrayList = new ArrayList();
        while (qc1Var.hasNext()) {
            arrayList.add(qc1Var.next());
        }
        return arrayList.toArray(objArr);
    }
}
