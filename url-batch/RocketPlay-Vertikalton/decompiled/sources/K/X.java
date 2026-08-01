package K;

import android.view.View;
import android.view.ViewGroup;
import j1.InterfaceC0183a;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public class X implements Iterator, InterfaceC0183a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f638a;

    /* renamed from: b, reason: collision with root package name */
    public int f639b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f640c;

    public /* synthetic */ X(int i, Object obj) {
        this.f638a = i;
        this.f640c = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        switch (this.f638a) {
            case 0:
                return this.f639b < ((ViewGroup) this.f640c).getChildCount();
            case 1:
                return this.f639b < ((W0.d) this.f640c).a();
            case 2:
                return this.f639b < ((Object[]) this.f640c).length;
        }
        while (true) {
            int i = this.f639b;
            it = (Iterator) this.f640c;
            if (i > 0 && it.hasNext()) {
                it.next();
                this.f639b--;
            }
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it;
        switch (this.f638a) {
            case 0:
                int i = this.f639b;
                this.f639b = i + 1;
                View childAt = ((ViewGroup) this.f640c).getChildAt(i);
                if (childAt != null) {
                    return childAt;
                }
                throw new IndexOutOfBoundsException();
            case 1:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i2 = this.f639b;
                this.f639b = i2 + 1;
                return ((W0.d) this.f640c).get(i2);
            case 2:
                try {
                    Object[] objArr = (Object[]) this.f640c;
                    int i3 = this.f639b;
                    this.f639b = i3 + 1;
                    return objArr[i3];
                } catch (ArrayIndexOutOfBoundsException e2) {
                    this.f639b--;
                    throw new NoSuchElementException(e2.getMessage());
                }
        }
        while (true) {
            int i4 = this.f639b;
            it = (Iterator) this.f640c;
            if (i4 > 0 && it.hasNext()) {
                it.next();
                this.f639b--;
            }
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f638a) {
            case 0:
                int i = this.f639b - 1;
                this.f639b = i;
                ((ViewGroup) this.f640c).removeViewAt(i);
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public X(Object[] objArr) {
        this.f638a = 2;
        i1.f.e(objArr, "array");
        this.f640c = objArr;
    }

    public X(o1.b bVar) {
        this.f638a = 3;
        this.f640c = bVar.f3704a.iterator();
        this.f639b = bVar.f3705b;
    }
}
