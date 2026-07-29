package o;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class OH implements Iterator, InterfaceC1594nw {
    public final CW[] h;
    public int i;
    public boolean j = true;

    public OH(BW bw, CW[] cwArr) {
        this.h = cwArr;
        cwArr[0].a(bw.d, Integer.bitCount(bw.a) * 2, 0);
        this.i = 0;
        a();
    }

    public final void a() {
        int i = this.i;
        CW[] cwArr = this.h;
        CW cw = cwArr[i];
        if (cw.j < cw.i) {
            return;
        }
        while (-1 < i) {
            int b = b(i);
            if (b == -1) {
                CW cw2 = cwArr[i];
                int i2 = cw2.j;
                Object[] objArr = cw2.h;
                if (i2 < objArr.length) {
                    int length = objArr.length;
                    cw2.j = i2 + 1;
                    b = b(i);
                }
            }
            if (b != -1) {
                this.i = b;
                return;
            }
            if (i > 0) {
                CW cw3 = cwArr[i - 1];
                int i3 = cw3.j;
                int length2 = cw3.h.length;
                cw3.j = i3 + 1;
            }
            cwArr[i].a(BW.e.d, 0, 0);
            i--;
        }
        this.j = false;
    }

    public final int b(int i) {
        CW[] cwArr = this.h;
        CW cw = cwArr[i];
        int i2 = cw.j;
        if (i2 < cw.i) {
            return i;
        }
        Object[] objArr = cw.h;
        if (i2 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i2];
        AbstractC0048Bt.l(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        BW bw = (BW) obj;
        if (i == 6) {
            CW cw2 = cwArr[i + 1];
            Object[] objArr2 = bw.d;
            cw2.a(objArr2, objArr2.length, 0);
        } else {
            cwArr[i + 1].a(bw.d, Integer.bitCount(bw.a) * 2, 0);
        }
        return b(i + 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.j;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!this.j) {
            throw new NoSuchElementException();
        }
        Object next = this.h[this.i].next();
        a();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
