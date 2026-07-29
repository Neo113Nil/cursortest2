package o;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: o.mS, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1498mS implements Iterator {
    public boolean h;
    public final int i;
    public final /* synthetic */ C1564nS j;

    public C1498mS(C1564nS c1564nS) {
        int i;
        this.j = c1564nS;
        i = ((AbstractList) c1564nS).modCount;
        this.i = i;
    }

    public final void a() {
        int i;
        int i2;
        C1564nS c1564nS = this.j;
        i = ((AbstractList) c1564nS).modCount;
        int i3 = this.i;
        if (i == i3) {
            return;
        }
        StringBuilder sb = new StringBuilder("ModCount: ");
        i2 = ((AbstractList) c1564nS).modCount;
        sb.append(i2);
        sb.append("; expected: ");
        sb.append(i3);
        throw new ConcurrentModificationException(sb.toString());
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.h;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.h) {
            throw new NoSuchElementException();
        }
        this.h = true;
        a();
        return this.j.i;
    }

    @Override // java.util.Iterator
    public final void remove() {
        a();
        this.j.clear();
    }
}
