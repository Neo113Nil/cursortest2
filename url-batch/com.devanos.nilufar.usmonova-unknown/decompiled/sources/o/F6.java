package o;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class F6 implements Iterator, InterfaceC1594nw {
    public int h;
    public int i;
    public boolean j;
    public final /* synthetic */ int k;
    public final /* synthetic */ Object l;

    public F6(int i) {
        this.h = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.i < this.h;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object e;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.i;
        switch (this.k) {
            case 0:
                e = ((K6) this.l).e(i);
                break;
            case 1:
                e = ((K6) this.l).h(i);
                break;
            default:
                e = ((N6) this.l).i[i];
                break;
        }
        this.i++;
        this.j = true;
        return e;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.j) {
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i = this.i - 1;
        this.i = i;
        switch (this.k) {
            case 0:
                ((K6) this.l).f(i);
                break;
            case 1:
                ((K6) this.l).f(i);
                break;
            default:
                ((N6) this.l).j(i);
                break;
        }
        this.h--;
        this.j = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public F6(N6 n6) {
        this(n6.j);
        this.k = 2;
        this.l = n6;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public F6(K6 k6, int i) {
        this(k6.j);
        this.k = i;
        switch (i) {
            case 1:
                this.l = k6;
                this(k6.j);
                break;
            default:
                this.l = k6;
                break;
        }
    }
}
