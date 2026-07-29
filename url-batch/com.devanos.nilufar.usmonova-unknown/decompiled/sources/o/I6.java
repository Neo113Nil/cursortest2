package o;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class I6 implements Collection {
    public final /* synthetic */ K6 h;

    public I6(K6 k6) {
        this.h = k6;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.h.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.h.a(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.h.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new F6(this.h, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        K6 k6 = this.h;
        int a = k6.a(obj);
        if (a < 0) {
            return false;
        }
        k6.f(a);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        K6 k6 = this.h;
        int i = k6.j;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (collection.contains(k6.h(i2))) {
                k6.f(i2);
                i2--;
                i--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        K6 k6 = this.h;
        int i = k6.j;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (!collection.contains(k6.h(i2))) {
                k6.f(i2);
                i2--;
                i--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.h.j;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        K6 k6 = this.h;
        int i = k6.j;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = k6.h(i2);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        K6 k6 = this.h;
        int i = k6.j;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = k6.h(i2);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }
}
