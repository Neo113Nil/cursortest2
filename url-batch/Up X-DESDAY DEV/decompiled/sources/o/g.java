package o;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class g implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final int f3316a;

    /* renamed from: b, reason: collision with root package name */
    public int f3317b;

    /* renamed from: c, reason: collision with root package name */
    public int f3318c;
    public boolean d = false;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0280a f3319e;

    public g(C0280a c0280a, int i) {
        this.f3319e = c0280a;
        this.f3316a = i;
        this.f3317b = c0280a.d();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3318c < this.f3317b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object b2 = this.f3319e.b(this.f3318c, this.f3316a);
        this.f3318c++;
        this.d = true;
        return b2;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.d) {
            throw new IllegalStateException();
        }
        int i = this.f3318c - 1;
        this.f3318c = i;
        this.f3317b--;
        this.d = false;
        this.f3319e.g(i);
    }
}
