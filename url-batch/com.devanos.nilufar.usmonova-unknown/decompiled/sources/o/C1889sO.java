package o;

import java.util.ListIterator;

/* renamed from: o.sO, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1889sO implements ListIterator, InterfaceC1594nw {
    public final ListIterator h;
    public final /* synthetic */ C1955tO i;

    public C1889sO(C1955tO c1955tO, int i) {
        this.i = c1955tO;
        this.h = c1955tO.h.listIterator(AbstractC0720ac.h0(c1955tO, i));
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        ListIterator listIterator = this.h;
        listIterator.add(obj);
        listIterator.previous();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.h.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.h.hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return this.h.previous();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return AbstractC0868ct.w(this.i) - this.h.previousIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return this.h.next();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return AbstractC0868ct.w(this.i) - this.h.nextIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        this.h.remove();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        this.h.set(obj);
    }
}
