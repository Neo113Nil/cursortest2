package d1;

import Q0.k;
import c.C0079c;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class c implements Iterator, Y0.a {

    /* renamed from: a, reason: collision with root package name */
    public Object f1904a;

    /* renamed from: b, reason: collision with root package name */
    public int f1905b = -2;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f1906c;

    public c(k kVar) {
        this.f1906c = kVar;
    }

    public final void a() {
        Object c2;
        int i = this.f1905b;
        k kVar = this.f1906c;
        if (i == -2) {
            kVar.getClass();
            c2 = C0079c.f1511b.a();
        } else {
            e eVar = (e) kVar.f662b;
            Object obj = this.f1904a;
            X0.e.b(obj);
            c2 = eVar.c(obj);
        }
        this.f1904a = c2;
        this.f1905b = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f1905b < 0) {
            a();
        }
        return this.f1905b == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f1905b < 0) {
            a();
        }
        if (this.f1905b == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.f1904a;
        X0.e.c(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
        this.f1905b = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
