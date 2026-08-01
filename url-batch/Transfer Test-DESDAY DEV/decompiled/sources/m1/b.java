package m1;

import c.C0086c;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class b implements Iterator, h1.a {

    /* renamed from: a, reason: collision with root package name */
    public Object f3129a;

    /* renamed from: b, reason: collision with root package name */
    public int f3130b = -2;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f3131c;

    public b(c cVar) {
        this.f3131c = cVar;
    }

    public final void a() {
        Object g2;
        int i = this.f3130b;
        c cVar = this.f3131c;
        if (i == -2) {
            cVar.getClass();
            g2 = C0086c.f1731b.c();
        } else {
            h hVar = (h) cVar.f3133b;
            Object obj = this.f3129a;
            g1.f.b(obj);
            g2 = hVar.g(obj);
        }
        this.f3129a = g2;
        this.f3130b = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f3130b < 0) {
            a();
        }
        return this.f3130b == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f3130b < 0) {
            a();
        }
        if (this.f3130b == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.f3129a;
        g1.f.c(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
        this.f3130b = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
