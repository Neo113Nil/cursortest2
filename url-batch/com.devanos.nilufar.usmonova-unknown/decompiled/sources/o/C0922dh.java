package o;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: o.dh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0922dh implements Iterator, InterfaceC1594nw {
    public int h = -1;
    public int i;
    public int j;
    public C1197ht k;
    public final /* synthetic */ C0987eh l;

    public C0922dh(C0987eh c0987eh) {
        this.l = c0987eh;
        int q = AbstractC1807r8.q(0, 0, ((CharSequence) c0987eh.b).length());
        this.i = q;
        this.j = q;
    }

    public final void a() {
        C0987eh c0987eh = this.l;
        CharSequence charSequence = (CharSequence) c0987eh.b;
        int i = this.j;
        if (i < 0) {
            this.h = 0;
            this.k = null;
            return;
        }
        if (i > charSequence.length()) {
            this.k = new C1197ht(this.i, UT.F(charSequence), 1);
            this.j = -1;
        } else {
            C1619oH c1619oH = (C1619oH) ((C1759qP) c0987eh.c).invoke(charSequence, Integer.valueOf(this.j));
            if (c1619oH == null) {
                this.k = new C1197ht(this.i, UT.F(charSequence), 1);
                this.j = -1;
            } else {
                int intValue = ((Number) c1619oH.h).intValue();
                int intValue2 = ((Number) c1619oH.i).intValue();
                this.k = AbstractC1807r8.c0(this.i, intValue);
                int i2 = intValue + intValue2;
                this.i = i2;
                this.j = i2 + (intValue2 == 0 ? 1 : 0);
            }
        }
        this.h = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.h == -1) {
            a();
        }
        return this.h == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.h == -1) {
            a();
        }
        if (this.h == 0) {
            throw new NoSuchElementException();
        }
        C1197ht c1197ht = this.k;
        AbstractC0048Bt.l(c1197ht, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.k = null;
        this.h = -1;
        return c1197ht;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
