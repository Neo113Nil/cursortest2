package o;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class i implements Iterator, Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    public int f3344a;
    public final /* synthetic */ C0280a d;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3346c = false;

    /* renamed from: b, reason: collision with root package name */
    public int f3345b = -1;

    public i(C0280a c0280a) {
        this.d = c0280a;
        this.f3344a = c0280a.d() - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f3346c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i = this.f3345b;
        C0280a c0280a = this.d;
        Object b2 = c0280a.b(i, 0);
        if (key != b2 && (key == null || !key.equals(b2))) {
            return false;
        }
        Object value = entry.getValue();
        Object b3 = c0280a.b(this.f3345b, 1);
        return value == b3 || (value != null && value.equals(b3));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (!this.f3346c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.d.b(this.f3345b, 0);
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (!this.f3346c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.d.b(this.f3345b, 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3345b < this.f3344a;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f3346c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i = this.f3345b;
        C0280a c0280a = this.d;
        Object b2 = c0280a.b(i, 0);
        Object b3 = c0280a.b(this.f3345b, 1);
        return (b2 == null ? 0 : b2.hashCode()) ^ (b3 != null ? b3.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f3345b++;
        this.f3346c = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f3346c) {
            throw new IllegalStateException();
        }
        this.d.g(this.f3345b);
        this.f3345b--;
        this.f3344a--;
        this.f3346c = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!this.f3346c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        C0280a c0280a = this.d;
        int i = this.f3345b;
        switch (c0280a.d) {
            case 0:
                int i2 = (i << 1) + 1;
                Object[] objArr = ((b) c0280a.f3320e).f3352b;
                Object obj2 = objArr[i2];
                objArr[i2] = obj;
                return obj2;
            default:
                throw new UnsupportedOperationException("not a map");
        }
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
