package o;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class CW implements Iterator, InterfaceC1594nw {
    public Object[] h = BW.e.d;
    public int i;
    public int j;

    public final void a(Object[] objArr, int i, int i2) {
        this.h = objArr;
        this.i = i;
        this.j = i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.j < this.i;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
