package d1;

import Q0.o;
import c.C0079c;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class c implements Iterator, Y0.a {

    /* renamed from: a, reason: collision with root package name */
    public Object f1912a;

    /* renamed from: b, reason: collision with root package name */
    public int f1913b = -2;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f1914c;

    public c(o oVar) {
        this.f1914c = oVar;
    }

    public final void a() {
        Object c2;
        int i = this.f1913b;
        o oVar = this.f1914c;
        if (i == -2) {
            oVar.getClass();
            c2 = C0079c.f1516b.a();
        } else {
            e eVar = (e) oVar.f666b;
            Object obj = this.f1912a;
            X0.d.b(obj);
            c2 = eVar.c(obj);
        }
        this.f1912a = c2;
        this.f1913b = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f1913b < 0) {
            a();
        }
        return this.f1913b == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f1913b < 0) {
            a();
        }
        if (this.f1913b == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.f1912a;
        X0.d.c(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
        this.f1913b = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
