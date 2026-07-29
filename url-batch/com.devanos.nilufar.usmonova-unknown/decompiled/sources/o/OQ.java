package o;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class OQ implements Iterator, InterfaceC2235xe, InterfaceC1594nw {
    public int h;
    public Object i;
    public InterfaceC2235xe j;

    public final RuntimeException a() {
        int i = this.h;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.h);
    }

    public final void b(Object obj, AbstractC1296jO abstractC1296jO) {
        this.i = obj;
        this.h = 3;
        this.j = abstractC1296jO;
    }

    @Override // o.InterfaceC2235xe
    public final InterfaceC0189He getContext() {
        return C1188hk.h;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        while (true) {
            i = this.h;
            if (i != 0) {
                break;
            }
            this.h = 5;
            InterfaceC2235xe interfaceC2235xe = this.j;
            AbstractC0048Bt.k(interfaceC2235xe);
            this.j = null;
            interfaceC2235xe.resumeWith(C0782bY.a);
        }
        if (i == 1) {
            AbstractC0048Bt.k(null);
            throw null;
        }
        if (i == 2 || i == 3) {
            return true;
        }
        if (i == 4) {
            return false;
        }
        throw a();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.h;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i == 2) {
            this.h = 1;
            AbstractC0048Bt.k(null);
            throw null;
        }
        if (i != 3) {
            throw a();
        }
        this.h = 0;
        Object obj = this.i;
        this.i = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // o.InterfaceC2235xe
    public final void resumeWith(Object obj) {
        AbstractC1494mO.l(obj);
        this.h = 4;
    }
}
