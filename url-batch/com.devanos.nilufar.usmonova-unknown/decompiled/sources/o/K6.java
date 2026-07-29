package o;

import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class K6 extends GR implements Map {
    public E6 k;
    public G6 l;
    public I6 m;

    @Override // java.util.Map
    public final Set entrySet() {
        E6 e6 = this.k;
        if (e6 != null) {
            return e6;
        }
        E6 e62 = new E6(this, 0);
        this.k = e62;
        return e62;
    }

    public final boolean i(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean j(Collection collection) {
        int i = this.j;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i != this.j;
    }

    @Override // java.util.Map
    public final Set keySet() {
        G6 g6 = this.l;
        if (g6 != null) {
            return g6;
        }
        G6 g62 = new G6(this);
        this.l = g62;
        return g62;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        int size = map.size() + this.j;
        int i = this.j;
        int[] iArr = this.h;
        if (iArr.length < size) {
            int[] copyOf = Arrays.copyOf(iArr, size);
            AbstractC0048Bt.m(copyOf, "copyOf(this, newSize)");
            this.h = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.i, size * 2);
            AbstractC0048Bt.m(copyOf2, "copyOf(this, newSize)");
            this.i = copyOf2;
        }
        if (this.j != i) {
            throw new ConcurrentModificationException();
        }
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        I6 i6 = this.m;
        if (i6 != null) {
            return i6;
        }
        I6 i62 = new I6(this);
        this.m = i62;
        return i62;
    }
}
