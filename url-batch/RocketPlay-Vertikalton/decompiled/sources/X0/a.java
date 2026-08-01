package X0;

import j1.InterfaceC0183a;
import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class a implements ListIterator, InterfaceC0183a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1289a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f1290b;

    /* renamed from: c, reason: collision with root package name */
    public int f1291c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public final W0.e f1292e;

    public a(c cVar, int i) {
        int i2;
        i1.f.e(cVar, "list");
        this.f1292e = cVar;
        this.f1290b = i;
        this.f1291c = -1;
        i2 = ((AbstractList) cVar).modCount;
        this.d = i2;
    }

    public void a() {
        int i;
        i = ((AbstractList) ((b) this.f1292e).f1296e).modCount;
        if (i != this.d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i;
        int i2;
        switch (this.f1289a) {
            case 0:
                a();
                int i3 = this.f1290b;
                this.f1290b = i3 + 1;
                b bVar = (b) this.f1292e;
                bVar.add(i3, obj);
                this.f1291c = -1;
                i = ((AbstractList) bVar).modCount;
                this.d = i;
                break;
            default:
                b();
                int i4 = this.f1290b;
                this.f1290b = i4 + 1;
                c cVar = (c) this.f1292e;
                cVar.add(i4, obj);
                this.f1291c = -1;
                i2 = ((AbstractList) cVar).modCount;
                this.d = i2;
                break;
        }
    }

    public void b() {
        int i;
        i = ((AbstractList) ((c) this.f1292e)).modCount;
        if (i != this.d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f1289a) {
            case 0:
                if (this.f1290b < ((b) this.f1292e).f1295c) {
                }
                break;
            default:
                if (this.f1290b < ((c) this.f1292e).f1298b) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f1289a) {
            case 0:
                if (this.f1290b > 0) {
                }
                break;
            default:
                if (this.f1290b > 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f1289a) {
            case 0:
                a();
                int i = this.f1290b;
                b bVar = (b) this.f1292e;
                if (i >= bVar.f1295c) {
                    throw new NoSuchElementException();
                }
                this.f1290b = i + 1;
                this.f1291c = i;
                return bVar.f1293a[bVar.f1294b + i];
            default:
                b();
                int i2 = this.f1290b;
                c cVar = (c) this.f1292e;
                if (i2 >= cVar.f1298b) {
                    throw new NoSuchElementException();
                }
                this.f1290b = i2 + 1;
                this.f1291c = i2;
                return cVar.f1297a[i2];
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f1289a) {
        }
        return this.f1290b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f1289a) {
            case 0:
                a();
                int i = this.f1290b;
                if (i <= 0) {
                    throw new NoSuchElementException();
                }
                int i2 = i - 1;
                this.f1290b = i2;
                this.f1291c = i2;
                b bVar = (b) this.f1292e;
                return bVar.f1293a[bVar.f1294b + i2];
            default:
                b();
                int i3 = this.f1290b;
                if (i3 <= 0) {
                    throw new NoSuchElementException();
                }
                int i4 = i3 - 1;
                this.f1290b = i4;
                this.f1291c = i4;
                return ((c) this.f1292e).f1297a[i4];
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f1289a) {
        }
        return this.f1290b - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i;
        int i2;
        switch (this.f1289a) {
            case 0:
                a();
                int i3 = this.f1291c;
                if (i3 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                b bVar = (b) this.f1292e;
                bVar.b(i3);
                this.f1290b = this.f1291c;
                this.f1291c = -1;
                i = ((AbstractList) bVar).modCount;
                this.d = i;
                return;
            default:
                b();
                int i4 = this.f1291c;
                if (i4 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                c cVar = (c) this.f1292e;
                cVar.b(i4);
                this.f1290b = this.f1291c;
                this.f1291c = -1;
                i2 = ((AbstractList) cVar).modCount;
                this.d = i2;
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f1289a) {
            case 0:
                a();
                int i = this.f1291c;
                if (i == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((b) this.f1292e).set(i, obj);
                return;
            default:
                b();
                int i2 = this.f1291c;
                if (i2 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((c) this.f1292e).set(i2, obj);
                return;
        }
    }

    public a(b bVar, int i) {
        int i2;
        i1.f.e(bVar, "list");
        this.f1292e = bVar;
        this.f1290b = i;
        this.f1291c = -1;
        i2 = ((AbstractList) bVar).modCount;
        this.d = i2;
    }
}
