package o;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* renamed from: o.uB, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2008uB implements Map.Entry, InterfaceC1594nw {
    public final C2140wB h;
    public final int i;
    public final int j;

    public C2008uB(C2140wB c2140wB, int i) {
        AbstractC0048Bt.n(c2140wB, "map");
        this.h = c2140wB;
        this.i = i;
        this.j = c2140wB.f238o;
    }

    public final void a() {
        if (this.h.f238o != this.j) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return AbstractC0048Bt.h(entry.getKey(), getKey()) && AbstractC0048Bt.h(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        a();
        return this.h.h[this.i];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        a();
        Object[] objArr = this.h.i;
        AbstractC0048Bt.k(objArr);
        return objArr[this.i];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        int hashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return hashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        a();
        C2140wB c2140wB = this.h;
        c2140wB.b();
        Object[] objArr = c2140wB.i;
        if (objArr == null) {
            int length = c2140wB.h.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            c2140wB.i = objArr;
        }
        int i = this.i;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
