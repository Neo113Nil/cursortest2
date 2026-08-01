package o1;

import W0.q;
import c.C0102c;
import j1.InterfaceC0183a;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class c implements Iterator, InterfaceC0183a {

    /* renamed from: a, reason: collision with root package name */
    public Object f3706a;

    /* renamed from: b, reason: collision with root package name */
    public int f3707b = -2;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f3708c;

    public c(q qVar) {
        this.f3708c = qVar;
    }

    public final void a() {
        Object g2;
        int i = this.f3707b;
        q qVar = this.f3708c;
        if (i == -2) {
            qVar.getClass();
            g2 = C0102c.f2111b.c();
        } else {
            h hVar = (h) qVar.f1282b;
            Object obj = this.f3706a;
            i1.f.b(obj);
            g2 = hVar.g(obj);
        }
        this.f3706a = g2;
        this.f3707b = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f3707b < 0) {
            a();
        }
        return this.f3707b == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f3707b < 0) {
            a();
        }
        if (this.f3707b == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.f3706a;
        i1.f.c(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
        this.f3707b = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
