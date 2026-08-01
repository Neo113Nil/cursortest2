package Q0;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public class a implements Iterator, Y0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f654a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f655b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f656c;

    public a(Object[] objArr) {
        X0.d.e(objArr, "array");
        this.f656c = objArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        switch (this.f654a) {
            case 0:
                return this.f655b < ((d) this.f656c).a();
            case 1:
                return this.f655b < ((Object[]) this.f656c).length;
        }
        while (true) {
            int i = this.f655b;
            it = (Iterator) this.f656c;
            if (i > 0 && it.hasNext()) {
                it.next();
                this.f655b--;
            }
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it;
        switch (this.f654a) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i = this.f655b;
                this.f655b = i + 1;
                return ((d) this.f656c).get(i);
            case 1:
                try {
                    Object[] objArr = (Object[]) this.f656c;
                    int i2 = this.f655b;
                    this.f655b = i2 + 1;
                    return objArr[i2];
                } catch (ArrayIndexOutOfBoundsException e2) {
                    this.f655b--;
                    throw new NoSuchElementException(e2.getMessage());
                }
        }
        while (true) {
            int i3 = this.f655b;
            it = (Iterator) this.f656c;
            if (i3 > 0 && it.hasNext()) {
                it.next();
                this.f655b--;
            }
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f654a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public a(d dVar) {
        this.f656c = dVar;
    }

    public a(d1.b bVar) {
        this.f656c = bVar.f1910a.iterator();
        this.f655b = bVar.f1911b;
    }
}
