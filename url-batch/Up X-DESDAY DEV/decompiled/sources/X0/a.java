package X0;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class a implements Iterator, Y0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1008a = 1;

    /* renamed from: b, reason: collision with root package name */
    public int f1009b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1010c;

    public a(Object[] objArr) {
        e.e(objArr, "array");
        this.f1010c = objArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        switch (this.f1008a) {
            case 0:
                return this.f1009b < ((Object[]) this.f1010c).length;
        }
        while (true) {
            int i = this.f1009b;
            it = (Iterator) this.f1010c;
            if (i > 0 && it.hasNext()) {
                it.next();
                this.f1009b--;
            }
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it;
        switch (this.f1008a) {
            case 0:
                try {
                    Object[] objArr = (Object[]) this.f1010c;
                    int i = this.f1009b;
                    this.f1009b = i + 1;
                    return objArr[i];
                } catch (ArrayIndexOutOfBoundsException e2) {
                    this.f1009b--;
                    throw new NoSuchElementException(e2.getMessage());
                }
        }
        while (true) {
            int i2 = this.f1009b;
            it = (Iterator) this.f1010c;
            if (i2 > 0 && it.hasNext()) {
                it.next();
                this.f1009b--;
            }
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f1008a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public a(d1.b bVar) {
        this.f1010c = bVar.f1905a.iterator();
        this.f1009b = bVar.f1906b;
    }
}
