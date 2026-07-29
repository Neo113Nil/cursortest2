package o;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: o.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2257y implements Iterator, InterfaceC1594nw {
    public final /* synthetic */ int h = 0;
    public int i;
    public final Object j;

    public C2257y(Object[] objArr) {
        AbstractC0048Bt.n(objArr, "array");
        this.j = objArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.h) {
            case 0:
                if (this.i < ((B) this.j).j()) {
                }
                break;
            default:
                if (this.i < ((Object[]) this.j).length) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.h) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                B b = (B) this.j;
                int i = this.i;
                this.i = i + 1;
                return b.get(i);
            default:
                try {
                    Object[] objArr = (Object[]) this.j;
                    int i2 = this.i;
                    this.i = i2 + 1;
                    return objArr[i2];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.i--;
                    throw new NoSuchElementException(e.getMessage());
                }
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

    public C2257y(B b) {
        this.j = b;
    }
}
