package o;

import java.util.Iterator;

/* renamed from: o.qW, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1766qW implements Iterator, InterfaceC1594nw {
    public final Iterator h;
    public final /* synthetic */ C1831rW i;

    public C1766qW(C1831rW c1831rW) {
        this.i = c1831rW;
        this.h = c1831rW.a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.h.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.i.b.invoke(this.h.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
