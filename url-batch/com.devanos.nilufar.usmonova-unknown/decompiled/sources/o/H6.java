package o;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class H6 implements Iterator, Map.Entry {
    public int h;
    public int i = -1;
    public boolean j;
    public final /* synthetic */ K6 k;

    public H6(K6 k6) {
        this.k = k6;
        this.h = k6.j - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.j) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i = this.i;
        K6 k6 = this.k;
        return AbstractC0048Bt.h(key, k6.e(i)) && AbstractC0048Bt.h(entry.getValue(), k6.h(this.i));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.j) {
            return this.k.e(this.i);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.j) {
            return this.k.h(this.i);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.i < this.h;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.j) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i = this.i;
        K6 k6 = this.k;
        Object e = k6.e(i);
        Object h = k6.h(this.i);
        return (e == null ? 0 : e.hashCode()) ^ (h != null ? h.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.i++;
        this.j = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.j) {
            throw new IllegalStateException();
        }
        this.k.f(this.i);
        this.i--;
        this.h--;
        this.j = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.j) {
            return this.k.g(this.i, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
