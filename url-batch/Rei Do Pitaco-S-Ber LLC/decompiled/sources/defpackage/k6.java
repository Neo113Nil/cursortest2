package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class k6 implements Collection {
    public final /* synthetic */ l6 f;

    public k6(l6 l6Var) {
        this.f = l6Var;
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
        this.f.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f.a(obj) >= 0;
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
        return this.f.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new h6(this.f, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        l6 l6Var = this.f;
        int a = l6Var.a(obj);
        if (a < 0) {
            return false;
        }
        l6Var.g(a);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        l6 l6Var = this.f;
        int i = l6Var.h;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (collection.contains(l6Var.i(i2))) {
                l6Var.g(i2);
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
        l6 l6Var = this.f;
        int i = l6Var.h;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (!collection.contains(l6Var.i(i2))) {
                l6Var.g(i2);
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
        return this.f.h;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        l6 l6Var = this.f;
        int i = l6Var.h;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = l6Var.i(i2);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        l6 l6Var = this.f;
        int i = l6Var.h;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = l6Var.i(i2);
        }
        return objArr;
    }
}
