package o;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: o.gt, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1131gt implements Iterator, InterfaceC1594nw {
    public final int h;
    public final int i;
    public boolean j;
    public int k;

    public C1131gt(int i, int i2, int i3) {
        this.h = i3;
        this.i = i2;
        boolean z = false;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z = true;
        }
        this.j = z;
        this.k = z ? i : i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.j;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(nextInt());
    }

    public final int nextInt() {
        int i = this.k;
        if (i != this.i) {
            this.k = this.h + i;
            return i;
        }
        if (!this.j) {
            throw new NoSuchElementException();
        }
        this.j = false;
        return i;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
