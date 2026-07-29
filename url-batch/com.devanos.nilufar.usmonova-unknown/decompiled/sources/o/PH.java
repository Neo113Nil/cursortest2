package o;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public class PH extends OH {
    public final HH k;
    public Object l;
    public boolean m;
    public int n;

    public PH(HH hh, CW[] cwArr) {
        super(hh.i, cwArr);
        this.k = hh;
        this.n = hh.k;
    }

    public final void d(int i, BW bw, Object obj, int i2) {
        int i3 = i2 * 5;
        CW[] cwArr = this.h;
        if (i3 <= 30) {
            int k = 1 << ON.k(i, i3);
            if (bw.h(k)) {
                cwArr[i2].a(bw.d, Integer.bitCount(bw.a) * 2, bw.f(k));
                this.i = i2;
                return;
            } else {
                int t = bw.t(k);
                BW s = bw.s(t);
                cwArr[i2].a(bw.d, Integer.bitCount(bw.a) * 2, t);
                d(i, s, obj, i2 + 1);
                return;
            }
        }
        CW cw = cwArr[i2];
        Object[] objArr = bw.d;
        cw.a(objArr, objArr.length, 0);
        while (true) {
            CW cw2 = cwArr[i2];
            if (AbstractC0048Bt.h(cw2.h[cw2.j], obj)) {
                this.i = i2;
                return;
            } else {
                cwArr[i2].j += 2;
            }
        }
    }

    @Override // o.OH, java.util.Iterator
    public final Object next() {
        if (this.k.k != this.n) {
            throw new ConcurrentModificationException();
        }
        if (!this.j) {
            throw new NoSuchElementException();
        }
        CW cw = this.h[this.i];
        this.l = cw.h[cw.j];
        this.m = true;
        return super.next();
    }

    @Override // o.OH, java.util.Iterator
    public final void remove() {
        if (!this.m) {
            throw new IllegalStateException();
        }
        boolean z = this.j;
        HH hh = this.k;
        if (!z) {
            AbstractC1305jX.f(hh).remove(this.l);
        } else {
            if (!z) {
                throw new NoSuchElementException();
            }
            CW cw = this.h[this.i];
            Object obj = cw.h[cw.j];
            AbstractC1305jX.f(hh).remove(this.l);
            d(obj != null ? obj.hashCode() : 0, hh.i, obj, 0);
        }
        this.l = null;
        this.m = false;
        this.n = hh.k;
    }
}
