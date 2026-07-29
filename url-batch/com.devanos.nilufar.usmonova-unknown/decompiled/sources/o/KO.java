package o;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class KO implements Iterator {
    public final JO h;
    public C0953e9 i;
    public int j;

    public KO(LO lo) {
        JO jo = new JO(lo);
        this.h = jo;
        this.i = new C0953e9(jo.next());
        this.j = lo.i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.j > 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.i.hasNext()) {
            this.i = new C0953e9(this.h.next());
        }
        this.j--;
        return Byte.valueOf(this.i.a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
