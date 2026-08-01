package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class m8 implements Collection {
    public final /* synthetic */ n8 d;

    public m8(n8 n8Var) {
        this.d = n8Var;
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
        this.d.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.d.a(obj) >= 0;
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
        return this.d.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new j8(this.d, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        n8 n8Var = this.d;
        int a = n8Var.a(obj);
        if (a < 0) {
            return false;
        }
        n8Var.f(a);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        n8 n8Var = this.d;
        int i = n8Var.f;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (collection.contains(n8Var.h(i2))) {
                n8Var.f(i2);
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
        n8 n8Var = this.d;
        int i = n8Var.f;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (!collection.contains(n8Var.h(i2))) {
                n8Var.f(i2);
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
        return this.d.f;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        n8 n8Var = this.d;
        int i = n8Var.f;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = n8Var.h(i2);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        n8 n8Var = this.d;
        int i = n8Var.f;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = n8Var.h(i2);
        }
        return objArr;
    }
}
