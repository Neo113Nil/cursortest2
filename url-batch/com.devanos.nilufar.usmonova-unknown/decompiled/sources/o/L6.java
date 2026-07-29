package o;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class L6 implements Iterator, InterfaceC1594nw {
    public int h;
    public Object i;
    public int j = -1;
    public final /* synthetic */ M6 k;

    public L6(M6 m6) {
        this.k = m6;
    }

    public final boolean a() {
        int i;
        Object[] objArr;
        this.h = 3;
        do {
            i = this.j + 1;
            this.j = i;
            objArr = this.k.h;
            if (i >= objArr.length) {
                break;
            }
        } while (objArr[i] == null);
        if (i >= objArr.length) {
            this.h = 2;
        } else {
            Object obj = objArr[i];
            AbstractC0048Bt.l(obj, "null cannot be cast to non-null type T of org.jetbrains.kotlin.util.ArrayMapImpl");
            this.i = obj;
            this.h = 1;
        }
        return this.h == 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.h;
        if (i == 0) {
            return a();
        }
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.h;
        if (i == 1) {
            this.h = 0;
            return this.i;
        }
        if (i == 2 || !a()) {
            throw new NoSuchElementException();
        }
        this.h = 0;
        return this.i;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
