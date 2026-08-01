package o1;

import F1.l;
import j1.InterfaceC0183a;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class e implements Iterator, Z0.d, InterfaceC0183a {

    /* renamed from: a, reason: collision with root package name */
    public int f3709a;

    /* renamed from: b, reason: collision with root package name */
    public Object f3710b;

    /* renamed from: c, reason: collision with root package name */
    public Iterator f3711c;
    public Z0.d d;

    public final RuntimeException a() {
        int i = this.f3709a;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f3709a);
    }

    @Override // Z0.d
    public final Z0.i getContext() {
        return Z0.j.f1558a;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i = this.f3709a;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw a();
                }
                Iterator it = this.f3711c;
                i1.f.b(it);
                if (it.hasNext()) {
                    this.f3709a = 2;
                    return true;
                }
                this.f3711c = null;
            }
            this.f3709a = 5;
            Z0.d dVar = this.d;
            i1.f.b(dVar);
            this.d = null;
            dVar.resumeWith(V0.i.f1250a);
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f3709a;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i == 2) {
            this.f3709a = 1;
            Iterator it = this.f3711c;
            i1.f.b(it);
            return it.next();
        }
        if (i != 3) {
            throw a();
        }
        this.f3709a = 0;
        Object obj = this.f3710b;
        this.f3710b = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // Z0.d
    public final void resumeWith(Object obj) {
        l.n0(obj);
        this.f3709a = 4;
    }
}
