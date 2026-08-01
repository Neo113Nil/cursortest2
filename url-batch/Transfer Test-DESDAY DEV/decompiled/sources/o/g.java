package o;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class g implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final int f3171a;

    /* renamed from: b, reason: collision with root package name */
    public int f3172b;

    /* renamed from: c, reason: collision with root package name */
    public int f3173c;
    public boolean d = false;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0254a f3174e;

    public g(C0254a c0254a, int i) {
        this.f3174e = c0254a;
        this.f3171a = i;
        this.f3172b = c0254a.d();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3173c < this.f3172b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object b2 = this.f3174e.b(this.f3173c, this.f3171a);
        this.f3173c++;
        this.d = true;
        return b2;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.d) {
            throw new IllegalStateException();
        }
        int i = this.f3173c - 1;
        this.f3173c = i;
        this.f3172b--;
        this.d = false;
        this.f3174e.g(i);
    }
}
