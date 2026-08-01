package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class l8 implements Iterator, Map.Entry {
    public int d;
    public int e = -1;
    public boolean f;
    public final /* synthetic */ n8 g;

    public l8(n8 n8Var) {
        this.g = n8Var;
        this.d = n8Var.f - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f) {
            g8.s("This container does not support retaining Map.Entry objects");
            return false;
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            int i = this.e;
            n8 n8Var = this.g;
            if (nz.l(key, n8Var.e(i)) && nz.l(entry.getValue(), n8Var.h(this.e))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f) {
            return this.g.e(this.e);
        }
        g8.s("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f) {
            return this.g.h(this.e);
        }
        g8.s("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.e < this.d;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f) {
            g8.s("This container does not support retaining Map.Entry objects");
            return 0;
        }
        int i = this.e;
        n8 n8Var = this.g;
        Object e = n8Var.e(i);
        Object h = n8Var.h(this.e);
        return (e == null ? 0 : e.hashCode()) ^ (h != null ? h.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            g8.k();
            return null;
        }
        this.e++;
        this.f = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f) {
            throw new IllegalStateException();
        }
        this.g.f(this.e);
        this.e--;
        this.d--;
        this.f = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f) {
            return this.g.g(this.e, obj);
        }
        g8.s("This container does not support retaining Map.Entry objects");
        return null;
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
