package o;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: o.e9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0953e9 implements Iterator {
    public final /* synthetic */ int h = 0;
    public int i = 0;
    public final int j;
    public final /* synthetic */ Iterable k;

    public C0953e9(C1151h9 c1151h9) {
        this.k = c1151h9;
        this.j = c1151h9.size();
    }

    public byte a() {
        try {
            byte[] bArr = ((C2271yA) this.k).i;
            int i = this.i;
            this.i = i + 1;
            return bArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.h) {
            case 0:
                if (this.i < this.j) {
                }
                break;
            default:
                if (this.i < this.j) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.h) {
            case 0:
                int i = this.i;
                if (i >= this.j) {
                    throw new NoSuchElementException();
                }
                this.i = i + 1;
                return Byte.valueOf(((C1151h9) this.k).o(i));
            default:
                return Byte.valueOf(a());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.h) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public C0953e9(C2271yA c2271yA) {
        this.k = c2271yA;
        this.j = c2271yA.i.length;
    }
}
