package defpackage;

import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class k70 implements ListIterator, j00 {
    public final List d;
    public int e;

    public k70(List list, int i) {
        this.d = list;
        this.e = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        this.d.add(this.e, obj);
        this.e++;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.e < this.d.size();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.e > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.e;
        this.e = i + 1;
        return this.d.get(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.e;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.e - 1;
        this.e = i;
        return this.d.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.e - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i = this.e - 1;
        this.e = i;
        this.d.remove(i);
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        this.d.set(this.e, obj);
    }
}
