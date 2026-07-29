package o;

import java.util.Iterator;

/* renamed from: o.qj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1779qj implements Iterator, InterfaceC1594nw {
    public final /* synthetic */ int h = 1;
    public final Iterator i;
    public int j;

    public C1779qj(Iterator it) {
        AbstractC0048Bt.n(it, "iterator");
        this.i = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        switch (this.h) {
            case 0:
                break;
            default:
                return this.i.hasNext();
        }
        while (true) {
            int i = this.j;
            it = this.i;
            if (i > 0 && it.hasNext()) {
                it.next();
                this.j--;
            }
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it;
        switch (this.h) {
            case 0:
                break;
            default:
                int i = this.j;
                this.j = i + 1;
                if (i >= 0) {
                    return new C0021As(i, this.i.next());
                }
                AbstractC0868ct.Y();
                throw null;
        }
        while (true) {
            int i2 = this.j;
            it = this.i;
            if (i2 > 0 && it.hasNext()) {
                it.next();
                this.j--;
            }
        }
        return it.next();
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

    public C1779qj(C1844rj c1844rj) {
        this.i = c1844rj.a.iterator();
        this.j = c1844rj.b;
    }
}
