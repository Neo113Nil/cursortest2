package o;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class g implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final int f3320a;

    /* renamed from: b, reason: collision with root package name */
    public int f3321b;

    /* renamed from: c, reason: collision with root package name */
    public int f3322c;
    public boolean d = false;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0275a f3323e;

    public g(C0275a c0275a, int i) {
        this.f3323e = c0275a;
        this.f3320a = i;
        this.f3321b = c0275a.d();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3322c < this.f3321b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object b2 = this.f3323e.b(this.f3322c, this.f3320a);
        this.f3322c++;
        this.d = true;
        return b2;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.d) {
            throw new IllegalStateException();
        }
        int i = this.f3322c - 1;
        this.f3322c = i;
        this.f3321b--;
        this.d = false;
        this.f3323e.g(i);
    }
}
