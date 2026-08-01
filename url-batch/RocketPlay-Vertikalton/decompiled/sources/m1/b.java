package m1;

import j1.InterfaceC0183a;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class b implements Iterator, InterfaceC0183a {

    /* renamed from: a, reason: collision with root package name */
    public final int f3560a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3561b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3562c;
    public int d;

    public b(int i, int i2, int i3) {
        this.f3560a = i3;
        this.f3561b = i2;
        boolean z2 = false;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z2 = true;
        }
        this.f3562c = z2;
        this.d = z2 ? i : i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3562c;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.d;
        if (i != this.f3561b) {
            this.d = this.f3560a + i;
        } else {
            if (!this.f3562c) {
                throw new NoSuchElementException();
            }
            this.f3562c = false;
        }
        return Integer.valueOf(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
