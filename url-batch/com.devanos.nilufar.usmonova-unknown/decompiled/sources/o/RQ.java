package o;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class RQ implements Iterator, InterfaceC1594nw {
    public final /* synthetic */ int h;
    public final Object i;
    public boolean j = true;

    public /* synthetic */ RQ(int i, Object obj) {
        this.h = i;
        this.i = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.h) {
        }
        return this.j;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.h) {
            case 0:
                if (!this.j) {
                    throw new NoSuchElementException();
                }
                this.j = false;
                return this.i;
            case 1:
                if (!this.j) {
                    throw new NoSuchElementException();
                }
                this.j = false;
                return this.i;
            default:
                if (!this.j) {
                    throw new NoSuchElementException();
                }
                this.j = false;
                return ((C1288jG) this.i).h;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.h) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
