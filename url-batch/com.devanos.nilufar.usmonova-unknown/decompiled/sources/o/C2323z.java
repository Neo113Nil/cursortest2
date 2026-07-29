package o;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: o.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2323z extends C2257y implements ListIterator {
    public final /* synthetic */ B k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2323z(B b, int i) {
        super(b);
        this.k = b;
        int j = b.j();
        if (i < 0 || i > j) {
            throw new IndexOutOfBoundsException(AbstractC1888sN.g(i, j, "index: ", ", size: "));
        }
        this.i = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.i > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.i;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.i - 1;
        this.i = i;
        return this.k.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.i - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
