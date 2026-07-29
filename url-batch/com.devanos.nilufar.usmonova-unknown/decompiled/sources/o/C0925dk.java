package o;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: o.dk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0925dk implements Iterator, InterfaceC1594nw {
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
