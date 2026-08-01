package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class i70 implements List, k00 {
    public final l70 d;

    public i70(l70 l70Var) {
        this.d = l70Var;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        this.d.b(obj);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        l70 l70Var = this.d;
        return l70Var.e(l70Var.f, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.d.g();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.d.h(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.d.h(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        m70.a(this, i);
        return this.d.d[i];
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        l70 l70Var = this.d;
        Object[] objArr = l70Var.d;
        int i = l70Var.f;
        for (int i2 = 0; i2 < i; i2++) {
            if (nz.l(obj, objArr[i2])) {
                return i2;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.d.f == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new k70(this, 0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        l70 l70Var = this.d;
        Object[] objArr = l70Var.d;
        for (int i = l70Var.f - 1; i >= 0; i--) {
            if (nz.l(obj, objArr[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new k70(this, 0);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        m70.a(this, i);
        return this.d.j(i);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        l70 l70Var = this.d;
        int i = l70Var.f;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            l70Var.i(it.next());
        }
        return i != l70Var.f;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        l70 l70Var = this.d;
        int i = l70Var.f;
        for (int i2 = i - 1; -1 < i2; i2--) {
            if (!collection.contains(l70Var.d[i2])) {
                l70Var.j(i2);
            }
        }
        return i != l70Var.f;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        m70.a(this, i);
        Object[] objArr = this.d.d;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.d.f;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        m70.b(this, i, i2);
        return new j70(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return x40.P(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return x40.Q(this, objArr);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        this.d.a(i, obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new k70(this, i);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        return this.d.e(i, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        return this.d.i(obj);
    }
}
