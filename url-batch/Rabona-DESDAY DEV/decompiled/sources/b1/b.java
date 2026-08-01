package b1;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class b implements Iterator, Y0.a {

    /* renamed from: a, reason: collision with root package name */
    public final int f1510a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1511b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1512c;
    public int d;

    public b(int i, int i2, int i3) {
        this.f1510a = i3;
        this.f1511b = i2;
        boolean z2 = false;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z2 = true;
        }
        this.f1512c = z2;
        this.d = z2 ? i : i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1512c;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.d;
        if (i != this.f1511b) {
            this.d = this.f1510a + i;
        } else {
            if (!this.f1512c) {
                throw new NoSuchElementException();
            }
            this.f1512c = false;
        }
        return Integer.valueOf(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
