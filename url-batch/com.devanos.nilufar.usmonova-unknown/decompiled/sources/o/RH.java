package o;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class RH implements Iterator, InterfaceC1594nw {
    public final /* synthetic */ int h = 0;
    public final Object i;

    public RH(Object[] objArr) {
        AbstractC0048Bt.n(objArr, "array");
        this.i = AbstractC1305jX.z(objArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.h) {
            case 0:
                return ((PH) this.i).j;
            default:
                return ((C2257y) this.i).hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.h) {
            case 0:
                return (Map.Entry) ((PH) this.i).next();
            default:
                return ((C2257y) this.i).next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.h) {
            case 0:
                ((PH) this.i).remove();
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public RH(HH hh) {
        CW[] cwArr = new CW[8];
        for (int i = 0; i < 8; i++) {
            cwArr[i] = new EW(this);
        }
        this.i = new PH(hh, cwArr);
    }
}
