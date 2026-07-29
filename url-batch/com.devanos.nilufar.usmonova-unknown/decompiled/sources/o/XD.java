package o;

import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class XD implements ListIterator, InterfaceC1594nw {
    public final Object h;
    public int i;

    public XD(int i, List list) {
        this.h = list;
        this.i = i;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator
    public final void add(Object obj) {
        this.h.add(this.i, obj);
        this.i++;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.i < this.h.size();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.i > 0;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.i;
        this.i = i + 1;
        return this.h.get(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.i;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.i - 1;
        this.i = i;
        return this.h.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.i - 1;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i = this.i - 1;
        this.i = i;
        this.h.remove(i);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator
    public final void set(Object obj) {
        this.h.set(this.i, obj);
    }
}
