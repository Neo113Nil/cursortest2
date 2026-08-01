package o;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class g implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final int f3597a;

    /* renamed from: b, reason: collision with root package name */
    public int f3598b;

    /* renamed from: c, reason: collision with root package name */
    public int f3599c;
    public boolean d = false;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0297a f3600e;

    public g(C0297a c0297a, int i) {
        this.f3600e = c0297a;
        this.f3597a = i;
        this.f3598b = c0297a.d();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3599c < this.f3598b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object b2 = this.f3600e.b(this.f3599c, this.f3597a);
        this.f3599c++;
        this.d = true;
        return b2;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.d) {
            throw new IllegalStateException();
        }
        int i = this.f3599c - 1;
        this.f3599c = i;
        this.f3598b--;
        this.d = false;
        this.f3600e.g(i);
    }
}
