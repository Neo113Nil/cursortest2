package W0;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class a implements ListIterator, h1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f898a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f899b;

    /* renamed from: c, reason: collision with root package name */
    public int f900c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public final V0.a f901e;

    public a(c cVar, int i) {
        int i2;
        g1.f.e(cVar, "list");
        this.f901e = cVar;
        this.f899b = i;
        this.f900c = -1;
        i2 = ((AbstractList) cVar).modCount;
        this.d = i2;
    }

    public void a() {
        int i;
        i = ((AbstractList) ((b) this.f901e).f905e).modCount;
        if (i != this.d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i;
        int i2;
        switch (this.f898a) {
            case 0:
                a();
                int i3 = this.f899b;
                this.f899b = i3 + 1;
                b bVar = (b) this.f901e;
                bVar.add(i3, obj);
                this.f900c = -1;
                i = ((AbstractList) bVar).modCount;
                this.d = i;
                break;
            default:
                b();
                int i4 = this.f899b;
                this.f899b = i4 + 1;
                c cVar = (c) this.f901e;
                cVar.add(i4, obj);
                this.f900c = -1;
                i2 = ((AbstractList) cVar).modCount;
                this.d = i2;
                break;
        }
    }

    public void b() {
        int i;
        i = ((AbstractList) ((c) this.f901e)).modCount;
        if (i != this.d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f898a) {
            case 0:
                if (this.f899b < ((b) this.f901e).f904c) {
                }
                break;
            default:
                if (this.f899b < ((c) this.f901e).f907b) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f898a) {
            case 0:
                if (this.f899b > 0) {
                }
                break;
            default:
                if (this.f899b > 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f898a) {
            case 0:
                a();
                int i = this.f899b;
                b bVar = (b) this.f901e;
                if (i >= bVar.f904c) {
                    throw new NoSuchElementException();
                }
                this.f899b = i + 1;
                this.f900c = i;
                return bVar.f902a[bVar.f903b + i];
            default:
                b();
                int i2 = this.f899b;
                c cVar = (c) this.f901e;
                if (i2 >= cVar.f907b) {
                    throw new NoSuchElementException();
                }
                this.f899b = i2 + 1;
                this.f900c = i2;
                return cVar.f906a[i2];
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f898a) {
        }
        return this.f899b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f898a) {
            case 0:
                a();
                int i = this.f899b;
                if (i <= 0) {
                    throw new NoSuchElementException();
                }
                int i2 = i - 1;
                this.f899b = i2;
                this.f900c = i2;
                b bVar = (b) this.f901e;
                return bVar.f902a[bVar.f903b + i2];
            default:
                b();
                int i3 = this.f899b;
                if (i3 <= 0) {
                    throw new NoSuchElementException();
                }
                int i4 = i3 - 1;
                this.f899b = i4;
                this.f900c = i4;
                return ((c) this.f901e).f906a[i4];
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f898a) {
        }
        return this.f899b - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i;
        int i2;
        switch (this.f898a) {
            case 0:
                a();
                int i3 = this.f900c;
                if (i3 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                b bVar = (b) this.f901e;
                bVar.b(i3);
                this.f899b = this.f900c;
                this.f900c = -1;
                i = ((AbstractList) bVar).modCount;
                this.d = i;
                return;
            default:
                b();
                int i4 = this.f900c;
                if (i4 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                c cVar = (c) this.f901e;
                cVar.b(i4);
                this.f899b = this.f900c;
                this.f900c = -1;
                i2 = ((AbstractList) cVar).modCount;
                this.d = i2;
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f898a) {
            case 0:
                a();
                int i = this.f900c;
                if (i == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((b) this.f901e).set(i, obj);
                return;
            default:
                b();
                int i2 = this.f900c;
                if (i2 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((c) this.f901e).set(i2, obj);
                return;
        }
    }

    public a(b bVar, int i) {
        int i2;
        g1.f.e(bVar, "list");
        this.f901e = bVar;
        this.f899b = i;
        this.f900c = -1;
        i2 = ((AbstractList) bVar).modCount;
        this.d = i2;
    }
}
