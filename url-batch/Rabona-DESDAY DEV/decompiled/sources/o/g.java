package o;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class g implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final int f3338a;

    /* renamed from: b, reason: collision with root package name */
    public int f3339b;

    /* renamed from: c, reason: collision with root package name */
    public int f3340c;
    public boolean d = false;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0280a f3341e;

    public g(C0280a c0280a, int i) {
        this.f3341e = c0280a;
        this.f3338a = i;
        this.f3339b = c0280a.d();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3340c < this.f3339b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object b2 = this.f3341e.b(this.f3340c, this.f3338a);
        this.f3340c++;
        this.d = true;
        return b2;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.d) {
            throw new IllegalStateException();
        }
        int i = this.f3340c - 1;
        this.f3340c = i;
        this.f3339b--;
        this.d = false;
        this.f3341e.g(i);
    }
}
