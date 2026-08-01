package o;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class g implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final int f3332a;

    /* renamed from: b, reason: collision with root package name */
    public int f3333b;

    /* renamed from: c, reason: collision with root package name */
    public int f3334c;
    public boolean d = false;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0279a f3335e;

    public g(C0279a c0279a, int i) {
        this.f3335e = c0279a;
        this.f3332a = i;
        this.f3333b = c0279a.d();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3334c < this.f3333b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object b2 = this.f3335e.b(this.f3334c, this.f3332a);
        this.f3334c++;
        this.d = true;
        return b2;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.d) {
            throw new IllegalStateException();
        }
        int i = this.f3334c - 1;
        this.f3334c = i;
        this.f3333b--;
        this.d = false;
        this.f3335e.g(i);
    }
}
