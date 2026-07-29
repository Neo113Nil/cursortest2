package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class PD implements InterfaceC0103Dw, Set, InterfaceC1594nw {
    public final /* synthetic */ QD h;
    public final /* synthetic */ QD i;

    public PD(QD qd) {
        this.i = qd;
        this.h = qd;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.i.a(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        AbstractC0048Bt.n(collection, "elements");
        QD qd = this.i;
        int i = qd.d;
        for (Object obj : collection) {
            qd.b[qd.d(obj)] = obj;
        }
        return i != qd.d;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.i.b();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.h.c(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        AbstractC0048Bt.n(collection, "elements");
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.h.c(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.h.g();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C2247xq(this.i);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.i.j(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0091, code lost:
    
        if (((r5 & ((~r5) << 6)) & r12) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0093, code lost:
    
        r14 = -1;
     */
    @Override // java.util.Set, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean removeAll(Collection collection) {
        int i;
        int i2;
        AbstractC0048Bt.n(collection, "elements");
        QD qd = this.i;
        int i3 = qd.d;
        Iterator it = collection.iterator();
        while (true) {
            int i4 = 1;
            int i5 = 0;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (next != null) {
                qd.getClass();
                i = next.hashCode();
            } else {
                i = 0;
            }
            int i6 = i * (-862048943);
            int i7 = i6 ^ (i6 << 16);
            int i8 = i7 & 127;
            int i9 = qd.c;
            int i10 = (i7 >>> 7) & i9;
            while (true) {
                long[] jArr = qd.a;
                int i11 = i10 >> 3;
                int i12 = (i10 & 7) << 3;
                int i13 = i4;
                int i14 = i5;
                long j = (((-i12) >> 63) & (jArr[i11 + i4] << (64 - i12))) | (jArr[i11] >>> i12);
                long j2 = (i8 * 72340172838076673L) ^ j;
                long j3 = -9187201950435737472L;
                long j4 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
                while (true) {
                    if (j4 == 0) {
                        break;
                    }
                    i2 = ((Long.numberOfTrailingZeros(j4) >> 3) + i10) & i9;
                    long j5 = j3;
                    if (AbstractC0048Bt.h(qd.b[i2], next)) {
                        break;
                    }
                    j4 &= j4 - 1;
                    j3 = j5;
                }
                i5 = i14 + 8;
                i10 = (i10 + i5) & i9;
                i4 = i13;
            }
            if (i2 >= 0) {
                qd.k(i2);
            }
        }
        return i3 != qd.d;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        AbstractC0048Bt.n(collection, "elements");
        QD qd = this.i;
        long[] jArr = qd.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return false;
        }
        int i = 0;
        boolean z = false;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        if (!collection.contains(qd.b[i4])) {
                            qd.k(i4);
                            z = true;
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return z;
                }
            }
            if (i == length) {
                return z;
            }
            i++;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.h.d;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return AbstractC0048Bt.j0(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        AbstractC0048Bt.n(objArr, "array");
        return AbstractC0048Bt.k0(this, objArr);
    }
}
