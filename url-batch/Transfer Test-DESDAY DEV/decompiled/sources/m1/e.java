package m1;

import X0.i;
import X0.j;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class e implements Iterator, X0.d, h1.a {

    /* renamed from: a, reason: collision with root package name */
    public int f3134a;

    /* renamed from: b, reason: collision with root package name */
    public Object f3135b;

    /* renamed from: c, reason: collision with root package name */
    public Iterator f3136c;
    public X0.d d;

    public final RuntimeException a() {
        int i = this.f3134a;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f3134a);
    }

    @Override // X0.d
    public final void b(Object obj) {
        T.e.W(obj);
        this.f3134a = 4;
    }

    @Override // X0.d
    public final i h() {
        return j.f936a;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i = this.f3134a;
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
                Iterator it = this.f3136c;
                g1.f.b(it);
                if (it.hasNext()) {
                    this.f3134a = 2;
                    return true;
                }
                this.f3136c = null;
            }
            this.f3134a = 5;
            X0.d dVar = this.d;
            g1.f.b(dVar);
            this.d = null;
            dVar.b(U0.i.f870a);
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f3134a;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i == 2) {
            this.f3134a = 1;
            Iterator it = this.f3136c;
            g1.f.b(it);
            return it.next();
        }
        if (i != 3) {
            throw a();
        }
        this.f3134a = 0;
        Object obj = this.f3135b;
        this.f3135b = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
