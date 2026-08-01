package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class j6 implements Iterator, Map.Entry {
    public int f;
    public int g = -1;
    public boolean h;
    public final /* synthetic */ l6 i;

    public j6(l6 l6Var) {
        this.i = l6Var;
        this.f = l6Var.h - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.h) {
            l8.u("This container does not support retaining Map.Entry objects");
            return false;
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            int i = this.g;
            l6 l6Var = this.i;
            if (oo.b(key, l6Var.f(i)) && oo.b(entry.getValue(), l6Var.i(this.g))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.h) {
            return this.i.f(this.g);
        }
        l8.u("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.h) {
            return this.i.i(this.g);
        }
        l8.u("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.g < this.f;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.h) {
            l8.u("This container does not support retaining Map.Entry objects");
            return 0;
        }
        int i = this.g;
        l6 l6Var = this.i;
        Object f = l6Var.f(i);
        Object i2 = l6Var.i(this.g);
        return (f == null ? 0 : f.hashCode()) ^ (i2 != null ? i2.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.g++;
        this.h = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.h) {
            throw new IllegalStateException();
        }
        this.i.g(this.g);
        this.g--;
        this.f--;
        this.h = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.h) {
            return this.i.h(this.g, obj);
        }
        l8.u("This container does not support retaining Map.Entry objects");
        return null;
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
