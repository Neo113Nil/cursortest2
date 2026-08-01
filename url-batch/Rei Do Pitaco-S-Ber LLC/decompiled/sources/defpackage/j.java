package defpackage;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class j extends i implements ListIterator {
    public final /* synthetic */ l i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, int i) {
        super(0, lVar);
        this.i = lVar;
        int a = lVar.a();
        if (i < 0 || i > a) {
            throw new IndexOutOfBoundsException(n20.d(i, a, "index: ", ", size: "));
        }
        this.g = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.g > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.g;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.g - 1;
        this.g = i;
        return this.i.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.g - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
