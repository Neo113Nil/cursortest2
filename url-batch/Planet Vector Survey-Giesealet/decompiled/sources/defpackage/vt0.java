package defpackage;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class vt0 implements List, k00 {
    public final gs0 d;
    public final int e;
    public int f;
    public int g;

    public vt0(gs0 gs0Var, int i, int i2) {
        this.d = gs0Var;
        this.e = i;
        this.f = px0.D(gs0Var);
        this.g = i2 - i;
    }

    public final void a() {
        if (px0.D(this.d) != this.f) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        a();
        int i = this.e + this.g;
        gs0 gs0Var = this.d;
        gs0Var.add(i, obj);
        this.g++;
        this.f = px0.D(gs0Var);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        a();
        int i2 = i + this.e;
        gs0 gs0Var = this.d;
        boolean addAll = gs0Var.addAll(i2, collection);
        if (addAll) {
            this.g = collection.size() + this.g;
            this.f = px0.D(gs0Var);
        }
        return addAll;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        if (this.g > 0) {
            a();
            int i = this.g;
            int i2 = this.e;
            gs0 gs0Var = this.d;
            gs0Var.d(i2, i + i2);
            this.g = 0;
            this.f = px0.D(gs0Var);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        a();
        px0.f(i, this.g);
        return this.d.get(this.e + i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        a();
        int i = this.g;
        int i2 = this.e;
        Iterator it = rg0.v(i2, i + i2).iterator();
        while (((dz) it).f) {
            int nextInt = ((xy) it).nextInt();
            if (nz.l(obj, this.d.get(nextInt))) {
                return nextInt - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.g == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        a();
        int i = this.g;
        int i2 = this.e;
        for (int i3 = (i + i2) - 1; i3 >= i2; i3--) {
            if (nz.l(obj, this.d.get(i3))) {
                return i3 - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        a();
        ej0 ej0Var = new ej0();
        ej0Var.d = i - 1;
        return new xk0(ej0Var, this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        a();
        int i2 = this.e + i;
        gs0 gs0Var = this.d;
        Object remove = gs0Var.remove(i2);
        this.g--;
        this.f = px0.D(gs0Var);
        return remove;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i;
        w wVar;
        or0 k;
        boolean j;
        a();
        gs0 gs0Var = this.d;
        int i2 = this.e;
        int i3 = this.g + i2;
        int size = gs0Var.size();
        do {
            synchronized (px0.g) {
                gt0 gt0Var = gs0Var.d;
                gt0Var.getClass();
                gt0 gt0Var2 = (gt0) ur0.i(gt0Var);
                i = gt0Var2.d;
                wVar = gt0Var2.c;
            }
            wVar.getClass();
            tf0 e = wVar.e();
            e.subList(i2, i3).retainAll(collection);
            w c = e.c();
            if (nz.l(c, wVar)) {
                break;
            }
            gt0 gt0Var3 = gs0Var.d;
            gt0Var3.getClass();
            synchronized (ur0.c) {
                k = ur0.k();
                j = px0.j((gt0) ur0.x(gt0Var3, gs0Var, k), i, c, true);
            }
            ur0.o(k, gs0Var);
        } while (!j);
        int size2 = size - gs0Var.size();
        if (size2 > 0) {
            this.f = px0.D(this.d);
            this.g -= size2;
        }
        return size2 > 0;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        px0.f(i, this.g);
        a();
        int i2 = i + this.e;
        gs0 gs0Var = this.d;
        Object obj2 = gs0Var.set(i2, obj);
        this.f = px0.D(gs0Var);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.g;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (i < 0 || i > i2 || i2 > this.g) {
            gh0.a("fromIndex or toIndex are out of bounds");
        }
        a();
        int i3 = this.e;
        return new vt0(this.d, i + i3, i2 + i3);
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
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        a();
        int i2 = this.e + i;
        gs0 gs0Var = this.d;
        gs0Var.add(i2, obj);
        this.g++;
        this.f = px0.D(gs0Var);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(this.g, collection);
    }
}
