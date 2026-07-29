package o;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* renamed from: o.dr, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0931dr implements Iterator, InterfaceC1594nw {
    public final /* synthetic */ int h = 0;
    public final C0841cS i;
    public final int j;
    public int k;
    public int l;

    public C0931dr(C0841cS c0841cS, int i, int i2) {
        this.i = c0841cS;
        this.j = i2;
        this.k = i;
        this.l = c0841cS.n;
        if (c0841cS.m) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.h) {
            case 0:
                return this.k < this.j;
            default:
                throw null;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.h) {
            case 0:
                C0841cS c0841cS = this.i;
                int i = c0841cS.n;
                int i2 = this.l;
                if (i != i2) {
                    throw new ConcurrentModificationException();
                }
                int i3 = this.k;
                this.k = TM.c(c0841cS.h, i3) + i3;
                return new C0907dS(c0841cS, i3, i2);
            default:
                throw null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.h) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C0931dr(C0841cS c0841cS, int i, AbstractC0997er abstractC0997er, AbstractC0773bP abstractC0773bP) {
        this.i = c0841cS;
        this.j = i;
        this.k = c0841cS.n;
    }
}
