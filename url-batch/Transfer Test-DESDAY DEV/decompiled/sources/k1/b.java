package k1;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class b implements Iterator, h1.a {

    /* renamed from: a, reason: collision with root package name */
    public final int f2850a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2851b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2852c;
    public int d;

    public b(int i, int i2, int i3) {
        this.f2850a = i3;
        this.f2851b = i2;
        boolean z2 = false;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z2 = true;
        }
        this.f2852c = z2;
        this.d = z2 ? i : i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2852c;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.d;
        if (i != this.f2851b) {
            this.d = this.f2850a + i;
        } else {
            if (!this.f2852c) {
                throw new NoSuchElementException();
            }
            this.f2852c = false;
        }
        return Integer.valueOf(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
